package prova.vendas;

import java.time.LocalDate;

public class Cliente {

	String cliente;
	LocalDate nascimento;

	public Cliente(String cliente, LocalDate nascimento) {
		this.cliente = cliente;
		this.nascimento = nascimento;
	}

	public String getCliente() {
		return cliente;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

}
