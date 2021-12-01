package cn.smbms.test.prodvider;

import cn.smbms.beans.Prodvider;
import cn.smbms.beans.User;
import cn.smbms.dao.user.ProdviderDao;
import cn.smbms.dao.user.UserDao;
import cn.smbms.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-16 10:18
 */
public class SelectProdviderTest {
    @Test
    public void test01() {
        SqlSession session = MyBatisUtil.createSession();
        List<Prodvider> prodviderList = session.getMapper(ProdviderDao.class).getProdviderList();
        MyBatisUtil.closeSqlSession(session);
        for (Prodvider prodvider : prodviderList) {
            System.out.println(prodvider);
        }
    }

    @Test
    public void test02() {
        SqlSession session = MyBatisUtil.createSession();
        List<User> userList = session.getMapper(UserDao.class).getUserListByName("赵");
        for (User user : userList) {
            System.out.println(user);
        }
        MyBatisUtil.closeSqlSession(session);
    }

    @Test
    public void test03() {
        HashMap<String, String> map = new HashMap<>();
        map.put("userName", "赵");
        map.put("userRole", "3");
        SqlSession session = MyBatisUtil.createSession();
        List<User> userListByNameadnRole = session.getMapper(UserDao.class).getUserListByNameadnRole(map);
        for (User user : userListByNameadnRole) {
            System.out.println(user);
        }
    }
}
