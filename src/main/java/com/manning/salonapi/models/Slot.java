package com.manning.salonapi.models;

import lombok.Data;

import java.util.Date;

@Data
public class Slot {
    private Long id;
    private Date createdAt;
}
