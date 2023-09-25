
//10
import java.util.Scanner;

public class LabFirst3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the matrix n (n >= 20): ");
        int n = scanner.nextInt();

        int[][] A = new int[n][n];

        // Зчитування значення матриці вручну
        System.out.println("Enter the elements of the matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("A[" + i + "][" + j + "]: ");
                A[i - 1][j - 1] = scanner.nextInt();
            }
        }

        // Виклик функції для пошуку симетричних рядків
        findAndPrintSymmetricRows(A);

        scanner.close();
    }

    // Функція для перевірки, чи є рядок симетричним порівнює кожний елемент з
    // початку рядка з відповідним елементом з кінця
    // рядка.
    static boolean isSymmetric(int[] row) {
        int length = row.length;
        for (int i = 0; i < length / 2; i++) {
            if (row[i] != row[length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    // Функція для пошуку та друку симетричних рядків
    // перебирає кожен рядок матриці і викликає функцію isSymmetric для перевірки
    // симетричності кожного рядка.
    static void findAndPrintSymmetricRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (isSymmetric(matrix[i])) {
                System.out.println("The row " + (i + 1) + " is symmetrical.");
            }
        }
    }
}
