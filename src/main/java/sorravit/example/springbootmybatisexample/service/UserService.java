package sorravit.example.springbootmybatisexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sorravit.example.springbootmybatisexample.mapper.UserMapper;
import sorravit.example.springbootmybatisexample.model.User;

import java.util.List;

@Service
public class UserService {

    UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public User createUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    public void deleteAllUser(){
        userMapper.deleteAllUser();
    }

    public void updateUserName(Long id, String name) {
        userMapper.updateUserName(id, name);
    }

    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    public User getUserById(Long id) {
        return userMapper.getUserById(id);
    }
}
