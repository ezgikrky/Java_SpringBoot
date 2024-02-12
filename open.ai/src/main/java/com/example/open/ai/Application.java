package com.example.open.ai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
controller service e geçer oradan da repository den veri çekilir. ortada service olması lazım. controller service ile service de
repository ile iletişime geçer. controller direkt olarak repository ile iletişime geçmez.

get veri alırken post veri gönderirken
post get e göre daha güvenilirverileri url de göstermez
* */

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
