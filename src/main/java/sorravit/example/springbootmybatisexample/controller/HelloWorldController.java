package sorravit.example.springbootmybatisexample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sorravit.example.springbootmybatisexample.model.User;
import sorravit.example.springbootmybatisexample.service.UserService;

@RestController
public class HelloWorldController {

    @Autowired
    UserService userService;

    @GetMapping("/")
    public String helloWorld() {
        User user = new User();
        user.setAge(12);
        user.setName("big");
        userService.createUser(user);
        return "Hello World!";
    }

    @GetMapping("/deleteAllUser")
    public String deleteAllUser() {
        userService.deleteAllUser();
        return "All users deleted!";
    }
}
