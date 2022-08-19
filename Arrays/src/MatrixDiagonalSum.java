// https://leetcode.com/problems/matrix-diagonal-sum/

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
        System.out.print("Enter 2D array size : ");
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int columns=sc.nextInt();

        System.out.println("Enter array elements : ");

        int twoD[][]=new int[rows][columns];


        for(int i=0; i<rows;i++)
        {
            for(int j=0; j<columns;j++)
            {
                twoD[i][j]=sc.nextInt();
            }
        }
        System.out.print("\nData you entered : \n");
        for(int []x:twoD){
            for(int y:x){
                System.out.print(y+"        ");
            }
            System.out.println();
        }
        System.out.println(diagonalSum(twoD));


}



    public static int diagonalSum(int[][] mat) {
            int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum=sum+mat[i][j*2];
            }
        }
        return sum;
    }
}
