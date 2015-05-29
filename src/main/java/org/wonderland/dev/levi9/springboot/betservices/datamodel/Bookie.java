package org.wonderland.dev.levi9.springboot.betservices.datamodel;

import java.util.List;

public class Bookie {

    private String id;
    private String name;
    private List<BetOffer> betOffers;

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
    public List<BetOffer> getBetOffers() {
        return betOffers;
    }
    public void setBetOffers(final List<BetOffer> betOffers) {
        this.betOffers = betOffers;
    }

    @Override
    public String toString() {
        return "Bookie [id = " + id + ", name = " + name + ", betOffers = "
                + betOffers + "]";
    }

}
