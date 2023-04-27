package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Connection.DBConnection;
import Model.Employee;

public class EmployeeDao {
	public static void insertEmployee(Employee e) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into employee (First_Name,Last_Name,Gender,Address,Mobile,Email,Password) values (?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, e.getFirst_Name());
			pst.setString(2, e.getLast_Name());
			pst.setString(3, e.getGender());
			pst.setString(4, e.getAddress());
			pst.setLong(5, e.getMobile());
			pst.setString(6, e.getEmail());
			pst.setString(7, e.getPassword());
			
			pst.executeUpdate();
			System.out.println("Account Registered succesfully.");
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
	}
}
