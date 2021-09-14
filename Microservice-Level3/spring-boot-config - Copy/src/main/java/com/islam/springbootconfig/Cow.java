package com.islam.springbootconfig;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
@Profile("default")
public class Cow implements Animal{
    @Override
    public String speak() {
        return "Woooh";
    }
}
