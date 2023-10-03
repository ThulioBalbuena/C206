package ExercicioKimi;
public class Main {
    public static void main(String[] args) {

        Competicao c1 = new Competicao();


        
        Violinista v1 = new Violinista();
        Instrumento i1 = new Instrumento();
        i1.setModelo("Stradivarius");
        i1.setCor("Vermelho");
        i1.setAno(2010);
        v1.setNome("João");
        v1.setIdade(20);
        v1.setPontuacao(100);
        v1.setUsaEspaleira(true);
        v1.setMarcaBreu("Pirastro");
        v1.setCodigo(2010);
        v1.setMusica("Ave Maria");
        v1.instrumento = i1;

        Pianista p1 = new Pianista();
        Instrumento i2 = new Instrumento();
        i2.setModelo("Yamaha");
        i2.setCor("Preto");
        i2.setAno(2015);
        p1.setNome("Maria");
        p1.setIdade(25);
        p1.setPontuacao(100);
        p1.setAlturaBanco(5);
        p1.setCodigo(2011);
        p1.setMusica("Bola azul");
        p1.instrumento = i2;


        Cellista ce1 = new Cellista();
        Instrumento i3 = new Instrumento();
        i3.setModelo("Honda");
        i3.setCor("Vermelho");
        i3.setAno(2010);
        ce1.setNome("Pedro");
        ce1.setIdade(30);
        ce1.setPontuacao(100);
        ce1.setSentado(true);
        ce1.setCodigo(2012);
        ce1.setMusica("Bola vermelha");
        ce1.instrumento = i3;

        c1.addMusico(v1);
        c1.addMusico(p1);
        c1.addMusico(ce1);

        c1.listarCompetidores();
}
}

