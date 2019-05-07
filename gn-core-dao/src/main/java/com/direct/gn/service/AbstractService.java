package com.direct.gn.service;

import java.io.Serializable;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.direct.gn.dao.BaseDao;
import com.direct.gn.enums.CustomExceptionEnum;
import com.direct.gn.exception.CustomException;
import com.direct.gn.model.AbstractModel;
import com.direct.gn.model.PageQuery;
import com.direct.gn.result.QueryResult;
import com.github.pagehelper.PageHelper;

public abstract class AbstractService<T extends AbstractModel, ID extends Serializable> implements BaseService<T, ID>
{
	protected final Logger logger = LoggerFactory.getLogger(this.getClass());

	protected abstract BaseDao<T, ID> getDao();

	public int deleteById(ID id) throws CustomException
	{
		return this.getDao().deleteById(id);
	}

	public int insert(T record) throws CustomException
	{
		record.spaceConvertNull();
		return this.getDao().insert(record);
	}

	public T selectById(ID id)
	{
		return this.getDao().selectById(id);
	}

	public int selectListCount(T record)
	{
		return this.getDao().selectListCount(record);
	}

	public QueryResult<T> selectListByPage(T record, PageQuery page)
	{
		QueryResult<T> result = new QueryResult<T>();
		try
		{
			if (null == page)
				page = new PageQuery();

			page.setFlag(true);

			if (StringUtils.isEmpty(page.getOrderBy()))
				PageHelper.startPage(page.getPageNum(), page.getPageSize());
			else
				PageHelper.startPage(page.getPageNum(), page.getPageSize(), page.getOrderBy());

			result.setResults(this.getDao().selectList(record));
			result.setSuccess(true);
		} catch (Exception e)
		{
			logger.error(e.getMessage(), e);
			result.setSuccess(false);
			result.setErrorCode(String.valueOf(CustomExceptionEnum.COMMON_DB_ERRORS.getCode()));
			result.setErrorHint(e.getMessage());
		}
		return result;
	}

	public List<T> selectList(T record, PageQuery page)
	{
		if (null == page)
			page = new PageQuery();
		page.setFlag(false);
		if (!StringUtils.isEmpty(page.getOrderBy()))
			PageHelper.orderBy(page.getOrderBy());

		return this.getDao().selectList(record);
	}

	public int updateById(T record) throws CustomException
	{
		record.spaceConvertNull();
		return this.getDao().updateById(record);
	}

	public boolean isExist(T record)
	{
		return this.selectListCount(record) > 0 ? true : false;
	}
}
