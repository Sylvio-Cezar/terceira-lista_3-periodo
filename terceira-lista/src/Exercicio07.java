import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String entry = scan.nextLine();
        String result = sortByLength(entry);
        System.out.println("Resultado: " + result);
        scan.close();
    }

    public static String sortByLength(String entry) {
        String[] words = entry.split(" ");
        String[] sortWords = new String[words.length];
        for (int i = 0; i < words.length; i++) {
            sortWords[i] = words[i];
        }
        for (int i = 0; i < sortWords.length - 1; i++) {
            for (int j = i + 1; j < sortWords.length; j++) {
                if (sortWords[j].length() > sortWords[i].length()) {
                    String aux = sortWords[i];
                    sortWords[i] = sortWords[j];
                    sortWords[j] = aux;
                }
            }
        }
        String result = "";
        for (String word : sortWords) {
            result += word + " ";
        }
        return result.trim();
    }
}