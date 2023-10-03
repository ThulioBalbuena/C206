package ExercicioKimi;

public abstract class Musico {
    
    public static int contador=0;// Recebe 0 inicialmente
    private int codigo;
    private String nome;
    private int idade;
    private double pontuacao;
    private String musica;


    Instrumento instrumento; // Musico pode ter um instrumento ou não

    Musico(){
        this.contador++;
        this.codigo=contador;
    }

    public void mostraInfo(){
        System.out.println("\n");
        System.out.println("Código: "+this.codigo);
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        System.out.println("Pontuação: "+this.pontuacao);
    }

    public void tocar(){
        System.out.println("\n");
        System.out.println("O musico: "+this.nome);
        System.out.println("Está tocando: "+this.musica);
    }


    public double getPontuacao(){
        return this.pontuacao;
    }

    public void setPontuacao(double pontuacao){
        this.pontuacao=pontuacao;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade=idade;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public String getMusica(){
        return this.musica;
    }

    public void setMusica(String musica){
        this.musica=musica;
    }

    public String getNome(){
        return this.nome;
    }

    public int getCodigo(){
        return this.codigo;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }

}


