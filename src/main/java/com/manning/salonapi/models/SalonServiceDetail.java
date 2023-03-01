package com.manning.salonapi.models;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.Instant;


@Data
@NoArgsConstructor
@ToString
@Entity
public class SalonServiceDetail implements Serializable {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;

   private String name;
   private String description;
   private Long price;
   private Integer timeInMinutes;

   @CreatedDate
   private Instant createdAt;

}
