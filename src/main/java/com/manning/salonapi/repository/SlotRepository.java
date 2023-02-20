package com.manning.salonapi.repository;

import com.manning.salonapi.Slot;

public interface SlotRepository {
    Iterable<Slot> findAll();
}
