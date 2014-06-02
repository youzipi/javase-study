import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-26
 */
public class JdbcDemo1 {
    static String url = "jdbc:mysql://localhost:3306/school";
    static String username = "root";
    static String password = "";
    static Connection conn = null;

    public static void main(String[] args) {

        try{//加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,username,password);
            if(conn != null)
                System.out.println("数据库连接正常");
            else
                System.out.println("连接失败。。。");
            //创建语句对象
            Statement stmt = conn.createStatement();
            String sql = "insert into Students values (1,'王二',20,'男','wang-er@qq.com','北京')";
            //执行语句
            int result = stmt.executeUpdate(sql);
            if(result > 0){
                System.out.println("添加成功");
            }
            else
                System.out.println("添加失败");
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            //释放资源
            if(conn != null){
                try {
                    conn.close();
                    conn = null;
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

        }
        }

    }
