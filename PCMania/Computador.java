package PCMania;

public class Computador {
    String marca;
    float preco;
    SistemaOperacional so = new SistemaOperacional();
    HardwareBasico RAM = new HardwareBasico();
    HardwareBasico HD = new HardwareBasico();
    HardwareBasico CPU = new HardwareBasico();
    MemoriaUSB MemoriaUSB;





    void mostraPCConfigs(){
        System.out.println("Marca: " + marca);
        System.out.println("Preço: " + preco);
        System.out.println("Sistema Operacional: " + so.nome);
        System.out.println("Tipo de Sistema Operacional: " + so.tipo);
        System.out.println("Capacidade da Memória RAM: " + RAM.capacidade);
        System.out.println("Capacidade do HD: " + HD.capacidade);
        System.out.println("CPU: " + CPU.nome);
        System.out.println("Capacidade da CPU: " + CPU.capacidade);
        System.out.println("Memória adicional: " + MemoriaUSB.nome + " " + MemoriaUSB.capacidade + " Gb");
        
    }

    void addMemoriaUSB(MemoriaUSB musb){
        MemoriaUSB = musb;
    }
}
