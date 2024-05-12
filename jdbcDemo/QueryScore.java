import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

//用于查询学生成绩的接口
public interface QueryScore {
    int idCount(Connection connection) throws Exception;

    double avergeScore(Connection connection) throws SQLException;

    int maxScore(Connection connection) throws SQLException;

    int minScore(Connection connection) throws SQLException;

    ArrayList<String> nameQuery(Connection connection) throws SQLException;

    ArrayList<String> limitQuery(Connection connection) throws SQLException;
}
