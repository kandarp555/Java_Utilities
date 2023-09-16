import java.util.*;

public class Averageof3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        float a = sc.nextInt();
        System.out.println("Enter second number:");
        float b = sc.nextInt();
        System.out.println("Enther third number:");
        float c = sc.nextInt();
        sc.close();
        average2 ave = new average2();
        ave.Ave(a,b,c);
        
        sc.close();

    }

}

class average2 
{
        void Ave(float a, float b, float c) {
        float average = (a + b + c) / 3;
        System.out.printf("Average of 3 numbers is: %.2f\n" , average);
    }
}