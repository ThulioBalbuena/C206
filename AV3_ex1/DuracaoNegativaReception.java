package AV3_ex1;

public class DuracaoNegativaReception extends Exception{
    public DuracaoNegativaReception(){
        System.out.println("Duração 0 ou negativa não é permitida");
    }
}
