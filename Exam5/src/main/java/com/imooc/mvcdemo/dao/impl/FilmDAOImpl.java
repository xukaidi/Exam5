package com.imooc.mvcdemo.dao.impl;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.imooc.mvcdemo.dao.FilmDAO;

public class FilmDAOImpl implements FilmDAO{

	@Autowired
	 private DataSource dataSource;
	   private JdbcTemplate jdbcTemplateObject; 
	   public void setDataSource(DataSource dataSource) {
	      this.dataSource = dataSource;
	      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	   }
	
	
	public void create(String title, String des, Integer languageid) {
		// TODO Auto-generated method stub
		
		// String SQL1 = "insert into language (language_id,name) values (?,?)";
		// jdbcTemplateObject.update( SQL1,4,"French");
//		 String SQL2 = "insert into language (language_id) values (?)";
//		 jdbcTemplateObject.update( SQL1,languageid);
		 
		 String SQL = "insert into film (title, description,language_id) values (?, ?, ?)";     
	      jdbcTemplateObject.update( SQL, title, des,languageid);
	      System.out.println("Created File title = " + title + " des = " + des+"languageid="+languageid);
		
		
	}

}
