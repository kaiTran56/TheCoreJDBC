package com.tranquyet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tranquyet.model.People;

public class PeopleMapper implements RowMapper<People> {

	@Override
	public People mapRow(ResultSet rs) {

		try {
			People people = new People();
			people.setId(rs.getString("id"));
			people.setName(rs.getString("name"));
			people.setDob(rs.getDate("dob"));
			people.setAddress(rs.getString("address"));
			return people;
		} catch (SQLException e) {
			return null;
		}

	}

}
