package com.manning.salonapi.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class SalonDetails {
    @Value("${salon.name}")
    private String name;

    @Value("${salon.address}")
    private String address;

    @Value("${salon.state}")
    private String state;

    @Value("${salon.city}")
    private String city;

    @Value("${salon.zipCode}")
    private String zipCode;

    @Value("${salon.phone}")
    private String phone;

}
