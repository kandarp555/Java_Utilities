import java.util.*;

public class Arithmetic {
    public static void main(String args[]) {

            int p = 15;
            int q = 16;
            int x = p+q;
            int y = p-q;
            int z = p*q;
            int w = p/q;
            float u = p/q;
            int t = p%q;
            System.out.println("Addition = "+x);
            System.out.println("Subtraction = "+y);
            System.out.println("Multiplication = "+z);
            System.out.println("Division = "+w);
            System.out.println("Float division = "+u);
            System.out.println("Modulo = "+t);


            Scanner sc = new Scanner(System.in);

            System.out.println("\nenter one value:");
            int i = sc.nextInt();
            System.out.println("\n");
            System.out.println("enter second value:");
            int j = sc.nextInt();
            System.out.println("\n");
            int c = i + j;
            int d = i - j;
            int e = i * j;
            int f = i / j;
            float g = i / j;
            int h = i%j;
            System.out.println("Addition = " + c);
            System.out.println("Subtraction = " + d);
            System.out.println("Multiplication = " + e);
            System.out.println("Integer division = " + f);
            System.out.println("Float division = " + g);
            System.out.println("Modulo = "+h);
            sc.close();

        

    }
}