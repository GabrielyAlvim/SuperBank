package SRC.Aula3;

public abstract class Conta {
    private double NumConta;
    private double NumBanco;
    private double Saldo;
    private double Deposito;
    private double Saque;

    Conta (double NumBanco, double Saldo) {
        this.NumBanco = NumBanco;
        this.Saldo = Saldo;
    }
//gets and sets
    public double getNumConta() {
        return NumConta;
    }
    
    public void setNumConta(double Numconta) {
        this.NumConta = Numconta;
    }

    public double getSaldo () {
        return Saldo;
    }

    public void setSaldo (double Saldo) {
        this.Saldo = Saldo;
    }
    public double getNumBanco() {
        return NumBanco;
    }

    public void setNumBanco(double NumBanco) {
        this.NumBanco = NumBanco;
    }

    public double getDeposito() {
        return Deposito;
    }

    public void setDeposito(double Deposito) {
        this.Deposito = Deposito;
    }

    public double getSaque() {
        return Saque;
    }

    public void setSaque(double Saque) {
        this.Saque = Saque;
    }


}