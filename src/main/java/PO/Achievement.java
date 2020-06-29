package PO;

import javax.persistence.*;

@Entity
@Table(name = "achievement")
public class Achievement {
    private int student_sid;
    private String student_name;
    private String math;
    private String english;
    private String physics;
    private String javaweb;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getStudent_sid() {
        return student_sid;
    }

    public void setStudent_sid(int student_sid) {
        this.student_sid = student_sid;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getMath() {
        return math;
    }

    public void setMath(String math) {
        this.math = math;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getPhysics() {
        return physics;
    }

    public String getJavaweb() {
        return javaweb;
    }

    public void setJavaweb(String javaweb) {
        this.javaweb = javaweb;
    }

    public void setPhysics(String physics) {
        this.physics = physics;
    }
    public  Achievement(){}
    public String toString(){
        return "Achievement {" +
                "id="+student_sid+",name='" + student_name +'\'' + ",math='" + math +'\''+"}";
    }
}
