public class ContaBancaria {
    private String agencia;
    private int numero;
    private String nomeCliente;
    private double saldo;

    private ContaBancaria(ContaBuilder builder) {
        this.agencia = builder.agencia;
        this.numero = builder.numero;
        this.nomeCliente = builder.nomeCliente;
        this.saldo = builder.saldo;
    }

    public static class ContaBuilder {
        private String agencia;
        private int numero;
        private String nomeCliente;
        private double saldo;

        public ContaBuilder agencia(String agencia) {
            this.agencia = agencia;
            return this;
        }

        public ContaBuilder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public ContaBuilder nomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
            return this;
        }

        public ContaBuilder saldo(double saldo) {
            this.saldo = saldo;
            return this;
        }

        public ContaBancaria build() {
            return new ContaBancaria(this);
        }
    }

    public void exibirMensagem() {
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}