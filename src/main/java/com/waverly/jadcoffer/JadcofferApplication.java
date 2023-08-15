package com.waverly.jadcoffer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@Slf4j
public class JadcofferApplication {

	public static void main(String[] args) {
		SpringApplication.run(JadcofferApplication.class, args);
		log.info("JadcofferApplication started");
	}

}
