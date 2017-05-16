package com.huios.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huios.metier.User;

@Transactional
@Repository
public class DaoImplJPA implements IDao {

	@PersistenceContext(name="testPU")
	EntityManager em;
	
	
	
	@Override
	public void ajouterUser(User u) {
		em.persist(u);
	}

	@Override
	public List<User> listerUsers() {
		String req = "SELECT u FROM User u";
		Query query = em.createQuery(req);
		return query.getResultList();
	}

	@Override
	public void supprimerUser(long id) {
		em.remove(em.find(User.class, id));
	}

	@Override
	public User trouverUser(long id) {
		return em.find(User.class, id);
	}

	@Override
	public List<User> listerParMC(String nom) {
		String req = "SELECT u FROM User u WHERE u.nom LIKE :nom";
		Query query = em.createQuery(req);
		query.setParameter("nom", "%"+nom+"%");
		return query.getResultList();
	}

	@Override
	public List<User> listerParNom(String nom) {
		String req = "SELECT u FROM User u WHERE u.nom = :nom";
		Query query = em.createQuery(req);
		query.setParameter("nom", nom);
		return query.getResultList();
	}

}
