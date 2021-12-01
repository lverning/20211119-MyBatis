package cn.smbms.test.bill;

import cn.smbms.beans.Bill;
import cn.smbms.dao.user.BillDao;
import cn.smbms.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-17 17:24
 */
public class BillTest {
    @Test
    public void test02(){
        SqlSession session = MyBatisUtil.createSession();
        List<Bill> billList = session.getMapper(BillDao.class).getBillproNameandproid("油", 7, 2);
        for (Bill bill : billList) {
            System.out.println(bill);
        }
        MyBatisUtil.closeSqlSession(session);
    }
}
