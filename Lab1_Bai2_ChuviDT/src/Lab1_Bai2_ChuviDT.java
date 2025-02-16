/**
 * 
 */
import java.util.Scanner;
/**
 * 
 */
public class Lab1_Bai2_ChuviDT {
	public static void main(String[] args) {  
        // Tạo một đối tượng Scanner để nhập dữ liệu từ bàn phím  
        Scanner scanner = new Scanner(System.in);  
        
        // Nhập độ dài cạnh 1  
        System.out.print("Nhập độ dài cạnh 1: ");  
        double canh1 = scanner.nextDouble();  
        
        // Nhập độ dài cạnh 2  
        System.out.print("Nhập độ dài cạnh 2: ");  
        double canh2 = scanner.nextDouble();  
        
        // Tính chu vi hình chữ nhật  
        double chuVi = 2 * (canh1 + canh2);  
        
        // Tính diện tích hình chữ nhật  
        double dienTich = canh1 * canh2;  
        
        // Tìm cạnh nhỏ  
        double canhNho = Math.min(canh1, canh2);  
        
        // Xuất thông tin ra màn hình  
        System.out.println("Thông tin hình chữ nhật:");  
        System.out.println("Chu vi: " + chuVi);  
        System.out.println("Diện tích: " + dienTich);  
        System.out.println("Cạnh nhỏ: " + canhNho);  
        
        // Đóng Scanner  
        scanner.close();  
    }  
}
