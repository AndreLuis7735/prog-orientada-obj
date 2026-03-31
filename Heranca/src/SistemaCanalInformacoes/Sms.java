package SistemaCanalInformacoes;

public class Sms extends CanalNotificacao{
    private int numeroTelefone;

    public Sms() {
        super();
    }

    public Sms(String destinatario, String mensagem, int numeroTelefone) {
        super(destinatario, mensagem);
        this.numeroTelefone = numeroTelefone;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando SMS para o número "+ this.numeroTelefone+ " : " +this.mensagem);
    }

    @Override
    public String toString() {
        return "Sms{" +
               super.toString()+ "numeroTelefone=" + numeroTelefone +
                '}';
    }

    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
