package Exe1;
public class TestaConta {
    public static void main(String[] args) {
        Conta c1 = new Conta(123, 456, "Joao Silva");
        System.out.println(c1.toString());
        c1.depositar(500);
        System.out.println(c1.toString());
        c1.encerrarConta();
        System.out.println(c1.toString());
        c1.sacar(500);
        System.out.println(c1.toString());
        c1.encerrarConta();
        System.out.println(c1.toString());

        Conta c2 = new Conta(789, 32, "Maria Souza");
        System.out.println(c2.toString());
        c2.sacar(50);
        System.out.println(c2.toString());


    }
}
