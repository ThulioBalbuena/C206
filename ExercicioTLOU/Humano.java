package ExercicioTLOU;
public class Humano extends Personagem implements Lutar,Aprimorar{

    private String nome;
    private int idade;
    private double energia;
    private double distanciaEscuta;
    private boolean vagalume;

    Arma arma;

    @Override
    public void mostraInfo() {
        System.out.println("\n");
        super.mostraInfo();
        System.out.println("Nome: "+ this.nome);
        System.out.println("Idade: "+ this.idade);
        System.out.println("Energia: "+ this.energia);
        System.out.println("Distância de escuta: "+ this.distanciaEscuta);
    }

    @Override
    public void modificarArma() {
        this.arma.setForcaArma(this.arma.getForcaArma()+5);
        System.out.println("\n");
        System.out.println("Força da arma aprimorada: "+this.arma.getForcaArma());
    }

    @Override
    public void modificarHabilidade(int qntPilulas, String tipoHabilidade) {
        System.out.println("\n");
        if(qntPilulas<=0){
            System.out.println("Quantidade de pílulas inválidas, favor informar um valor maior que 0");
        }else{
            if(tipoHabilidade.equals("Energia")){
                if(qntPilulas>=0 && qntPilulas<=10){
                    this.energia=this.energia+(this.energia*0.02);
                    System.out.println("Energia melhorada: "+this.energia);
                }else if(qntPilulas>10 && qntPilulas<=15){
                    this.energia=this.energia+(this.energia*0.04);
                    System.out.println("Energia melhorada: "+this.energia);
                }
            }else if(tipoHabilidade.equals("Distância de escuta")){
                if(qntPilulas>=0 && qntPilulas<=10){
                    this.distanciaEscuta=this.distanciaEscuta+0.2;
                    System.out.println("Distância de escuta melhorada: "+this.distanciaEscuta);
                }else if(qntPilulas>10 && qntPilulas<=15){
                    this.distanciaEscuta=this.distanciaEscuta+0.5;
                    System.out.println("Distância de escuta melhorada: "+this.distanciaEscuta);
                }
            }
        }
    }

    @Override
    public void atacar(){
        System.out.println("\n");
        System.out.println("Humano Atacando...");
        System.out.println("Nome da arma: "+this.arma.getNomeArma());
        System.out.println("Força da arma: "+this.arma.getForcaArma());
    }

    @Override
    public void defender(){
        System.out.println("\n");
        System.out.println("Humano Defendendo...");
        System.out.println("Nome da arma: "+this.arma.getNomeArma());
        System.out.println("Força da arma: "+this.arma.getForcaArma());
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public void setDistanciaEscuta(double distanciaEscuta) {
        this.distanciaEscuta = distanciaEscuta;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getDistanciaEscuta() {
        return distanciaEscuta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public boolean isVagalume() {
        return vagalume;
    }

    public void isVagalume(boolean vagalume) {
        this.vagalume = vagalume;
    }

}
