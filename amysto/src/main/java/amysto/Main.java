package amysto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@SpringBootApplication
@EnableAutoConfiguration
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello world");
		SpringApplication.run(Main.class, args);

	}

}
