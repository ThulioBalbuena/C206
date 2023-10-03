package ExercicioKimi;

public class Cellista extends Musico implements Som{
    private boolean sentado;

    @Override
    public void tocar(){
        super.tocar();
    }

    @Override
    public void desafinar(){
        this.setPontuacao(this.getPontuacao()-(this.getPontuacao()*0.05));
        System.out.println("O cellista desafinou e irá recomeçar!");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Sentado: "+this.sentado);
    }

    public void setSentado(boolean sentado){
        this.sentado=sentado;
    }

    public boolean getSentado(){
        return this.sentado;
    }

}
