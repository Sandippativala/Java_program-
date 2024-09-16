public class k5 {

    public static void main(String[] args) {
        // Define two 3x3 matrices
        int[][] matrixA = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrixB = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        // Perform matrix addition
        int[][] sum = addMatrices(matrixA, matrixB);
        System.out.println("Matrix A + Matrix B:");
        printMatrix(sum);

        // Perform matrix subtraction
        int[][] difference = subtractMatrices(matrixA, matrixB);
        System.out.println("Matrix A - Matrix B:");
        printMatrix(difference);

        // Perform matrix multiplication
        int[][] product = multiplyMatrices(matrixA, matrixB);
        System.out.println("Matrix A * Matrix B:");
        printMatrix(product);
    }

    // Method to print a matrix
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Method to add two matrices
    private static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    // Method to subtract two matrices
    private static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    // Method to multiply two matrices
    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }
}
