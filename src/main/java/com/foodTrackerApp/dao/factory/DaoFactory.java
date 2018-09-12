package com.foodTrackerApp.dao.factory;

import com.foodTrackerApp.dao.*;
import com.foodTrackerApp.dao.impl.*;

public class DaoFactory {

    public static UserDao getUserMethods() {
        return new UserDaoImpl();
    }

    public static RoleDao getRoleMethods() {
        return new RoleDaoImpl();
    }

    public static RecordDao getRecordMethods() {
        return new RecordDaoImpl();
    }

    public static FoodDao getFoodMethods() {
        return new FoodDaoImpl();
    }

    public static CategoryDao getCategoryMethods() {
        return new CategoryDaoImpl();
    }

}