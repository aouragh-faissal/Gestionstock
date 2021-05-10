package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.MvtStk;

@Repository
public interface IMvtStkRepository extends JpaRepository<MvtStk, Long>{

}
