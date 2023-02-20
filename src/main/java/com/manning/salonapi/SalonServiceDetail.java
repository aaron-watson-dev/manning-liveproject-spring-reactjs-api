package com.manning.salonapi;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@ToString
public class SalonServiceDetail {

    private long id;
    private String name;
    private String address;
    private String city;
    private String zipCode;
    private String phone;
    private Date createdAt;
}
