package com.huios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.huios.dao.IDao;
import com.huios.metier.User;
@Service
public class ServiceImpl implements IService {

	@Autowired
	@Qualifier("daoImplJPA")
	private IDao dao;
	
	@Override
	public void ajouterUser(User u) {
		dao.ajouterUser(u);

	}

	@Override
	public List<User> listerUsers() {
		return dao.listerUsers();
	}

	@Override
	public void supprimerUser(long id) {
		dao.supprimerUser(id);

	}

	@Override
	public User trouverUser(long id) {
		return dao.trouverUser(id);
	}

	@Override
	public List<User> listerParMC(String nom) {
		return dao.listerParMC(nom);
	}

	@Override
	public List<User> listerParNom(String nom) {
		return dao.listerParNom(nom);
	}

}
