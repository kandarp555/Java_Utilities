import java.util.*;

public class p3 {

  static void delete(int arr[], int index) {
    for (int i = index + 1; i <= arr.length - 1; i++) {
      arr[i - 1] = arr[i];
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the elements of array: ");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }
    System.out.println("The elements of array are: ");
    for (int i = 0; i < n; i++) {
      System.out.print(arr[i] + " ");
    }
    int target;
    System.out.println("Enter the element to be searched: ");
    target = sc.nextInt();
    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        System.out.println("The element is present at index : " + i);
      }
    }
    System.out.println("Enter the element to be inserted: ");
    int e = sc.nextInt();
    System.out.println("Enter the index you want to insert at: ");
    int p = sc.nextInt();
    int num[] = Arrays.copyOf(arr, n + 2);
    for (int j = num.length - 2; j >= p; j--) {
      num[j + 1] = num[j];
    }
    num[p] = e;
    System.out.println("Array after insertion is : ");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println("Enter the index you want to delete at: ");
    int z = sc.nextInt();
    delete(num, z);
    System.out.println("Array after deletion is: ");
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
    sc.close();
  }
}
