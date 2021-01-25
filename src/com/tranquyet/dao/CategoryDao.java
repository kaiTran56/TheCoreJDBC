package com.tranquyet.dao;

import java.util.List;

import com.tranquyet.model.Category;

public interface CategoryDao extends GenericDao<Category> {
	List<Category> finAll();
}
