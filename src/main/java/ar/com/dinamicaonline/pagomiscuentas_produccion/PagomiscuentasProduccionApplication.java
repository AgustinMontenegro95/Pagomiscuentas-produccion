package ar.com.dinamicaonline.pagomiscuentas_produccion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class PagomiscuentasProduccionApplication {

	public static void main(String[] args) {
		SpringApplication.run(PagomiscuentasProduccionApplication.class, args);
	}

}
