package com.direct.gn.db.mongodb.service;


import java.util.List;


import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.BasicUpdate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.alibaba.fastjson.JSON;
import com.direct.gn.model.PageQuery;
import com.direct.gn.result.QueryResult;
import com.github.pagehelper.Page;


public abstract class AbstractMongoDAO<T, ID> implements BaseMongoDAO<T, ID>
{
    protected abstract Class<T> getModelClass();
    protected abstract MongoTemplate getDao();
    
    @Override
    public List<T> find(T t, String table)
    {
        String json = JSON.toJSONString(t);
        Query query = new BasicQuery(json);
        return this.find(query , table);
    }

    @Override
    public T findOne(T t, String table)
    {
        String json = JSON.toJSONString(t);
        Query query = new BasicQuery(json);
        return this.getDao().findOne(query, this.getModelClass() , table);
    }

    @Override
    public void update(T q ,T t, String table)
    {
        String queryJson = JSON.toJSONString(q);
        Query query = new BasicQuery(queryJson);
        
        String updateJson = JSON.toJSONString(t);
        Update update = new BasicUpdate(updateJson);
        
        //this.getDao().findAndModify(query, update, this.getModelClass());
        this.getDao().upsert(query, update, this.getModelClass() , table);
    }

    @Override
    public void remove(T q, String table)
    {
        String queryJson = JSON.toJSONString(q);
        Query query = new BasicQuery(queryJson);
        
        //this.getDao().findAndModify(query, update, this.getModelClass());
        this.getDao().remove(query, this.getModelClass() , table);
    }
    
    @Override
    public T save(T entity, String table)
    {
        this.getDao().insert(entity , table);
        return entity;
    }

    @Override
    public T findById(ID id, String table)
    {
        return this.getDao().findById(id, this.getModelClass() , table);
    }

    @Override
    public QueryResult<T> findPage(PageQuery pageQuery, T t, String table)
    {
        QueryResult<T> result = new QueryResult<T>();
        String json = JSON.toJSONString(t);
        Query query = new BasicQuery(json);
        
        //long count = this.count(query , table);  
        
        int pageNumber = pageQuery.getPageNum();  
        int pageSize = pageQuery.getPageSize();  
        query.skip((pageNumber - 1) * pageSize).limit(pageSize);  
        List<T> rows = this.find(query , table);  
        Page<T> list = new Page<T>(pageQuery.getPageNum(), pageQuery.getPageSize());
        if (null != rows && rows.size() > 0)
            list.addAll(rows);
        result.setResults(list);;
        return result;
    }

    @Override
    public long count(T t, String table)
    {
        String json = JSON.toJSONString(t);
        Query query = new BasicQuery(json);
        return this.count(query , table);
    }
    
    private long count(Query query, String table)
    {
        return this.getDao().count(query, this.getModelClass() , table);
    }

    private List<T> find(Query query, String table)
    {
        return this.getDao().find(query, this.getModelClass() , table);
    }
}
