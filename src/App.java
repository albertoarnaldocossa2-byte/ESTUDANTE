import java.util.Scanner;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

        cadastroEstudante cadastro = new cadastroEstudante();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== CADASTRO DE ESTUDANTES ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Buscar");
            System.out.println("3 - Actualizar");
            System.out.println("4 - Remover");
            System.out.println("5 - Listar todos");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // consome a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Número: ");
                    int numero = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Curso: ");
                    String curso = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    if (cadastro.cadastrar(new Estudante(numero, nome, curso, idade))) {
                        System.out.println("Estudante cadastrado com sucesso!");
                    } else {
                        System.out.println("Já existe um estudante com esse número.");
                    }
                    break;

                case 2:
                    System.out.print("Número: ");
                    Estudante e = cadastro.buscar(sc.nextInt());
                    sc.nextLine();
                    System.out.println(e != null ? e : "Estudante não encontrado.");
                    break;

                case 3:
                    System.out.print("Número do estudante a actualizar: ");
                    int num = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Novo nome: ");
                    String novoNome = sc.nextLine();
                    System.out.print("Novo curso: ");
                    String novoCurso = sc.nextLine();
                    System.out.print("Nova idade: ");
                    int novaIdade = sc.nextInt();
                    sc.nextLine();
                    System.out.println(cadastro.atualizar(num, novoNome, novoCurso, novaIdade)
                            ? "Dados actualizados!" : "Estudante não encontrado.");
                    break;

                case 4:
                    System.out.print("Número do estudante a remover: ");
                    boolean removido = cadastro.remover(sc.nextInt());
                    sc.nextLine();
                    System.out.println(removido ? "Estudante removido!" : "Estudante não encontrado.");
                    break;

                case 5:
                    cadastro.listar();
                    break;

                case 0:
                    System.out.println("A sair...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        } while(opcao != 0);

        sc.close();
    }
}
