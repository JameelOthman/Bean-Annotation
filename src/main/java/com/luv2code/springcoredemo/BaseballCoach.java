package com.luv2code.springcoredemo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "spend 30 min in batting practices";
    }
}
