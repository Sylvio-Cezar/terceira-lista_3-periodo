import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma string: ");
        String entry = scan.nextLine();
        String result = removeDuplicates(entry);
        System.out.println("Resultado: " + result);
        scan.close();
    }

    public static String removeDuplicates(String entry) {
        String result = "";
        for (int i = 0; i < entry.length(); i++) {
            char letter = entry.charAt(i);
            if (i == entry.length() - 1 || letter != entry.charAt(i + 1)) {
                result += letter;
            }
        }
        return result;
    }
}