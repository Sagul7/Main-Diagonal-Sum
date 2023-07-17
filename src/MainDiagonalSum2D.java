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
