package com.iset.serviceoffreempl.dao;

import com.iset.serviceoffreempl.entities.Offre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OffreRepository extends JpaRepository<Offre,Long> {
    

}
