package com.other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan(basePackages = {"com.other"})
@Import({ApplicationContextDataBase.class})
@PropertySource("classpath:config.properties")
public class ApplicationContext {


    @Bean
    @Autowired
    public VolleyBallCoach getVolleyBallBean(Service service) {
        VolleyBallCoach volleyBallCoach = new VolleyBallCoach();
        volleyBallCoach.setService(service);
        return volleyBallCoach;
    }


}
