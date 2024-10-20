/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_24_while;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class chuyen_Thap_Phan_Sang_Nhi_Phan {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int n;
        System.out.println("Nhap n: ");
        n = s.nextInt();
        
        System.out.print("1");
        while ((n/2)!=0) {
            System.out.print(n%2);
            n/=2;
        }
        System.out.println();        
    }
}
