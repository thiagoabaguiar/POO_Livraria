package livraria;

import java.util.Random;

public class Livro implements Publicacao {

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
        this.pagAtual = 0;
        this.aberto = false;
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

        if (pagAtual >= 0 && pagAtual <= this.totalPaginas) {

            this.pagAtual = pagAtual;

        }

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

        return "#### DETALHES DO LIVRO: #### \n"
                + "Título: " + this.getTitulo() + "\n"
                + "Autor: " + this.getAutor() + "\n"
                + "Total de Páginas: " + this.getTotalPaginas() + "\n"
                + "Página atual: " + this.getPagAtual() + "\n"
                + "Livro aberto? " + this.isAberto() + "\n"
                + "#################################### \n";

    }

    @Override
    public boolean abrir() {
        this.setAberto(true);
        return this.isAberto();
    }

    @Override
    public boolean fechar() {
        this.setAberto(false);
        return this.isAberto();
    }

    @Override
    public int folhear() {

        Random paginaAleatoria = new Random();

        this.setPagAtual(paginaAleatoria.nextInt(this.getTotalPaginas() + 1));

        return this.getPagAtual();

    }

    @Override
    public int avancarPag() {

        if (this.isAberto() && this.getPagAtual() < this.getTotalPaginas()) {

            this.setPagAtual(this.getPagAtual() + 1);

        } else if (this.getPagAtual() == this.getTotalPaginas()) {

            System.out.println("Já está na última página");

        } else if (!this.isAberto()) {

            System.out.println("Livro fechado. Impossível avançar página");

        }

        return this.getPagAtual();

    }

    @Override
    public int voltarPag() {

        if (this.isAberto() && this.getPagAtual() > 0) {

            this.setPagAtual(this.getPagAtual() - 1);

        } else if (this.isAberto() && this.getPagAtual() == 0) {

            System.out.println("Já está na primeira página");

        } else if (!this.isAberto()) {
            
            System.out.println("Livro fechado. Impossível voltar página");
            
        }

        return this.getPagAtual();

    }

}
