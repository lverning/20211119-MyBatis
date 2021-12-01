package cn.smbms.dao.user;

import cn.smbms.beans.User;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-16 08:57
 */
public interface UserDao {
    public int getUsercount();

    public List<User> getUserList();

    public List<User> getUserListByName(String name);

    public List<User> getUserListByNameadnRole(HashMap<String, String> map);

    public int addUser(User user);

    public int updateUser(User user);

    public int updateUser2(@Param("id") int id, @Param("userName") String userName);

    public int deleteUser(User user);

    public List<User> getUserByRoleId(@Param("id") Integer id);

    public List<User> getUserRoleName(Integer id);
}
