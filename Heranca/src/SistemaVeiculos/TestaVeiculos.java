package SistemaVeiculos;

public class TestaVeiculos {
    public static void mostra (Veiculos camaleao){
        camaleao.mover();
        System.out.println(camaleao.toString());
    }
    public static void main(String[] args){
        Veiculos camaleao;
        camaleao = new Aviao("Boeing", "McDonnell Douglas F-15 Eagle",1.5f,18.000f);
        mostra( camaleao);
        camaleao = new CarroEletrico("BYD", "Dolphin", 25f,90);
        mostra(camaleao);
    }

}
