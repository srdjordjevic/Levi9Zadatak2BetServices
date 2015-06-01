package org.wonderland.dev.levi9.springboot.betservices.datamodel;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "matches")
public class Match {
    
    private Long id;
    private String name;
    private List<BetOffer> betOffers;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy="bookie")
    public List<BetOffer> getBetOffers() {
        return betOffers;
    }

    public void setBetOffers(List<BetOffer> betOffers) {
        this.betOffers = betOffers;
    }
}
