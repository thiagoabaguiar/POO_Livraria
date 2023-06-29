package livraria;

public class Livraria {

    public static void main(String[] args) {
        
        Pessoa[] leitores = new Pessoa[2];
        
        leitores[0] = new Pessoa("José da Silva", 56, "M");
        leitores[1] = new Pessoa("Maria Conceição", 17, "F");
        
        Livro livro1 = new Livro("O Senhor dos Anéis", "JRR Tolkien", 1568);
        Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis", 208);

//        livro1.setLeitor(leitores[0]);
        
        leitores[0].lerLivro(livro1);     
        
        System.out.println(livro1.detalhes());;
        
    }
    
}
