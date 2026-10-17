package SRC.Aula2;
import java.util.Scanner;
 
public class Principal {
    public static void main(String[] args) {
 
        try (Scanner teclado = new Scanner(System.in)) {
            //iniciando co o objeto da classe corrente
            Corrente corrente = new Corrente();
 
            System.out.println("Digite o seu nome: ");
            String nome = teclado.nextLine();
            corrente.setNomecli(nome);
 
            System.out.println("Digite o seu CPF: ");
            String cpf = teclado.nextLine();
            corrente.setCpfcli(cpf);
 
            corrente.abrirConta();
        }
 
    }
}