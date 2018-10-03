package com.maktab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class FootBallCoach implements Coach {


    private Service service;



    @Override
    public void teaching() {
        System.out.println("call teaching");
    }

    @Override
    public void callService() {
        service.getDailyWork();

    }


    @Autowired
    public void setService(Service service) {
        this.service = service;
    }
}
