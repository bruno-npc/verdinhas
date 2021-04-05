package upe.br.verdinhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class Verdinhas01Application {

	public static void main(String[] args) {
		SpringApplication.run(Verdinhas01Application.class, args);
	}

}
