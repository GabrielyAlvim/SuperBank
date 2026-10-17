package SRC.Aula6;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SistemaLoginDicionario {
    public static void main(String[] args) {
        Map<String, String> usuariosCadastrados = new LinkedHashMap<>();
        usuariosCadastrados.put("Luis Inácio 'Lula' da Silva", "1313");
        usuariosCadastrados.put("Lenin", "bolchevique");
        usuariosCadastrados.put("Che Guevara", "Cubalibre13");
        usuariosCadastrados.put("Josef Stalin", "Vodka&Revolution");
        usuariosCadastrados.put("Karl Marx", "DasKapital");
        usuariosCadastrados.put("Fidel Castro", "Revolution13");
        usuariosCadastrados.put("Nelson Mandela", "FreeSouthAfrica");
        usuariosCadastrados.put("Mao Tse-tung", "Maoism");
        

     

        try (Scanner scanner = new Scanner(System.in)) {
            boolean loginSucesso = false;

            while (!loginSucesso) {
                System.out.println("=== TELA DE LOGIN ===");
                System.out.print("Digite o usuário: ");
                String usuarioDigitado = scanner.nextLine();

                System.out.print("Digite a senha: ");
                String senhaDigitada = scanner.nextLine();

                String senhaBanco = usuariosCadastrados.get(usuarioDigitado);
                if (senhaBanco != null && senhaBanco.equals(senhaDigitada)) {
                    System.out.println("\nLogin realizado com sucesso! Bem-vindo(a), "
                            + usuarioDigitado + "!\n");
                    loginSucesso = true;
                } else {
                    System.out.println("\nUsuário ou senha incorretos. Tente novamente.\n");
                }
            }
        }
    }
}
