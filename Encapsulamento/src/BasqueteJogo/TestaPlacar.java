package BasqueteJogo;

public class TestaPlacar {

    public static void main(String[] args) {

        Placar jogo = new Placar("Timberwolves", "Raptors");

        jogo.registrarPonto("casa", 2);
        jogo.registrarPonto("visitante", 3);
        jogo.registrarPonto("casa", 1);

        System.out.println(jogo);

        jogo.proximoQuarto();
        jogo.proximoQuarto();

        System.out.println(jogo);
    }
}