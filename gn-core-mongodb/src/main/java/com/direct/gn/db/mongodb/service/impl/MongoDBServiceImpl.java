package com.direct.gn.db.mongodb.service.impl;

import java.io.Serializable;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.direct.gn.db.mongodb.model.DbDocument;
import com.direct.gn.db.mongodb.service.AbstractMongoDAO;

@Service("MongoDBService")
public class MongoDBServiceImpl<T extends Serializable> extends AbstractMongoDAO<DbDocument<T> , String>
{
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    private DbDocument<T> obj = new DbDocument<T>();
    
    @Resource
    private MongoTemplate mongoTemplate;

    @Override
    protected MongoTemplate getDao()
    {
        return mongoTemplate;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected Class<DbDocument<T>> getModelClass()
    {
        return (Class<DbDocument<T>>) obj.getClass();
    }


}
