package livraria;

public class Pessoa {

    // ATRIBUTOS
    private String nome;
    private int idade;
    private String sexo;
    private Livro livroEmLeitura;

    // CONSTRUTOR
    public Pessoa(String nome, int idade, String sexo) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.livroEmLeitura = null;

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

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Livro getLivroEmLeitura() {
        return livroEmLeitura;
    }

    private void setLivroEmLeitura(Livro livroEmLeitura) {
        this.livroEmLeitura = livroEmLeitura;
        livroEmLeitura.setLeitor(this);
    }       

    // MÉTODOS PÚBLICOS
    public int fazerAniversario() {

        this.setIdade(this.getIdade() + 1);
        return this.getIdade();

    }

    public int lerLivro(Livro livro) {
        
        this.setLivroEmLeitura(livro);
        livro.abrir();
        livro.folhear();
        
        return livro.getPagAtual();
        
    }

}
