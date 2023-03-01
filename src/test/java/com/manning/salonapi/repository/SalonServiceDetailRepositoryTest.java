package com.manning.salonapi.repository;


import com.manning.salonapi.PersistanceConfig;
import com.manning.salonapi.models.SalonServiceDetail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@EnableJpaAuditing
@Import(PersistanceConfig.class)
public class SalonServiceDetailRepositoryTest {
    @Autowired
    private SalonServiceDetailRepository salonServiceDetailRepository;

    @Test
    public void saveTest() {
        var detail = new SalonServiceDetail();
        detail.setName("Test");
        salonServiceDetailRepository.save(detail);

        System.out.println(salonServiceDetailRepository.findAll().size());
        assertNotEquals(0,salonServiceDetailRepository.findAll().size());
    }
}
