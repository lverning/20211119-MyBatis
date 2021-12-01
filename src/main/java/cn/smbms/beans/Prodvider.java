package cn.smbms.beans;


import java.util.Date;

/**
 * @author： 吕二宁
 * @date： 2021-11-16 10:13
 */
public class Prodvider {
   private int id;
   private String proCode;
   private String proName;
   private String proDesc;
   private String proContact;
   private String proPhone;
   private String proAddress;
   private String proFax;
   private int createdBy;
   private Date creationDate;
   private Date modifyDate;
   private int modifyBy;

    public Prodvider() {
    }

    public Prodvider(int id, String proCode, String proName, String proDesc, String proContact, String proPhone, String proAddress, String proFax, int createdBy, Date creationDate, Date modifyDate, int modifyBy) {
        this.id = id;
        this.proCode = proCode;
        this.proName = proName;
        this.proDesc = proDesc;
        this.proContact = proContact;
        this.proPhone = proPhone;
        this.proAddress = proAddress;
        this.proFax = proFax;
        this.createdBy = createdBy;
        this.creationDate = creationDate;
        this.modifyDate = modifyDate;
        this.modifyBy = modifyBy;
    }

    @Override
    public String toString() {
        return "Prodvider{" +
                "id=" + id +
                ", proCode='" + proCode + '\'' +
                ", proName='" + proName + '\'' +
                ", proDesc='" + proDesc + '\'' +
                ", proContact='" + proContact + '\'' +
                ", proPhone='" + proPhone + '\'' +
                ", proAddress='" + proAddress + '\'' +
                ", proFax='" + proFax + '\'' +
                ", createdBy=" + createdBy +
                ", creationDate=" + creationDate +
                ", modifyDate=" + modifyDate +
                ", modifyBy=" + modifyBy +
                '}';
    }
}
