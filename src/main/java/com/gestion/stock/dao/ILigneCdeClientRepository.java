package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.LigneCommandeClient;

@Repository
public interface ILigneCdeClientRepository extends JpaRepository<LigneCommandeClient, Long>{

}
