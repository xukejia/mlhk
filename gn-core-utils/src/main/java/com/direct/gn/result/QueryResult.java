/*
 * Copyright 1999-2024 Colotnet.com All right reserved. This software is the confidential and proprietary information of
 * Colotnet.com ("Confidential Information"). You shall not disclose such Confidential Information and shall use it only
 * in accordance with the terms of the license agreement you entered into with Colotnet.com.
 */
package com.direct.gn.result;

import java.util.List;

/**
 * 类QueryResult.java的实现描述：查询返回结果
 * 
 * @author Sunney 2016年2月1日 下午1:23:33
 */
public class QueryResult<T> extends Result {

    /**
     * 
     */
    private static final long serialVersionUID = -7616663907405360892L;

    /**
     * 数据的结果集
     */
    private List<T>           results;
    /**
     * 分页信息
     */
    private PageResult<T>     pageResult;

    public QueryResult(boolean isSuccess, String errorCode, String errorHint, List<T> results) {
        super(isSuccess, errorCode, errorHint);
        this.results = results;

    }

    public QueryResult(boolean isSuccess, List<T> results) {
        super(isSuccess);
        this.results = results;
    }

    public QueryResult() {
        super(false);
    }

    public List<T> getResults() {
        return results;
    }

    public void setResults(List<T> results) {
        this.results = results;
        // 返回分页信息
        PageResult<T> pageResult = new PageResult<T>(results);
        this.setPageResult(pageResult);
    }

    /**
     * @return the pageResult
     */
    public PageResult<?> getPageResult() {
        return pageResult;
    }

    /**
     * @param pageResult the pageResult to set
     */
    public void setPageResult(PageResult<T> pageResult) {
        this.pageResult = pageResult;
    }

}
