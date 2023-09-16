import java.util.*;

public class Area {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle:(in cm)");
    double a = sc.nextDouble();
    circle cir = new circle();
    cir.Area(a);
    System.out.println("Enter the length of side of square:(in cm)");
    double l = sc.nextDouble();
    square squ = new square();
    squ.Area(l);
    System.out.println("Enter the length of side of ractangle:(in cm)");
    double l1 = sc.nextDouble();
    System.out.println("Enter the breadth of side of ractangle:(in cm)");
    double b = sc.nextDouble();
    ractangle rac = new ractangle();
    rac.Area(l1, b);

    sc.close();
  }
}

class circle {

  void Area(double r) {
    double area = (6.28 * r);
    System.out.printf("Area of the circle is: %.2f cm2\n", area);
  }
}

class square {

  void Area(double l) {
    double area = l * l;
    System.out.printf("Area of the square is: %.2f cm2\n", area);
  }
}

class ractangle {

  void Area(double l, double b) {
    double area = l * b;
    System.out.printf("Area of the ractangle is: %.2f cm2\n", area);
  }
}
