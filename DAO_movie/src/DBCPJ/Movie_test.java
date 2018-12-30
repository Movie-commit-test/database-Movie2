package DBCPJ;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Date;

import DBCPJ.SQLInsert;


public class Movie_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user=new User();
		
		user.setUserId("1");
		
		user.setUserName("RRR1");
		user.setUserPhone("123456789");
		user.setUserPictureUrl("www.baidu.com");
		user.setUserPwd("123456");
		user.setUserQQ("269123456");
		user.setUserSex("ÄÐ");
		
		SQLInsert sqlInsert=new SQLInsert();
		sqlInsert.insertUser(user);
		
		
	}

}
