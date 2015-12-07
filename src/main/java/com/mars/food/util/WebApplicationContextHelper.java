package com.mars.food.util;

import org.omnifaces.util.Faces;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;

/**
 * Created by Mars on 2015/12/7.
 */
public class WebApplicationContextHelper {

    public static Object getBean(ServletContext servletContext, String beanName) {
        WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(Faces.getServletContext());
        return ctx.getBean(beanName);
    }
}
