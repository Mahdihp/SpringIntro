package com.maktab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BasketBall implements Coach {

    @Value("${basketball.name}")
    private String lastName;
    @Value("${basketball.lastName}")
    private String name;

    Service service;

    @Override
    public void teaching() {
        System.out.println("init BasketBall");
    }

    public void callService() {
        service.getDailyWork();
    }

    @Autowired
    public void setService(Service service) {
        this.service = service;
    }


    @Override
    public String toString() {
        return "BasketBall{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
