package com.tranquyet.service.impl;

import java.util.List;

import com.tranquyet.dao.PeopleDao;
import com.tranquyet.dao.impl.PeopleDaoImpl;
import com.tranquyet.model.People;
import com.tranquyet.service.PeopleService;

public class PeopleServiceImpl implements PeopleService {

	private PeopleDao peopleDao;

	@Override
	public List<People> findAll() {
		this.peopleDao = new PeopleDaoImpl();
		return peopleDao.findAll();
	}

}
