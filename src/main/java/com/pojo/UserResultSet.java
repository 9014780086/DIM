package com.pojo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class UserResultSet implements ResultSetExtractor<Map<String, List<User>>> {

	public Map<String, List<User>> extractData(ResultSet rs) throws SQLException, DataAccessException {
		Map<String, List<User>> map = new HashMap<String, List<User>>();
		List<User> list = new ArrayList<User>();
		while (rs.next()) {
			User user = new User();
			user.setUsername(rs.getString("username"));
			user.setUserid(rs.getString("userid"));
			user.setPwd(rs.getString("pwd"));
			user.setMemid(rs.getString("memid"));

		}

		map.put("user User", list);

		return map;

	}
}
