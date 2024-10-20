/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_21_for;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class chep_Phat {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        int n;
        System.out.println("Nhap n: ");
        n = s.nextInt();
        
        for (int i=1; i<=n; i++) {
            System.out.println("Line "+i+": Em hua...");
        }
    }
}
