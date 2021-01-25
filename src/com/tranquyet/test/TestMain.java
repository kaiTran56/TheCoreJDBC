package com.tranquyet.test;

import com.tranquyet.service.PeopleService;
import com.tranquyet.service.impl.PeopleServiceImpl;

public class TestMain {

	public static void main(String[] args) {
		PeopleService people = new PeopleServiceImpl();
		people.findAll().forEach(p -> {
			System.out.println(p.toString()+"\n");
		});
	}
}
