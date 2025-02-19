package linhntk.ntu; // ten goi viet thuong

import java.util.Scanner;

public class CT { // ten lop viet hoa ki tu dau

	public static void main(String[] args) {
		// in ra mot dong tieu de 
		System.out.print("CT tinh tong \n");
		// chuan bi cho viec nhap
		Scanner banphim = new Scanner(System.in);
		// in dong huong dan 
		System.out.println("nhap a: ");
		double a = banphim.nextDouble();
		System.out.println("nhap b: ");
		double b = banphim.nextDouble();
		// tinh toan
		double tong = a + b;
		// xuat
		System.out.print("Tong la: ");
		System.out.print(tong);
		

	}

}
