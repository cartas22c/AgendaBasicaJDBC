package com.capgemini.persistence;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.InitializingBean;

public class JdbcTest implements InitializingBean {
	private DataSource dataSource;
	 public void afterPropertiesSet() throws SQLException, ClassNotFoundException {
	      // run the actual test
	      Class.forName("com.mysql.jdbc.Driver");
 
		 Connection conn = null;
		 conn = dataSource.getConnection(); 
	     Statement stmt = null;
		 stmt = conn.createStatement();
	  }
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	 
	 
	 
}
