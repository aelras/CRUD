package com.teste.primeiroexemplo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.services.ProdutoService;


@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	//Pedir o controle do nosso serviço
	@Autowired
	private ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> obterTodos() {
		return produtoService.obterTodos();
	}
	
	
	@PostMapping
	public Produto adicionar(@RequestBody Produto produto) {
		return produtoService.adicionar(produto);  
	}
}
