package com.SpringBootMultiRunner.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(-23)
public class ModuleRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Module Runner");

	}

}
