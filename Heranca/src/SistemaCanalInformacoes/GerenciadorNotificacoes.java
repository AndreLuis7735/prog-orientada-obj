package SistemaCanalInformacoes;

import java.util.ArrayList;

public class GerenciadorNotificacoes {
    public static void main(String[] args) {
        ArrayList<CanalNotificacao> canais = new ArrayList<CanalNotificacao>();

        canais.add(new Email("Carlos ", "Tomar vacina", "Lembrete"));
        canais.add(new Sms("Carlos", "Venha tomar vacina", 99999999));
        canais.add(new WhatsApp("Carlos ", "Venha tomar vacina", "Não lida"));

        // percorre o vetor chamando o método enviar
        for (CanalNotificacao camaleao: canais) { //para cada canal
            camaleao.enviar();// polimorfismo
        }
    }

}
