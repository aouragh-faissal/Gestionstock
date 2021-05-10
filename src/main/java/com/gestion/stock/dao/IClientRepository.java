package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.Client;

@Repository
public interface IClientRepository extends JpaRepository<Client, Long>{

}
