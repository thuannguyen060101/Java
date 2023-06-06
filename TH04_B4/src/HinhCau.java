class HinhCau implements HinhHocCoBan, HinhHoc3D {
	private double r;

	public HinhCau(double r) {
		super();
		this.r = r;
	}

	@Override
	public double tinhTheTich() {
// TODO Auto-generated method stub
		return (Math.PI * 4 * r * r * r) / 3;
	}

	@Override
	public double tinhChuVi() {
// TODO Auto-generated method stub
		return Math.PI * 2 * r;
	}

	@Override
	public double tinhDienTich() {
		// TODO Auto-generated method stub
		return Math.PI * r * r * 4;
	}
}
