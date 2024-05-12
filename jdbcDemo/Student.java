public class Student{
    private Integer id;
    private String name;
    private Integer score;
    private String teacherComment;

    public Student(){

    }

    public Student(Integer id, String name, Integer score, String teacher_comment) {
        this.id = id;
        this.name = name;
        this.score = score;
        this.teacherComment = teacher_comment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getTeacherComment() {
        return teacherComment;
    }

    public void setTeacherComment(String teacherComment) {
        this.teacherComment = teacherComment;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", score=" + score +
                ", teacher_comment='" + teacherComment + '\'' +
                '}';
    }
}
