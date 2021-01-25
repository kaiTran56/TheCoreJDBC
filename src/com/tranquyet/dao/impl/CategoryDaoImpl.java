package com.tranquyet.dao.impl;

import java.util.List;

import com.tranquyet.dao.CategoryDao;
import com.tranquyet.mapper.CategoryMapper;
import com.tranquyet.model.Category;

public class CategoryDaoImpl extends AbstractDao<Category> implements CategoryDao {

	@Override
	public List<Category> finAll() {
		String sql = "select *from category;";
		
		return query(sql, new CategoryMapper());
	}

}
