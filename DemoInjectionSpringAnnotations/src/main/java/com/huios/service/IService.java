package com.huios.service;

import java.util.List;

import com.huios.metier.User;

public interface IService {

	public void ajouterUser(User u);
	public List<User> listerUsers();
	public void supprimerUser(long id);
	public User trouverUser(long id);
	public List<User> listerParMC(String nom);
	public List<User> liserParNom(String nom);
	
}
