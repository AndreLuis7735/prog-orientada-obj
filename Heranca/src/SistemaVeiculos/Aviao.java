package SistemaVeiculos;

public class Aviao extends Veiculos{
    private float altitudeMax;
    public Aviao(){
        super();
    }
    public Aviao(String marca, String modelo, float velocidade, float altitudeMax){
        super(marca, modelo, velocidade);
        this.altitudeMax = altitudeMax;
    }

    public float getAltitudeMax() {
        return altitudeMax;
    }

    public void setAltitudeMax(float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }

    public void mover(){
        System.out.println( "Avião voando a " + velocidade +" km/h e "+ altitudeMax+ " metros ");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação.");
    }

    @Override
    public String toString() {
        return super.toString() + "Aviao{" +
                "altitudeMax=" + altitudeMax +
                '}';
    }

}
