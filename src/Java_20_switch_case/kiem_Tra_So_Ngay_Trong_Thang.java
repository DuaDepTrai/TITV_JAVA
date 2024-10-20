/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_20_switch_case;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class kiem_Tra_So_Ngay_Trong_Thang {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int m, y;
        System.out.println("Nhap thang, nam (1 <= m <= 12): ");
        m = s.nextInt();
        y = s.nextInt();
        
        switch (m) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Thang co 30 ngay");
                break;
            case 2:
                if ((y % 4 == 0 && y % 100 !=0) || (y % 400 == 0) ) {
                System.out.println("Thang co 29 ngay");
                } else System.out.println("Thang co 28 ngay");
                break;
            default:
                System.out.println("Du lieu khong chinh xac");
        }
    }
}
