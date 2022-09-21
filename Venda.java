package prova.vendas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Venda {

	List<ItemVenda> lista = new ArrayList<>();
	Cliente cliente;
	Integer formaDePagamento;

	public Venda(List<ItemVenda> lista, Cliente cliente, Integer formaDePagamento) {
		super();
		this.lista = lista;
		this.cliente = cliente;
		this.formaDePagamento = formaDePagamento;
	}

	public List<ItemVenda> getLista() {
		return lista;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Integer getFormaDePagamento() {
		return formaDePagamento;
	}

}
