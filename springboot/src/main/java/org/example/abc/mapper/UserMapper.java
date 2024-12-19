package org.example.abc.mapper;

import org.example.abc.enity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> findAll();
    @Select("select * from user where username = #{username} and password=#{password}")
    public User findByid(String username,String password);
    @Insert("insert into user values (#{username},#{password})")
    public int insertUser(String username,String password);
}
