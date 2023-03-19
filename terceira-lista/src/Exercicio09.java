import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite uma frase: ");
        String phrase = scan.nextLine();

        String[] words = phrase.split(" ");
        String phraseNoArticle = "";
        for (String word : words) {
            if (!word.equalsIgnoreCase("o") && !word.equalsIgnoreCase("a") &&
                    !word.equalsIgnoreCase("os") && !word.equalsIgnoreCase("as") &&
                    !word.equalsIgnoreCase("um") && !word.equalsIgnoreCase("uma") &&
                    !word.equalsIgnoreCase("uns") && !word.equalsIgnoreCase("umas") &&
                    !word.equalsIgnoreCase("de") && !word.equalsIgnoreCase("da") &&
                    !word.equalsIgnoreCase("do") && !word.equalsIgnoreCase("dos") &&
                    !word.equalsIgnoreCase("das") && !word.equalsIgnoreCase("para") &&
                    !word.equalsIgnoreCase("com") && !word.equalsIgnoreCase("em") &&
                    !word.equalsIgnoreCase("por") && !word.equalsIgnoreCase("no") &&
                    !word.equalsIgnoreCase("na") && !word.equalsIgnoreCase("nos") &&
                    !word.equalsIgnoreCase("nas")) {
                phraseNoArticle += word + " ";
            }
        }

        String[] orderedWords = phraseNoArticle.trim().split(" ");
        for (int i = 0; i < orderedWords.length - 1; i++) {
            for (int j = i + 1; j < orderedWords.length; j++) {
                if (orderedWords[i].compareToIgnoreCase(orderedWords[j]) > 0) {
                    String aux = orderedWords[i];
                    orderedWords[i] = orderedWords[j];
                    orderedWords[j] = aux;
                }
            }
        }

        System.out.print("Frase ordenada: ");
        for (String orderedWord : orderedWords) {
            System.out.print(orderedWord + " ");
        }
    }
}
