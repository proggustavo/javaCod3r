package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")// assim eu não preciso colocar o início do caminho no path "/qualquer"
public class ClienteController {
	
	@GetMapping(path="/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "096.309.859-42");
	}
	
	@GetMapping("/{id}") // as chaves e a notation PathVariable indicam que é uma variável
	public Cliente obterClientePorId1(@PathVariable int id) { 
		return new Cliente(id, "Maria", "987.654.321-00");
		
	}
	
	@GetMapping // modelo de url que é mais usado pelos serviços /?id=112
	public Cliente obterClientePorId2(@RequestParam(name="id", defaultValue = "1") int id) {
		return new Cliente(id, "João Augusto", "111.222.333-44");
	}
}
