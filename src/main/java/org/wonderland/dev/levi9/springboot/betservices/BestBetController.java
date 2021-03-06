package org.wonderland.dev.levi9.springboot.betservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Bookie;
import org.wonderland.dev.levi9.springboot.betservices.repositories.BookieRepository;

@RestController
@RequestMapping("/api/bestbet/matches")
public class BestBetController {

    @Autowired
    BookieRepository repository;
    
    @RequestMapping(method=RequestMethod.GET)
    public Bookie getMatches() {
        return (repository.findByName("Best Bet")).get(0);
    }

}