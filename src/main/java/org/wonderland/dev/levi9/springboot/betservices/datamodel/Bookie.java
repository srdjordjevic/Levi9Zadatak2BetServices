package org.wonderland.dev.levi9.springboot.betservices.datamodel;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "bookie")
public class Bookie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name = "name")
    private String name;
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BetOffer> betOffers;

    public Long getId() {
        return id;
    }
    public void setId(final Long id) {
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

}
