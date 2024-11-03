package sorravit.example.springbootmybatisexample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sorravit.example.springbootmybatisexample.mapper.UserMapper;
import sorravit.example.springbootmybatisexample.model.User;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User createUser(User user) {
        userMapper.insertUser(user);
        return user;
    }

    public void deleteAllUser(){
        userMapper.deleteAllUser();
    }
}
