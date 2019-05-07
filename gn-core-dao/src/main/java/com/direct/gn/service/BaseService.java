package com.direct.gn.service;

import java.io.Serializable;
import java.util.List;

import com.direct.gn.exception.CustomException;
import com.direct.gn.model.AbstractModel;
import com.direct.gn.model.PageQuery;
import com.direct.gn.result.QueryResult;

public interface BaseService<T extends AbstractModel, ID extends Serializable>
{
	/**
	 * 物理删除数据
	 * @param id
	 * @return
	 * @throws CustomException
	 */
	int deleteById(ID id) throws CustomException;

	/**
	 * 逻辑 删除数据
	 * @param id
	 * @return
	 * @throws CustomException
	 */
	int deleteByIdOnLogic(Long id , String modifyBy) throws CustomException;
	
	/**
	 * 插入数据
	 * @param record
	 * @return
	 * @throws CustomException
	 */
	int insert(T record) throws CustomException;

	/**
	 * 根据id获取单个数据
	 * @param id
	 * @return
	 */
	T selectById(ID id);

	/**
	 * 查询数据总数
	 * @param record
	 * @return
	 */
	int selectListCount(T record);

	/**
	 * 查询数据List,可以进行分页
	 * @param record
	 * @return
	 */
	QueryResult<T> selectListByPage(T record , PageQuery page);

	/**
	 * 查询数据List,未进行分页
	 * @param record
	 * @return
	 */
	List<T> selectList(T record , PageQuery page);
	
	/**
	 * 根据id更新数据
	 * @param record
	 * @return
	 * @throws CustomException
	 */
	int updateById(T record) throws CustomException;

	/**
	 * 保存数据,id != null 更新数据,否则 查询数据
	 * @param record
	 * @return
	 * @throws CustomException
	 */
	int save(T record) throws CustomException;

	/**
	 * 验证数据是否存在
	 * @param record
	 * @return
	 */
	boolean isExist(T record);
}
