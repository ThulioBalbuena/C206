package ExercicioTLOU;
public class Main{
    public static void main(String[] args) {

        Cidade c1 = new Cidade();

        Arma a1 = new Arma();
        a1.setNomeArma("Espada");
        a1.setForcaArma(10);

        Humano h1 = new Humano();
        h1.setNome("João");
        h1.setIdade(20);
        h1.setEnergia(100);
        h1.setDistanciaEscuta(10);
        h1.setVida(100);
        h1.isVagalume(true);
        h1.arma=a1;


        Zumbi z1 = new Zumbi();
        z1.setDiasInfeccao(370);
        z1.setVida(100);

        c1.addPersonagem(h1);
        c1.addPersonagem(z1);

        c1.listarPersonagens();
}
}
