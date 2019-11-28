package com.ma.dao;

import com.ma.model.User;

public interface UserDAO {
    public boolean addUser( User user );

	public User getUserByID(String userid, String userpassword);
}
