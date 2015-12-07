package com.mars.food.repo;

import com.mars.food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mars on 2015/9/7.
 */
public interface FoodCrudRepo extends JpaRepository<Food, String> {

}