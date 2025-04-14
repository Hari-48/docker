package com.Docker.demo.Controller;

import com.Docker.demo.Entity.Users;
import com.Docker.demo.Repo.UserRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {


    private final UserRepo repo;

    public UserController(UserRepo repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Users> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Users create(@RequestBody Users user) {
        return repo.save(user);
    }
}
