public class Estudante {
    private int numero;      // chave única (número de estudante)
    private String nome;
    private String curso;
    private int idade;

    public Estudante(int numero, String nome, String curso, int idade) {
        this.numero = numero;
        this.nome = nome;
        this.curso = curso;
        this.idade = idade;
    }

    public int getNumero() { return numero; }
    public String getNome() { return nome; }
    public String getCurso() { return curso; }
    public int getIdade() { return idade; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCurso(String curso) { this.curso = curso; }
    public void setIdade(int idade) { this.idade = idade; }

    @Override
    public String toString() {
        return String.format("Nº %d | %s | Curso: %s | Idade: %d",
                numero, nome, curso, idade);
    }
}