package SRC.Aula3;

public class Corrente extends Conta {
    Corrente (double Numbanco, double Saldo) {
        super (Numbanco, Saldo);
    }

    public double verSaldo () {
        return this.getSaldo();
    }

    public double Deposito (double valor) {
        return this.getDeposito(valor);
    }
}
    

