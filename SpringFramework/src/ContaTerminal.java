public class ContaTerminal {
    public static void main(String[] args) {
        ContaBancaria conta = ContaBancariaFactory.criarConta();
        conta.exibirMensagem();

        // Fechando o scanner
        ScannerSingleton.getInstance().close();
    }
}