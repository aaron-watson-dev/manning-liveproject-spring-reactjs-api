package com.manning.salonapi.repository;

import com.manning.salonapi.models.SalonServiceDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SalonServiceDetailRepository extends JpaRepository<SalonServiceDetail, Long> {
}
