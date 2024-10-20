package Java_16;
import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        //Nhap du lieu
        double r, C, S;
        System.out.println("Nhap ban kinh: ");
        r = s.nextDouble();
        
        //Tinh C, S;
        System.out.println("Chu vi duong tron: " + 2*Math.PI*r);
        System.out.println("Chu vi duong tron: " + Math.round(2*Math.PI*r*100.0)/100.0);
        System.out.println("Dien tich hinh tron: " + Math.PI*Math.pow(r, 2));
        System.out.println("Dien tich hinh tron: " + Math.round(Math.PI*Math.pow(r, 2)*100.0)/100.0);
    }
}
