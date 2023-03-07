package com.manning.salonapi.controllers;

import com.manning.salonapi.models.SalonServiceDetail;
import com.manning.salonapi.repository.SalonServiceDetailRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Salon services")
@RequestMapping("/api/services")
public class SalonServices {
    @Autowired
    private SalonServiceDetailRepository salonServiceDetailRepository;

    @ApiOperation(value = "Retrieve a list of available salon service details")
    @GetMapping("/retrieveAvailableSalonServices")
    @CrossOrigin // TODO - this should be limited in production
    public Iterable<SalonServiceDetail> serviceDetail() {
        return salonServiceDetailRepository.findAll();
    }

}
