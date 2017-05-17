package com.huios.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.huios.dao.springdata.UserRepository;
import com.huios.metier.User;
@Transactional
@Service
public class ServiceImpl implements IService {

	@Autowired
	//@Qualifier("daoImplJPA")
	//private IDao dao;
	UserRepository ur;
	
	@Override
	public void ajouterUser(User u) {
		//dao.ajouterUser(u);
		ur.save(u);

	}

	@Override
	public List<User> listerUsers() {
		//return dao.listerUsers();
		return ur.findAll();
	}

	@Override
	public void supprimerUser(long id) {
		//dao.supprimerUser(id);
		ur.delete(id);
	}

	@Override
	public User trouverUser(long id) {
		//return dao.trouverUser(id);
		return ur.findOne(id);
	}

	@Override
	public List<User> listerParMC(String nom) {
		//return dao.listerParMC(nom);
		return ur.finByMC(nom);
	}

	@Override
	public List<User> listerParNom(String nom) {
		//return dao.listerParNom(nom);
		return ur.findByNom(nom);
	}

	
}
