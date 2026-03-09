package ArCondicionado;

public class ArCondicionado {

    private String marca;
    private String modelo;
    private int temperatura;
    private boolean ligado;

    public ArCondicionado() {
        marca = "Generico";
        modelo = "Standard";
        temperatura = 24;
        ligado = false;
    }

    public ArCondicionado(String marca, String modelo, int temperatura) {
        this.marca = marca;
        this.modelo = modelo;
        setTemperatura(temperatura);
        ligado = false;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(int temperatura) {
        if (temperatura >= 16 && temperatura <= 30) {
            this.temperatura = temperatura;
        } else {
            System.out.println("Erro: temperatura deve estar entre 16°C e 30°C");
        }
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void ligar() {
        ligado = true;
        System.out.println("Ar condicionado ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println("Ar condicionado desligado");
    }

    public void ajustarTemperatura(int novaTemp) {
        if (ligado) {
            setTemperatura(novaTemp);
        } else {
            System.out.println("Não é possível ajustar a temperatura. O aparelho está desligado.");
        }
    }

    public void modoTurbo() {
        if (ligado) {
            processarResfriamentoRapido();
        } else {
            System.out.println("Não é possível ativar o modo turbo. O aparelho está desligado.");
        }
    }

    private void processarResfriamentoRapido() {
        System.out.println("Aumentando rotação do compressor...");
        System.out.println("Ligando ventilação máxima...");
        setTemperatura(16);
    }

    public String toString() {
        String status;
        if (ligado) {
            status = "Ligado";
        } else {
            status = "Desligado";
        }

        return "Marca: " + marca +
                "\nModelo: " + modelo +
                "\nTemperatura: " + temperatura + "°C" +
                "\nStatus: " + status;
    }
}
