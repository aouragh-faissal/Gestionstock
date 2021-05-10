package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.CommandeClient;

@Repository
public interface ICdeClientRepository extends JpaRepository<CommandeClient, Long>{

}
