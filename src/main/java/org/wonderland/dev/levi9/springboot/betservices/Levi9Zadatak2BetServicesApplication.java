package org.wonderland.dev.levi9.springboot.betservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Bookie;
import org.wonderland.dev.levi9.springboot.betservices.repositories.BookieRepository;


/*@ComponentScan
@EnableAutoConfiguration
@EnableJpaRepositories*/
@SpringBootApplication
public class Levi9Zadatak2BetServicesApplication {
    
    @Autowired
    BookieRepository repository;
    
    public static void main(final String[] args) {
        SpringApplication.run(Levi9Zadatak2BetServicesApplication.class, args);
    }
    
    public void run(String... strings) throws Exception {
        for (Bookie b : repository.findAll()) {
            System.out.println(b);
        }
    }
}
