package cl.awakelab.Evaluacion_Modulo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class EvaluacionModulo5Application {

	public static void main(String[] args) {
		SpringApplication.run(EvaluacionModulo5Application.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
