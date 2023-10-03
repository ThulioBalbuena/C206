package ExercicioKimi;

public class Instrumento {
    private String modelo;
    private String cor;
    private int ano;

    public int getAno(){
        return this.ano;
    }

    public void setAno(int ano){
        this.ano=ano;
    }

    public void setCor(String cor){
        this.cor=cor;
    }

    public String getCor(){
        return this.cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo=modelo;
    }

    public void mostraInfo(){
        System.out.println("Infos do instrumento:");
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Cor: "+this.cor);
        System.out.println("Ano: "+this.ano);
    }
}
