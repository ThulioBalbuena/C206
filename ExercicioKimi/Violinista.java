package ExercicioKimi;

public class Violinista extends Musico implements Som{
    private String marcaBreu;
    private boolean usaEspaleira;

    @Override
    public void tocar(){
        super.tocar();
    }

    @Override
    public void desafinar(){
        if(usaEspaleira == true){
            this.setPontuacao(this.getPontuacao()-(this.getPontuacao()*0.05));
        }
        else{
            this.setPontuacao(this.getPontuacao()-(this.getPontuacao()*0.1));
        }
        System.out.println("O violinista desafinou e irá recomeçar!");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Marca do breu: "+this.marcaBreu);
        System.out.println("Usa espaleira: "+this.usaEspaleira);
    }

    public void setMarcaBreu(String marcaBreu){
        this.marcaBreu=marcaBreu;
    }

    public void setUsaEspaleira(boolean usaEspaleira){
        this.usaEspaleira=usaEspaleira;
    }

    public String getMarcaBreu(){
        return this.marcaBreu;
    }

    public boolean getUsaEspaleira(){
        return this.usaEspaleira;
    }

    
}
