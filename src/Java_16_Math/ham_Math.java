package Java_16_Math;
import java.util.Scanner;

public class ham_Math {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        
        //Nhap a, b
        double a, b;
        System.out.println("Nhap a: ");
        a = s.nextDouble();
        System.out.println("Nhap b: ");
        b = s.nextDouble();
        
        //Ham Math
        //GTTD
        System.out.println("|a| = " + Math.abs(a));
        
        //Min
        System.out.println("Min (a, b) = " + Math.min(a, b));
        
        //Max
        System.out.println("Max (a, b) = " + Math.max(a, b));
        
        //Can bac hai
        System.out.println("sqrt(a) = " + Math.sqrt(a));
        
        //Luy thua
        System.out.println("pow(a, b) = " + Math.pow(a, b));
        
        //Ham ceil
        System.out.println("ceil(a) = " + Math.ceil(a));
        
        //Ham floor
        System.out.println("floor(a) = " + Math.floor(a));
    }
}
