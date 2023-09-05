package Exercicios4;

public class Plataforma {
       
    String nome;
    Serie[] series = new Serie[15];

    void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Series: ");
        
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null) {
                System.out.println("Serie " + (i+1) + ": " + series[i].nome);
                System.out.println("Nota: " + series[i].nota);
                System.out.println("Temporadas: " + series[i].temporadas);
                System.out.println("Finalizada: " + series[i].finalizada);
                System.out.println("Diretor: " + series[i].diretor.nome);
                System.out.println();
            }
        }
    }

    void addSerie(Serie serie){
        for (int i = 0; i < series.length; i++) {
            if (series[i] == null) {
                series[i] = serie;
                break;
            }
        }
    }

    String serieMaisLongaFinalizada(){
        Serie maisLonga = null;
        
        for (int i = 0; i < series.length; i++) {
            if (series[i] != null && series[i].finalizada) {
                if (maisLonga == null) {
                    maisLonga = series[i];
                } else if (series[i].temporadas > maisLonga.temporadas) {
                    maisLonga = series[i];
                }
            }
        }
        
        if (maisLonga != null) {
            return maisLonga.nome;
        } else {
            return "Nenhuma serie finalizada no sistema";
        }
    }

    void mediaPorcentagem(){
        int seriesComMaisDe3Temporadas = 0;
        int somaNotas = 0;
        int notNullSeries = 0;

        for(int i = 0; i < series.length; i++){
            if(series[i] != null){
                notNullSeries++;
                if(series[i].temporadas > 3){
                    seriesComMaisDe3Temporadas++;
                    somaNotas += series[i].nota;
                }
            }
        }

        if(seriesComMaisDe3Temporadas > 0){
            double porcentagem = (seriesComMaisDe3Temporadas * 100) / notNullSeries;
            System.out.println("Porcentagem de séries com mais de 3 temporadas: " + porcentagem + "%");
            System.out.println("Média das notas das séries com mais de 3 temporadas: " + (somaNotas / seriesComMaisDe3Temporadas));
        } else {
            System.out.println("Nenhuma série com mais de 3 temporadas no sistema");
        }
    }
}
