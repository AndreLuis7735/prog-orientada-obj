package BasqueteJogo;

public class Placar {

    private String nomeTimeCasa;
    private String nomeTimeVisitante;
    private int pontosCasa;
    private int pontosVisitante;
    private int periodoQuarto;

    public Placar(String casa, String visitante) {
        nomeTimeCasa = casa;
        nomeTimeVisitante = visitante;
        pontosCasa = 0;
        pontosVisitante = 0;
        periodoQuarto = 1;
    }

    public void registrarPonto(String time, int tipo) {

        if (time.equalsIgnoreCase("casa")) {
            pontosCasa += tipo;
        }
        else if (time.equalsIgnoreCase("visitante")) {
            pontosVisitante += tipo;
        }

        System.out.println("Ponto registrado: " + tipo);
    }

    public void proximoQuarto() {

        if (periodoQuarto < 4) {
            periodoQuarto++;
        }
        else {
            System.out.println("O jogo terminou.");
        }
    }

    public String toString() {
        return nomeTimeCasa + " " + pontosCasa +
                " x " +
                pontosVisitante + " " + nomeTimeVisitante +
                " - Período: " + periodoQuarto;
    }
}