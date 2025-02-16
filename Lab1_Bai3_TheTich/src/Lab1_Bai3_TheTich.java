/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai3_TheTich {
	public static void main(String[] args) {  
        // Tạo một đối tượng Scanner để nhập dữ liệu từ bàn phím  
        Scanner scanner = new Scanner(System.in);  
        
        // Nhập độ dài cạnh của khối lập phương  
        System.out.print("Nhập độ dài cạnh của khối lập phương: ");  
        double canh = scanner.nextDouble();  
        
        // Tính thể tích của khối lập phương  
        double theTich = Math.pow(canh, 3);  
        
        // Xuất thể tích ra màn hình  
        System.out.println("Thể tích của khối lập phương: " + theTich);  
        
        // Đóng Scanner  
        scanner.close();  
    }  
}
