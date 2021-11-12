package org.launchcode.techjobs.persistent;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan("org.launchcode.techjobs.persistent.models")
public class JavaWebDevTechjobsPersistentApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaWebDevTechjobsPersistentApplication.class, args);
	}

}
