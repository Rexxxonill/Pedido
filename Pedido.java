import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    // Classe interna ItemPedido
    class ItemPedido {
        private String nomeProduto;
        private int quantidade;
        private double precoUnitario;

        public ItemPedido(String nomeProduto, int quantidade, double precoUnitario) {
            this.nomeProduto = nomeProduto;
            this.quantidade = quantidade;
            this.precoUnitario = precoUnitario;
        }

        public double calcularSubtotal() {
            return quantidade * precoUnitario;
        }

        public String getNomeProduto() {
            return nomeProduto;
        }
    }

    // Lista de itens do pedido
    private List<ItemPedido> itens = new ArrayList<>();

    // Método para adicionar item ao pedido
    public void adicionarItem(String nomeProduto, int quantidade, double precoUnitario) {
        ItemPedido item = new ItemPedido(nomeProduto, quantidade, precoUnitario);
        itens.add(item);
    }

    // Método para calcular valor total
    public double valorTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    // Método principal (main)
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        // Adicionando itens
        pedido.adicionarItem("Teclado", 2, 150.0);
        pedido.adicionarItem("Mouse", 1, 80.0);

        // Exibindo resultado
        System.out.println("Valor total do pedido: R$ " + pedido.valorTotal());
    }
}
