package com.other;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationContextDataBase {

    @Bean
    public Service getServiceBean(){
        return new ServiceImpl();
    }
}
