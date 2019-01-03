package DBCPJ;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SQLInsertTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testInsertMovie() {
		System.out.println("testInsertMovie:");
		Movie movie=new Movie();
		movie.setMovieId("2");
		movie.setMovieAlias("马裤");
		movie.setMovieName("营救计划");
		movie.setMovieIntroduction("一个关于在马上如何救援的故事!");
		movie.setMovieLanguage("English");
		movie.setZoneId("1");

		movie.setMovieScore((float)3);
		
		movie.setScreenwriterId("2");
		movie.setDirectorId("2");
		Calendar c1=Calendar.getInstance();
		c1.set(2000,12,25);
		Date date=c1.getTime();	
		movie.setMovieDate(date);
			
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertMovie(movie);
	}

	@Test
	void testInsertUser() {
		System.out.println("testInsertUser:");
		User user=new User();
		user.setUserId("2");
		user.setUserName("RRR1");
		user.setUserPhone("123456789");
		user.setUserPictureUrl("www.baidu.com");
		user.setUserPwd("1234sf56");
		user.setUserQQ("269123456");
		user.setUserSex("男");
		
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertUser(user);
	}

	@Test
	void testInsertActor() {

		System.out.println("testInsertActor:");
		Actor actor=new Actor();
		actor.setActorId("2");
		
		actor.setActorname("DIOTER");
		actor.setActorSex("男");
		
		Calendar c1=Calendar.getInstance();
		c1.set(2000,12,25);
		Date date=c1.getTime();	
		actor.setActorBirthday(date);
			
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertActor(actor);
	}

	@Test
	void testInsertScreenwriter() {
		System.out.println("testInsertScreenwriter:");
		Screenwriter obj=new Screenwriter();
		obj.setScreenwriterId("2");
		
		obj.setScreenwritername("Mary");
		obj.setScreenwriterSex("女");
		
		Calendar c1=Calendar.getInstance();
		c1.set(1990,11,11);
		Date date=c1.getTime();	
		obj.setScreenwriterBirthday(date);
			
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertScreenwriter(obj);
	}

	@Test
	void testInsertDirector() {
		System.out.println("testInsertDirector:");
		Director director=new Director();
		director.setDirectorId("2");;
		
		director.setDirectorname("Alase");
		director.setDirectorSex("男");
		
		Calendar c1=Calendar.getInstance();
		c1.set(2000,12,25);
		Date date=c1.getTime();	
		director.setDirectorBirthday(date);
			
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertDirector(director);
	}

	@Test
	void testInsertZone() {
		System.out.println("testInsertZone:");
		Zone zone=new Zone();
		zone.setZoneId("2");
		zone.setZoneName("English");	
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertZone(zone);
	}

	@Test
	void testInsertType() {
		System.out.println("testInsertType:");
		Type type=new Type();
		type.setTypeId("2");
		type.setTypeName("科幻");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertType(type);
	}

	@Test
	void testInsertAdvertise() {
		System.out.println("testInsertAdvertise:");
		Advertise obj=new Advertise();
		obj.setAdContent("CoCo a good fruiter");
		obj.setAdId("2");
		obj.setAdProduct("OUTLET");
		obj.setAdType("护肤品");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertAdvertise(obj);
	}

	@Test
	void testInsertCinema() {
		System.out.println("testInsertCinema:");
		Cinema cinema=new Cinema();
		cinema.setCinemaAddress("北京市万达影院");
		cinema.setCinemaId("2");
		cinema.setCinemaName("万达影院");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertCinema(cinema);
	}

	@Test
	void testInsertPurchase() {
		System.out.println("testInsertPurchase:");
		Purchase purchase=new Purchase();
		purchase.setCinemaId("2");
		purchase.setMovieId("2");
		purchase.setUserId("2");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertPurchase(purchase);
	}

	@Test
	void testInsertRelease() {
		System.out.println("testInsertRelease:");
		Release release=new Release();
		release.setCinemaId("2");
		release.setMovieId("2");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertRelease(release);
	}

	@Test
	void testInsertCollection() {
		System.out.println("testInsertCollection:");
		Collection collection=new Collection();
		collection.setMovieId("2");
		collection.setUserId("2");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertCollection(collection);
	}

	@Test
	void testInsertComment() {
		System.out.println("testInsertComment:");
		Comment comment=new Comment();
		comment.setContent("This is not a good movie!Actor too bad!");
		comment.setMovieId("2");
		comment.setScore((float)3);
		comment.setUserId("2");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertComment(comment);
	}

	@Test
	void testInsertFilm_Type() {
		System.out.println("testInsertFilm_Type:");
		Film_Type obj=new Film_Type();
		obj.setMovieId("2");
		obj.setTypeId("2");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertFilm_Type(obj);
	}

	@Test
	void testInsertPlay() {
		System.out.println("testInsertPlay:");
		Play play=new Play();
		play.setActorId("2");
		play.setMovieId("2");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertPlay(play);
	}

}
