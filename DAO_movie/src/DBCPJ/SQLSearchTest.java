package DBCPJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SQLSearchTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	void testSearchPlay_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchPlay_ALL();
	}

	@Test
	void testSearchScreenwriter_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchScreenwriter_ALL();
	}

	@Test
	void testSearchZone_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchZone_ALL();
	}

	@Test
	void testSearchFilm_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchFilm_ALL();
	}

	@Test
	void testSearchType_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchType_ALL();
	}

	@Test
	void testSearchFilm_Type_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchFilm_Type_ALL();
	}

	@Test
	void testSearchComment_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchComment_ALL();
	}

	@Test
	void testSearchCollection_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchCollection_ALL();
	}

	@Test
	void testSearchDirector_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchDirector_ALL();
	}

	@Test
	void testSearchRelease_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchRelease_ALL();
	}

	@Test
	void testSearchAdvertise_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchAdvertise_ALL();
	}

	@Test
	void testSearchUser_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchUser_ALL();
	}

	@Test
	void testSearchPurchase_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchPurchase_ALL();
	}

	@Test
	void testSearchCinema_ALL() {
		SQLSearch a=new SQLSearch();
		a.SearchCinema_ALL();
	}

	@Test
	void testSearch_Table() {
		SQLSearch a=new SQLSearch();
		a.Search_Table("Actor");
	}

	@Test
	void testSearchActor() {
		SQLSearch a=new SQLSearch();
		a.SearchActor("actorId");
	}

	@Test
	void testSearchPlay() {
		SQLSearch a=new SQLSearch();
		a.SearchPlay("actorId");
	}

	@Test
	void testSearchZone() {
		SQLSearch a=new SQLSearch();
		a.SearchZone("zoneId");
	}

	@Test
	void testSearchScreenwriter() {
		SQLSearch a=new SQLSearch();
		a.SearchScreenwriter("screenwriterId");
	}

	@Test
	void testSearchType() {
		SQLSearch a=new SQLSearch();
		a.SearchType("typeId");
	}

	@Test
	void testSearchFilm_Type() {
		SQLSearch a=new SQLSearch();
		a.SearchFilm_Type("typeId");
	}

	@Test
	void testSearchFilm() {
		SQLSearch a=new SQLSearch();
		a.SearchFilm("movieId");
	}

	@Test
	void testSearchDirector() {
		SQLSearch a=new SQLSearch();
		a.SearchDirector("directorId");
	}

	@Test
	void testSearchComment() {
		SQLSearch a=new SQLSearch();
		a.SearchComment("movieId");
	}

	@Test
	void testSearchCollection() {
		SQLSearch a=new SQLSearch();
		a.SearchCollection("userId");
	}

	@Test
	void testSearchRelease() {
		SQLSearch a=new SQLSearch();
		a.SearchRelease("cinemaId");
	}

	@Test
	void testSearchAdvertise() {
		SQLSearch a=new SQLSearch();
		a.SearchAdvertise("adId");
	}

	@Test
	void testSearchUser() {
		SQLSearch a=new SQLSearch();
		a.SearchUser("userId");
	}

	@Test
	void testSearchCinema() {
		SQLSearch a=new SQLSearch();
		a.SearchCinema("cinemaId");
	}
}
