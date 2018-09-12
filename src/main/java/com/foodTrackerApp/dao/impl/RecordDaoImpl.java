package com.foodTrackerApp.dao.impl;

import com.foodTrackerApp.dao.RecordDao;
import com.foodTrackerApp.enteties.Record;
import org.apache.log4j.Logger;

public class RecordDaoImpl extends GenericDaoImpl<Record> implements RecordDao {
    private static final Logger logger = Logger.getLogger(RecordDaoImpl.class);
}
