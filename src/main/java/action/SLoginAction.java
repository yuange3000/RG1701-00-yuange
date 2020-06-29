package action;
import PO.Achievement;
import PO.Admin;
import PO.Student;
import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
public class SLoginAction extends ActionSupport implements SessionAware {
    private String name;
    private String password;
    private int sid;
    private Map<String, Object> session;
    private Session hbnSession;
    private List<Admin> list;
    private  List<Student> stuList=new ArrayList<Student>();
    private List achieveList;

    public List getAchievement() {
        return achieveList;
    }

    public void setAchievement(List<Achievement> achievement) {
        this.achieveList = achievement;
    }

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
    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    @Override
    public String execute() throws Exception {


        String hql = "from Student where name=?1 and password=?2";
        System.out.println(hql);
        hbnSession = HbnUtils.getSession();
        hbnSession.beginTransaction();
        Student student = (Student) hbnSession.createQuery(hql)
                .setParameter(1, this.getName())
                .setParameter(2, this.getPassword())
                .uniqueResult();
        System.out.println(student);
        stuList.add(student);
        session.put("stuList",this.stuList);
        session.put("student_name",this.getName());
        System.out.println(this.getName());
        System.out.println(this.getPassword());

        String hql1 = "from Achievement where student_sid = ?1";
        achieveList = hbnSession.createQuery(hql1).setParameter(1,student.getSid()).list();
        session.put("achieveList",this.achieveList);
        System.out.println(this.achieveList);
        hbnSession.getTransaction().commit();
        if (student == null) {
            System.out.println("student is null");
            return "login";
        } else{
            return "success";
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
