package composicao;

public class TestaComposicao {
    public static void main(String[] args){

        Empresa em1= new Empresa(1, "Google", "5566");
       em1.addFuncionario(1, "Carlos", "222", "MKT");
       em1.addFuncionario(2,"Marcos" ,"333", "TI");
       Empresa em2= new Empresa(2,"OpenAI", "6677");
       em2.addFuncionario(3,"Julio","22550","Gerente");
    }
}
