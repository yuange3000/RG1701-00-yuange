package PO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "student_ms")
public class Student {
    private int sid;
    private String password;
    private String name;
    private String grade;
    private String sex;
    private String birthday;
    private String university;
    private String department;
    private String major;



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Student() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public  Student(int sid,String name, String password,String grade,String sex,String birthday,String university, String major,String department){
        this.sid = sid;
        this.name = name;
        this.password = password;
        this.grade = grade;
        this.sex = sex;
        this.birthday = birthday;
        this.university = university;
        this.major = major;
        this.department = department;

    }
    public String toString(){
        return "Student {" +
                "id="+sid+",name='" + name +'\'' + ",age='" + birthday +'\''+"}";
    }
}