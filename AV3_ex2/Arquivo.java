package AV3_ex2;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    
    public void escrever(Veiculo veiculo){
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        String linha;

        try{

            os=new FileOutputStream("AV3_ex2/Veiculos.txt", true);
            osw = new OutputStreamWriter(os);
            bw = new BufferedWriter(osw);

            bw.write("++Veiculos++\n");
            bw.write(veiculo.getmarca()+"\n");
            bw.write(veiculo.getano()+"\n");
            bw.write(veiculo.getmodelo()+"\n");
            bw.write(veiculo.getkmRodados()+"\n");
            bw.write(veiculo.motor.getpotencia()+"\n");
            bw.write(veiculo.motor.getcilindrada()+"\n");
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
    public ArrayList<Veiculo>ler(){

        ArrayList<Veiculo> acheiOVeiculo = new ArrayList<>();

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        String linhaLer;

        try{
            is = new FileInputStream("AV3_ex2/Veiculos.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();

            while(linhaLer != null){
                if(linhaLer.contains("++Veiculos++")){
                    Veiculo veiculoAUX = new Veiculo();
                    veiculoAUX.motor = new Motor();
                    veiculoAUX.setmarca(br.readLine());
                    veiculoAUX.setano(Integer.parseInt(br.readLine()));
                    veiculoAUX.setmodelo(br.readLine());
                    veiculoAUX.setkmRodados(Double.parseDouble(br.readLine()));
                    veiculoAUX.motor.setpotencia(Double.parseDouble(br.readLine()));
                    veiculoAUX.motor.setcilindrada(Integer.parseInt(br.readLine()));
                    acheiOVeiculo.add(veiculoAUX);
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
        return acheiOVeiculo;
    }
}
