import java.util.ArrayList;
public class CT {

	public static void main(String[] args) {		
		        //khai bao danh sach san pham
				ArrayList<Sanpham> dsSanPham;
				//xin moi
				dsSanPham = new ArrayList<Sanpham>();
				//nhap 3 san pham
				Sanpham sp1 = new Sanpham(0, "Ca", "Dongvat", null);
				Sanpham sp2 = new Sanpham(1, "Bo", "Dongvat", null);
				Sanpham sp3 = new Sanpham(2, "Coca", "Douong", null);
				//them vao ArryList
				dsSanPham.add(sp1);
				dsSanPham.add(sp2);
				dsSanPham.add(sp3);
				for(Sanpham x:dsSanPham)
					System.out.println(x.toString());
				//cach khac de xuat ds
				//for(int i;i<dsSanPham.size(); i++) {
					//SanPham sp = dsSanPham.get(i);
					//System.out.println(sp.toString());
				//}
				
		}
}