package AV3_ex1;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    
    public void escrever(Filme filme){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String linha;

        try{

            os=new FileOutputStream("AV3_ex1/Filmes.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("++Filmes++\n");
            bw.write(filme.getNomeFilme()+"\n");
            bw.write(filme.getGeneroFilme()+"\n");
            bw.write(filme.getDuracaoMin()+"\n");
        }catch(Exception e){
            System.out.println("Erro: " +e);
        }finally{
            try{
                bw.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    public ArrayList<Filme>ler(){

        ArrayList<Filme> acheiOfilme = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer;

        try{
            is = new FileInputStream("AV3_ex1/Filmes.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();

            while(linhaLer != null){
                if(linhaLer.contains("++Filmes++")){
                    Filme filmeAUX = new Filme();
                    filmeAUX.setNomeFilme(br.readLine());
                    filmeAUX.setGeneroFilme(br.readLine());
                    filmeAUX.setDuracaoMin(Integer.parseInt(br.readLine()));
                    acheiOfilme.add(filmeAUX);
            }
            linhaLer = br.readLine();
        }
        }catch(Exception e){
            System.out.println("Erro: " +e);
        }finally{
            try{
                br.close();
            }catch(Exception e){
                System.out.println("Erro: " +e);
            }
        }
        return acheiOfilme;
    }
}
