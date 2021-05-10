package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.Fournisseur;

@Repository
public interface IFournisseurRepository extends JpaRepository<Fournisseur, Long>{

}
