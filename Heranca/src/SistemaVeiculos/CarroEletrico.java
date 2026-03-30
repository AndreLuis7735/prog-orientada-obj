package SistemaVeiculos;

public class CarroEletrico extends Veiculos {
    private int autonomiaBateria;
    public CarroEletrico(){
        super();
    }
    public CarroEletrico(String marca, String modelo, float velocidade, int autonomiaBateria){
        super();
        this.autonomiaBateria = autonomiaBateria;
    }

    public int getAutonomiaBateria() {
        return autonomiaBateria;
    }

    public void setAutonomiaBateria(int autonomiaBateria) {
        this.autonomiaBateria = autonomiaBateria;
    }

    @Override
    public void mover() {
        System.out.println("Carro elétrico se movendo silenciosamente.");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de recarga rápida.");
    }

    @Override
    public String toString() {
        return super.toString() +"CarroEletrico{" +
                "autonomiaBateria=" + autonomiaBateria +
                '}';
    }
}
