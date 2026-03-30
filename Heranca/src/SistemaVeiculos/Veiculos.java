package SistemaVeiculos;

public class Veiculos {
    protected String marca, modelo;
    protected float velocidade;

    public Veiculos() {
    }
    public Veiculos(String marca, String modelo, float velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public String toString() {
        return "Veiculos{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", velocidade=" + velocidade +
                '}';
    }

    public void mover(){
        System.out.println("Veiculo se movendo...");
    }

    public void abastecer(){
        System.out.println("Veiculo reabastecendo...");
    }
}
