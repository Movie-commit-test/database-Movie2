package DBCPJ;

import java.sql.*;

public class SQLSearch {
	

		
		
		public ResultSet SearchActor_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Actor";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ResultSet SearchPlay_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Play";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchScreenwriter_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Screenwriter";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchZone_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Zone";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchFilm_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Film";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchType_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Type";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchFilm_Type_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Film_Type";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchComment_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Comment";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchCollection_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Collection";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchDirector_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Director";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchRelease_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Release";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchAdvertise_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Advertise";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchUser_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from [User]";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchPurchase_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Purchase";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchCinema_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from Cinema";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ResultSet Search_Table(String table) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * from "+table;

				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ResultSet SearchActor(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Actor";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ResultSet SearchPlay(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Play";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ResultSet SearchZone(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Zone";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchScreenwriter(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Screenwriter";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ResultSet SearchType(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Type";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchFilm_Type(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Film_Type";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchFilm(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Film";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchDirector(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Director";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchComment(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Comment";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchCollection(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Collection";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchRelease(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Release";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchAdvertise(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Advertise";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchUser(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from [User]";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		public ResultSet SearchCinema(String element) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select "+element+" from Cinema";
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
		public ResultSet search(String sql) {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				ResultSet rs=stmt.executeQuery(sql);
				ResultSetMetaData rsmd=rs.getMetaData();
				int columns=rsmd.getColumnCount();
				while(rs.next())
				{
					for(int i=1;i<=columns;i++) {
						System.out.print(rs.getString(i)+" ");
					}
					System.out.println();
				}

				DbcpJdbcUtil.release(conn, stmt,rs);
				return rs;
			}catch(Exception e) {
				e.printStackTrace();
			}
			return null;
		}
		
}
