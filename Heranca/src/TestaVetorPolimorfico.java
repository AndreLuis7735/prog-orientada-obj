public class TestaVetorPolimorfico {
    public static void mostra(Desenvolvedor camaleao) {
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bônus " + camaleao.calcularBonus());
    }
    public static void main(String[] args) {
        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = new Junior("João", 2000);
        devs[1] = new Pleno("Maria", 4000);
        devs[2] = new Senior("Carlos", 8000);
        devs[3] = new Desenvolvedor("Ana", 3000);
    }
}
