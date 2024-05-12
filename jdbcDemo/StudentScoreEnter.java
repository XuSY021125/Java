import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Properties;
import java.util.Random;

//用于录入学生信息
public class StudentScoreEnter {
    public static void main(String[] args) throws Exception {
        //1、导入jar包

        //2、定义配置文件

        //3、加载配置文件
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/druid.properties"));

        //4、获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(prop);

        //5、获取数据库链接
        Connection connection = dataSource.getConnection();

        ArrayList<String> surName = new ArrayList<>();
        Collections.addAll(surName,"李", "王", "张", "刘", "陈", "杨", "赵", "黄", "周", "吴", "徐", "孙", "胡", "朱","高", "林","何", "袁", "邓", "许", "傅", "沈", "曾", "彭");

        ArrayList<String> giveName = new ArrayList<>();
        Collections.addAll(giveName,"浩宇", "梓睿", "宇轩", "子涵", "雨泽", "嘉豪", "俊熙", "梓轩", "皓轩", "子墨", "杰", "翔", "瑞", "阳", "悦", "琳", "涵", "豪", "宇", "洋");

        Collections.shuffle(surName);
        Collections.shuffle(giveName);

        String sql = "insert into tb_student(name,score) values(?,?);";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int surNameNumber = random.nextInt(surName.size());
            int giveNameNumber = random.nextInt(giveName.size());

            int score = random.nextInt(101);//随机录入0-100成绩

            String name = surName.get(surNameNumber) + giveName.get(giveNameNumber);//拼接姓和名
            preparedStatement.setString(1,name);
            preparedStatement.setInt(2,score);
            preparedStatement.executeUpdate();
        }

        preparedStatement.close();
        connection.close();
    }
}