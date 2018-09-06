package com.springaop.service;

import com.springaop.model.User;

public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
