package DBCPJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SQLUpdateTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testUpdateActor_name() {
		System.out.println("testUpdateActor_name:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateActor_name("test", "2");
	}

	@Test
	void testUpdateAdvertise_Type() {
		System.out.println("testUpdateAdvertise_Type:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateAdvertise_Type("2", "test");
	}

	@Test
	void testUpdateCinema_Name() {
		System.out.println("testUpdateCinema_Name:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateCinema_Name("2", "test");
	}

	@Test
	void testUpdateDirector_Name() {
		System.out.println("testUpdateDirector_Name:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateDirector_Name("2", "test");
	}

	@Test
	void testUpdateMovie_Aliase() {
		System.out.println("testUpdateMovie_Aliase:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateMovie_Aliase("2", "test");
	}

	@Test
	void testUpdateScreenwriter_Name() {
		System.out.println("testUpdateScreenwriter_Name:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateScreenwriter_Name("2", "test");
	}

	@Test
	void testUpdateType_Name() {
		System.out.println("testUpdateType_Name:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateType_Name("2", "test");
	}

	@Test
	void testUpdateUser_Name() {
		System.out.println("testUpdateUser_Name:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateUser_Name("2", "test");
	}

	@Test
	void testUpdateZone_Name() {
		System.out.println("testUpdateZone_Name:");
		SQLUpdate a=new SQLUpdate();
		a.UpdateZone_Name("2", "test");
	}
	
	
}
