package com.edu.util;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class MyPropertyPlaceholderConfigurer  extends PropertyPlaceholderConfigurer {
    @Override
    protected String convertProperty(String propertyName, String propertyValue) {
        if(propertyName.equals("username")||propertyName.equals("password")){
            return  DET.decode(propertyValue);
        }else {
            return  propertyValue;
        }
    }
}
