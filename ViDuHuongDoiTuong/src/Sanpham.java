
public class Sanpham {
	// dinh nghia cac thuoc tinh
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; // ten file anh
	// ham tao
	public Sanpham() { // cung ten, khong tham so
		//khoi tao gia tri ban dau cho cac thuoc tinh
	}
//	public Sanpham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) { // cung ten, co tham so
//		//khoi tao gia tri ban dau cho cac thuoc tinh
//		maSP = _maSP;
//		tenSP= _tenSP;
//		loaiSP=_loaiSP;
//		anhSP=_anhSP;
	}
	public Sanpham(int maSP, String tenSP, String loaiSP, String anhSP) { // cung ten, co tham so
		//khoi tao gia tri ban dau cho cac thuoc tinh
		this.maSP = maSP;
		this.tenSP= tenSP;
		this.loaiSP=loaiSP;
		this.anhSP=anhSP;
	}
	// cac getter, setter

}
