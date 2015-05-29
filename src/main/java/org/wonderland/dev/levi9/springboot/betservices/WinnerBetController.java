package org.wonderland.dev.levi9.springboot.betservices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.BetOffer;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Bookie;
import org.wonderland.dev.levi9.springboot.betservices.repositories.BetOfferRepository;
import org.wonderland.dev.levi9.springboot.betservices.repositories.BookieRepository;

@RestController
@RequestMapping("/api/winnerbet/matches")
public class WinnerBetController {
    
    @Autowired
    BetOfferRepository repository;

    @RequestMapping(method=RequestMethod.GET)
    public BetOffer getMatches() {
        return repository.findOne(1L);
    }
}
