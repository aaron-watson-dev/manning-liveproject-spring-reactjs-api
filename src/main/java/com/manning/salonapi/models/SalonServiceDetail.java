package com.manning.salonapi.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.data.annotation.CreatedDate;

import java.util.Date;


@Data
@NoArgsConstructor
@ToString
@Entity
public class SalonServiceDetail {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long Id;

   private String name;
   private String description;
   private Long price;
   private Integer timeInMinutes;

   @CreatedDate
   private Long createdAt;

}
