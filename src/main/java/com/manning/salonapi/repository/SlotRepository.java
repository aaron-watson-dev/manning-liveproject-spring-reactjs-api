package com.manning.salonapi.repository;

import com.manning.salonapi.models.Slot;

public interface SlotRepository {
    Iterable<Slot> findAll();
}
