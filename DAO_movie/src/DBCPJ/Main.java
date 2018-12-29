package DBCPJ;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import DBCPJ.SQLOperation;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SQLOperation sqlOperation=new SQLOperation();

		//String sql2="insert into Student(SNo,SN,Sex,Date_of_birth,Classno,Age) values(128,'Â¬Ô¶·«','ÄÐ','1999-12-1',09035,19)";
	//	sqlOperation.update(sql2);
	//	System.out.println("delete before:");
		String sql3="select * from movie";
		sqlOperation.search(sql3);
	//	System.out.println("delete after:");
	//	String sql4="delete from Student where SNo='128'";
	//	sqlOperation.update(sql4);
	//	sqlOperation.search(sql3);
		
	}

}
