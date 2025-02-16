/**
 * 
 */
import java.util.Scanner;  
/**
 * 
 */
public class Lab1_Bai1_DTB {
	public static void main(String[] args) {  
        // Tạo một đối tượng Scanner để nhập dữ liệu từ bàn phím  
        Scanner scanner = new Scanner(System.in);  
        
        // Nhập họ và tên sinh viên  
        System.out.print("Nhập họ và tên sinh viên: ");  
        String hoTen = scanner.nextLine();  
        
        // Nhập điểm trung bình  
        System.out.print("Nhập điểm trung bình: ");  
        double diemTrungBinh = scanner.nextDouble();  
        
        // Xuất thông tin ra màn hình  
        System.out.println("Thông tin sinh viên:");  
        System.out.println("Họ và tên: " + hoTen);  
        System.out.println("Điểm trung bình: " + diemTrungBinh);  
        
        // Đóng Scanner  
        scanner.close();  
        
    } 
}
