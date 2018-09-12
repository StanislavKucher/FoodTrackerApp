package com.foodTrackerApp.dao.impl;

import com.foodTrackerApp.dao.FoodDao;
import com.foodTrackerApp.enteties.Food;
import org.apache.log4j.Logger;

public class FoodDaoImpl extends GenericDaoImpl<Food> implements FoodDao {
    private static final Logger logger = Logger.getLogger(FoodDaoImpl.class);
}