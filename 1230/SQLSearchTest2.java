package DBCPJ;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SQLSearchTest2 {

	@BeforeEach
	void setUp() throws Exception {
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
		a.SearchComment("commentId");
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
