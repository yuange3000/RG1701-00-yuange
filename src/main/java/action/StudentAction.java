package action;
import PO.Achievement;
import PO.Admin;
import PO.Student;
import com.opensymphony.xwork2.ActionSupport;
import dao.HbnUtils;
import org.apache.struts2.interceptor.SessionAware;
import org.hibernate.Session;
import java.util.List;
import java.util.Map;
public class StudentAction extends ActionSupport implements SessionAware {
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
    private  List<Achievement> achieveList;

    //查询所有学生信息
    public String findAll(){
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        String hql="from Student";
        stuList = hbnSession.createQuery(hql).list();
        session.put("stuList",this.stuList);
        hbnSession.getTransaction().commit();
        if(stuList!=null)
            return "success";
        else
            return "error";
    }
    //删除
    public String delete() {
        hbnSession = HbnUtils.getSession();
        try {
            hbnSession.beginTransaction();
            Student student = new Student();
            student.setSid(this.getSid());
            hbnSession.delete(student);
            System.out.println(this.getSid());
            hbnSession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            //回滚
            hbnSession.getTransaction().rollback();
            return "error";
        }
    }
    //更新
    public String update(){
            hbnSession = HbnUtils.getSession();
        try {
            hbnSession.beginTransaction();
            Student student = new Student(this.getSid(),this.getName(),this.getPassword(),this.getGrade(),this.getSex(),this.getBirthday(),this.getUniversity(),this.getMajor(),this.getDepartment());
            hbnSession.update(student);
            hbnSession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            //回滚
            hbnSession.getTransaction().rollback();
            return "error";
        }
    }
    //查找
    public String search(){
        hbnSession = HbnUtils.getSession();
            hbnSession.beginTransaction();
            String hql = "from Student Where name like :tname" ;
            stuList_search = hbnSession.createQuery(hql).setParameter("tname", "%" + this.getName() + "%").list();
            session.put("stuList_search", this.stuList_search);
            System.out.println(stuList_search);
            hbnSession.getTransaction().commit();
        if(stuList_search!=null)
            return "success";
        else
            return "error";

    }
    public String add(){
        hbnSession = HbnUtils.getSession();
        try {
            hbnSession.beginTransaction();
            Student student = new Student(this.getSid(),this.getName(),this.getPassword(),this.getGrade(),this.getSex(),this.getBirthday(),this.getUniversity(),this.getMajor(),this.getDepartment());
            hbnSession.save(student);
            hbnSession.getTransaction().commit();
            return "success";
        } catch (Exception e) {
            e.printStackTrace();
            //回滚
            hbnSession.getTransaction().rollback();
            return "error";
        }
    }
    public String findlocal(){
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        String hql="from Student where department = '信电'";
        stuList = hbnSession.createQuery(hql).list();
        session.put("stuList",this.stuList);
        hbnSession.getTransaction().commit();
        if(stuList!=null)
            return "success";
        else
            return "error";
    }
    public String find(){
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        String hql="from Student";
        stuList = hbnSession.createQuery(hql).list();
        session.put("stuList",this.stuList);
        hbnSession.getTransaction().commit();
        if(stuList!=null)
            return "success";
        else
            return "error";
    }
    public String findAchievement(){
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        String hql1 = "from Achievement where student_sid = ?1";
        achieveList = hbnSession.createQuery(hql1).setParameter(1,this.getSid()).list();
        session.put("achieveList",this.achieveList);
        System.out.println(this.achieveList);
        hbnSession.getTransaction().commit();
        if(achieveList!=null)
            return "success";
        else
            return "error";
    }
    public String findAchievementAdmin(){
        hbnSession= HbnUtils.getSession();
        hbnSession.beginTransaction();
        String hql1 = "from Achievement";
        achieveList = hbnSession.createQuery(hql1).list();
        session.put("achieveList",this.achieveList);
        System.out.println(this.achieveList);
        hbnSession.getTransaction().commit();
        if(achieveList!=null)
            return "success";
        else
            return "error";
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

    public List<Achievement> getAchieveList() {
        return achieveList;
    }

    public void setAchieveList(List<Achievement> achieveList) {
        this.achieveList = achieveList;
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
