package com.tranquyet.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		List<T> resultsList = new ArrayList<T>();

		Connection connection = null;
		PreparedStatement statement = null;
		ResultSet resultSet = null;

		try {
			connection = getConnectToJDBC();
			statement = connection.prepareStatement(sql);
			// set parameters
			resultSet = statement.executeQuery();

			while (resultSet.next()) {
				resultsList.add(rowMapper.mapRow(resultSet));
			}

		} catch (SQLException e) {
			return null;
		} finally {

			try {
				if (connection != null) {
					connection.close();
				}
				if (statement != null) {
					statement.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				return null;
			}

		}

	}
}
