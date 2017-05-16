package com.huios;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huios.metier.User;
import com.huios.service.IService;

public class Lanceur {

	public static void main(String[] args) {

		// 1- Chargement du container et création des beans
		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		IService service = (IService) appContext.getBean("serviceImpl");
		User u = (User) appContext.getBean("user");

		service.ajouterUser(u);
		// 4- Detruire le contexte
		appContext.close();

	}

}
