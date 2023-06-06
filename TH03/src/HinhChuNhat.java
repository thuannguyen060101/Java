
public class HinhChuNhat {
	private double chieuDai, chieuRong;

	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}
	
	public double tinhDienTich() {
		return chieuRong*chieuDai;
	}
	
	public double tinhChuVi() {
		return (chieuRong + chieuDai) * 2;
	}
}
