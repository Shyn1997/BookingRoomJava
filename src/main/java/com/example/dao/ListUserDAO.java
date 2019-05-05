package com.example.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.UserMapper;
import com.example.model.UserInfo;

@Repository
@Transactional
public class ListUserDAO extends JdbcDaoSupport{
	@Autowired
    public ListUserDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }
 
    public List<UserInfo> getUser() {
        String sql = UserMapper.BASE_SQL;
 
        Object[] params = new Object[] {};
        UserMapper mapper = new UserMapper();
        List<UserInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
 
        return list;
    }

}
