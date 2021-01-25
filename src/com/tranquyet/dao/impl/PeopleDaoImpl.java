package com.tranquyet.dao.impl;

import java.util.List;

import com.tranquyet.dao.PeopleDao;
import com.tranquyet.mapper.PeopleMapper;
import com.tranquyet.model.People;

public class PeopleDaoImpl extends AbstractDao<People> implements PeopleDao {

	@Override
	public List<People> findAll() {
		String sql = "Select * from people;";
		return query(sql, new PeopleMapper());
	}

}
