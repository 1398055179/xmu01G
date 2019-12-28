package cn.itcast.controller;

import cn.itcast.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import cn.itcast.pojo.User;
import java.util.List;
//asdaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa
@Controller
public class UserController {
    @Autowired
    private UserServices userServices;
    @RequestMapping("/DindAllUser")
    public String AllUser(Model model){
        List<User> UserList = userServices.FindAllUser();
        model.addAttribute("UserLiset",UserList);
        return "DindAllUser";
    }

    @RequestMapping("/date-AllUser")
    @ResponseBody
    public List<User> dateAllUser(){
        List<User> userList = userServices.FindAllUser();
        return userList;
    }


    @RequestMapping("/AddUser")
    public String dataAddUser(String name ,long age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        System.out.println(name+">>>>>>>>>>>>>>>>>>"+age);
        int UserList =userServices.AddUser(user);
        return "AddUser";
    }
}
