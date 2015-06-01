package org.wonderland.dev.levi9.springboot.betservices;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.BetOffer;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Bookie;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Match;
import org.wonderland.dev.levi9.springboot.betservices.repositories.BetOfferRepository;
import org.wonderland.dev.levi9.springboot.betservices.repositories.BookieRepository;
import org.wonderland.dev.levi9.springboot.betservices.repositories.MatchRepository;



@SpringBootApplication
public class Levi9Zadatak2BetServicesApplication implements CommandLineRunner {
    
    @Autowired
    BookieRepository bookieRepository;
    
    @Autowired
    MatchRepository matchRepository;
    
    @Autowired
    BetOfferRepository offersRepository;
    
    public static void main(final String[] args) {
        SpringApplication.run(Levi9Zadatak2BetServicesApplication.class, args);
    }

    @Override
    public void run(String... arg0) throws Exception {
        Bookie winnerBet = new Bookie();
        winnerBet.setName("Winner Bet");
        
        Bookie bestBet = new Bookie();
        bestBet.setName("Best Bet");
        
        Bookie moneyBet = new Bookie();
        moneyBet.setName("Money Bet");
        
        Match m1 = new Match();
        Match m2 = new Match();
        
        m1.setName("Djokovic - Nadal");
        m2.setName("Murray - Federer");      
        
        BetOffer offer1 = new BetOffer(1.245, 4.536, 700.0, m1, winnerBet);
        BetOffer offer2 = new BetOffer(1.897, 6.553, 500.0, m2, winnerBet);
        BetOffer offer3 = new BetOffer(2.152, 5.112, 600.0, m1, moneyBet);
        BetOffer offer4 = new BetOffer(5.321, 5.878, 900.0, m2, moneyBet);
        BetOffer offer5 = new BetOffer(2.675, 4.099, 300.0, m1, bestBet);
        BetOffer offer6 = new BetOffer(1.122, 2.676, 600.0, m2, bestBet);
        
        List<BetOffer> m1offers = new ArrayList<BetOffer>();
        List<BetOffer> m2offers = new ArrayList<BetOffer>();
        List<BetOffer> winnerBetOffers = new ArrayList<BetOffer>();
        List<BetOffer> bestBetOffers = new ArrayList<BetOffer>();
        List<BetOffer> moneyBetOffers = new ArrayList<BetOffer>();
        
        m1offers.add(offer1);
        m1offers.add(offer3);
        m1offers.add(offer5);
        m2offers.add(offer2);
        m2offers.add(offer4);
        m2offers.add(offer6);
        winnerBetOffers.add(offer1);
        winnerBetOffers.add(offer2);
        moneyBetOffers.add(offer3);
        moneyBetOffers.add(offer4);
        bestBetOffers.add(offer5);
        bestBetOffers.add(offer6);
        
        m1.setBetOffers(m1offers);
        m2.setBetOffers(m2offers);
        
        winnerBet.setBetOffers(winnerBetOffers);
        bestBet.setBetOffers(bestBetOffers);
        moneyBet.setBetOffers(moneyBetOffers);
        
        offersRepository.save(offer1);
        offersRepository.save(offer2);
        offersRepository.save(offer3);
        offersRepository.save(offer4);
        offersRepository.save(offer5);
        offersRepository.save(offer6);
    }
}
