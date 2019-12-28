package cn.itcast.dao;

import cn.itcast.pojo.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UserDao {
    @Select("SELECT * FROM `user`")
    List<User> FindAllUser();
    @Insert("INSERT INTO `user`(`name`,`age`) VALUES(#{name},#{age});")
    int AddUser(User user);
}
