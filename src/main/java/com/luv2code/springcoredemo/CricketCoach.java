package com.luv2code.springcoredemo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@RequestScope
//@SessionScope
public class CricketCoach  implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 min!!";
    }
}
