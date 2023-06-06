package Run;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import Controller.Controller;
import View.Trang1;
import View.Trang2;
import View.Trang3;
import View.Trang4;

public class Run {
	public static void main(String[] args) {
		Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Trang3 trang3 = new Trang3();
		Trang2 trang2 = new Trang2();
		Trang1 trang1 = new Trang1();
		Trang4 trang4 = new Trang4();
		trang1.capNhatTable(conn);
		trang3.setComboBox();
		Controller controller = new Controller(trang3,trang2,trang1, trang4);
	}
}
