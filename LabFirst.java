
//1
import java.util.Locale;
import java.util.Scanner;

public class LabFirst {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // для зчитування введення користувача з консолі.

        input.useLocale(Locale.US); // обробляються десяткові роздільники.

        // Зчитую значення a та b з консолі
        System.out.print("Enter the value of a (real number): ");
        double a = input.nextDouble();

        System.out.print("Enter the value of b (real number): ");
        double b = input.nextDouble();

        // 1: вхідні дані дійсного типу, результат - дійсний
        double result1 = a + ((a + b - 1) / (Math.pow(a, 2) + 2)) - Math.pow(a * b, 3);
        System.out.println("Result (real type) = " + result1);

        // 2: вхідні дані цілого типу, результат - дійсний
        int aInt = (int) a;
        int bInt = (int) b;
        double result2 = aInt + ((aInt + bInt - 1) / (Math.pow(aInt, 2) + 2)) - Math.pow(aInt * bInt, 3);
        System.out.println("Result (real type with integer input data) = " + result2);

        // 3: вхідні дані дійсного типу, результат - ціле число
        final int result3 = (int) (a + ((a + b - 1) / (Math.pow(a, 2) + 2)) - Math.pow(a * b, 3));
        System.out.println("Result (integer input data) = " + result3);

        input.close();
    }

    public String toString() {
        return "LabFirst []";
    }

}
// int використовується для зберігання цілих чисел без десяткової частини.
// double (чисел з десятковою частиною).
// float теж саме але має менший діапазон значень і точність порівняно з double.
// long для зберігання дуже великих цілих чисел.
// short має діапазон від -32,768 до 32,767.
// byte має діапазон від -128 до 127. і те і те для цілих чисел