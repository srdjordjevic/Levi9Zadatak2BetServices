package org.wonderland.dev.levi9.springboot.betservices.datamodel;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "match")
public class Match {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<BetOffer> betOffers;

    public Match(Long id, String name, Set<BetOffer> betOffers) {
        this.id = id;
        this.name = name;
        this.betOffers = betOffers;
    }

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

    public Set<BetOffer> getBetOffers() {
        return betOffers;
    }

    public void setBetOffers(Set<BetOffer> betOffers) {
        this.betOffers = betOffers;
    }
}
