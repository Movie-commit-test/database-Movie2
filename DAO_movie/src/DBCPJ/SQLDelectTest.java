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
		SQLDelect a=new SQLDelect();
		a.DeleteActor("2");
	}

	@Test
	void testDeleteAdvertise() {
		SQLDelect a=new SQLDelect();
		a.DeleteAdvertise("2");
	}

	@Test
	void testDeleteCinema() {
		SQLDelect a=new SQLDelect();
		a.DeleteCinema("2");	
	}

	@Test
	void testDeleteCollection() {
		SQLDelect a=new SQLDelect();
		a.DeleteCollection("2", "1");
	}

	@Test
	void testDeleteComment() {
		SQLDelect a=new SQLDelect();
		a.DeleteComment("2", "5");
	}

	@Test
	void testDeleteDirector() {
		SQLDelect a=new SQLDelect();
		a.DeleteDirector("2");
	}

	@Test
	void testDeleteFilm_Type() {
		SQLDelect a=new SQLDelect();
		a.DeleteFilm_Type("2", "1");
	}

	@Test
	void testDeleteMovie() {
		SQLDelect a=new SQLDelect();
		a.DeleteMovie("2");
	}

	@Test
	void testDeletePlay() {
		SQLDelect a=new SQLDelect();
		a.DeletePlay("2","1");
	}

	@Test
	void testDeletePurchase() {
		SQLDelect a=new SQLDelect();
		a.DeletePurchase("2", "5", "2");
	}

	@Test
	void testDeleteRelease() {
		SQLDelect a=new SQLDelect();
		a.DeleteRelease("2", "2");
	}

	@Test
	void testDeleteScreenwriter() {
		SQLDelect a=new SQLDelect();
		a.DeleteScreenwriter("2");
	}

	@Test
	void testDeleteType() {
		SQLDelect a=new SQLDelect();
		a.DeleteType("2");
	}

	@Test
	void testDeleteUser() {
		SQLDelect a=new SQLDelect();
		a.DeleteUser("9");
	}

	@Test
	void testDeleteZone() {
		SQLDelect a=new SQLDelect();
		a.DeleteZone("2");
	}

}
