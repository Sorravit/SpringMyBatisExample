package sorravit.example.springbootmybatisexample.controller;

import org.springframework.web.bind.annotation.*;
import sorravit.example.springbootmybatisexample.model.User;
import sorravit.example.springbootmybatisexample.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @DeleteMapping
    public String deleteAllUsers() {
        userService.deleteAllUser();
        return "All users deleted!";
    }

    @PutMapping("/{id}/name")
    public String updateUserName(@PathVariable Long id, @RequestBody String name) {
        userService.updateUserName(id, name);
        return "User name updated successfully";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
}
