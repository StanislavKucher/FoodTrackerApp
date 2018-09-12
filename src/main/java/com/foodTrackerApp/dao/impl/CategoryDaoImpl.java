package com.foodTrackerApp.dao.impl;

import com.foodTrackerApp.dao.CategoryDao;
import com.foodTrackerApp.enteties.Category;
import org.apache.log4j.Logger;


public class CategoryDaoImpl extends GenericDaoImpl<Category> implements CategoryDao {
    private static final Logger logger = Logger.getLogger(CategoryDaoImpl.class);
}
