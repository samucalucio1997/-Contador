public class ContaBanco {
    int num;
    String Agencia;
    String nomeCliente;
    double saldo;

    void CriarConta(int num, String agencia,
            String nomeCliente, double saldo) {
        if (num > 0)
            this.num = num;
        else
            System.out.println("número inválido");

        this.Agencia = agencia;
        this.nomeCliente = nomeCliente;
        if (saldo > 0)
            this.saldo = saldo;
        else
            System.out.println("Saldo inicial inválido");
    }

    String status() {
        return "Olá " + this.nomeCliente +
                ", obrigado por criar uma conta em nosso banco, sua agência é " + this.Agencia + ", conta"
                + "conta " + this.num + " e seu saldo " + this.saldo + " já está disponível para saque";
    }

}
