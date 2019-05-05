package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.UserInfo;

public class UserMapper implements RowMapper<UserInfo>{
	
	public static final String BASE_SQL="SELECT u.id,u.name, u.id_number, u.type,u.phone, u.avt,u.start_at, u.email, u.address FROM user u";

	@Override
	public UserInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Long id= rs.getLong("id");
		String name= rs.getString("name");
		Long id_number= rs.getLong("id_number");
		Long type = rs.getLong("type");
		Long phone= rs.getLong("phone");
		String avt= rs.getString("avt");
		String start_at= rs.getString("start_at");
		String email= rs.getString("email");
		Long address= rs.getLong("address");
		return new UserInfo(id, name,id_number,type,phone,avt,start_at,email, address);
	}

}
