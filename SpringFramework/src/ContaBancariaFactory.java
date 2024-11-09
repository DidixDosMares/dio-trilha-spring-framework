import java.util.Scanner;

public class ContaBancariaFactory {
    public static ContaBancaria criarConta() {
        Scanner scanner = ScannerSingleton.getInstance();

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        return new ContaBancaria.ContaBuilder()
                .agencia(agencia)
                .numero(numero)
                .nomeCliente(nomeCliente)
                .saldo(saldo)
                .build();
    }
}