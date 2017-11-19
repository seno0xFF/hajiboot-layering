package com.example;

import com.example.domain.Customer;
import com.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HajibootLayeringApplication implements CommandLineRunner {

	@Autowired
	CustomerService customerService;
	
	@Override
	public void run(String... strings) throws Exception{
	//データ追加
	customerService.save(new Customer(1, "Nobita",	"Nobi",	"Gunshooting"));
	customerService.save(new Customer(2, "Takeshi",	"Goda", "Sing a song"));
	customerService.save(new Customer(3, "Suneo",	"Honekawa", "RC operation"));
	customerService.save(new Customer(4, "Shizuka",	"Minamoto",	"Bathing"));
	
	//データ表示
	customerService.findAll()
		.forEach(System.out::println);
	}	
	public static void main(String[] args) {
		SpringApplication.run(HajibootLayeringApplication.class, args);
	}
}
