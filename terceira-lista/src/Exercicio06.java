import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String entry = scan.nextLine();
        String result = sortAlphabetical(entry);
        System.out.println("Resultado: " + result);
        scan.close();
    }

    public static String sortAlphabetical(String entry) {
        int[] frequency = new int[26];
        for (int i = 0; i < entry.length(); i++) {
            char letter = entry.charAt(i);
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                frequency[letter - 'a']++;
            }
        }
        char[] sortedChars = new char[entry.length()];
        int index = 0;
        for (char letter = 'a'; letter <= 'z'; letter++) {
            int f = frequency[letter - 'a'];
            for (int i = 0; i < f; i++) {
                sortedChars[index] = letter;
                index++;
            }
        }
        return new String(sortedChars);
    }
}