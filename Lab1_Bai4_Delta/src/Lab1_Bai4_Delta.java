/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai4_Delta {
	public static void main(String[] args) {  
        // Tạo một đối tượng Scanner để nhập dữ liệu từ bàn phím  
        Scanner scanner = new Scanner(System.in);  
        
        // Nhập các hệ số của phương trình bậc 2 (a, b, c)  
        System.out.print("Nhập hệ số a: ");  
        double a = scanner.nextDouble();  
        System.out.print("Nhập hệ số b: ");  
        double b = scanner.nextDouble();  
        System.out.print("Nhập hệ số c: ");  
        double c = scanner.nextDouble();  
        
        // Tính delta (Δ)  
        double delta = (b * b) - (4 * a * c);  
        
        // Xuất delta ra màn hình  
        System.out.println("Giá trị của Δ: " + delta);  
        
        // Tính và xuất căn delta nếu delta không âm  
        if (delta >= 0) {  
            double canDelta = Math.sqrt(delta);  
            System.out.println("Căn của Δ: " + canDelta);  
        } else {  
            System.out.println("Δ âm nên không thể lấy căn bậc hai.");  
        }  
        
        // Đóng Scanner  
        scanner.close();  
    }  
}
