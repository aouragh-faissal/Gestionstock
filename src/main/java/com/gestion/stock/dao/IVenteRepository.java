package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.Vente;

@Repository
public interface IVenteRepository extends JpaRepository<Vente, Long>{

}
