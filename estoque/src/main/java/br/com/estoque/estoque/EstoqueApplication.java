package br.com.estoque.estoque;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import builder.ConstrutorDePedido;
import model.Pedido;
import model.Produto;

@RestController
@SpringBootApplication
public class EstoqueApplication {

	// Funcionou, rapaziada!!! hahahah *apagar isso
	@RequestMapping("/aeee")
	public String aeee() {
		return "Aeeeeee!!!!";
	}

	@RequestMapping("/getPedido")
	public Pedido mostraPedido() {
		Pedido pedido = new ConstrutorDePedido ()
		.setNumeroPedido("1123542134")
		.setMatriz("CTBA - Centro")
		.setFilial("SC - Florianópolis")
		.setProduto("Celular", "Xiaomi - Poco x3", 200)
		.setProduto("Televisão", "LG - 55 polegadas", 100)
		.builder();
	return pedido;
	}

	// @RequestMapping("/getAll")
	// public Pedido all() {
	// 	Pedido pedido = new Pedido();
		
	// return pedido;
	// }


	public static void main(String[] args) {
		SpringApplication.run(EstoqueApplication.class, args);
	}
}
