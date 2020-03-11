package com.mingda.pasrv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class PasrvApplication {

	public static void main(String[] args) {
		SpringApplication.run(PasrvApplication.class, args);
	}

}
