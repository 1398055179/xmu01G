package cn.itcast.services.impl;
import cn.itcast.pojo.User;
import cn.itcast.dao.UserDao;
import cn.itcast.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("UserServices")
public class UserServicesImpl implements UserServices {

    @Autowired
        private UserDao userDao;

    @Override
    public int AddUser(User user) {
        System.out.println(">>>>>>>>>>>>");
        return userDao.AddUser(user);
    }

    @Override
    public List<User> FindAllUser() {
        System.out.println(">>>>>>>>>>>>");
        return userDao.FindAllUser();
    }
}
