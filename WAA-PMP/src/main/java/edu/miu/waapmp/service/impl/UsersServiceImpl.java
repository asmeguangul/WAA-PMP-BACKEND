package edu.miu.waapmp.service.impl;

import edu.miu.waapmp.entity.Users;
import edu.miu.waapmp.repository.UsersRepo;
import edu.miu.waapmp.service.UsersService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersRepo usersRepo;


    public UsersServiceImpl(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepo.findAll();
    }

    @Override
    public Users getUserById(int id) {
        return usersRepo.findById(id).get();
    }

    @Override
    public void saveUser(Users users) {
     usersRepo.save(users);
    }

    @Override
    public void deleteUser(int id) {
      usersRepo.deleteById(id);
    }

    @Override
    public void updateUser(int id, Users users) {
       usersRepo.save(users);
    }
}
