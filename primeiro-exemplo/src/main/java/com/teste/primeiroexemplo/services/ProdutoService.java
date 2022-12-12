package com.teste.primeiroexemplo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository;

@Service  //Classe de serviço
public class ProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	
	/**
	 * Método para retornar uma lista de produtos.
	 * @return Lista de produtos.
	 */
	public List<Produto> obterTodos() {
		// Colocar regra de negócio aqui caso tenha.
		return produtoRepository.obterTodos();
	}
	
	/**
	 * Método que retorna o produto encontrado pelo seu Id.
	 * @param id do produto que será localizado.
	 * @return retorna um produto caso seja encontrado.
	 */
	public Optional<Produto> obterPorId(Integer id) {
		return produtoRepository.obterPorId(id);
	}
	
	/**
	 * Método para adicionar produto na lista.
	 * @param produto que será adicionado.
	 * @return Retorna o produto que foi adicionado na lista.
	 */
	
	public Produto adicionar(Produto produto) {
		// Poderia haver alguma regra de negócio aqui.
		return produtoRepository.adicionar(produto);
	}
	
	/**
	 * Método para deletar o produto por ID.
	 * @param id do produto a ser deletado.
	 */
	public void deletar(Integer id) {
		//Aqui poderia ter alguma lógica de validação.
		produtoRepository.deletar(id);
	}
	
	/**
	 * Método para atualizar o produto na lista.
	 * @param produto que será atualizado.
	 * @param id do produto.
	 * @ Retorna produto após atualizar a lista.
	 */
	public Produto atualizar(Integer id, Produto produto) {
		
		//Poderia haver alguma validação no ID.
		produto.setId(id);
		
		return produtoRepository.atualizar(produto);
	}
}
