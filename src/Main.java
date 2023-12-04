import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // Fibonacci
        int toFindInt = 1;
        int toFindInt2 = 0;
        boolean fibonacciInt = main.findFibonacciInt(toFindInt);
        boolean fibonacciInt2 = main.findFibonacciInt(toFindInt2);
        // toFindInt will return 1 since it is a fibonacci number
        System.out.println("Fibonacci 1: " + fibonacciInt);
        // toFindInt2 will return -1 = not found
        System.out.println("Not Fibonacci 2: " + fibonacciInt2);

        // Largest number in list
        int[] numList = {1, 2, 3, 4, 5, 2, 4, 6, 1, 2, -1};
        int largestNum = main.findLargestNumInList(numList);
        System.out.println("Largest number in list: " + largestNum);

        // Row and column processing
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] newMatrix = main.colRowProcessing(matrix);
        System.out.println("Row and column processing: " + Arrays.deepToString(newMatrix));
    }

    private boolean findFibonacciInt(int toFindInt) {
        int num1 = 0;
        int num2 = 1;
        int num3 = 0;
        for (int i = 0; i < toFindInt; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            if (num3 == toFindInt) {
                return true;
            }

            if (num3 > toFindInt) {
                return false;
            }
        }

        return false;
    }

    private int findLargestNumInList(int[] numList) {
        int largestNum = numList[0];
        for (int j : numList) {
            if (j > largestNum) {
                largestNum = j;
            }
        }

        return largestNum;
    }

    private int[][] colRowProcessing(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] newMatrix = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = row - 1; j >= 0; j--) {
                newMatrix[i][row - 1 - j] = matrix[j][i];
            }
        }

        return newMatrix;
    }
}