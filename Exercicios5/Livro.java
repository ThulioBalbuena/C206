package Exercicios5;

public class Livro {
    String titulo;
    String genLiterario;
    int qntFolhas;
    String editora;
    Autor autor;
     
    public Livro(){
        this.autor = new Autor();
    }

    void mostraInfo(){
        System.out.println("Título: " + titulo);
        System.out.println("Gênero literário: " + genLiterario);
        System.out.println("Quantidade de folhas: " + qntFolhas);
        System.out.println("Editora: " + editora);
        System.out.println("Autor: " + autor.nome);
        System.out.println("Ano de nascimento do autor: " + autor.anoNascimento);
        System.out.println("Profissão do autor: " + autor.profissao);
    }
}
