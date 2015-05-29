package org.wonderland.dev.levi9.springboot.betservices.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "offers")
public class BetOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name = "oddsHome")
    private double oddsHome;
    
    @Column(name = "oddsAway")
    private double oddsAway;
    
    @Column(name = "maxBet")
    private double maxBet;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "match_id")
    private Match match;
    
    @ManyToOne(optional = false)
    @JoinColumn(name = "bookie_id")
    private Bookie bookie;

    
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public Match getMatch() {
        return match;
    }
    public void setMatch(Match match) {
        this.match = match;
    }
    public Bookie getBookie() {
        return bookie;
    }
    public void setBookie(Bookie bookie) {
        this.bookie = bookie;
    }

}
