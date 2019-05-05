package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.PostInfo;

public class PostMapper implements RowMapper<PostInfo>{

	public static final String BASE_SQL="SELECT p.id, p.title, p.content, p.img, p.start_at,p.`status`, p.price, ad.city as city,u.name as name,c.name as type From posts p\r\n" + 
			"			LEFT JOIN address ad ON ad.id=p.address\r\n" + 
			"			LEFT JOIN `user` u on u.id=p.`user`\r\n" + 
			"			LEFT JOIN apartment a on a.id=p.apartment\r\n" + 
			"			LEFT JOIN category c on c.id= a.type\r\n" + 
			"where u.id=2"; 
	@Override
	public PostInfo mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		// TODO Auto-generated method stub
		Long id= rs.getLong("id");
		String title= rs.getString("title");
		String content= rs.getString("content");
		String img= rs.getString ("img");
		String startAt= rs.getString ("start_at");
		Long status= rs.getLong("status");
		Double price= rs.getDouble("price");
		String address= rs.getString("city");
		String user= rs.getString("name");
		String apartment= rs.getString("type");
//		Long addressId=rs.getLong("address.id");
//		String city= rs.getString("address.city");
//		Long userId= rs.getLong("user.id");
//		String name= rs.getString("user.name");
//		Long apartmentId= rs.getLong("apartment.id");
//		String type= rs.getString ("apartment.type");
		
		
		return new PostInfo(id, title,content,img,startAt,status,price,address,user,apartment
				/*addressId, city, userId, name, apartmentId, type*/);
	}

}
