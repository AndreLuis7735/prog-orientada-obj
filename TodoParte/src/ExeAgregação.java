import java.util.ArrayList;

class Produto {

    int id;
    String nome;
    float preco;

    Produto(int id, String nome, float preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return nome + " - R$ " + preco;
    }
}

class ItemVenda {

    int id;
    int quantidade;
    float valorUnitario;

    ItemVenda(int id, int quantidade, float valorUnitario) {
        this.id = id;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "Item " + id + " | Qtd: " + quantidade + " | Valor: R$ " + valorUnitario;
    }
}

class Carrinho {

    ArrayList<Produto> produtos = new ArrayList<>();
    ArrayList<ItemVenda> itens = new ArrayList<>();

    void adicionarProduto(Produto p) {
        produtos.add(p);
    }

    void gerarItem(int id, int qtd, float valor) {
        ItemVenda item = new ItemVenda(id, qtd, valor);
        itens.add(item);
    }

    void removerItem(int id) {
        for (ItemVenda i : itens) {
            if (i.getId() == id) {
                itens.remove(i);
                break;
            }
        }
    }

    public String toString() {

        String texto = "Produtos:\n";

        for (Produto p : produtos) {
            texto += p + "\n";
        }

        texto += "\nItens de Venda:\n";

        for (ItemVenda i : itens) {
            texto += i + "\n";
        }

        return texto;
    }
}