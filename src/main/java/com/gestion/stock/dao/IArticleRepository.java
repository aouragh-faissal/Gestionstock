package com.gestion.stock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.stock.model.Article;

@Repository
public interface IArticleRepository extends JpaRepository<Article, Long>{

}
