package br.unesp.rc.recomendacao;

import br.unesp.rc.recomendacao.entity.Obra;
import br.unesp.rc.recomendacao.service.ObraService;
import br.unesp.rc.recomendacao.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class RecomendacaoApplication implements CommandLineRunner {

	@Autowired
	ObraService obraService = new ObraService();

	public static void main(String[] args) {
		SpringApplication.run(RecomendacaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Obra obra = new Obra();
		List<Obra> result = obraService.findAll();
		System.out.println(result);
	}

}
