package com.tranquyet.dao;

import java.util.List;

import com.tranquyet.mapper.RowMapper;

public interface GenericDao<T> {
	@SuppressWarnings("hiding")
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
}
