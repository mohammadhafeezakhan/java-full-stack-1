import java.util.Scanner;



public class SpiralMatrix {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix (n): ");

        int n = scanner.nextInt();

        int[][] matrix = new int[n][n];



        int value = 1;

        int top = 0, bottom = n - 1;

        int left = 0, right = n - 1;



        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {

                matrix[top][i] = value++;

            }

            top++;



            for (int i = top; i <= bottom; i++) {

                matrix[i][right] = value++;

            }

            right--;



            if (top <= bottom) {

                for (int i = right; i >= left; i--) {

                    matrix[bottom][i] = value++;

                }

                bottom--;

            }



            if (left <= right) {

                for (int i = bottom; i >= top; i--) {

                    matrix[i][left] = value++;

                }

                left++;

            }

        }



        for (int[] row : matrix) {

            for (int num : row) {

                System.out.print(num + "\t");

            }

            System.out.println();

        }



        scanner.close();

    }

}