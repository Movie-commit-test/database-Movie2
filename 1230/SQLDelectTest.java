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
		a.DeleteActor("1");
	}

	@Test
	void testDeleteAdvertise() {
		SQLDelect a=new SQLDelect();
		a.DeleteAdvertise("1");
	}

	@Test
	void testDeleteCinema() {
		SQLDelect a=new SQLDelect();
		a.DeleteCinema("1");	
	}

	@Test
	void testDeleteCollection() {
		SQLDelect a=new SQLDelect();
		a.DeleteCollection("1", "1");
	}

	@Test
	void testDeleteComment() {
		SQLDelect a=new SQLDelect();
		a.DeleteComment("1", "1");
	}

	@Test
	void testDeleteDirector() {
		SQLDelect a=new SQLDelect();
		a.DeleteDirector("1");
	}

	@Test
	void testDeleteFilm_Type() {
		SQLDelect a=new SQLDelect();
		a.DeleteFilm_Type("1", "1");
	}

	@Test
	void testDeleteMovie() {
		SQLDelect a=new SQLDelect();
		a.DeleteMovie("1");
	}

	@Test
	void testDeletePlay() {
		SQLDelect a=new SQLDelect();
		a.DeletePlay("1","1");
	}

	@Test
	void testDeletePurchase() {
		SQLDelect a=new SQLDelect();
		a.DeletePurchase("1", "1", "1");
	}

	@Test
	void testDeleteRelease() {
		SQLDelect a=new SQLDelect();
		a.DeleteRelease("1", "1");
	}

	@Test
	void testDeleteScreenwriter() {
		SQLDelect a=new SQLDelect();
		a.DeleteScreenwriter("1");
	}

	@Test
	void testDeleteType() {
		SQLDelect a=new SQLDelect();
		a.DeleteType("1");
	}

	@Test
	void testDeleteUser() {
		SQLDelect a=new SQLDelect();
		a.DeleteUser("1");
	}

	@Test
	void testDeleteZone() {
		SQLDelect a=new SQLDelect();
		a.DeleteZone("1");
	}

}
