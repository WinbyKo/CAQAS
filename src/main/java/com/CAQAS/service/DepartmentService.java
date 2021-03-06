package com.CAQAS.service;

import java.util.Map;

import com.CAQAS.pojo.Department;

public interface DepartmentService {
	/**
	 * 查询所有部门.
	 * @return 结果
	 */
	Map<String, Object> selectAllDepartments(Integer page, Integer pageNum);
	
	/**
	 * 添加.
	 * @param department department对象
	 * @return
	 */
	Integer insertSelective(Department department);
	
	/**
	 * 更新.
	 * @param department department对象
	 * @return 结果
	 */
	Integer updateByPrimaryKeySelective(Department department);
	
	/**
	 * 删除.
	 * @param depId 部门Id
	 * @return 结果
	 */
	int deleteByPrimaryKey(Integer depId);
	
	/**
	 * 批量删除.
	 * @param depIds 部门Ids
	 * @return 结果
	 */
	int deleteBatchDep(String depIds);
	
	/**
	 * 通过部门名字查询.
	 * @param depName depName部门名字
	 * @return 结果
	 */
	Department selectByDepName(String depName);
}
