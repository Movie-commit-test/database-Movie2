package DBCPJ;

import java.sql.*;

public class SQLDelect {
	

		public void DeleteActor(String id) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Actor where actorId ="+id;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteAdvertise(String id) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Advertise where adId ="+id;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteCinema(String id) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Cinema where cinemaId ="+id;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteCollection(String mid,String uid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Collection where movieId ="+mid+"and userId"+uid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void DeleteComment(String mid,String uid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Comment where movieId ="+mid+"and userId"+uid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteDirector(String id) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Director where "+id;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void DeleteFilm_Type(String mid,String tid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Filem_Type where movieId ="+mid+"and typeId"+tid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteMovie(String mid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Film where movieId ="+mid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeletePlay(String mid,String actorid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Play where movieId ="+mid+"and actorId"+actorid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeletePurchase(String mid,String uid,String cid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Purchase where movieId ="+mid+"and userId"+uid+"and cinemaId";
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteRelease(String mid,String cid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Collection where movieId ="+mid+"and cinemaId"+cid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteScreenwriter(String swid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Screenwriter where screenwriterId ="+swid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteType(String tid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Type where typeId ="+tid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteUser(String uid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from [User] where userId ="+uid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void DeleteZone(String zid) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="delete from Zone where zoneId ="+zid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("delete fault!");
					}
					else {
						System.out.println("delete success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
}
