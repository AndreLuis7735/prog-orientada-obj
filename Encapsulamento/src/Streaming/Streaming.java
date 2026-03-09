package Streaming;

public class Streaming {

    private String usuario;
    private String plano;
    private float mensalidade;
    private boolean ativo;
    private String ultimoFilmeAssistido;

    public Streaming(String usuario, String plano) {
        this.usuario = usuario;
        this.plano = plano;

        if (plano.equalsIgnoreCase("Básico")) {
            mensalidade = 25.90f;
        } else if (plano.equalsIgnoreCase("Premium")) {
            mensalidade = 45.90f;
        } else if (plano.equalsIgnoreCase("Família")) {
            mensalidade = 60.90f;
        }

        ativo = true;
        ultimoFilmeAssistido = "";
    }

    public void assistirFilme(String nomeFilme) {
        if (ativo) {
            ultimoFilmeAssistido = nomeFilme;
            System.out.println("Assistindo: " + nomeFilme);
        } else {
            System.out.println("Conta suspensa. Pague a fatura para continuar assistindo.");
        }
    }

    public void cancelarAssinatura() {
        ativo = false;
        System.out.println("Assinatura cancelada.");
    }

    public String toString() {
        String status;

        if (ativo) {
            status = "Ativo";
        } else {
            status = "Suspenso";
        }

        return "Usuario: " + usuario +
                "\nPlano: " + plano +
                "\nMensalidade: R$ " + mensalidade +
                "\nStatus: " + status +
                "\nUltimo filme assistido: " + ultimoFilmeAssistido;
    }
}