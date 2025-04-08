import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int arr1[][] = new int[m][n];
        System.out.println("Array 1 ");
        for(int i=0;i<=m-1;i++) {
            for(int j=0;j<=n-1;j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
       
        int arr2[][] = new int[m][n];
        System.out.println("Array 2 ");
        for(int i=0;i<=m-1;i++) {
            for(int j=0;j<=n-1;j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
       
        int addition[][] = new int[m][n];
        for(int i=0;i<=m-1;i++) {
            for(int j=0;j<=n-1;j++) {
                addition[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
       
        System.out.println("Array after addition..");
        for(int i=0;i<=m-1;i++) {
            for(int j=0;j<=n-1;j++) {
                System.out.print(addition[i][j]+" ");
            }
            System.out.println();
        }
    }
}
