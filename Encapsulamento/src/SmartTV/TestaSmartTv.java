package SmartTV;

public class TestaSmartTv {
    public static void main(String[] args ){
        SmartTv obj1=  new SmartTv("Samsung", "32 polegadas",0);
        System.out.println(obj1.toString());
        //altera o volume
        obj1.setVolume(30);
        System.out.println("Valor do volume "+ obj1.getVolume());
        //altera a marca
        obj1.setMarca("Phillips");
        System.out.println("Marca: "+ obj1.getMarca());
        //altera o modelo
        obj1.setModelo("42 polegadas");
        System.out.println("Modelo: "+ obj1.getModelo());

        SmartTv obj2 = new SmartTv();
        System.out.println(obj2.toString());

        SmartTv obj3 = new SmartTv("LG","32 polegadas widescream ",-120);
        System.out.println(obj3.toString());
        obj3.setVolume(50);

    }
}
