package com.mars.food.view;

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

/**
 * Created by Mars on 2015/12/7.
 */
@ManagedBean
public class FoodSearchView {

    @Setter
    @Getter
    private Food food;

    private FoodService getFacade() {
        return (FoodServiceImpl) WebApplicationContextHelper.getBean(Faces.getServletContext(), "foodServiceImpl");
    }

    public List<Food> completeFood(String query) {
        return getFacade().searchFood(query);
    }

    public void onItemSelect(SelectEvent event) {
        JsfUtil.addSuccessMessage("找到食物!!");
    }

}
