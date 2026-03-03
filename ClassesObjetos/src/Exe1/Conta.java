package Exe1;
public class Conta{
    public int numeroConta;
    public int agencia;
    public String nomeCliente;
    public float saldo;
    public boolean status;

    public Conta(int numeroConta, int agencia, String nomeCliente) {
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = 0;
        this.status = true;
    }

    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Aprovado");
        }
    }

    public void sacar(float valor){
        if(this.status && this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Sacado");
        } else {
            System.out.println("Erro, conta iniativa");
        }
    }

    public void encerrarConta(){
        if(this.status){
            this.saldo = 0;
            this.status = false;
        } else  {
            System.out.println("Saque o saldo atual");
        }
    }

    public String toString(){
        return "Numero da conta: " + this.numeroConta +
                " Cliente: " + this.nomeCliente +
                " Saldo: " + this.saldo +
                " Status: " + (this.status ? "Ativo ": "Inativo");

    }
}