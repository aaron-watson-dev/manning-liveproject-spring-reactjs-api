package com.manning.salonapi.repository;

import com.manning.salonapi.models.SalonServiceDetail;

public interface SalonServiceDetailRepository {
    Iterable<SalonServiceDetail> findAll();
}
