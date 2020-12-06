package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.User;
import help.DataBaseConnect;

public class UserDao {
	public static ArrayList<User> loadUser(){
		ArrayList<User> listUser = new ArrayList<User>();
		try {
			Connection conn = DataBaseConnect.Connect();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listUser;
	}
}
