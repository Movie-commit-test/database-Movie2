package DBCPJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SQLDelectTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testDeleteActor() {
		System.out.println("testDeleteActor:");
		SQLDelect a=new SQLDelect();
		a.DeleteActor("2");
	}

	@Test
	void testDeleteAdvertise() {
		System.out.println("testDeleteAdvertise:");
		SQLDelect a=new SQLDelect();
		a.DeleteAdvertise("2");
	}

	@Test
	void testDeleteCinema() {
		System.out.println("testDeleteCinema:");
		SQLDelect a=new SQLDelect();
		a.DeleteCinema("2");	
	}

	@Test
	void testDeleteCollection() {
		System.out.println("testDeleteCollection:");
		SQLDelect a=new SQLDelect();
		a.DeleteCollection("2", "1");
	}

	@Test
	void testDeleteComment() {
		System.out.println("testDeleteComment:");
		SQLDelect a=new SQLDelect();
		a.DeleteComment("2", "5");
	}

	@Test
	void testDeleteDirector() {
		System.out.println("testDeleteDirector:");
		SQLDelect a=new SQLDelect();
		a.DeleteDirector("2");
	}

	@Test
	void testDeleteFilm_Type() {
		System.out.println("testDeleteFilm_Type:");
		SQLDelect a=new SQLDelect();
		a.DeleteFilm_Type("2", "1");
	}

	@Test
	void testDeleteMovie() {
		System.out.println("testDeleteMovie:");
		SQLDelect a=new SQLDelect();
		a.DeleteMovie("2");
	}

	@Test
	void testDeletePlay() {
		System.out.println("testDeletePlay:");
		SQLDelect a=new SQLDelect();
		a.DeletePlay("2","1");
	}

	@Test
	void testDeletePurchase() {
		System.out.println("testDeletePurchase:");
		SQLDelect a=new SQLDelect();
		a.DeletePurchase("2", "2", "2");
	}

	@Test
	void testDeleteRelease() {
		System.out.println("testDeleteRelease:");
		SQLDelect a=new SQLDelect();
		a.DeleteRelease("2", "2");
	}

	@Test
	void testDeleteScreenwriter() {
		System.out.println("testDeleteScreenwriter:");
		SQLDelect a=new SQLDelect();
		a.DeleteScreenwriter("2");
	}

	@Test
	void testDeleteType() {
		System.out.println("testDeleteType:");
		SQLDelect a=new SQLDelect();
		a.DeleteType("2");
	}

	@Test
	void testDeleteUser() {
		System.out.println("testDeleteUser:");
		SQLDelect a=new SQLDelect();
		a.DeleteUser("2");
	}

	@Test
	void testDeleteZone() {
		System.out.println("testDeleteZone:");
		SQLDelect a=new SQLDelect();
		a.DeleteZone("2");
	}

}
