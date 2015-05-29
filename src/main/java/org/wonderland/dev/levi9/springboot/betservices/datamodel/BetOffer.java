package org.wonderland.dev.levi9.springboot.betservices.datamodel;

public class BetOffer {

    private String id;
    private String name;
    private double oddsHome;
    private double oddsAway;
    private double maxBet;

    public String getId() {
        return id;
    }
    public void setId(final String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
    public double getOddsHome() {
        return oddsHome;
    }
    public void setOddsHome(final double oddsHome) {
        this.oddsHome = oddsHome;
    }
    public double getOddsAway() {
        return oddsAway;
    }
    public void setOddsAway(final double oddsAway) {
        this.oddsAway = oddsAway;
    }
    public double getMaxBet() {
        return maxBet;
    }
    public void setMaxBet(final double maxBet) {
        this.maxBet = maxBet;
    }

    @Override
    public String toString() {
        return "BetOffer [id = " + id + ", name = " + name + ", oddsHome = "
                + oddsHome + ", oddsAway = " + oddsAway + ", maxBet = " + maxBet
                + "]";
    }

}
