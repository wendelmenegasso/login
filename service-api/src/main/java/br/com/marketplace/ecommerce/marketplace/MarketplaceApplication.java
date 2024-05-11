package br.com.marketplace.ecommerce.marketplace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Hello Security application.
 *
 * @author Joe Grandja
 */
@SpringBootApplication
@Configuration
@EnableWebMvc
public class MarketplaceApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceApplication.class, args);
	}
}
