package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.LigneCommandeFournisseur;

@Repository
public interface ILigneCdeFournisseurRepository extends JpaRepository<LigneCommandeFournisseur, Long>{

}
