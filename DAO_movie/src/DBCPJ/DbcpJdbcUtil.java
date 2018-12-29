package DBCPJ;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSourceFactory;
public class DbcpJdbcUtil {
	
	private static DataSource ds=null;
	static {
		try {
			InputStream in=DbcpJdbcUtil.class.getClassLoader().getResourceAsStream("dbcpconfig.properties");
			Properties prop=new Properties();
			prop.load(in);
			ds=BasicDataSourceFactory.createDataSource(prop);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		return ds.getConnection();
	}
	
	public static void release(Connection conn,Statement st,ResultSet rs){
		          if(rs!=null){
		             try{
		                 //关闭存储查询结果的ResultSet对象
		                 rs.close();
		              }catch (Exception e) {
		                  e.printStackTrace();
		              }
		              rs = null;
		          }
		          if(st!=null){
		              try{
		                 //关闭负责执行SQL命令的Statement对象
		                  st.close();
		              }catch (Exception e) {
		                  e.printStackTrace();
		              }
		          }
		          
		          if(conn!=null){
		              try{
		                  //将Connection连接对象还给数据库连接池
		                  conn.close();
		             }catch (Exception e) {
		                 e.printStackTrace();
		             }
		         }
		     }
	
}
