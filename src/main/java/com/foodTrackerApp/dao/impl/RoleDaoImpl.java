package com.foodTrackerApp.dao.impl;

import com.foodTrackerApp.dao.RoleDao;
import com.foodTrackerApp.enteties.Role;
import org.apache.log4j.Logger;

public class RoleDaoImpl extends GenericDaoImpl<Role> implements RoleDao{
    private static final Logger logger = Logger.getLogger(RoleDaoImpl.class);
}
