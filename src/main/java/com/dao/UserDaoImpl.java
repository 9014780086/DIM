package com.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.pojo.User;
import com.pojo.UserResultSet;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public int insertUser(User user) {
		System.out.println("received data to dao layer" + user);
		String insertQuery = "insert into user values(?,?,?,?)";
		int rowsAffected = jdbcTemplate.update(insertQuery,
				new Object[] { user.getUsername(), user.getUserid(), user.getPwd(), user.getMemid() });
		return rowsAffected;
	}

	public int updateInfo(User user) {
		System.out.println("data received to dao layer is" + user);
		String updateQuery = "update user set userName=:name, userId =:id, pwd= :pwd where memId= :id";

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("name", user.getUsername());
		map.put("id", user.getUserid());
		map.put("pwd", user.getPwd());
		map.put("id", user.getMemid());

		int noOfRowsAffected = namedParameterJdbcTemplate.update(updateQuery, map);
		return noOfRowsAffected;

	}

	public int deleteInfo(String userId) {
		System.out.println(" Data received to Dao layer is " + userId);
		String deleteQeuery = "select * from user where userid = ?";
		int noOfRowsAffected = jdbcTemplate.update(deleteQeuery, new Object[] { userId });
		return noOfRowsAffected;

	}

	public Map<String, List<User>> UserInfo() {
		String sql = "select * from user";
		Map<String, List<User>> mapObj = jdbcTemplate.query(sql, new UserResultSet());
		return mapObj;
	}

}
