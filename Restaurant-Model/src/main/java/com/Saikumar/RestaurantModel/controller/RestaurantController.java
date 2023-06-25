package com.Saikumar.RestaurantModel.controller;

import com.Saikumar.RestaurantModel.model.Restaurant;
import com.Saikumar.RestaurantModel.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {
    @Autowired
    RestaurantService restaurantService;
    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurants(){
       return  restaurantService.getAllRestaurants();
    }
    @GetMapping("restaurants/restaurant/{rId}")
    public Object getRestaurant(@PathVariable Integer rId){
       return  restaurantService.getRestaurant(rId);
    }
    @PostMapping("restaurant")
    public String addNewRestaurant(@RequestBody Restaurant restaurant){
       return restaurantService.addNewRestaurant(restaurant);
    }
    @PutMapping("restaurants/restaurant/{rId}/{speciality}")
    public String updateSpeciality(@PathVariable Integer rId,@PathVariable String speciality){
       return restaurantService.UpdateSpeciality(rId,speciality);
    }
    @DeleteMapping("restaurants/{rId}")
    public String removeRestaurant(@PathVariable Integer rId){
       return restaurantService.removeRestaurant(rId);
    }
}
