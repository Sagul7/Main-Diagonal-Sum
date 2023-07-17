import java.util.Scanner;

public class MainDiagonalSum2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();
        int array[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        System.out.println(calculateDiagonal(array,row,column));
    }
    public static int calculateDiagonal(int[][] array,int row,int column)
    {
        int sum = 0;
        for(int i=0;i<row;i++)
        {
            sum+=array[i][i];
        }
        return sum;
    }
}
/*You are given a N X N integer matrix. You have to find the sum of all the main diagonal elements of A.
Main diagonal of a matrix A is a collection of elements A[i, j] such that i = j.
Input Format
There are 1 lines in the input. First 2 integers R, C are the number of rows and columns. 
Then R * C integers follow corresponding to the row-wise numbers in the 2D array A.
Input
3 3 1 -2 -3 -4 5 -6 -7 -8 9
Output
15
*/
