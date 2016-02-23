package com.mars.food.service;

import com.mars.food.entity.Food;

import java.util.List;

/**
 * Created by Mars on 2015/12/7.
 */
public interface FoodService {

    List<Food> getFood();

    Food getFood(String sid);

    List<Food> searchFood(String query);
}
