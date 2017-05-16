package com.huios;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huios.metier.User;
import com.huios.service.IService;

public class Lanceur {

	public static void main(String[] args) {

		// 1- Chargement du container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		IService service = (IService) appContext.getBean("serviceImpl");
		User u = (User) appContext.getBean("user");
		User u2 = (User) appContext.getBean("user");
		u.setNom("y");
		u.setPrenom("y");
		System.out.println(u.getNom());

		//service.ajouterUser(u);
		
		
		List<User> list= service.listerUsers();
		for(User user : list)
		{
			System.out.println(user);
		}
		
		List<User> list2= service.listerParMC("o");
		for(User user : list2)
		{
			System.out.println(user);
		}
		
		// 4- Detruire le contexte
		appContext.close();

	}

}
