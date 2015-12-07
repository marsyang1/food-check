package com.mars.food.view;

import com.google.common.collect.ImmutableList;
import com.mars.food.entity.Food;
import com.mars.food.service.FoodService;
import com.mars.food.service.FoodServiceImpl;
import com.mars.food.util.JsfUtil;
import com.mars.food.util.WebApplicationContextHelper;
import lombok.Getter;
import lombok.Setter;
import org.omnifaces.util.Faces;
import org.primefaces.event.SelectEvent;

import javax.faces.bean.ManagedBean;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Mars on 2015/12/7.
 */
@ManagedBean
public class FoodSearchView {

    @Setter
    @Getter
    private Food food;


    private FoodService getFacade() {
        FoodServiceImpl impl = (FoodServiceImpl) WebApplicationContextHelper.getBean(Faces.getServletContext(), "foodServiceImpl");
        return impl;
    }

    public List<Food> completeFood(String query) {
        List<Food> allFoods = getFacade().getFood();
        List<Food> filteredFoods = ImmutableList.copyOf(allFoods.stream().filter(food -> food.getName().toLowerCase().startsWith(query)).collect(Collectors.toList()));
        return filteredFoods;
    }

    public void onItemSelect(SelectEvent event) {
        JsfUtil.addSuccessMessage("Get food!");
    }

}
