package com.marcelo.cursomc.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Pedido implements Serializable{
	private static final long serialVersionUID = 1L;
	
	
	private Integer id;
    private Date instante;
    private Pagamento pagamento;
    
    private Cliente cliente;
    
    private Endereco enderecoDeEntrega;
    
    public Pedido() {
    	
    }

	public Pedido(Integer id, Date instante, Pagamento pagamento, Cliente cliente, Endereco enderecoDeEntrega) {
		super();
		this.id = id;
		this.instante = instante;
		this.pagamento = pagamento;
		this.cliente = cliente;
		this.enderecoDeEntrega = enderecoDeEntrega;
	}

	@Override
	public int hashCode() {
		return Objects.hash(enderecoDeEntrega);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		return Objects.equals(enderecoDeEntrega, other.enderecoDeEntrega);
	}


    
    
}
