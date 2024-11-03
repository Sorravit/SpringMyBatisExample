package sorravit.example.springbootmybatisexample.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import sorravit.example.springbootmybatisexample.model.User;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    void insertUser(User user);

    @Delete("truncate user")
    void deleteAllUser();
}
