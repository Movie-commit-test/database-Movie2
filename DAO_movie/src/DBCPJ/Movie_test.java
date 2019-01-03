package DBCPJ;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.Test;

import DBCPJ.SQLInsert;


public class Movie_test {

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
	void testSearchDirector_ALL() {
		System.out.println("testSearchDirector_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchDirector_ALL();
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
	void testSearchCinema_ALL() {
		System.out.println("testSearchCinema_ALL:");
		SQLSearch a=new SQLSearch();
		a.SearchCinema_ALL();
	}

}
