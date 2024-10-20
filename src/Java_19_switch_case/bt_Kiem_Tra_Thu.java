/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_19_switch_case;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bt_Kiem_Tra_Thu {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int n;
        System.out.println("Nhap n (2 <= n <= 8): ");
        n = s.nextInt();
        
        switch (n) {
            case 2:
                System.out.println("Thu Hai");
                break;
            case 3:
                System.out.println("Thu Ba");
                break;
            case 4:
                System.out.println("Thu Tu");
                break;
            case 5:
                System.out.println("Thu Nam");
                break;
            case 6:
                System.out.println("Thu Sau");
                break;
            case 7:
                System.out.println("Thu Bay");
                break;
            case 8:
                System.out.println("Chu Nhat");
                break;
            default:
                System.out.println("Nhap du lieu sai");
        }
    }
}
