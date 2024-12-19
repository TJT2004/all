package org.example.abc.controller;
import org.example.abc.enity.User;
import org.example.abc.common.Result;
import org.example.abc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class LoginController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/finduser")
    public Result getUser()
    {
        List<User> UserList = userMapper.findAll();
        return Result.success(UserList);
    }
    @PostMapping("/findByid")
    public Result findUserByid(@RequestBody User user){
        User x = userMapper.findByid(user.getUsername(),user.getPassword());
        if (x!=null){
            return Result.success();
        }
        else {
            return Result.error("用户名或密码错误");
        }
    }
    @PostMapping("/adduser")
    public Result addUser(@RequestBody User user){
        User xxx = userMapper.findByid(user.getUsername(),user.getPassword());
        if(xxx!=null){
            return Result.error("该用户已存在");
        }else{
            userMapper.insertUser(user.getUsername(),user.getPassword());
            return Result.success();
        }
    }
}
