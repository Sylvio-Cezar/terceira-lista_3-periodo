import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite a lista de palavras permitidas separadas por espaço: ");
        String allowedList = scan.nextLine();
        String[] allowedWords = allowedList.split(" ");

        System.out.print("Digite uma frase: ");
        String phrase = scan.nextLine();
        String[] words = phrase.split(" ");

        String filteredPhrase = "";
        for (String word : words) {
            for (String allowedWord : allowedWords) {
                if (word.toLowerCase().equals(allowedWord)) {
                    filteredPhrase += word + " ";
                    break;
                }
            }
        }

        System.out.println("Frase filtrada: " + filteredPhrase.trim());
    }
}
