package Collection.Map.HashMapDemo.hashmapDemo1;

import java.util.Objects;

public class Student {
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

    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null && this.getClass() != obj.getClass()){
            return false;
        }
        Student student = (Student) obj;
        return this.getName().equals(student.getName()) && this.getAge() == student.getAge();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
