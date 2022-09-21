package prova.vendas;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Nome por favor: ");
		String nome = sc.next();
		System.out.println("Data de nascimento: ");
		String dataNascimento = sc.next();
		Cliente c = new Cliente(nome, LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy")));




		List<ItemVenda> lista = new ArrayList<>();
		while (true) {

			System.out.println("Nome do produto: ");
			String produto = sc.next();
			if (produto.equals("fim")) {
				break;
			}
			System.out.println("Preço do produto: ");
			Double precoProduto = sc.nextDouble();
			Produto p = new Produto(produto, precoProduto);

			System.out.println("Quantidade que desejas: ");
			Integer quantidade = sc.nextInt();
			ItemVenda l = new ItemVenda(p, quantidade);
			lista.add(l);

		}
		System.out.println("Formas de pagamento, digite 1 para cartão de Crédito, digite 2 para cartão de Débito e 3 para dinheiro: ");
		Integer formaDePagamento = sc.nextInt();

		//faltou cupom completo, contas, ver se a idade dele é mais de 60, nome com letra inicial e *
		Venda v = new Venda (lista, c , formaDePagamento);

		for (int i = 0; i < lista.size(); i++) {


		}


	}
}