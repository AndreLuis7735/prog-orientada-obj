package SistemaCanalInformacoes;

public class Email extends CanalNotificacao{
    private String assunto;
    public Email(){
        super();
    }

    public Email(String destinatario, String mensagem, String assunto){
        super(destinatario, mensagem);
        this.assunto = assunto;
    }

    @Override
    public void enviar() {
        System.out.println("Enviando E-mai para o destinatário " + this.destinatario +
                " com o assunto "+ this.assunto + " : "+ this.mensagem);
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    @Override
    public String toString() {
        return "Email{" +
              super.toString() +  "assunto='" + assunto + '\'' +
                '}';
    }
}
