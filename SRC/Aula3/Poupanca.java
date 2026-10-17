package SRC.Aula3;

public class Poupanca extends Conta {
    Poupanca(double NumBanco, double Saldo) {
        super(NumBanco, Saldo);
        this.NumBanco = NumBanco;
        this.Saldo = Saldo;
    }

public double verSaldo() {
    return this.getSaldo();
}

public double me.deposito (double valor) {
    return this.getSaldo() + valor;
}
    
}
