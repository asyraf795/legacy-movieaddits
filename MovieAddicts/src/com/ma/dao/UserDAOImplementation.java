package com.ma.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ma.model.User;
import com.ma.util.DBUtil;

public class UserDAOImplementation implements UserDAO {

	private Connection connection;
	
	public UserDAOImplementation() {
		
		connection = DBUtil.getConnection();
		
	
	}
	@Override	
	public User getUserByID(String userid, String userpassword) {
		User user = new User();
		
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from users where userid = ? and userpassword = ?");
			preparedStatement.setString(1, userid);
			preparedStatement.setString(2, userpassword);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				user.setUserid(rs.getString("userid"));
				user.setUserpassword(rs.getString("userpassword"));
			}
			rs.close();
			preparedStatement.close();
		} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return user;
		
		
	}
	@Override
	public boolean addUser(User user) {
		try {
            String query = "insert into users (userid, userpassword) values (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement( query );
            preparedStatement.setString( 1, user.getUserid() );
            preparedStatement.setString( 2, user.getUserpassword() );
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
		return true;
    }
}
