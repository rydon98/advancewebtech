package com.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bean.user;
public class UserDao {
public static Connection getConnection(){
	Connection con=null;
	try{
		Class.forName("com.mysql.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/form","root","");
	}catch(Exception e){System.out.println(e);}
	return con;
}
public static int save(user u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("insert into loginmen(user) values(?)");
		ps.setString(1,u.getName());

		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}
	return status;
}

public static int delete(user u){
	int status=0;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("delete from loginmen where id=?");
		ps.setInt(1,u.getId());
		status=ps.executeUpdate();
	}catch(Exception e){System.out.println(e);}

	return status;
}
public static List<user> getAllRecords(){
	List<user> list=new ArrayList<user>();
	
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from loginmen");
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			user u=new user();
			u.setId(rs.getInt("user"));
			u.setName(rs.getString("name"));

			list.add(u);
		}
	}catch(Exception e){System.out.println(e);}
	return list;
}
public static user getRecordByuser(int user){
	user u=null;
	try{
		Connection con=getConnection();
		PreparedStatement ps=con.prepareStatement("select * from loginmen where user=?");
		ps.setInt(1,user);
		ResultSet rs=ps.executeQuery();
		while(rs.next()){
			u=new user();
			u.setId(rs.getInt("user"));
			u.setName(rs.getString("name"));

		}
	}catch(Exception e){System.out.println(e);}
	return u;
}
}
