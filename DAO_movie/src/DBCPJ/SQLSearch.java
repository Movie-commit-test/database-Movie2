package DBCPJ;

import java.sql.*;


import DBCPJ.Movie;

public class SQLSearch {
	

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
		
		public ResultSet SearchActor_ALL() {
			Connection conn=null;
			Statement stmt=null;
			try {
				conn=DbcpJdbcUtil.getConnection();
				stmt = conn.createStatement();
				String sql="select * form Actor";
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
				String sql="select * form Play";
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
				String sql="select * form Screenwriter";
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
				String sql="select * form Zone";
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
				String sql="select * form Film";
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
				String sql="select * form Type";
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
				String sql="select * form Film_Type";
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
				String sql="select * form Comment";
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
				String sql="select * form Collection";
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
				String sql="select * form Director";
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
				String sql="select * form Release";
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
				String sql="select * form Advertise";
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
				String sql="select * form User";
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
				String sql="select * form Purchase";
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
				String sql="select * form Cinema";
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
				String sql="select * form "+table;

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
				String sql="select "+element+" form Actor";
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
				String sql="select "+element+" form Play";
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
				String sql="select "+element+" form Zone";
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
				String sql="select "+element+" form Screenwriter";
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
				String sql="select "+element+" form Type";
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
				String sql="select "+element+" form Film_Type";
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
				String sql="select "+element+" form Film";
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
				String sql="select "+element+" form Director";
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
				String sql="select "+element+" form Comment";
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
				String sql="select "+element+" form Collection";
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
				String sql="select "+element+" form Release";
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
				String sql="select "+element+" form Advertise";
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
				String sql="select "+element+" form User";
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
				String sql="select "+element+" form Cinema";
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
		
		public boolean update(String sql) {
			Connection conn=null;
			Statement stmt=null;
			
			try {
					conn=DbcpJdbcUtil.getConnection();
					stmt = conn.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					conn.close();
					stmt.close();
					if(rs==0) {
						return false;
					}
					else {
						return true;
					}
			}catch(Exception e) {
				e.printStackTrace();
			}
			return false;
		}
		
}
