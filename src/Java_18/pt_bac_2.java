/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_18;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class pt_bac_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        //Nhap he so
        double d, a, b, c, x1, x2;
        System.out.println("Nhap he so a, b, c: ");
        a = s.nextDouble();
        b = s.nextDouble();
        c = s.nextDouble();
        
        //Tim nghiem phuong trinh
        if (a==0) {
            if (b==0) {
                if (c==0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else System.out.println("Phuong trinh vo nghiem");
            } else System.out.println("Phuong trinh co nghiem: x = " + Math.round(-c/b*100.0)/100.0);
        } else {
            d = Math.pow(b, 2) - 4*a*c;
            if (d<0) {
                System.out.println("Phuong trinh vo nghiem");
            } else if (d==0) {
                System.out.println("Phuong trinh co nghiem kep: x1 = x2 = " + Math.round(-b/(2*a)*100.0)/100.0);
            } else {
                x1 = (-b + Math.sqrt(d))/(2*a);
                x2 = (-b - Math.sqrt(d))/(2*a);
                System.out.println("Phuong trinh co 2 nghiem phan biet: x1 = " + Math.round(x1*100.0)/100.0 + ", x2 = " + Math.round(x2*100.0)/100.0);
            }
        }
    }
   
}
