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
            boolean sair = false;

            while (!sair) {
                System.out.println("=== MENU ===");
                System.out.println("1. Cadastrar novo usuário");
                System.out.println("2. Fazer login");
                System.out.print("Escolha uma opção: ");
                String opcao = scanner.nextLine();

                if (opcao.equals("1")) {
                    cadastrarUsuario(scanner, usuariosCadastrados);
                } else if (opcao.equals("2")) {
                    sair = true;
                } else {
                    System.out.println("Opção inválida. Tente novamente.");
                }
            }

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

    private static void cadastrarUsuario(Scanner scanner, Map<String, String> usuariosCadastrados) {
        System.out.println("=== CADASTRO DE USUÁRIO ===");
        System.out.print("Digite o nome do usuário: ");
        String novoUsuario = scanner.nextLine();

        if (usuariosCadastrados.containsKey(novoUsuario)) {
            System.out.println("Usuário já cadastrado. Tente novamente.");
            return;
        }

        System.out.print("Digite a senha: ");
        String novaSenha = scanner.nextLine();

        usuariosCadastrados.put(novoUsuario, novaSenha);
        System.out.println("Usuário cadastrado com sucesso!");
    }
}
