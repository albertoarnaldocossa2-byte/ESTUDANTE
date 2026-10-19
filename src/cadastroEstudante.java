import java.util.Collection;
import java.util.Hashtable;

public class cadastroEstudante {
    private Hashtable<Integer, Estudante> estudantes = new Hashtable<>();

    // Cadastra um novo estudante. Retorna false se o número já existir.
    public boolean cadastrar(Estudante e) {
        if (estudantes.containsKey(e.getNumero())) {
            return false;
        }
        estudantes.put(e.getNumero(), e);
        return true;
    }

    // Busca um estudante pelo número. Retorna null se não existir.
    public Estudante buscar(int numero) {
        return estudantes.get(numero);
    }

    // Actualiza os dados de um estudante existente.
    public boolean atualizar(int numero, String nome, String curso, int idade) {
        Estudante e = estudantes.get(numero);
        if (e == null) {
            return false;
        }
        e.setNome(nome);
        e.setCurso(curso);
        e.setIdade(idade);
        return true;
    }

    // Remove um estudante pelo número.
    public boolean remover(int numero) {
        return estudantes.remove(numero) != null;
    }

    // Lista todos os estudantes cadastrados.
    public void listar() {
        if (estudantes.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
            return;
        }
        Collection<Estudante> todos = estudantes.values();
        for (Estudante e : todos) {
            System.out.println(e);
        }
        System.out.println("Total: " + estudantes.size());
    }

    public int total() {
        return estudantes.size();
    }
}
