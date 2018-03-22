package com.yang.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.yang.domain.Persion;

public class PersionDao {
	public final static  String URL = "jdbc:mysql://localhost:3306/test";
	public final static  String USERNAME ="root";
	public final static  String PASSWORD ="root";
	public final static  String DRIVED ="com.mysql.jdbc.Driver";
	
	//插入
	public static void insert() {
		try {
			Class.forName(DRIVED);
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String sql = "insert into Persion(id,name, password,age) values(5,'xiao','1234',12)";
			Statement  st = conn.createStatement();
			
			st.execute(sql);
			
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//删除
	
	public static void delete() {
		try {
			Class.forName(DRIVED);
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String sql = "delete from persion where id = '5'";
			Statement  st = conn.createStatement();
			
			st.execute(sql);
			
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//更新
	public static void update() {
		try {
			Class.forName(DRIVED);
			Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			
			String sql = "update persion set name='小名' where id =1";
			
			Statement  st = conn.createStatement();
			
			st.execute(sql);
			
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
//		insert();
//		delete();
		update();
	}
}
