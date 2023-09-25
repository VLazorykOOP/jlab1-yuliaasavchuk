
//9
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LabFirst4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String inputText = scanner.nextLine();

        List<String> words = extractWords(inputText); // для виділення слів з тексту.
        List<String> sortedWords = findLexicographicallySortedWords(words);
        // вивід слів на консоль
        System.out.println("words in lexicographic order: ");
        for (String word : sortedWords) {
            System.out.println(word);
        }

        scanner.close();
    }

    // Функція для виділення слів з тексту
    static List<String> extractWords(String text) {
        String[] wordsArray = text.split("[\\s,.!?]+");
        List<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));// перетворюється масив у список
        return wordsList;
    }

    // Функція для знаходження слів, літери в яких розміщені в лексикографічному
    // порядку
    static List<String> findLexicographicallySortedWords(List<String> words) {
        List<String> sortedWords = new ArrayList<>();

        for (String word : words) {
            if (isLexicographicallySorted(word)) {
                sortedWords.add(word);
            }
        }

        return sortedWords;
    }

    // Функція для перевірки, чи в слові літери розміщені в лексикографічному
    // порядку
    static boolean isLexicographicallySorted(String word) {
        char[] chars = word.toCharArray();
        char[] sortedChars = Arrays.copyOf(chars, chars.length);
        Arrays.sort(sortedChars);
        return Arrays.equals(chars, sortedChars);
    }
}
