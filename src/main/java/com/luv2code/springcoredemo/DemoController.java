package com.luv2code.springcoredemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private final Coach coach;
    private final Coach anotherCoach;
  @Autowired
    public  DemoController(@Qualifier("cricketCoach") Coach coach ,
                           @Qualifier("cricketCoach") Coach anotherCoach){
        this.coach=coach;
        this.anotherCoach=anotherCoach;
    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
      return coach.getDailyWorkout();
    }

    @GetMapping("/check")
        public String check(){
      return "the index of coach is: "+coach+" the index of the anotherCoach is: "+anotherCoach;
        }

}
