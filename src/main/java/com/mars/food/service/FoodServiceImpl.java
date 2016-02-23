package com.mars.food.service;

import com.mars.food.entity.Food;
import com.mars.food.repo.FoodCrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mars on 2015/12/7.
 */
@Service
public class FoodServiceImpl implements FoodService {

    final FoodCrudRepo repo;

    @Autowired
    public FoodServiceImpl(FoodCrudRepo repo) {
        this.repo = repo;
    }

    public List<Food> getFood() {
        return repo.findAll();
    }

    @Override
    public Food getFood(String sid) {
        return repo.findOne(sid);
    }

    @Override
    public List<Food> searchFood(String query) {
        List<Food> filteredFoods = getFood().stream()
                .filter(food -> food.getName().toLowerCase().startsWith(query)
                        || food.getId().toLowerCase().startsWith(query))
                .collect(Collectors.toList());
        return filteredFoods;
    }
}

