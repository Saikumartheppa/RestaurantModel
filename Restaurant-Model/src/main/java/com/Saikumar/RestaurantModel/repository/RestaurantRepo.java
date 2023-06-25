package com.Saikumar.RestaurantModel.repository;

import com.Saikumar.RestaurantModel.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {
    @Autowired
    List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurantList(){

        return restaurantList;
    }
}
