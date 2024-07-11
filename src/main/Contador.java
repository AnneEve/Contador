package main;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leitura dos parâmetros
            System.out.print("Digite o primeiro número: ");
            int primeiroNumero = scanner.nextInt();
            System.out.print("Digite o segundo número: ");
            int segundoNumero = scanner.nextInt();

            // Validação dos parâmetros
            if (primeiroNumero > segundoNumero) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Loop para imprimir os números
            for (int i = primeiroNumero; i <= segundoNumero; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }
}

