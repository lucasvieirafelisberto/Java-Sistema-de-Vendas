package prova.vendas;

public class ItemVenda {
	Produto produto;
	Integer quantidade;

	public ItemVenda(Produto produto, Integer quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	public Produto getProduto() {
		return produto;
	}
	public Integer getQuantidade() {
		return quantidade;
	}

}
