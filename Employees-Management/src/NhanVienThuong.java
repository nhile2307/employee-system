
public class NhanVienThuong extends NhanSu {

	// Constants
	final int LUONG_NGAY = 100;
	// 1. Attributes
	private TruongPhong truongPhong;
	// 2. Get, set

	/**
	 * @return the truongPhong
	 */
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	/**
	 * @param truongPhong the truongPhong to set
	 */
	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

	// 3. Constructor
	public NhanVienThuong() {
		this.truongPhong = null; // Chưa được phân bổ
	}

	public NhanVienThuong(String maso, String hoTen, String soDienThoai, float soNgayLamViec) {
		super(maso, hoTen, soDienThoai, soNgayLamViec);

	}

	// 4. input, output
	@Override
	public void xuat() {
		super.xuat();
		if (this.truongPhong != null) {
			System.out.println("\t Salary: " + this.luong + "\t Manager's code: " + this.truongPhong.getMaso() + "\t Manager's name:"
					+ this.truongPhong.getHoTen());
		} else {
			System.out.println("\t Salary: " + this.luong + "\t Not be allocated");
		}
	}

	// 5. Business
	@Override
	public void tinhLuong() {
		this.luong = this.soNgayLamViec * LUONG_NGAY;
	}

}
