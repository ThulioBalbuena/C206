package AV3_ex2;

public class Veiculo implements Comparable<Veiculo>{
    private String marca;
    private int ano;
    private String modelo;
    private double kmRodados;
    Motor motor;

    //getters and setters
    
    public String getmarca() {
        return marca;
    }
    public void setmarca(String marca) {
        this.marca = marca;
    }
    public int getano() {
        return ano;
    }
    public void setano(int ano) {
        this.ano = ano;
    }
    public String getmodelo() {
        return modelo;
    }
    public void setmodelo(String modelo) {
        this.modelo = modelo;
    }
    public double getkmRodados() {
        return kmRodados;
    }
    public void setkmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }


    @Override
    public int compareTo(Veiculo f){
        return Integer.compare(this.ano, f.getano());
    }
}
