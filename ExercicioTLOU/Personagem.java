package ExercicioTLOU;
public abstract class Personagem{
    public static int contador=0;// Recebe 0 inicialmente
    private int idPersonagem;
    private int vida;
  
    Personagem(){
        this.contador++;
        this.idPersonagem=contador;
    }



    public void mostraInfo(){
        System.out.println("\n");
        System.out.println("ID: "+this.idPersonagem);
        System.out.println("Vida: "+this.vida);
    }

    // Getters and setters
    public void setVida(int vida){
        this.vida=vida;
    }

    public int getVida(){
        return this.vida;
    }
}
