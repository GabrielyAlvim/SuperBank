package SRC.Aula2;
public abstract class Conta {
 
private double numero;
private int numbank;
private double saldo;
 
public double getNumero () {
    return numero;
}
 
 
public int getNumbank() {
    return (numbank);
}
 
public void setNumbank(int numbank) {
    this.numbank = numbank;
}
 
public void setNumero (double numero) {
    this.numero = numero;
}
 
public double getSaldo() {
    return saldo;
}
 
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
}
 
 
 
 
 