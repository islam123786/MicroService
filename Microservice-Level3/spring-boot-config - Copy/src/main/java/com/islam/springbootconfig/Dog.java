package com.islam.springbootconfig;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

@Repository
@Profile("test")
public class Dog implements Animal{
    @Override
    public String speak() {
        return "Bhoww";
    }
}
