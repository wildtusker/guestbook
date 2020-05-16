package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.model.Login;
import com.model.User;




public class UserDaoImpl implements UserDao {

	  @Autowired
	  DataSource datasource;

	  @Autowired
	  JdbcTemplate jdbcTemplate;

 


public User validateUser(Login login) {
	  // String sql = "select * from users where username='" + login.getUsername() + "' and password='" + login.getPassword() + "'";
	
	  String sql = "select * from users where username='" + login.getUsername() + "'";
	  // jdbcTemplate.
	  //List<User> users= jdbcTemplate.execute(sql);
 List<User> users = jdbcTemplate.query(sql, new UserMapper());
 
 

  return  users.size() > 0 ? users.get(0) : null;
}




public int register(User user) {
	// TODO Auto-generated method stub
	return 0;
}

}

class UserMapper implements RowMapper<User> {

  public User mapRow(ResultSet rs, int arg1) throws SQLException {
    User user = new User();

    user.setUsername(rs.getString("username"));
   // user.setPassword(rs.getString("password"));
    user.setFirstname(rs.getString("firstname"));
    //user.setLastname(rs.getString("lastname"));
  
    return user;
  }
}