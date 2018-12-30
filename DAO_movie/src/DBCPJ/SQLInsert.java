package DBCPJ;

import java.sql.*;


import DBCPJ.Movie;

public class SQLInsert {
	
		public void insertMovie(Movie movie) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Film(movieId,directorId,screenwriterId,zoneId,movieName,movieLanguage,movieIntroduction,movieScore,movieAlias,movieDate) values(?,?,?,?,?,?,?,?,?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,movie.getMovieId());
					ps.setString(2,movie.getDirectorId());
					ps.setString(3,movie.getScreenwriterId());
					ps.setString(4,movie.getZoneId());
					ps.setString(5,movie.getMovieName());
					ps.setString(6,movie.getMovieLanguage());
					ps.setString(7,movie.getMovieIntroduction());
					ps.setFloat(8,movie.getMovieScore());
					ps.setString(9, movie.getMovieAlias());
					ps.setDate(10,new Date(movie.getMovieDate().getTime()));			
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertUser(User user) {
			Connection connection=null;
			PreparedStatement ps=null;
			
			try {
					connection=DbcpJdbcUtil.getConnection();
					
					String sql="insert into [User](userId,userName,userSex,userPwd,userQQ,userPhone,userPictureUrl) values(?,?,?,?,?,?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,user.getUserId());
					ps.setString(2,user.getUserName());
					ps.setString(3,user.getUserSex());
					ps.setString(4,user.getUserPwd());
					ps.setString(5,user.getUserQQ());
					ps.setString(6,user.getUserPhone());
					ps.setString(7,user.getUserPictureUrl());		
					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void insertActor(Actor actor) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into actor(actorId,actorName,actorSex,actorBirthday) values(?,?,?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,actor.getActorId());
					ps.setString(2,actor.getActorname());
					ps.setString(3,actor.getActorSex());
					ps.setDate(4,new Date(actor.getActorBirthday().getTime()));
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
					
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertScreenwriter(Screenwriter obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Screenwriter(screenwriterId,screenwriterName,screenwriterSex,screenwriterBirthday) values(?,?,?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,obj.getScreenwriterId());
					ps.setString(2,obj.getScreenwritername());
					ps.setString(3,obj.getScreenwriterSex());
					ps.setDate(4,new Date(obj.getScreenwriterBirthday().getTime()));
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertDirector(Director obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Director(directorId,directorName,directorSex,directorBirthday) values(?,?,?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,obj.getDirectorId());
					ps.setString(2,obj.getDirectorname());
					ps.setString(3,obj.getDirectorSex());
					ps.setDate(4,new Date(obj.getDirectorBirthday().getTime()));
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void insertZone(Zone obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Zone(zoneId,zoneName) values(?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,obj.getZoneId());
					ps.setString(2,obj.getZoneName());
		
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertType(Type obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Type(typeId,typeName) values(?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,obj.getTypeId());
					ps.setString(2,obj.getTypeName());
		
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertAdvertise(Advertise obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Advertise(adId,adContent,adProduct,adType) values(?,?,?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,obj.getAdId());
					ps.setString(2,obj.getAdContent());
					ps.setString(3,obj.getAdProduct());
					ps.setString(4,obj.getAdType());
					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertCinema(Cinema obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Cinema(cinemaId,cinemaName,cinemaAddress) values(?,?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,obj.getCinemaId());
					ps.setString(2,obj.getCinemaName());
					ps.setString(3,obj.getCinemaAddress());

					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void insertPurchase(Purchase obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Purchase(cinemaId,movieId,userId) values(?,?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,obj.getCinemaId());
					ps.setString(2,obj.getMovieId());
					ps.setString(3,obj.getUserId());

					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertRelease(Release obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Release(cinemaId,movieId) values(?,?)";
					ps=connection.prepareStatement(sql);
					
					ps.setString(1,obj.getCinemaId());
					ps.setString(2,obj.getMovieId());

					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		public void insertCollection(Collection obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Release(movieId,userId) values(?,?)";
					ps=connection.prepareStatement(sql);
					
					
					ps.setString(1,obj.getMovieId());
					ps.setString(2,obj.getUserId());
					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertComment(Comment obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Comment(movieId,userId,content,score) values(?,?,?,?)";
					ps=connection.prepareStatement(sql);
					
					
					ps.setString(1,obj.getMovieId());
					ps.setString(2,obj.getUserId());
					ps.setString(3,obj.getContent());
					ps.setFloat(4,obj.getScore());
					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertFilm_Type(Film_Type obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Film_Type(typeId,movieId) values(?,?)";
					ps=connection.prepareStatement(sql);
					
					
					ps.setString(1,obj.getTypeId());
					ps.setString(2,obj.getMovieId());
					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		
		public void insertPlay(Play obj) {
			Connection connection=null;
			PreparedStatement ps=null;
			try {
					connection=DbcpJdbcUtil.getConnection();
					String sql="insert into Play(actorId,movieId) values(?,?)";
					ps=connection.prepareStatement(sql);
					
					
					ps.setString(1,obj.getActorId());
					ps.setString(2,obj.getMovieId());
					
					ps.executeUpdate();
					connection.close();
					ps.close();
					System.out.println("Insert success!");
			}catch(Exception e){
				e.printStackTrace();
			}
		}
		

		
		public boolean delectdata(String sql) {
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
