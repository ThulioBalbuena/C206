package ExercicioKimi;

public class Pianista extends Musico implements Tecnica,Tempo{
    
    private float alturaBanco;


    @Override
    public void tocarAcorde() {
        System.out.println("O pianista tocou um acorde");
    }

    @Override
    public void errarPausa() {
        this.setPontuacao(this.getPontuacao()-25);
        System.out.println("O pianista errou uma pausa e irá recomeçar!");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Altura do banco: "+this.alturaBanco);
    }

    @Override
    public void tocar(){
        super.tocar();
    }

    public void setAlturaBanco(float alturaBanco){
        this.alturaBanco=alturaBanco;
    }
}
