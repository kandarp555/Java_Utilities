import java.util.*;

public class Dollar {

    public static void main(String args[]) {

        System.out.println("Enter the amount of rupee:");
        Scanner sc = new Scanner(System.in);
        double rupee = sc.nextInt();
        double dollar = (rupee / 79.65);
        System.out.println("Amount in dollar: " + dollar);

        sc.close();

    }
}
