package sorravit.example.springbootmybatisexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sorravit.example.springbootmybatisexample.mapper.UserMapper;

@SpringBootApplication
public class SpringbootMybatisExampleApplication {

    private final UserMapper userMapper;

    public SpringbootMybatisExampleApplication(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisExampleApplication.class, args);
    }

}
