package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Type;
import java.util.List;


@SpringBootApplication
public class DemorestApplication {



	private static final Logger log = LoggerFactory.getLogger(DemorestApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemorestApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
		return args -> {
//			CatFact catFact = restTemplate.getForObject(
//					"https://catfact.ninja/fact?max_length=140", CatFact.class);
//			log.info(catFact.toString());
			String url = "https://api.quotable.io/quotes/random?limit=3";
			HttpHeaders headers = new HttpHeaders();
			headers.set("Accept", "application/json");
//			headers.set("Other-Header", "othervalue");
			HttpEntity<Void> requestEntity = new HttpEntity<>(headers);


			ResponseEntity<List<RandomQuote>> response = restTemplate.exchange(
					url, HttpMethod.GET, requestEntity, new ParameterizedTypeReference<List<RandomQuote>>() {});
			log.info(response.getBody().get(0).toString());
		};
	}

}
