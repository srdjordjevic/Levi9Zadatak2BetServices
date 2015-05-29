package org.wonderland.dev.levi9.springboot.betservices.utils;

import java.util.Random;

import org.wonderland.dev.levi9.springboot.betservices.datamodel.BetOffer;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Bookie;

public class RandomDataGenerator {

    private static final Random random = new Random();

    public static Bookie generateRandomBettingBestBet() {
        final Bookie bookie = new Bookie();
        bookie.setName("Best Bet");
        return bookie;
    }

    public static Bookie generateRandomBettingMoneyBet() {
        final Bookie bookie = new Bookie();
        bookie.setName("Money Bet 123");
        return bookie;
    }

    public static Bookie generateRandomBettingWinnerBet() {
        final Bookie bookie = new Bookie();
        bookie.setName("Winner Bet");
        return bookie;
    }

    private static BetOffer generateRandomBetOffer() {
        final BetOffer offer = new BetOffer();
        offer.setMaxBet(500.0 + random.nextInt(5) * 100.0);
        offer.setOddsAway(random.nextDouble() * 15.0);
        offer.setOddsHome(random.nextDouble() * 15.0);
        return offer;
    }
}
