import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String entry = scan.nextLine();
        String result = duplicateVowels(entry);
        System.out.println("Resultado: " + result);
        scan.close();
    }

    public static String duplicateVowels(String entry) {
        String result = "";
        for (int i = 0; i < entry.length(); i++) {
            char letter = entry.charAt(i);
            if (isVowel(letter)) {
                result += letter + "" + letter;
            } else {
                result += letter;
            }
        }
        return result;
    }

    public static boolean isVowel(char letter) {
        letter = Character.toLowerCase(letter);
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u';
    }
}