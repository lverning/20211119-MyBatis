package cn.smbms.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author： 吕二宁
 * @date： 2021-11-16 08:57
 */
@Data //get set 方法
@AllArgsConstructor //有参构造
@NoArgsConstructor //无参构造
public class User {
    private int id;
    private String userCode;
    private String userName;
    private String userPassword;
    private int gender;
    private Date birthday;
    private String phone;
    private String address;
    private int userRole;
    private int createdBy;
    private Date creationDate;
    private int modifyBy;
    private Date modifyDate;
    private String Role;
}
