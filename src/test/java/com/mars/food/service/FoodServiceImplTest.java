package com.mars.food.service;

import com.google.common.collect.ImmutableList;
import com.mars.food.entity.Food;
import com.mars.food.repo.FoodCrudRepo;
import org.junit.Assert;
import org.mockito.Mockito;

import java.util.List;

/**
 * Created by Mars on 2016/2/23.
 */
public class FoodServiceImplTest {

    FoodService foodService;

    public FoodServiceImplTest() {
        FoodCrudRepo mock = Mockito.mock(FoodCrudRepo.class);
        ImmutableList.Builder<Food> builder = ImmutableList.builder();
        List<Food> foodData = builder.add(new Food("Cranberry", "蔓越莓")).build();
        Mockito.when(mock.findAll()).thenReturn(foodData);

        foodService = new FoodServiceImpl(mock);
    }

    @org.junit.Test
    public void testSearchFood() throws Exception {
        String query = "C";
        Food food = foodService.searchFood(query).get(0);
        Assert.assertEquals(food.getName(),"蔓越莓");
    }
}