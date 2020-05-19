package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.models.Cliente;

@RestController
@RequestMapping(path = "/clientes")// assim eu não preciso colocar o início do caminho no path "/qualquer"
public class ClienteController {
	@GetMapping(path="/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28, "Pedro", "096.309.859-42");
	}

}
