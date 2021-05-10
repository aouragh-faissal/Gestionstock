package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.Category;

@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long>{

}
