
public class CT {

	public static void main(String[] args) {
		//tao ra 2 san pham (hardcode: cho san)
		Sanpham sp1 = new Sanpham();
		Sanpham sp2 = new Sanpham(2, "banh","doan","avt.jpg");
		sp1.setMaSP(1);
		sp1.setTenSP("bia");
		sp1.setLoaiSP("douong");
		sp1.setAnhSP("avt1.jpg");
		//in ra ma hinh thong tin 2 san pham tren
		String thongtinSP1 = sp1.toString();
		String thongtinSP2 = "Ma SP2 la " + sp2.getMaSP(); 
		       thongtinSP2 +="Ten SP2 la" + sp2.getTenSP();
		System.out.println(thongtinSP1);
		System.out.println(thongtinSP2);
	}
}
