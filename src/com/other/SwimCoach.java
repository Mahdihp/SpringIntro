package com.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

    private Service service;


    @Override
    public void teaching() {
        System.out.println("call teaching from SwimCoach");
    }

    @Override
    public void callService() {
        System.out.println("call callService metod from SwimCoach");

    }

    public void setService(Service service) {
        this.service = service;
    }
}
