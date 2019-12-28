package cn.itcast.services;

import java.util.List;
import cn.itcast.pojo.User;

public interface UserServices {
    List<User> FindAllUser();
    int AddUser(User user);
}
