package com.islam.MovieCatalogservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.islam.MovieCatalogservice.models.Rating;
import com.islam.MovieCatalogservice.models.UserRating;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@Service
public class UserRatingInfo {

	@Autowired
	private RestTemplate restTemplate;
	
	@HystrixCommand(fallbackMethod = "getFallbackUserRating")
    public List<Rating> getUserRating(String userId){
    	UserRating userRatings = restTemplate.getForObject("http://rating-data-service/ratings/users/"+userId, UserRating.class);
    	return userRatings.getUserRating();
    }
    
    public List<Rating> getFallbackUserRating(String userId){
    	List<Rating> list = new ArrayList<Rating>();
    	list.add(new Rating("0", 0));
    	return list;
    }
}
