package cn.smbms.test.user;

import cn.smbms.beans.User;
import cn.smbms.dao.user.UserDao;
import cn.smbms.util.MyBatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-16 09:02
 */
public class Text {
    private Logger logger = Logger.getLogger(Text.class);

    public static void main(String[] args) {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("configuration.xml");
            SqlSessionFactory build = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = build.openSession();
            int count = sqlSession.getMapper(UserDao.class).getUsercount();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Test01() {
        SqlSession session = MyBatisUtil.createSession();
        int count = session.getMapper(UserDao.class).getUsercount();
        MyBatisUtil.closeSqlSession(session);
        System.out.println(count);
    }

    @Test
    public void addUser() {
        User user = new User();
        user.setUserCode("zhangsan");
        user.setUserName("张三");
        user.setUserPassword("123456");
        SqlSession session = MyBatisUtil.createSession();
        session.getMapper(UserDao.class).addUser(user);
        session.commit();
        MyBatisUtil.closeSqlSession(session);
    }

    @Test
    public void testUpdateUser() {
        SqlSession session = MyBatisUtil.createSession();
        session.getMapper(UserDao.class).updateUser2(2, "张三");
        session.commit();
        MyBatisUtil.closeSqlSession(session);
    }

    @Test
    public void deleteUser() {
        User user = new User();
        user.setId(2);
        SqlSession session = MyBatisUtil.createSession();
        session.getMapper(UserDao.class).deleteUser(user);
        session.commit();
        MyBatisUtil.closeSqlSession(session);
    }

    @Test
    public void testgetUserByRoleId() {
        SqlSession session = MyBatisUtil.createSession();
        List<User> userByRoleId = session.getMapper(UserDao.class).getUserByRoleId(2);
        for (User user : userByRoleId) {
            System.out.println(user.getId() + " " + user.getUserName() + " " + user.getAddress()
                    + " " + user.getRole());
        }
        MyBatisUtil.closeSqlSession(session);
    }

    @Test
    public void getUserRoleName() {
        SqlSession session = MyBatisUtil.createSession();
        List<User> userRoleName = session.getMapper(UserDao.class).getUserRoleName(15);
        for (User user : userRoleName) {
            System.out.println(
                    user.getId() + " "
                            + user.getUserName() + " "
                            + user.getRole());
        }
        MyBatisUtil.closeSqlSession(session);
    }
}
