package com.zenika.tz.hexaarchi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.zenika.tz.hexaarchi")
public class HexaArchiApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexaArchiApplication.class, args);
	}


}
