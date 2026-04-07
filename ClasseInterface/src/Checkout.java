public class Checkout {
    public static void main(String[] args) {
        // variável do tipo interface
        Pagamento seletor;
        //cliente escolheu PIX
        seletor = new Pix("andreluis@gmail.com");
        seletor.autorizar(150.0);
        seletor.exibirComprovante();

        //cliente mudou de ideia e escolheu cartão
        seletor = new CartaoCredito("111222333444");
        seletor.autorizar(300.0);
        seletor.exibirComprovante(); //polimorfismo
    }
}
