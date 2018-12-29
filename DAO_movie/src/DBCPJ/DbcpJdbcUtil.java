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
		                 //�رմ洢��ѯ�����ResultSet����
		                 rs.close();
		              }catch (Exception e) {
		                  e.printStackTrace();
		              }
		              rs = null;
		          }
		          if(st!=null){
		              try{
		                 //�رո���ִ��SQL�����Statement����
		                  st.close();
		              }catch (Exception e) {
		                  e.printStackTrace();
		              }
		          }
		          
		          if(conn!=null){
		              try{
		                  //��Connection���Ӷ��󻹸����ݿ����ӳ�
		                  conn.close();
		             }catch (Exception e) {
		                 e.printStackTrace();
		             }
		         }
		     }
	
}
