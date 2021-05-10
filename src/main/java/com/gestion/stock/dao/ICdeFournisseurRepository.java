package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.CommandeFournisseur;

@Repository
public interface ICdeFournisseurRepository extends JpaRepository<CommandeFournisseur, Long>{

}
