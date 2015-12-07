package com.mars.food.view;

import com.mars.food.entity.Food;
import com.mars.food.service.FoodService;
import com.mars.food.service.FoodServiceImpl;
import com.mars.food.util.WebApplicationContextHelper;
import org.omnifaces.util.Faces;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 * Created by Mars on 2015/12/7.
 */
@FacesConverter("foodConverter")
public class FoodConverter implements Converter {

    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if (value != null && value.trim().length() > 0) {
            return getFacade().getFood(value);
        } else {
            return null;
        }
    }

    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if (object != null) {
            return String.valueOf(((Food) object).getSid());
        } else {
            return null;
        }
    }

    private FoodService getFacade() {
        FoodServiceImpl impl = (FoodServiceImpl) WebApplicationContextHelper.getBean(Faces.getServletContext(), "foodServiceImpl");
        return impl;
    }

}
