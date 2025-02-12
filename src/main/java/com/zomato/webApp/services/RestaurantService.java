package com.zomato.webApp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import com.zomato.webApp.model.Restaurant;
import com.zomato.webApp.repository.RestaurantRepository;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    // Get Restaurant by ID
    public Restaurant getRestaurantById(long id) {
        return restaurantRepository.findById(id).orElse(null);
    }

    // Get List of Restaurants with Pagination
    public Page<Restaurant> getRestaurants(int page, int size) {
        return restaurantRepository.findAll(PageRequest.of(page, size));
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepository.findAll();
    }

    public Optional<Restaurant> getRestaurantByResId(String resId) {
        return restaurantRepository.findByResId(resId);
    }

    

}