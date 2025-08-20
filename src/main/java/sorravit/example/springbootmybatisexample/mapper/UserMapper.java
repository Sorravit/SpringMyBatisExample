package sorravit.example.springbootmybatisexample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import sorravit.example.springbootmybatisexample.model.User;

@Mapper
public interface UserMapper {

    @Insert("INSERT INTO user(name, age) VALUES(#{name}, #{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertUser(User user);

    @Delete("truncate user")
    void deleteAllUser();

    void updateUserName(@Param("id") Long id, @Param("name") String name);

    List<User> getAllUsers();
    User getUserById(@Param("id") Long id);
}
