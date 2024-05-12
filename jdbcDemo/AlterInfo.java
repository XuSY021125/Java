import java.sql.Connection;
import java.sql.SQLException;

//用于添加评语和修改、删除学生成绩的接口
public interface AlterInfo {
    boolean alterScore(Connection connection) throws SQLException;

    boolean deleteScore(Connection connection) throws SQLException;

    boolean addComment(Connection connection) throws SQLException;
}
