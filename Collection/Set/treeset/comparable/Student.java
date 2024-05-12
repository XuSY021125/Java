package Collection.Set.treeset.comparable;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int compareTo(Student o) {
        System.out.println("-----------------------");
        System.out.println("this:" + this);
        System.out.println("o:" + o);
        return this.getAge() - o.getAge();
    }
}