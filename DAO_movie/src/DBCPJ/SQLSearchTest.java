package DBCPJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SQLSearchTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	void testSearchPlay_ALL() {
		System.out.println("testSearchPlay_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchPlay_ALL();
	}

	@Test
	void testSearchScreenwriter_ALL() {
		System.out.println("testSearchScreenwriter_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchScreenwriter_ALL();
	}

	@Test
	void testSearchZone_ALL() {
		System.out.println("testSearchZone_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchZone_ALL();
	}

	@Test
	void testSearchFilm_ALL() {
		System.out.println("testSearchFilm_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchFilm_ALL();
	}

	@Test
	void testSearchType_ALL() {
		System.out.println("testSearchType_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchType_ALL();
	}

	@Test
	void testSearchFilm_Type_ALL() {
		System.out.println("testSearchFilm_Type_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchFilm_Type_ALL();
	}

	@Test
	void testSearchComment_ALL() {
		System.out.println("testSearchComment_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchComment_ALL();
	}

	@Test
	void testSearchCollection_ALL() {
		System.out.println("testSearchCollection_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchCollection_ALL();
	}

	@Test
	void testSearchDirector_ALL() {
		System.out.println("testSearchDirector_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchDirector_ALL();
	}

	@Test
	void testSearchRelease_ALL() {
		System.out.println("testSearchRelease_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchRelease_ALL();
	}

	@Test
	void testSearchAdvertise_ALL() {
		System.out.println("testSearchAdvertise_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchAdvertise_ALL();
	}

	@Test
	void testSearchUser_ALL() {
		System.out.println("testSearchUser_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchUser_ALL();
	}

	@Test
	void testSearchPurchase_ALL() {
		System.out.println("testSearchPurchase_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchPurchase_ALL();
	}

	@Test
	void testSearchCinema_ALL() {
		System.out.println("testSearchCinema_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchCinema_ALL();
	}

	@Test
	void testSearch_Table() {
		System.out.println("testSearch_Table:");
		SQLSearch a=new SQLSearch();
		a.Search_Table("Actor");
	}

	@Test
	void testSearchActor() {
		System.out.println("testSearchActor:");
		SQLSearch a=new SQLSearch();
		a.SearchActor("actorId");
	}

	@Test
	void testSearchPlay() {
		System.out.println("testSearchPlay:");
		SQLSearch a=new SQLSearch();
		a.SearchPlay("actorId");
	}

	@Test
	void testSearchZone() {
		System.out.println("testSearchZone:");
		SQLSearch a=new SQLSearch();
		a.SearchZone("zoneId");
	}

	@Test
	void testSearchScreenwriter() {
		System.out.println("testSearchScreenwriter:");
		SQLSearch a=new SQLSearch();
		a.SearchScreenwriter("screenwriterId");
	}

	@Test
	void testSearchType() {
		System.out.println("testSearchType:");
		SQLSearch a=new SQLSearch();
		a.SearchType("typeId");
	}

	@Test
	void testSearchFilm_Type() {
		System.out.println("testSearchFilm_Type:");
		SQLSearch a=new SQLSearch();
		a.SearchFilm_Type("typeId");
	}

	@Test
	void testSearchFilm() {
		System.out.println("testSearchFilm:");
		SQLSearch a=new SQLSearch();
		a.SearchFilm("movieId");
	}

	@Test
	void testSearchDirector() {
		System.out.println("testSearchDirector:");
		SQLSearch a=new SQLSearch();
		a.SearchDirector("directorId");
	}

	@Test
	void testSearchComment() {
		System.out.println("testSearchComment:");
		SQLSearch a=new SQLSearch();
		a.SearchComment("movieId");
	}

	@Test
	void testSearchCollection() {
		System.out.println("testSearchCollection:");
		SQLSearch a=new SQLSearch();
		a.SearchCollection("userId");
	}

	@Test
	void testSearchRelease() {
		System.out.println("testSearchRelease:");
		SQLSearch a=new SQLSearch();
		a.SearchRelease("cinemaId");
	}

	@Test
	void testSearchAdvertise() {
		System.out.println("testSearchAdvertise:");
		SQLSearch a=new SQLSearch();
		a.SearchAdvertise("adId");
	}

	@Test
	void testSearchUser() {
		System.out.println("testSearchUser:");
		SQLSearch a=new SQLSearch();
		a.SearchUser("userId");
	}

	@Test
	void testSearchCinema() {
		System.out.println("testSearchCinema:");
		SQLSearch a=new SQLSearch();
		a.SearchCinema("cinemaId");
	}
}
