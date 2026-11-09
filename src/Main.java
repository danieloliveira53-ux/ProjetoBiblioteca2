import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int operacao;
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        do {
            System.out.printf("===== MENU BIBLIOTECA =====\n" +
                    "1 - Cadastrar Livro\n" +
                    "2 - Cadastrar Leitor\n" +
                    "3 - Realizar Empréstimo\n" +
                    "4 - Listar Empréstimos\n" +
                    "5 - Salvar Arquivo TXT\n" +
                    "6 - Sair Opção: ");
            operacao = leia.nextInt();

            switch (operacao) {
                case 1:
                    biblioteca.cadastrarLivro(sc);
                    break;
                case 2:
                    biblioteca.cadastrarLeitor(sc);
                    break;
                case 3:
                    System.out.println("Realizar Emprestimo");
                    break;
                case 4:
                    System.out.println("Listar Emprestimo");
                    break;
                case 5:
                    System.out.println("Salvar");
                    break;
                case 6:
                    System.out.println("Encerrar programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (operacao !=6);
        leia.close();
        sc.close();
    }
}