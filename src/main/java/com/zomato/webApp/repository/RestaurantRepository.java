package com.zomato.webApp.repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.zomato.webApp.model.Restaurant;

@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {


    @Query(value = """
        SELECT * FROM restaurants
        WHERE earth_distance(
            ll_to_earth(latitude, longitude),
            ll_to_earth(:lat, :lon)
        ) <= :radius
        ORDER BY earth_distance(ll_to_earth(latitude, longitude), ll_to_earth(:lat, :lon))
        """, nativeQuery = true)
    List<Restaurant> findRestaurantsByLocation(
            @Param("lat") double latitude,
            @Param("lon") double longitude,
            @Param("radius") double radius);
            

    Optional<Restaurant> findByResId(String resId);

}