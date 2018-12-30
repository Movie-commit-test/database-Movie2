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
		Movie movie=new Movie();
		movie.setMovieId("1");
		movie.setMovieAlias("马裤");
		movie.setMovieName("营救计划");
		movie.setMovieIntroduction("一个关于在马上如何救援的故事!");
		movie.setMovieLanguage("English");
		movie.setZoneId("1");

		movie.setMovieScore((float)3);
		
		movie.setScreenwriterId("1");
		movie.setDirectorId("1");
		Calendar c1=Calendar.getInstance();
		c1.set(2000,12,25);
		Date date=c1.getTime();	
		movie.setMovieDate(date);
			
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertMovie(movie);
	}

	@Test
	void testInsertUser() {
		User user=new User();
		user.setUserId("3");
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
		Screenwriter obj=new Screenwriter();
		obj.setScreenwriterId("1");
		
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
		Director director=new Director();
		director.setDirectorId("1");;
		
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
		Zone zone=new Zone();
		zone.setZoneId("1");
		zone.setZoneName("English");	
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertZone(zone);
	}

	@Test
	void testInsertType() {
		Type type=new Type();
		type.setTypeId("1");
		type.setTypeName("科幻");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertType(type);
	}

	@Test
	void testInsertAdvertise() {
		Advertise obj=new Advertise();
		obj.setAdContent("CoCo a good fruiter");
		obj.setAdId("1");
		obj.setAdProduct("OUTLET");
		obj.setAdType("护肤品");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertAdvertise(obj);
	}

	@Test
	void testInsertCinema() {
		Cinema cinema=new Cinema();
		cinema.setCinemaAddress("北京市万达影院");
		cinema.setCinemaId("1");
		cinema.setCinemaName("万达影院");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertCinema(cinema);
	}

	@Test
	void testInsertPurchase() {
		Purchase purchase=new Purchase();
		purchase.setCinemaId("1");
		purchase.setMovieId("1");
		purchase.setUserId("1");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertPurchase(purchase);
	}

	@Test
	void testInsertRelease() {
		Release release=new Release();
		release.setCinemaId("1");
		release.setMovieId("1");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertRelease(release);
	}

	@Test
	void testInsertCollection() {
		Collection collection=new Collection();
		collection.setMovieId("1");
		collection.setUserId("1");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertCollection(collection);
	}

	@Test
	void testInsertComment() {
		Comment comment=new Comment();
		comment.setContent("This is not a good movie!Actor too bad!");
		comment.setMovieId("1");
		comment.setScore((float)3);
		comment.setUserId("1");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertComment(comment);
	}

	@Test
	void testInsertFilm_Type() {
		Film_Type obj=new Film_Type();
		obj.setMovieId("1");
		obj.setTypeId("1");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertFilm_Type(obj);
	}

	@Test
	void testInsertPlay() {
		Play play=new Play();
		play.setActorId("1");
		play.setMovieId("1");
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertPlay(play);
	}

}
