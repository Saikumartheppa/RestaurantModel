package com.Saikumar.RestaurantModel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
    private Integer restaurantId;
    private  String restaurantName;
    private  String restaurantAddress;
    private Type restaurantType;
    private  String restaurantSpeciality;
    private Double restaurantRating;
    private String restaurantTimings;
    private Integer restaurantTotalStaff;
}
