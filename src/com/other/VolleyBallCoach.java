package com.other;


import org.springframework.stereotype.Component;

@Component
public class VolleyBallCoach implements Coach {

    private Service service;

    @Override
    public void teaching() {
        System.out.println("call teaching from VolleyBall");
    }

    @Override
    public void callService() {
        System.out.println("call callService metod from VolleyBall");
    }

    public void setService(Service service) {
        this.service = service;
    }
}
