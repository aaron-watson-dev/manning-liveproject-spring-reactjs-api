package com.manning.salonapi.repository;

import com.manning.salonapi.models.Slot;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SlotRepository extends JpaRepository<Slot, Long> { }
