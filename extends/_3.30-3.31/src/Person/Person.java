package Person;

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Student implements HumanBehavior {
        private String school;

        public Student(String school) {
            this.school = school;
        }

        public void work() {
            System.out.println(getName() + "正在学习专业课程");
        }

        public void communicate() {
            System.out.println(getName() + "正在参加小组讨论");
        }

        public void attendClass() {
            System.out.println(getName() + "正在上课");
        }

        public void introduceYourself() {
            System.out.println("大家好，我是" + getName() + "，我是一名学生，在" + school + "上学。");
        }
    }

    public class Engineer implements Profession, HumanBehavior {
        private String company;

        public Engineer(String company) {
            this.company = company;
        }

        public void work() {
            System.out.println(getName() + "正在编写代码");
        }


        public void communicate() {
            System.out.println(getName() + "正在与团队成员沟通项目进度");
        }

        public void performDuties() {
            System.out.println(getName() + "正在解决技术问题");
        }

        public void introduceYourself() {
            System.out.println("大家好，我是" + getName() + "，我是一名工程师，在" + company + "工作。");
        }
    }
}

