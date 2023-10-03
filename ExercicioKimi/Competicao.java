package ExercicioKimi;

public class Competicao {
    
    private Musico musicos [] = new Musico[10];

    public void addMusico(Musico musico){
        for(int i=0;i<this.musicos.length;i++){
            if(this.musicos[i]==null){
                this.musicos[i]=musico;
                break;
            }
        }
    }


public void listarCompetidores(){
        for(int i=0;i<this.musicos.length;i++){
            if(this.musicos[i]!=null){
             
                if(this.musicos[i] instanceof Violinista){
                    Violinista auxViolinista = (Violinista)this.musicos[i];
                    auxViolinista.tocar();
                    auxViolinista.desafinar();
                    auxViolinista.mostraInfo();
                    auxViolinista.instrumento.mostraInfo();
                }else if(this.musicos[i] instanceof Pianista){
                    Pianista auxPianista = (Pianista)this.musicos[i];
                    auxPianista.tocar();
                    auxPianista.errarPausa();
                    auxPianista.mostraInfo();
                    auxPianista.instrumento.mostraInfo();
                }else if(this.musicos[i] instanceof Cellista){
                    Cellista auxCellista = (Cellista)this.musicos[i];
                    auxCellista.tocar();
                    auxCellista.desafinar();
                    auxCellista.mostraInfo();
                    auxCellista.instrumento.mostraInfo();
                }
            }
        }
    }
}


