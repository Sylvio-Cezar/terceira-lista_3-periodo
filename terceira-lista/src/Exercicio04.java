import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String entry = scan.nextLine();
        String result = SetUpperOrLower(entry);
        System.out.println("Resultado: " + result);
        scan.close();
    }

    public static String SetUpperOrLower(String entry) {
        String result = "";
        for (int i = 0; i < entry.length(); i++) {
            char letter = entry.charAt(i);
            if (i % 2 == 0) {
                result += Character.toString(letter).toLowerCase();
            } else {
                result += Character.toString(letter).toUpperCase();
            }
        }
        return result;
    }

}