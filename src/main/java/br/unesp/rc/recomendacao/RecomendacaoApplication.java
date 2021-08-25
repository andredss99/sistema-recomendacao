package br.unesp.rc.recomendacao;

import br.unesp.rc.recomendacao.entity.Obra;
import br.unesp.rc.recomendacao.entity.Review;
import br.unesp.rc.recomendacao.entity.Usuario;
import br.unesp.rc.recomendacao.service.GeneroService;
import br.unesp.rc.recomendacao.service.ObraService;
import br.unesp.rc.recomendacao.service.ReviewService;
import br.unesp.rc.recomendacao.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

@SpringBootApplication
public class RecomendacaoApplication implements CommandLineRunner {

	@Autowired
	ObraService obraService = new ObraService();
	ReviewService reviewService = new ReviewService();
	UsuarioService usuarioService = new UsuarioService();
	GeneroService generoService = new GeneroService();

	public static void main(String[] args) {
		SpringApplication.run(RecomendacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("***************************");
		System.out.println(generoService.findAll());
		System.out.println("***************************");
	}

}
