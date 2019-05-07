package com.direct.gn.db.mongodb.service;


import java.util.List;

import com.direct.gn.model.PageQuery;
import com.direct.gn.result.QueryResult;

public interface BaseMongoDAO<T , ID>
{
    /** 
     * 通过条件查询实体(集合) 
     *  
     * @param query 
     */  
    public List<T> find(T query , String table) ;  
  
    /** 
     * 通过一定的条件查询一个实体 
     *  
     * @param query 
     * @return 
     */  
    public T findOne(T query, String table) ;  
  
    /** 
     * 通过条件查询更新数据 
     *  
     * @param query 
     * @param update 
     * @return 
     */  
    public void update(T query, T update, String table) ;  
  
    public void remove(T query, String table);
    
    /** 
     * 保存一个对象到mongodb 
     *  
     * @param entity 
     * @return 
     */  
    public T save(T entity, String table) ;  
  
    /** 
     * 通过ID获取记录 
     *  
     * @param id 
     * @return 
     */  
    public T findById(ID id, String table) ;  
      
    /** 
     * 分页查询 
     * @param page 
     * @param query 
     * @return 
     */  
    public QueryResult<T> findPage(PageQuery page,T query, String table);  
      
    /** 
     * 求数据总和 
     * @param query 
     * @return 
     */  
    public long count(T query, String table); 
}
