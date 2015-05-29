package org.wonderland.dev.levi9.springboot.betservices.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name = "offers")
public class BetOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
 
    @Column(name = "oddsHome")
    private Double oddsHome;
    
    @Column(name = "oddsAway")
    private Double oddsAway;
    
    @Column(name = "maxBet")
    private Double maxBet;
    
    
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

    public Double getOddsHome() {
        return oddsHome;
    }
    public void setOddsHome(final Double oddsHome) {
        this.oddsHome = oddsHome;
    }
    public Double getOddsAway() {
        return oddsAway;
    }
    public void setOddsAway(final Double oddsAway) {
        this.oddsAway = oddsAway;
    }
    public Double getMaxBet() {
        return maxBet;
    }
    public void setMaxBet(final Double maxBet) {
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
