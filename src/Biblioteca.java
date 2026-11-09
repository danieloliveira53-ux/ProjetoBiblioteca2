pimport java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca implements Gravavel{

    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Leitor> leitores = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public void cadastrarLivro(Scanner sc){
        System.out.println("Cadastrar Livro");
        System.out.print("Digite o Título: ");
        String titulo = sc.nextLine();
        System.out.print("Digite o Autor: ");
        String autor = sc.nextLine();
        livros.add(new Livro(titulo, autor));
        System.out.println("Cadstrado com sucesso");
    }

    public void cadastrarLeitor(Scanner sc){
        System.out.println("Cadastrar Leitor");
        System.out.print("Digite o Nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite a idade: ");
        int idade = sc.nextInt();
        leitores.add(new Leitor(nome, idade));
        System.out.println("Cadstrado com sucesso");
    }

    public void realizarEmprestimo(Scanner sc){
        if(leitores.isEmpty() || livros.isEmpty()) {
            System.out.println("É necessário cadastrar livros e leitores antes");
            return;
        }

    }

    public void listarEmprestimos(){
        if(emprestimos.isEmpty()){
            System.out.println("É necessário ter emprestimos para listar");
        }

    }

    @Override
    public void salvar() {
        System.out.println("manipular um TXT");
    }
}
