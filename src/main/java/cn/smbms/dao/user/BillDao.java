package cn.smbms.dao.user;

import cn.smbms.beans.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author： 吕二宁
 * @date： 2021-11-17 17:20
 */
public interface BillDao {
    public List<Bill> getBill(Bill bill);
    public List<Bill> getBillproNameandproid(@Param("productName") String productName, @Param("providerId") Integer providerId, @Param("isPayment") Integer isPayment);
}
