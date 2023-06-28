package livraria;

public class Livro implements Publicacao{

    // ATRIBUTOS
    private String titulo, autor;
    private int totalPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    // CONSTRUTOR
    public Livro(String titulo, String autor, int totalPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.totalPaginas = totalPaginas;
    }

    // GETTERS e SETTERS
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotalPaginas() {
        return totalPaginas;
    }

    public void setTotalPaginas(int totalPaginas) {
        this.totalPaginas = totalPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    // MÉTODOS PÚBLICOS
    public String detalhes() {

        String detalhes = "#### DETALHES DO LIVRO: ####"
                + this.getTitulo() + "\n"
                + this.getAutor() + "\n"
                + this.getTotalPaginas() + "\n";

        return detalhes;

    }

    @Override
    public void abrir() {
    }

    @Override
    public void fechar() {
    }

    @Override
    public void folhear() {
    }

    @Override
    public void avancarPag() {
    }

    @Override
    public void voltarPag() {
    }

}
