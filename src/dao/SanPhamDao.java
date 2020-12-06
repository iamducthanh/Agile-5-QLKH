package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import entities.SanPham;
import help.DataBaseConnect;

public class SanPhamDao {
	public static ArrayList<SanPham> loadUser(){
		ArrayList<SanPham> listSP = new ArrayList<SanPham>();
		try {
			Connection conn = DataBaseConnect.Connect();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listSP;
	}
}
