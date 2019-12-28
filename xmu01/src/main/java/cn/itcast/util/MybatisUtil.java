package cn.itcast.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    private static SqlSessionFactory factory;

    static {//静态块下SqlSessionFactory只会创建一次
        try {
            //1.获取输出流
            InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
            //2.创建sqlSessionfactory 完成配置读取
            factory = new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //创建SqlSession
    public static SqlSession createSqlSession(){

        return factory.openSession(false);//false自动提交事务 true手动
    }
    //关闭SqlSession
    public  static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession != null){
            sqlSession.close();
        }
    }
}
