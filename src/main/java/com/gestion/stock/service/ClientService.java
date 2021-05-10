package com.gestion.stock.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.stock.dao.IClientRepository;
import com.gestion.stock.model.Client;


@Service
public class ClientService {
	
	@Autowired
	private IClientRepository iClientR;
	
	public List<Client> getAllClient(){		
		List<Client> st = new ArrayList<>();		
		iClientR.findAll().forEach(st::add);
		return st;
	}
	
	
	public void addClient(Client st) {
		iClientR.save(st);
	}
	
	
	public Optional<Client> getClient(long id){
		return iClientR.findById(id)	;
		}

	public void updateClient(long id, Client st) {
		iClientR.save(st);
	}
	
	public void deleteClient(long id) {
		iClientR.deleteById(id);
	}

	public List<Client> getAllClient(String sortField, String sort){
		List<Client> st = new ArrayList<>();
		iClientR.findAll().forEach(st::add);
		return st;
	}
	
}
