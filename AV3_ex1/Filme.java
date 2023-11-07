package AV3_ex1;

public class Filme implements Comparable<Filme>{
    private String nomeFilme;
    private int duracaoMin;
    private String generoFilme;

    //getters and setters
    
    public String getNomeFilme() {
        return nomeFilme;
    }
    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }
    public int getDuracaoMin() {
        return duracaoMin;
    }
    public void setDuracaoMin(int duracaoMin) {
        this.duracaoMin = duracaoMin;
    }
    public String getGeneroFilme() {
        return generoFilme;
    }
    public void setGeneroFilme(String generoFilme) {
        this.generoFilme = generoFilme;
    }

    @Override
    public int compareTo(Filme f){
        return this.nomeFilme.compareTo(f.getNomeFilme());
    }
}
