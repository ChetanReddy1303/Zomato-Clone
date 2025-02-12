package com.zomato.webApp.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "restaurants")
public class Restaurant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "res_id")
    private String resId;

    @Column(name = "apikey")
    private String apikey;

    @Column(name = "name")
    private String name;

    @Column(name = "url")
    private String url;

    @Column(name = "address")
    private String address;

    @Column(name = "locality")
    private String locality;

    @Column(name = "city")
    private String city;

    @Column(name = "city_id")
    private String cityId;

    @Column(name = "latitude")
    private double latitude;

    @Column(name = "longitude")
    private double longitude;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "country_id")
    private String countryId;

    @Column(name = "locality_verbose")
    private String localityVerbose;

    @Column(name = "switch_to_order_menu")
    private String switchToOrderMenu;

    @Column(name = "cuisines")
    private String cuisines;

    @Column(name = "average_cost_for_two")
    private Double averageCostForTwo;

    @Column(name = "price_range")
    private Integer priceRange;

    @Column(name = "currency")
    private String currency;

    @Column(name = "thumb")
    private String thumb;

    @Column(name = "aggregate_rating")
    private String aggregateRating;

    @Column(name = "rating_text")
    private String ratingText;

    @Column(name = "rating_color")
    private String ratingColor;

    @Column(name = "votes")
    private String votes;

    @Column(name = "photos_url")
    private String photosUrl;

    @Column(name = "menu_url")
    private String menuUrl;

    @Column(name = "featured_image")
    private String featuredImage;

    @Column(name = "has_online_delivery")
    private String hasOnlineDelivery;

    @Column(name = "is_delivering_now")
    private String isDeliveringNow;

    @Column(name = "deeplink")
    private String deeplink;

    @Column(name = "has_table_booking")
    private String hasTableBooking;

    @Column(name = "events_url")
    private String eventsUrl;
}