package br.com.sagres.mvc.programa.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "compras")
public class Compra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	@JoinColumn(name = "fornecedor_id", nullable = false)
	private Fornecedor fornecedor;
	@OneToMany(mappedBy = "produto")
	private List<Produto> listaProdutos;
	private LocalDate data;
	private Long valorTotal;
	@OneToMany(mappedBy = "compra")
	private List<Parcela> listaParcelas;
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public List<Produto> getListaProdutos() {
		return listaProdutos;
	}

	public void setListaProdutos(List<Produto> listaProdutos) {
		this.listaProdutos = listaProdutos;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Long getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Long valorTotal) {
		this.valorTotal = valorTotal;
	}

	/*public List<Parcelas> getListaParcelas() {
		return listaParcelas;
	}

	public void setListaParcelas(List<Parcelas> listaParcelas) {
		this.listaParcelas = listaParcelas;
	}*/
	
	
	

}
