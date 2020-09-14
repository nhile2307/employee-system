import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanSu {
	// 1. Attributes
	private ArrayList<NhanSu> listNhanSu;
	// 2. get, set

	/**
	 * @return the listNhanSu
	 */
	public ArrayList<NhanSu> getListNhanSu() {
		return listNhanSu;
	}

	/**
	 * @param listNhanSu the listNhanSu to set
	 */
	public void setListNhanSu(ArrayList<NhanSu> listNhanSu) {
		this.listNhanSu = listNhanSu;
	}

	// 3. Constructors
	public DanhSachNhanSu() {
		this.listNhanSu = new ArrayList<NhanSu>();
	}

	// 4. Input, output
	private void inMenu() {
		System.out.println("1. Insert ordinary staff");
		System.out.println("2. Insert manager");
		System.out.println("3. Insert director");
		System.out.println("0. Exit ");
	}

	public ArrayList<NhanVienThuong> nhap(Scanner scan) {
		boolean flag = true;
		ArrayList<NhanVienThuong> listNVThuongMoi = new ArrayList<NhanVienThuong>();
		NhanSu nhanSu = null;
		do {
			inMenu();
			System.out.print("Please choose >>");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				nhanSu = new NhanVienThuong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				// adding to the list
				this.them(nhanSu);
				listNVThuongMoi.add((NhanVienThuong)nhanSu);
				break;
			case 2:
				nhanSu = new TruongPhong();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				// adding to the list
				this.them(nhanSu);
				break;
			case 3:
				nhanSu = new GiamDoc();
				nhanSu.nhap(scan);
				nhanSu.tinhLuong();
				// adding to the list
				this.them(nhanSu);
				break;
			default:
				System.out.println("Please choose fron 0-3");
			}
		} while (flag);
		return listNVThuongMoi;
	}
	
	public void xuat() {
		for(NhanSu ns: this.listNhanSu) {
			ns.xuat();
		}
	}
	
	public void tinhLuong() {
		for(NhanSu ns: this.listNhanSu) {
			ns.tinhLuong();
		}
	}
	
	public void them(NhanSu ns) {
		this.listNhanSu.add(ns);
	}
	
	public boolean xoaNhanSu(NhanSu ns) {
		boolean deleted = false;
		for(int i = this.listNhanSu.size() -1; i >0; i--) {
			NhanSu current = this.listNhanSu.get(i);
			if(ns.getMaso().equalsIgnoreCase(current.getMaso())){
				this.listNhanSu.remove(i);
				deleted = true;
				break;
			}
		}
		return deleted;
	}

}
