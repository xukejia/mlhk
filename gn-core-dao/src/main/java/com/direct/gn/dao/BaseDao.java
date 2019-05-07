package com.direct.gn.dao;

import java.io.Serializable;
import java.util.List;


public interface BaseDao<T extends Serializable, ID extends Serializable>
{
	int deleteById(ID id);

	int insert(T record);

	T selectById(ID id);

	int selectListCount(T record);

	List<T> selectList(T record);

	int updateById(T record);
	
}
