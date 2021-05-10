package com.gestion.stock.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Client implements Serializable{
	
	@Id
	@GeneratedValue
	private long idClient;
	
	private String nom;
	
	private String prenom;
	
	private String addresse;
	
	private String photo;
	
	private String mail;
	
	@OneToMany(mappedBy = "client")
	private List<CommandeClient> commandeClient;

	public long getIdClient() {
		return idClient;
	}

	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	

	public List<CommandeClient> getCommandeClient() {
		return commandeClient;
	}

	public void setCommandeClient(List<CommandeClient> commandeClient) {
		this.commandeClient = commandeClient;
	}

	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
