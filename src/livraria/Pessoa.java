package livraria;

public class Pessoa {

    // ATRIBUTOS
    private String nome;
    private int idade;
    private char sexo;

    // CONSTRUTOR
    public Pessoa(String nome, int idade, char sexo) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;

    }

    // GETTERS e SETTERS
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return this.sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    // MÉTODOS PÚBLICOS
    public int fazerAniversario() {

        this.setIdade(this.getIdade() + 1);
        return this.getIdade();

    }

}
