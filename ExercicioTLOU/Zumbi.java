package ExercicioTLOU;
public class Zumbi extends Personagem implements Lutar,Infectar{

    private int diasInfeccao;
    private boolean cego;

    private String tipoZumbi;

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Dias de infecção: "+this.diasInfeccao);
        System.out.println("Cego: "+this.cego);
        System.out.println("Este zumbi é um " + this.tipoZumbi);
    }

    @Override
    public void atacar(){
        System.out.println("\n");
        System.out.println("Zumbi Atacando...");
    }

    @Override
    public void defender(){
        System.out.println("\n");
        System.out.println("Zumbi Defendendo...");
    }

    @Override
    public void infectou(){
        System.out.println("\n");
        System.out.println("O zumbi mordeu e infectou um humano!");
    }

    public void transformacao(){
        if(this.diasInfeccao>=2 && this.diasInfeccao<=14){
            this.cego=false;
            this.tipoZumbi = "Corredor";
        }else if(this.diasInfeccao>14 && this.diasInfeccao<=365){
            this.cego=false;
            this.tipoZumbi = "Perseguidor";
        }else if(this.diasInfeccao>365){
            this.cego=true;
            this.tipoZumbi = "Estalador";
        }
    }

    public void setDiasInfeccao(int diasInfeccao){
        this.diasInfeccao=diasInfeccao;
    }

    public int getDiasInfeccao(){
        return this.diasInfeccao;
    }

    public boolean getCego(){
        return this.cego;
    }

}