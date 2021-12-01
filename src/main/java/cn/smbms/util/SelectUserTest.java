package cn.smbms.util;

import cn.smbms.beans.User;
import cn.smbms.dao.user.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-16 09:37
 */
public class SelectUserTest {
    @Test
    public void test01(){
        SqlSession session = MyBatisUtil.createSession();
        List<User> userList = session.getMapper(UserDao.class).getUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }
}
