/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.infiverve.flint.helpers;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

/**
 *
 * @author abhishek
 */
public class ConfigHelper {

    private static final Config config = ConfigFactory.load("configuration/application.conf");
    
    public static String getBaseURL() {
        
        return config.getString("flint.api.url");

    }
    
    public static String getApiUsername(){
        return config.getString("flint.api.username");
    }
    
    public static String getApiPassword(){
        return config.getString("flint.api.password");
    }
    
    public static String getApiKey(){
        return config.getString("flint.api.key");
    }

}
