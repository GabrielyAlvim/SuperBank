import java.util.Scanner;

public class Principal {

    
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        // sem public static void, a classe não é principal

        try {
            Calculos ca = new Calculos();

            System.out.println("Escolha a opção entre 1-4: ");
            int escolha = scanner.nextInt();

            if(escolha > 0 && escolha < 5){
                System.out.println("Você escolheu a opção: " + escolha);
            } else {
                System.out.println("Escolha inválida");

             System.out.println("Digite o primeiro número: ");
            int n1 = scanner.nextInt();
            ca.setN1(n1);

             System.out.println("Digite o segundo número: ");
            int n2 = scanner.nextInt();
            ca.setN2(n2);
            // Laço case = escolha então
            switch (escolha) {

                case 1:
                    System.out.println("Você escolheu somar: " + ca.soma(ca.getN1(), ca.getN2()));
                    break;

                case 2:
                    System.out.println("Você escolheu subtrair: " + ca.subtracao(ca.getN1(), ca.getN2()));
                    break;

                case 3:
                    System.out.println("Você escolheu multiplicar: " + ca.multiplicacao(ca.getN1(), ca.getN2()));
                    break;

                case 4:
                    System.out.println("Você escolheu dividir: " + ca.divisao(ca.getN1(), ca.getN2()));
                    break;

                default:
                    System.out.println("Escolha inválida");
                    break;
            }
        } finally {
            scanner.close();
        }
    }
}
