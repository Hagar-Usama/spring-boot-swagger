package explore.Hagar.swaggerboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import explore.Hagar.swaggerboot.entity.UserEntity;
import explore.Hagar.swaggerboot.repo.UserRepo;

@RestController
@RequestMapping("/api/v2/users")
public class UserController {

    UserRepo userRepo;

    @Autowired
    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @GetMapping("/")
    public List<UserEntity> getUsers() {
        List<UserEntity> users = userRepo.findAll();
        return users;
    }
    
}
