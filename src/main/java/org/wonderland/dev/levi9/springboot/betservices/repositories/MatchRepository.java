package org.wonderland.dev.levi9.springboot.betservices.repositories;


import org.springframework.data.repository.CrudRepository;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Match;

public interface MatchRepository extends CrudRepository<Match, Long>  {
}
