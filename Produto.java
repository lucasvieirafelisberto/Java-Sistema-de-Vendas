package prova.vendas;

public class Produto {

	String nomedoProduto;
	Double precoProduto;

	public Produto(String nomedoProduto, Double precoProduto) {
		this.nomedoProduto = nomedoProduto;
		this.precoProduto = precoProduto;

	}

	public String getNomedoProduto() {
		return nomedoProduto;
	}

	public Double getPrecoProduto() {
		return precoProduto;

	}

}
