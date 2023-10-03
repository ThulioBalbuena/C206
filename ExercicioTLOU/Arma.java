package ExercicioTLOU;
public class Arma{
    private int forcaArma;
    private String tipoArma;

    public void mostraInfo(){
        System.out.println("\n");
        System.out.println("Força da arma: "+this.forcaArma);
        System.out.println("Tipo da arma: "+this.tipoArma);
    }

    public void setForcaArma(int forcaArma){
        this.forcaArma=forcaArma;
    }

    public int getForcaArma(){
        return this.forcaArma;
    }

    public void setNomeArma(String nomeArma){
        this.tipoArma=nomeArma;
    }

    public String getNomeArma(){
        return this.tipoArma;
    }
}