import java.sql.*;

/**
 * project_name:test
 * package_name:PACKAGE_NAME
 * user: Administrator
 * date: 14-4-26
 */
public class JdbcDemo2 {
    static String url = "jdbc:mysql://localhost:3306/school";
    static String username = "root";
    static String password = "";
    static String charset = "utf8";

    static Connection conn = null;
    static Statement stmt = null;
    static ResultSet rs = null;
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            if(conn == null){
                conn = DriverManager.getConnection(url,username,password);
            }
        }
        catch (Exception ex){
            ex.printStackTrace();

        }

    }
    public static void query(){
        String sql = "select * from students;";
        try{
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sql);
            while (rs.next()){
                System.out.println("学号："+rs.getInt("sid")+"姓名："+rs.getString("sname")+"年龄："+rs.getString("age")+"性别："+rs.getString("gender"));
            }

        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally {
            destoryResource();

        }
    }

    public static boolean add(){

        String sql = "insert into students values(5,'Lee',17,'male','lee@yahoo.com','russia')";
        try{
            stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            if(result > 0){
                return true;
            }
            else {
                return false;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
        finally {
            destoryResource();
        }
    }

    public static boolean delete(int sid){
        String sql = "delete from students where sid="+sid;
        try{
            stmt = conn.createStatement();
            int result = stmt.executeUpdate(sql);
            if(result > 0){
                return true;
            }
            else {
                return false;
            }
        }
        catch (Exception ex){
            ex.printStackTrace();
            return false;
        }
        finally {
            destoryResource();
        }
    }

    public static void destoryResource(){
        try{
            if(rs != null){
                rs.close();
                rs = null;
            }
            if(stmt != null){
                stmt.close();
                stmt = null;
            }
            //if(conn != null){
            //    conn.close();
            //    conn = null;
            //}
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        JdbcDemo2.query();
        if(JdbcDemo2.add()){
            System.out.println("添加成功。。。");
            JdbcDemo2.query();
        }
        else {
            System.out.println("添加失败。。。");
        }
        JdbcDemo2.delete(5);
        JdbcDemo2.query();
    }
}
