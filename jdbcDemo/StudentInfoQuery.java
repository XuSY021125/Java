import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.util.Properties;

//用于查询学生信息
public class StudentInfoQuery {
    public static void main(String[] args) throws Exception {
        Properties properties = new Properties();
        properties.load(new FileInputStream("src/druid.properties"));
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
        Connection connection = dataSource.getConnection();

        Teacher teacher = new Teacher();

        System.out.println(teacher.printNameList(connection));
        try {
            System.out.println(teacher.limitQuery(connection));
        }catch (Exception e){
            e.printStackTrace();
        }

        connection.close();
    }
}
