package com.manning.salonapi.controllers;

import com.manning.salonapi.models.SalonServiceDetail;
import com.manning.salonapi.repository.SalonServiceDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/services")
public class SalonServices {
    @Autowired
    private SalonServiceDetailRepository salonServiceDetailRepository;

    @GetMapping("/retrieveAvailableSalonServices")
    public Iterable<SalonServiceDetail> serviceDetail() {
        return salonServiceDetailRepository.findAll();
    }

}
