package com.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.other","com.maktab"})
@Import({ApplicationContextDataBase.class})
@PropertySource("classpath:config.properties")
public class ApplicationContext {



    @Autowired
    @Qualifier("getServiceBean")
    public VolleyBallCoach getVolleyBallBean( Service service) {
        VolleyBallCoach volleyBallCoach = new VolleyBallCoach();
        volleyBallCoach.setService(service);
        return volleyBallCoach;
    }


    @Autowired
    public SwimCoach getSwimCoachBean(ServiceImplOne serviceImplOne) {
        SwimCoach swimCoach = new SwimCoach();
        swimCoach.setService(serviceImplOne);
        return swimCoach;
    }


    @Autowired
    public SwimCoach getSwimCoachBean(ServiceImplTwo serviceImplOne) {
        SwimCoach swimCoach = new SwimCoach();
        swimCoach.setService(serviceImplOne);
        return swimCoach;
    }




}
