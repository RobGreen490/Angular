package com.springcore.springcoredemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springcore.springcoredemo.common.Coach;
import com.springcore.springcoredemo.common.SwimCoach;

@Configuration
public class SportConfig {

    //using bean to manually handle the construction of Coach
    @Bean("aquatic") //the bean id defaults to the method name "swimCoach"
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
