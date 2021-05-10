package com.gestion.stock.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class MvtStk implements Serializable{
	
	public static final int ENTREE = 1;
	
	public static final int SORTIE = 2;
	
	@Id
	@GeneratedValue
	private long idMvtStk;
	
	private Date dateMvt;
	
	private BigDecimal quantite;
	
	private int TypeMvt;
	
	@ManyToOne
	@JoinColumn(name="idArticle")
	private Article article;

	public long getIdMvtStk() {
		return idMvtStk;
	}

	public void setIdMvtStk(long idMvtStk) {
		this.idMvtStk = idMvtStk;
	}

	public Date getDateMvt() {
		return dateMvt;
	}

	public void setDateMvt(Date dateMvt) {
		this.dateMvt = dateMvt;
	}

	public BigDecimal getQuantite() {
		return quantite;
	}

	public void setQuantite(BigDecimal quantite) {
		this.quantite = quantite;
	}

	public int getTypeMvt() {
		return TypeMvt;
	}

	public void setTypeMvt(int typeMvt) {
		TypeMvt = typeMvt;
	}

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public MvtStk() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
