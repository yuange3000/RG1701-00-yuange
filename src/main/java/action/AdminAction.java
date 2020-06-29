package action;
import PO.Admin;
import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class AdminAction extends ActionSupport implements SessionAware {
    private String admin_name;
    private String admin_password;
    private String admin_roleid;

    public String getAdmin_roleid() {
        return admin_roleid;
    }

    public void setAdmin_roleid(String admin_roleid) {
        this.admin_roleid = admin_roleid;
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

    private Map<String, Object> session;
    private Session hbnSession;
    private List<Admin> list;

    public Session getHbnSession() {
        return hbnSession;
    }

    public void setHbnSeeion(Session hbnSession) {
        this.hbnSession = hbnSession;
    }

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public String execute() throws Exception {
        String hql = "from Admin where admin_name=?1 and admin_password=?2";
        System.out.println(hql);
        hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        Admin admin = (Admin) hbnSession.createQuery(hql)
                .setParameter(1, this.getAdmin_name())
                .setParameter(2, this.getAdmin_password())
                .uniqueResult();
        System.out.println(admin);
        System.out.println(admin.getAdmin_roleid());
        session.put("admin_name", this.getAdmin_name());
        System.out.println(this.getAdmin_name());
        System.out.println(this.getAdmin_password());
        hbnSession.getTransaction().commit();
        if (admin == null) {
            System.out.println("admin is null");
            return "login";
        } else {
            if(admin.getAdmin_roleid() == 0){
                session.put("username","超级");
                return "success";
            }
           else if (admin.getAdmin_roleid() == 1){
                session.put("username","信电");
               return "success_1";

            }
           else
               return "success_2";
        }
    }
}