package com.tranquyet.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.tranquyet.model.Category;

public class CategoryMapper implements RowMapper<Category>{

	@Override
	public Category mapRow(ResultSet rs) {
		Category category = new Category();
		try {
			category.setIdCategory(rs.getString("id"));
			category.setNameCategory(rs.getString("name"));
			return category;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
