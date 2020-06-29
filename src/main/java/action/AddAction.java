package action;
import PO.Admin;
import PO.Student;
import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import java.util.List;
import java.util.Map;
public class AddAction extends ActionSupport implements SessionAware {
    private String name;
    private String password;
    private int sid;
    private String grade;
    private String sex;
    private String birthday;
    private String university;
    private String department;
    private String major;



    private  Map<String,Object> session;
    private Session hbnSession;
    private  List<Student> stuList;
    private List<Student> stuList_search;
    public String execute() throws Exception {
        hbnSession = HbnUtils.getSession();
            hbnSession.beginTransaction();
            Student student = new Student(this.getSid(),this.getName(),this.getPassword(),this.getGrade(),this.getSex(),this.getBirthday(),this.getUniversity(),this.getMajor(),this.getDepartment());
            hbnSession.save(student);
            hbnSession.getTransaction().commit();
            if(student == null){
                    System.out.println("student is null");
                    return "error";
            }
            else
                return "success";

    }
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
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
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public List<Student> getStuList() {
        return stuList;
    }

    public void setStuList(List<Student> stuList) {
        this.stuList = stuList;
    }

    public List<Student> getStuList_search() {
        return stuList_search;
    }

    public void setStuList_search(List<Student> stuList_search) {
        this.stuList_search = stuList_search;
    }

    public Map<String, Object> getSession() {
        return session;
    }
    public void setSession(Map<String, Object> session) {
        this.session=session;
    }
}
