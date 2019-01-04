package DBCPJ;

import java.sql.*;

public class SQLUpdate {
	

		public void UpdateActor_name(String name,String id) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update Actor set actorName="+name+" where actorId ="+id;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void UpdateAdvertise_Type(String id,String type) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update Advertise set adType="+type+" where adId ="+id;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void UpdateCinema_Name(String id,String name) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update Cinema set cinemaName="+name+" where cinemaId ="+id;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		public void UpdateDirector_Name(String id,String name) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update Director set directorName="+name+" where directorId"+id;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		
		public void UpdateMovie_Aliase(String mid,String aliase) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update Film set movieAliase="+aliase+" where movieId ="+mid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void UpdateScreenwriter_Name(String swid,String name) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update Screenwriter set screenwriterName="+name+" where screenwriterId ="+swid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void UpdateType_Name(String tid,String name) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update Type set typeName="+name+" where typeId ="+tid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void UpdateUser_Name(String uid,String name) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update [User] set userName="+name+" where userId ="+uid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void UpdateZone_Name(String zid,String name) {
			Connection connection=null;
			Statement stmt=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="Update Zone set zoneName="+name+" where zoneId ="+zid;
					
					
					stmt = connection.createStatement();
					int rs=stmt.executeUpdate(sql);
					
					connection.close();
					stmt.close();
					if(rs==0) {
						System.out.println("Update fault!");
					}
					else {
						System.out.println("Update success!");
					}
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
}
