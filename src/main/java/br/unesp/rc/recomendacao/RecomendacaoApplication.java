package br.unesp.rc.recomendacao;

import br.unesp.rc.recomendacao.entity.Usuario;
import br.unesp.rc.recomendacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecomendacaoApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService = new UsuarioService();

	public static void main(String[] args) {
		SpringApplication.run(RecomendacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(usuarioService.findAll());
	}

}
