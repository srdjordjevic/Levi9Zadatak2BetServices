package org.wonderland.dev.levi9.springboot.betservices.datamodel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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

    private Long id;
    private Double oddsHome;
    private Double oddsAway;
    private Double maxBet;
    private Match game;
    private Bookie bookie;

    public BetOffer() {
        super();
    }
    
    public BetOffer(Double oddsHome, Double oddsAway, Double maxBet, Match game, Bookie bookie) {
        super();
        this.oddsHome = oddsHome;
        this.oddsAway = oddsAway;
        this.maxBet = maxBet;
        this.game = game;
        this.bookie = bookie;
    }
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
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
    
    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL)  
    public Match getGame() {
        return game;
    }
    public void setGame(Match game) {
        if(game.equals(this.game)) {
            return;
        }
        this.game = game;
    }
    
    @JsonIgnore
    @ManyToOne(cascade=CascadeType.ALL)  
    public Bookie getBookie() {
        return bookie;
    }
    public void setBookie(Bookie bookie) {
        if(bookie.equals(this.bookie)) {
            return;
        }
        this.bookie = bookie;
    }
    
    public String getName() {
        return game.getName();
    }
    
    public void setName(String name) {
        return;
    }
}
