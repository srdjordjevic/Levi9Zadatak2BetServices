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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "bookies")
public class Bookie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column(name = "name")
    private String name;
    
    @JsonIgnore
    @OneToMany(mappedBy = "bookie", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<BetOffer> betOffers;

    public String getId() {
        return "BK" + id;
    }
    public void setId(final long id) {
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
