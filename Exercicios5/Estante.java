package Exercicios5;

public class Estante {
    int idEstante;
    char letra;
    Livro[] livros = new Livro[120];

    void mostraInfo(){
        System.out.println("ID da estante: " + idEstante);
        System.out.println("Letra: " + letra);
        for(int i = 0; i < livros.length; i++){
            if(livros[i] != null){
                System.out.println("Livro: " + livros[i].titulo);
                System.out.println("Gênero literário: " + livros[i].genLiterario);
                System.out.println("Quantidade de folhas: " + livros[i].qntFolhas);
                System.out.println("Editora: " + livros[i].editora);
                System.out.println("Autor: " + livros[i].autor.nome);
            }
        }
}
    void addLivros(Livro livro){
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = livro;
                break;
            }
        }
    }
    void porcentagemGen(){
        int drama = 0;
        int suspense = 0;
        int outros = 0;
        int total = 0;

        for(int i = 0; i < livros.length; i++){
            if(livros[i] == null){
                break;
            }
            if(livros[i].genLiterario.equals("Drama")){
                drama++;
            }
            if(livros[i].genLiterario.equals("Suspense")){
                suspense++;
            }
            if(livros[i].genLiterario.equals("Outros")){
                outros++;
            }
            total++;
        }
        System.out.println("Drama: " + (drama*100)/total + "%");
        System.out.println("Suspense: " + (suspense*100)/total + "%");
        System.out.println("Outros: " + (outros*100)/total + "%");
    }
    void livroMaisEMenosPag(){
        Livro maisPag = null;
        Livro menosPag = null;

        for(int i = 0; i < livros.length; i++){
            if(livros[i] == null){
                break;
            }
            if(maisPag == null){
                maisPag = livros[i];
            }
            if(menosPag == null){
                menosPag = livros[i];
            }
            if(livros[i].qntFolhas > maisPag.qntFolhas){
                maisPag = livros[i];
            }
            if(livros[i].qntFolhas < menosPag.qntFolhas){
                menosPag = livros[i];
            }
        }
        System.out.println("Livro com mais páginas: " + maisPag.titulo);
        System.out.println("Livro com menos páginas: " + menosPag.titulo);
    }

}
