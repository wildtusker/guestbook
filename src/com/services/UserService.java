package com.services;

import com.model.Login;
import com.model.User;


public interface UserService {



  User validateUser(Login login);
}
