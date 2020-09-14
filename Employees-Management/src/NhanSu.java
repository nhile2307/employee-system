import java.util.Scanner;

public class NhanSu {
	// 1. Attributes
	protected String maso;
	protected String hoTen;
	protected String soDienThoai;
	protected float soNgayLamViec;
	protected float luong;
	// 2. Get, set
	
	/**
	 * @return the maso
	 */
	public String getMaso() {
		return maso;
	}

	/**
	 * @param maso the maso to set
	 */
	public void setMaso(String maso) {
		this.maso = maso;
	}

	/**
	 * @return the hoTen
	 */
	public String getHoTen() {
		return hoTen;
	}

	/**
	 * @param hoTen the hoTen to set
	 */
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	/**
	 * @return the soDienThoai
	 */
	public String getSoDienThoai() {
		return soDienThoai;
	}

	/**
	 * @param soDienThoai the soDienThoai to set
	 */
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	/**
	 * @return the soNgayLamViec
	 */
	public float getSoNgayLamViec() {
		return soNgayLamViec;
	}

	/**
	 * @param soNgayLamViec the soNgayLamViec to set
	 */
	public void setSoNgayLamViec(float soNgayLamViec) {
		this.soNgayLamViec = soNgayLamViec;
	}
	
	public float getLuong() {
		return this.luong;
	}

	// 3. Constructors
	public NhanSu() {
		
	}

	/**
	 * @param maso
	 * @param hoTen
	 * @param soDienThoai
	 * @param soNgayLamViec
	 */
	public NhanSu(String maso, String hoTen, String soDienThoai, float soNgayLamViec) {
		this.maso = maso;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
	}
	
	// 4. Input, output
	public void nhap(Scanner scan) {
		System.out.println("========== Adding staff ========== ");
		System.out.print("Enter code");
		this.maso = scan.nextLine();
		
		System.out.print("Enter name");
		this.hoTen = scan.nextLine();
		
		System.out.print("Enter phone number");
		this.soDienThoai = scan.nextLine();
		
		System.out.print("Enter working days");
		this.soNgayLamViec = Float.parseFloat(scan.nextLine());
		
		System.out.println("========== Finish ========== ");
	}
	
	public void xuat() {
		System.out.print(" Code: " + this.maso);
		System.out.print("\t Full Name: " + this.hoTen);
		System.out.print("\t Phone number: " + this.soDienThoai);
		System.out.print("\t Working days: " + this.soNgayLamViec);
	}
	
	public void xuatMaVaTen() {
		System.out.println("Code: " + this.maso + "\t Name:" + this.hoTen);
	}
	// 5. Business methods
	
	public void tinhLuong() {
		this.luong = 0;
	}
	

}
