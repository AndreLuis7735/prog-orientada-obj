package SmartTV;

public class SmartTv {
    private String marca, modelo;
    private int volume;
    private  boolean conectadoInternet;


    // construtores
    public SmartTv(){
        this.marca = "Indefinido ";
        this.modelo = "Indefinido ";
        this.volume = 0;
        this.conectadoInternet = false;
    }
    // construir com parâmetros
    public SmartTv(String marca, String modelo, int volume){
        this.marca = marca;
        this.modelo=modelo;
        this.setVolume(volume);
        this.conectadoInternet = false;
    }
    // altera os valores do volume
    public void setVolume(int volume){
        if (volume >= 0 && volume <= 100){
            this.volume = volume;
        }
        else System.out.println("Volume inválido");
    }
    // obter o valor do volume
    public int getVolume() {
        return this.volume;
    }
     public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return this.marca;
    }

    public void setModelo (String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return this.modelo;
    }

    // aumentar o volume
    public void aumentarVolume(int x){
        this.setVolume(this.volume + x);
    }
    // diminuir o volume
    public void diminuirVolume(int x){
        this.setVolume(this.volume - x);
    }
    // método público para entrar no YouTube
    public void entrarYouTube(){
        if (!this.conectadoInternet){
            this.conectaInternet();
            System.out.println("Abrindo YouTube");
        }
        else {
            System.out.println("Internet não encontrada ");
        }

    }
    //método privado que liga a internet
    private boolean conectaInternet(){
        System.out.println("Buscando sinal de Wi-Fi");
        System.out.println("Verificando as credenciais");
        System.out.println("Autenticando IP no roteador");
        // liga a SmartTV na internet
        int randomico = (int)(Math.random() * 10);// gera números entre 0 e 9

        if (randomico < 5){
            this.conectadoInternet = true;
            return true;
        }
        else {
            this.conectadoInternet = false;
            return false;
        }
    }
    public String toString(){
        return "Marca: "+ this.marca +
                "Modelo:  "+ this.modelo+
                "Volume: "+ this.volume;
    }
}
