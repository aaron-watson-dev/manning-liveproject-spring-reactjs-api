package com.manning.salonapi.repository;

import com.manning.salonapi.SalonServiceDetail;

public interface SalonServiceDetailRepository {
    Iterable<SalonServiceDetail> findAll();
}
