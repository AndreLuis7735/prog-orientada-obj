package Streaming;

public class TestaStreaming {

    public static void main(String[] args) {

        Streaming conta = new Streaming("Andre", "Premium");

        conta.assistirFilme("Interestelar");

        System.out.println(conta);

        conta.cancelarAssinatura();

        conta.assistirFilme("Matrix");

        System.out.println(conta);
    }
}