package org.wonderland.dev.levi9.springboot.betservices.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.wonderland.dev.levi9.springboot.betservices.datamodel.Bookie;

public interface BookieRepository extends CrudRepository<Bookie, Long> {
    public List<Bookie> findByName(String name);
}
