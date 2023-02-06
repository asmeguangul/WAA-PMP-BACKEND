package edu.miu.waapmp.controller;

import edu.miu.waapmp.entity.Users;
import edu.miu.waapmp.service.UsersService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {

    private final UsersService usersService;

    public UsersController(UsersService usersService) {
        this.usersService = usersService;
    }

    @GetMapping
    public List<Users> getAllUsers(){
        return usersService.getAllUsers();
    }

    @GetMapping("{id}")
    public Users getUsers(@PathVariable int id){
        return usersService.getUserById(id);
    }

    @PostMapping
    public void saveUsers(@RequestBody Users users){
        usersService.saveUser(users);
    }
    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable int id){
        usersService.deleteUser(id);
    }

    @PutMapping("/{id}")
    public void updateUsers(@PathVariable int id, @RequestBody Users users){
        usersService.updateUser(id, users);
    }
}
