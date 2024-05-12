import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

//Teacher类实现增、删、改、查学生信息
public class Teacher implements QueryScore,AlterInfo{

    //创建一个static的学生列表，所有教师共享这个名单
    private static ArrayList<Student> nameList = new ArrayList<>();

    public Teacher() {

    }

    //打印学生名单
    public ArrayList<Student> printNameList(Connection connection) throws Exception {
        String sql = "select id,name,score,teacher_comment from tb_student;";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {

            Student student = new Student();

            student.setId(resultSet.getInt("id"));
            student.setName(resultSet.getString("name"));
            student.setScore(resultSet.getInt("score"));
            student.setTeacherComment(resultSet.getString("teacher_comment"));

            nameList.add(student);
        }

        resultSet.close();
        preparedStatement.close();

        return nameList;
    }

    //学生人数
    public int idCount(Connection connection) throws Exception {
        String sql = "select max(id) as 学生人数 from tb_student;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        int sum = 0;
        if (resultSet.next()){
            sum = resultSet.getInt("学生人数");
        }
        resultSet.close();
        preparedStatement.close();

        return sum;
    }

    //查询平均分
    public double avergeScore(Connection connection) throws SQLException {
        String sql = "select avg(score) as 平均分 from tb_student;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        double avgScore = 0;
        if (resultSet.next()) {
            avgScore = resultSet.getDouble("平均分");
        }

        resultSet.close();
        preparedStatement.close();

        return avgScore;
    }

    //查询最高分
    public int maxScore(Connection connection) throws SQLException {
        String sql = "select max(score) as 最高分 from tb_student;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        int maxScore = 0;
        if (resultSet.next()) {
            maxScore = resultSet.getInt("最高分");
        }

        resultSet.close();
        preparedStatement.close();

        return maxScore;
    }

    //查询最低分
    public int minScore(Connection connection) throws SQLException {
        String sql = "select min(score) as 最低分 from tb_student;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet = preparedStatement.executeQuery();

        int minScore = 0;
        if (resultSet.next()) {
            minScore = resultSet.getInt("最低分");
        }

        resultSet.close();
        preparedStatement.close();

        return minScore;
    }


    //通过姓名模糊查询
    public ArrayList<String> nameQuery(Connection connection) throws SQLException {
        //注意：使用模糊查询时，通配符和占位符一起使用会导致占位符失效
        //可以使用字符串拼接函数来避免占位符失效
        String sql = "select name,score from tb_student where name like concat('%',?,'%');";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        System.out.println("请输入姓名的关键字：");
        Scanner in = new Scanner(System.in);
        String nameLike = in.next();

        preparedStatement.setString(1,nameLike);
        ResultSet resultSet = preparedStatement.executeQuery();

        ArrayList<String> students = new ArrayList<>();
        String nameScore;
        String name;
        int score = 0;
        while (resultSet.next()) {
            name = resultSet.getString("name");
            score = resultSet.getInt("score");
            nameScore = name + " " + score;
            students.add(nameScore);
        }

        resultSet.close();
        preparedStatement.close();

        return students;
    }

    //分页查询
    public ArrayList<String> limitQuery(Connection connection) throws SQLException {
        String sql = "select name,score from tb_student order by score desc limit ?,10;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        ArrayList<String> students = new ArrayList<>();

        Scanner in = new Scanner(System.in);
        System.out.println("请输入要查询的页数：");
        int pageNum = in.nextInt();
        if (pageNum >0 && pageNum <= 100 / 10){
            preparedStatement.setInt(1,(pageNum - 1) * 10);
        }else {
            throw new IndexOutOfBoundsException("页面不存在");
        }
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String name = resultSet.getString("name");
            int score = resultSet.getInt("score");
            String nameScore = name + score;
            students.add(nameScore);
        }

        resultSet.close();
        preparedStatement.close();

        return students;
    }

    //修改对应姓名的人的分数
    public boolean alterScore(Connection connection) throws SQLException {
        String sql = "update tb_student set score = ? where name = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        Scanner in = new Scanner(System.in);
        System.out.println("请输入姓名：");
        String name = in.next();
        System.out.println("请修改成绩：");
        int newScore = in.nextInt();

        preparedStatement.setString(2,name);
        preparedStatement.setInt(1,newScore);
        int count = preparedStatement.executeUpdate();


        if (count > 0) {
            return true;
        }

        preparedStatement.close();

        return false;
    }

    //删除对应姓名的人的成绩
    public boolean deleteScore(Connection connection) throws SQLException {
        String sql = "delete from tb_student where name = ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        Scanner in = new Scanner(System.in);
        System.out.println("请输入要被删除成绩的人的姓名：");
        String name = in.next();
        preparedStatement.setString(1,name);

        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            return true;
        }

        preparedStatement.close();

        return false;
    }

    //添加评语
    public boolean addComment(Connection connection) throws SQLException {
        String sql = "update tb_student set teacher_comment = ? where score between ? and ?;";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        Scanner in = new Scanner(System.in);
        System.out.println("请输入分数范围：");
        int minScore = in.nextInt();
        int maxScore = in.nextInt();

        System.out.println("请输入评语：");
        String comment = in.next();

        preparedStatement.setInt(2,minScore);
        preparedStatement.setInt(3,maxScore);
        preparedStatement.setString(1,comment);

        int count = preparedStatement.executeUpdate();
        if (count > 0) {
            return true;
        }

        preparedStatement.close();

        return false;
    }
}
