package livraria;

public class Livraria {

    public static void main(String[] args) {
        
        Livro livro1 = new Livro("O Senhor dos Anéis", "JRR Tolkien", 1568);

        System.out.println(livro1.detalhes());
      
        livro1.abrir();
        livro1.avancarPag();
        
        System.out.println(livro1.detalhes());
        
    }
    
}
