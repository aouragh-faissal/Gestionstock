package com.gestion.stock.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class LigneCommandeFournisseur implements Serializable{
	
	@Id
	@GeneratedValue
	private long idLigneCommandeFournisseur;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;
	
	@ManyToOne
	@JoinColumn(name="idCommandeFournisseur")
	private CommandeFournisseur commandeFournisseur;

	public long getIdLigneCommandeFournisseur() {
		return idLigneCommandeFournisseur;
	}

	public void setIdLigneCommandeFournisseur(long idLigneCommandeFournisseur) {
		this.idLigneCommandeFournisseur = idLigneCommandeFournisseur;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public CommandeFournisseur getCommandeFournisseur() {
		return commandeFournisseur;
	}

	public void setCommandeFournisseur(CommandeFournisseur commandeFournisseur) {
		this.commandeFournisseur = commandeFournisseur;
	}

	public LigneCommandeFournisseur() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	
}
