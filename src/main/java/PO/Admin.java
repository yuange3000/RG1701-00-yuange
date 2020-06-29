package PO;

import javax.persistence.*;

@Entity
@Table(name = "admin_ms")
public class Admin {
    private int mid;
    private String admin_name;
    private String admin_password;
    private int admin_roleid;
    private String admin_rolename;

    public Admin() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public int getAdmin_roleid() {
        return admin_roleid;
    }

    public void setAdmin_roleid(int admin_roleid) {
        this.admin_roleid = admin_roleid;
    }

    public String getAdmin_rolename() {
        return admin_rolename;
    }

    public void setAdmin_rolename(String admin_rolename) {
        this.admin_rolename = admin_rolename;
    }
    public  Admin(String admin_name, String admin_password,int admin_roleid,String admin_rolename){
        this.admin_name = admin_name;
        this.admin_password = admin_password;
        this.admin_roleid = admin_roleid;
        this.admin_rolename = admin_rolename;


    }
    public String toString(){
        return "Student {" +
                "id="+admin_roleid+",name='" + admin_name +'\'' + ",admin_rolename='" + admin_rolename +'\''+"}";
    }
}