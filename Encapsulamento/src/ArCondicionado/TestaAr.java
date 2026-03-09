package ArCondicionado;

public class TestaAr {

    public static void main(String[] args) {

        ArCondicionado ar = new ArCondicionado("Samsung", "WindFree", 22);

        ar.ajustarTemperatura(10);
        ar.ajustarTemperatura(25);

        System.out.println(ar);

        ar.modoTurbo();

        ar.ligar();
        ar.modoTurbo();

        System.out.println(ar);
    }
}