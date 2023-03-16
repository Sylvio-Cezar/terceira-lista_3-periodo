import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma CNH: ");
        String cnh = scan.nextLine();
        if (isValidCNH(cnh)) {
            System.out.println("A CNH é válida.");
        } else {
            System.out.println("A CNH é inválida.");
        }
    }

    public static boolean isValidCNH(String cnh) {
        if (cnh == null || cnh.length() != 11) {
            return false;
        }
        // Verificar o primeiro dígito verificador
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int digit = cnh.charAt(i) - '0';
            sum += digit * (9 - i);
        }
        int firstDigit = sum % 11;
        if (firstDigit == 10) {
            firstDigit = 0;
        }
        if (cnh.charAt(9) - '0' != firstDigit) {
            return false;
        }
        // Verificar o segundo dígito verificador
        sum = 0;
        int multiplier = 9;
        for (int i = 0; i < 10; i++) {
            int digito = cnh.charAt(i) - '0';
            sum += digito * multiplier;
            if (multiplier == 2) {
                multiplier = 9;
            } else {
                multiplier--;
            }
        }
        int secondDigit = sum % 11;
        if (secondDigit == 10) {
            secondDigit = 0;
        }
        if (cnh.charAt(10) - '0' != secondDigit) {
            return false;
        }
        return true;
    }
}