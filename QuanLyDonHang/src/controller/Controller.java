package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.table.AbstractTableModel;

import View.Trang1;
import View.Trang2;
import View.Trang3;
import View.Trang4;

public class Controller {
	
	private boolean flagSua;
	private String maDonHang1;
	private String maDonHang;
	private Trang3 trang3;
	private Trang2 trang2;
	private Trang1 trang1;
	private Trang4 trang4;

	public Controller(Trang3 trang3, Trang2 trang2,Trang1 trang1, Trang4 trang4) {
		this.trang3 = trang3;
		this.trang2 = trang2;
		this.trang1 = trang1;
		this.trang4 = trang4;
		
		trang1.reset(new resetButton());
		trang1.timKiem(new timKiemButton());
		trang4.xoaSanPham(new suaXoaSanPhamButton());
		trang3.comboBox(new comboBoxButton());
		trang4.luuDonHang(new suaLuuDonHangButton());
		trang4.themSanPham(new suaThemSanPhamButton() , maDonHang1);
		trang1.suaDonHang(new suaDonHangButton());
		trang1.xoaDonHang(new xoaDonHangButton());
		trang2.xoaSanPham(new xoaSanPhamButton());
		trang1.themDonHang(new themDonHangButton());
		trang2.luuDonHang(new luuDonHangButton());
		trang2.themSanPham(new themSanPhamButton(), maDonHang);
		trang3.luuSanPham(new luuSanPhamButton());

	}
// Khi bấm nút lưu sản phẩm từ  trang 3
	class luuSanPhamButton implements ActionListener {
		public void actionPerformed(ActionEvent ee) {
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
// Nếu FlagSua đúng thì đang thêm sản phẩm từ trang 3			
			if (flagSua == true) {
			
			trang3.luuSanPhamSQL(conn, trang2.getMaDonHang());
			trang2.capNhatTable(conn);
			trang3.thietLapBanDau();
			}
// Nếu FlagSua sai thì đang sửa sản phẩm từ trang 4  
			else {
				trang3.luuSanPhamSQL(conn, trang4.getMaDonHang());
				trang4.capNhatTable(conn);
				trang3.thietLapBanDau();
			}
		}
	}
// Khi bấm nút thêm sản phẩm từ trang 3 
	class themSanPhamButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			flagSua = true;
			trang3.setVisible(true);
			
		}
	}
// Khi chọn comboBox thì sẽ thiết lập lại mã sản phẩm và giá sản phẩm
	class comboBoxButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			trang3.setTxt();
		}
		
	}
//  Khi bấm nút lưu đơn hàng từ trang 3
	class luuDonHangButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent ee) {
			// TODO Auto-generated method stub
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stube				
			trang2.luuDonHangVaoSQL(conn);// Lưu đơn hàng vào SQL
				trang1.capNhatTable(conn);// Cập nhật table 
		}

	}
// Khi bấm nút thêm đơn hàng từ trang 2	
	class themDonHangButton implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent ee) {
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			trang2.capNhatTable(conn);
			trang2.thietLapBanDau();
			trang2.thietLapMaDonHang(conn);
			trang2.setVisible(true);
			
		}
		
	}
// Khi bấm nút xóa sản phẩm từ trang 2	
	class xoaSanPhamButton implements ActionListener{
		public void actionPerformed(ActionEvent ee) {
			// TODO Auto-generated method stub
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			trang2.tblXoaSanPham(conn);
			trang2.capNhatTable(conn);
		}
	}
// Khi bấm nút xóa đơn hàng từ trang 1 	
	class xoaDonHangButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ee) {
			// TODO Auto-generated method stub
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			trang1.tblXoaSanPham(conn);
			trang1.capNhatTable(conn);
		}
		
	}
	
// Khi bấm nút sửa đơn hàng từ trang 1 
	class suaDonHangButton implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent ee) {
			
			// TODO Auto-generated method stub
			
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			trang4.capNhatDuLieu(conn, trang1.getMaDonHang1());
			trang4.capNhatTable(conn);
			trang4.setVisible(true);
		}
		
	}
// Khi bấm nút lưu đơn hàng từ trang 4
	class suaLuuDonHangButton implements ActionListener {
		public void actionPerformed(ActionEvent ee) {
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			trang4.luuDonHangVaoSQL(conn);
			trang1.capNhatTable(conn);
			trang4.setVisible(false);
			trang4.thietLapBanDau();
		}
	}
// Khi bấm nút thêm sản phẩm từ trang 4	
	class suaThemSanPhamButton implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			flagSua = false;
			trang3.setVisible(true);
		}
	}
// Khi bấm nút xóa sản phẩm từ trang 4		
	class suaXoaSanPhamButton implements ActionListener{
		public void actionPerformed(ActionEvent ee) {
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			trang4.tblXoaSanPham(conn);
			trang4.capNhatTable(conn);
		}
	}
// Khi bấm nút tìm kếm từ trang 1	
	class timKiemButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ee) {
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// TODO Auto-generated method stub
			trang1.capNhatDanhSachTimKiem(conn);
		}
		
	}
	
// Khi bấm nút reset từ trang 1	
	class resetButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent ee) {
			// TODO Auto-generated method stub
			Connection conn = null;
			try {
				Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				conn = DriverManager.getConnection("jdbc:sqlserver://TTVH\\SQLEXPRESS:1433;databaseName=QuanLyDonHang;user=sa;password=123");
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			trang1.capNhatTable(conn);
		}
		
	}

}