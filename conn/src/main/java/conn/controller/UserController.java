package conn.controller;

import conn.entity.User;
import conn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/user/")
public class UserController {
    @Autowired
    private UserService userService;
    @ResponseBody
    @RequestMapping("selectAllUser")
    public List<User> selectAllUser(){
        return userService.selecctALlUser();
    }
}
