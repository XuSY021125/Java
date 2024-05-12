public class Student {
    private int id;
    private String name;
    private String gender;
    private int age;

    static String teacher = "迈克";

    public Student(){

    }

    public Student(int id, String name, String gender, int age){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getGender(){
        return gender;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
