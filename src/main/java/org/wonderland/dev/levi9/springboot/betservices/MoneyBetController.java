package org.wonderland.dev.levi9.springboot.betservices;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Bookie;
import org.wonderland.dev.levi9.springboot.betservices.utils.RandomDataGenerator;

@RestController
@RequestMapping("/api/moneybet/matches")
public class MoneyBetController {

    
    @RequestMapping(method=RequestMethod.GET)
    public Bookie getMatches() {
        return RandomDataGenerator.generateRandomBettingMoneyBet();
    }
}
