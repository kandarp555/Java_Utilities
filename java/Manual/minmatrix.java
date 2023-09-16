import java.util.*;
public class minmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[][] = new int[3][3];
        System.out.println("Enter the elements of array: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int min = ar[0][0];
        for (int i = 0; i < 3; i++) {
            for(int j=0;j<3;j++){
                if(ar[i][j]<min){
                    min = ar[i][j];
                }
            }
            
        }
        System.out.println("The minimum number in the two dimensional array is: "+min);
        sc.close();
    }
}
