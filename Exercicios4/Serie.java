package Exercicios4;

public class Serie {
        
    String nome;
    double nota;
    int temporadas;
    boolean finalizada;
    Diretor diretor;

    public Serie(){
        this.diretor = new Diretor();
    }

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Nota: " + nota);
        System.out.println("Temporadas: " + temporadas);
        System.out.println("Finalizada: " + finalizada);
        System.out.println("Diretor: " + diretor.nome);
    }
}
