package SRC.Aula2;
public class Poupanca extends Conta implements IContas, ICliente {
 
    @Override
    public double saldo() {
       return this.getSaldo();
    }
 
    @Override
    public double depositar(double valor) {
    return valor;
    }
 
    @Override
    public double sacar(double valor) {
    return valor;    
    }
 
    @Override
    public void abrirConta() {
      Corrente corr = new Corrente();
   
      corr.setNumbank(101);
      corr.setNumero(10.115);
     
   
    }
 
 
   
 
}
 