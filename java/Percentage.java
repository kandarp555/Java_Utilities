import java.util.*;

public class Percentage {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter subject 1 marks:");
        int a = sc.nextInt();
        System.out.println("\nEnter subject 2 marks:");
        int b = sc.nextInt();
        System.out.println("\nEnter subject 3 marks:");
        int c = sc.nextInt();
        System.out.println("\nEnter subject 4 marks:");
        int d = sc.nextInt();
        System.out.println("\nEnter subject 5 marks:");
        int e = sc.nextInt();
        System.out.println("\nEnter subject 6 marks:");
        int f = sc.nextInt();

        float percnt = (a + b + c + d + e + f) / 6;

        System.out.println("Percentage = " + percnt);

        sc.close();

    }

}
