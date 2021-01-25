package com.tranquyet.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import com.tranquyet.dao.GenericDao;
import com.tranquyet.mapper.RowMapper;

public class AbstractDao<T> implements GenericDao<T> {
	private final String USERNAME = "root";
	private final String PASSWORD = "54935620tQ.";
	private final String ADDRESS = "jdbc:mysql://localhost:3306/information";

	public Connection getConnectToJDBC() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(ADDRESS, USERNAME, PASSWORD);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		// TODO Auto-generated method stub
		return null;
	}
}
