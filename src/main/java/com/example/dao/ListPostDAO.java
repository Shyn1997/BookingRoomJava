package com.example.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.mapper.PostMapper;
import com.example.model.PostInfo;

@Repository
@Transactional
public class ListPostDAO extends JdbcDaoSupport{
	@Autowired
    public ListPostDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

	public List<PostInfo> getPosts() {
        String sql = PostMapper.BASE_SQL;
 
        Object[] params = new Object[] {};
        PostMapper mapper = new PostMapper();
        List<PostInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
 
        return list;
    }
	public List<PostInfo> getPost(Long id) {
        String sql = PostMapper.BASE_SQL +"WHRER id= "+ id;
 
        Object[] params = new Object[] {};
        PostMapper mapper = new PostMapper();
        List<PostInfo> list = this.getJdbcTemplate().query(sql, params, mapper);
 
        return list;
    }
}
