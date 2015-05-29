package org.wonderland.dev.levi9.springboot.betservices.repositories;


import org.springframework.data.repository.CrudRepository;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.BetOffer;

public interface BetOfferRepository extends CrudRepository<BetOffer, Long> {
}
