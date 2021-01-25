package com.tranquyet.dao;

import java.util.List;

import com.tranquyet.model.People;

public interface PeopleDao extends GenericDao<People>{
	List<People> findAll();
}
