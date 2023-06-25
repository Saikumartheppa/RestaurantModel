package com.Saikumar.RestaurantModel.service;

import com.Saikumar.RestaurantModel.model.Restaurant;
import com.Saikumar.RestaurantModel.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
   @Autowired
   RestaurantRepo restaurantRepo;
   public List<Restaurant> getAllRestaurants() {

      return restaurantRepo.getRestaurantList();
   }
   public Object getRestaurant(Integer rId) {
      List<Restaurant> myRestaurantList = getAllRestaurants();
    //  Restaurant newRestaurant = null;
      for(Restaurant restaurant : myRestaurantList){
         if(restaurant.getRestaurantId().equals(rId)) {
             return restaurant;
         }
      }
      return "Trying to get Details of Restaurant"+ " : " +rId+" "+"doesn't exist";
   }
   public String addNewRestaurant(Restaurant restaurant) {
      List<Restaurant> myRestaurantList = getAllRestaurants();
      myRestaurantList.add(restaurant);
      return "Restaurant " + " : " + restaurant.getRestaurantId() + "  Added Successfully";
   }

   public String UpdateSpeciality(Integer rId,String speciality) {
      List<Restaurant> myRestaurantList = getAllRestaurants();
      for(Restaurant restaurant : myRestaurantList){
         if(restaurant.getRestaurantId().equals(rId)){
            restaurant.setRestaurantSpeciality(speciality);
            return "Restaurant"+" : " + rId + " speciality " + " " + speciality +" " +"Updated Successfully";
         }
      }
      return "Trying to update Restaurant speciality " + " : " + rId +" "+ "doesn't exit";
   }

   public String removeRestaurant(Integer rId) {
      List<Restaurant> myRestaurantList = getAllRestaurants();
      for(Restaurant restaurant : myRestaurantList){
         if(restaurant.getRestaurantId().equals(rId)){
             myRestaurantList.remove(restaurant);
            return "Restaurant"+" : " + rId + " " + "deleted Successfully";
         }
      }
      return "Trying to delete Restaurant  " + " : " + rId +" "+ "doesn't exit";
   }
}
