package ExercicioTLOU;
public class Cidade{

    private Personagem personagens[] = new Personagem[10];

    public void addPersonagem(Personagem p){
        for(int i=0;i<this.personagens.length;i++){
            if(this.personagens[i]==null){
                this.personagens[i]=p;
                break;
            }
        }
    }

    public void listarPersonagens(){
        for(int i=0;i<this.personagens.length;i++){
            if(this.personagens[i]!=null){
             
                if(this.personagens[i] instanceof Humano){
                    Humano auxHumano = (Humano)this.personagens[i];
                    auxHumano.mostraInfo();
                    auxHumano.atacar();
                    auxHumano.defender();
                    auxHumano.modificarArma();  
                    auxHumano.modificarHabilidade(5, "Energia");
                    auxHumano.modificarHabilidade(5, "Distância de escuta");
                }else if(this.personagens[i] instanceof Zumbi){
                    Zumbi auxZumbi = (Zumbi)this.personagens[i];
                    auxZumbi.transformacao();
                    auxZumbi.mostraInfo();
                    auxZumbi.atacar();
                    auxZumbi.defender();
                    auxZumbi.infectou();
                }
            }
        }
    }
}