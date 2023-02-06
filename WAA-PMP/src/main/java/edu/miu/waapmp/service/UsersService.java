package edu.miu.waapmp.service;

import edu.miu.waapmp.entity.Users;

import java.util.List;

public interface UsersService {

    public List<Users> getAllUsers();
    public Users getUserById(int id);
    public void saveUser(Users users);
    public void  deleteUser(int id);
    public void updateUser(int id, Users users);
}

