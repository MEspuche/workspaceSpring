package com.huios.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.huios.metier.User;

@Transactional
@Repository
public class DaoImplHibernate implements IDao {

	@Autowired
	private SessionFactory sessionFactory;

	// création de la session
	private Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void ajouterUser(User u) {
		getSession().save(u);
	}

	@Override
	public List<User> listerUsers() {
		String req = "from User";
		Query query = getSession().createQuery(req);
		return query.list();
	}

	@Override
	public void supprimerUser(long id) {
		getSession().delete(getSession().get(User.class, id));

	}

	@Override
	public User trouverUser(long id) {
		return getSession().get(User.class, id);
	}

	@Override
	public List<User> listerParMC(String nom) {
		String req = "FROM User as u WHERE u.nom like :nom";
		Query query = getSession().createQuery(req);
		query.setParameter("nom", "%" + nom + "%");
		return query.getResultList();
	}

	@Override
	public List<User> listerParNom(String nom) {
		String req = "FROM User as u WHERE u.nom = :nom" ;
		Query query = getSession().createQuery(req);
		query.setParameter("nom", nom);
		return query.getResultList();
	}

}
