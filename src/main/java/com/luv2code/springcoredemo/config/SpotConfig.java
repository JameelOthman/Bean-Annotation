package com.luv2code.springcoredemo.config;

import com.luv2code.springcoredemo.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpotConfig {
    @Bean
    public SwimCoach swimCoach(){
        return new SwimCoach();
    }
}
