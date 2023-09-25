
//13
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class LabFirst2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the aray: ");
        int n = input.nextInt();

        int[] A = new int[n];
        System.out.println("Enter the elements of the aray:");
        for (int i = 0; i < n; i++) {
            A[i] = input.nextInt();
        }

        // Мапа для зберігання кількості повторень кожного числа
        Map<Integer, Integer> countMap = new HashMap<>();

        // Заповнюю мапу та рахую кількість повторень кожного числа
        for (int num : A) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        } // підраховується кількість повторень кожного числа в масиві за допомогою ключа
          // і
          // значення, ключ-mup, ключами будуть числа з масиву A, значення-кількість
          // повторів числа

        // Створюємо новий список для зберігання ущільненого масиву
        List<Integer> resultList = new ArrayList<>();

        // Проходжусь по отриманому масиву та додаю числа, які повторюються більше як 3
        // рази
        for (int num : A) {
            if (countMap.get(num) <= 3) {
                resultList.add(num);
            }
        }

        // Перетворюю результат знову в масив
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        // Виводжу ущільнений масив
        System.out.println("Compressed array:");
        for (int num : resultArray) {
            System.out.print(num + " ");
        }

        input.close();
    }
}

// List - це інтерфейс, який представляє собою упорядковану послідовність
// об'єктів.
// Map - це колекція даних, яка використовується для зберігання пар
// ключ-значення,За допомогою ключа можна отримувати відповідне значення.