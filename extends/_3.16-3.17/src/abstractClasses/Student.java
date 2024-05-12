package abstractClasses;
public class Student extends Person {
    private String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }
    public String getDescription(){
        return getName() + "是一个学生，专业是：" + major;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

}
