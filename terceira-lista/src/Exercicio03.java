import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String entry = scan.nextLine();
        String result = removeOdd(entry);
        System.out.println("Resultado: " + result);
        scan.close();
    }

    public static String removeOdd(String entry) {
        int[] frequency = new int[26];
        for (int i = 0; i < entry.length(); i++) {
            char letter = entry.charAt(i);
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                frequency[letter - 'a']++;
            }
        }
        String result = "";
        for (int i = 0; i < entry.length(); i++) {
            char letter = entry.charAt(i);
            if (Character.isLetter(letter)) {
                letter = Character.toLowerCase(letter);
                if (frequency[letter - 'a'] % 2 == 0) {
                    result += letter;
                }
            } else {
                result += letter;
            }
        }
        return result;
    }
}