package com.huios.TPTransactionGestionStock;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.huios.TPTransactionGestionStock.exceptions.ArticleNotFoundException;
import com.huios.TPTransactionGestionStock.exceptions.NotEnoughArticleException;
import com.huios.TPTransactionGestionStock.exceptions.QteNegativeException;
import com.huios.TPTransactionGestionStock.metier.Stock;
import com.huios.TPTransactionGestionStock.service.Iservice;

public class Lanceur {

	public static void main(String[] args) throws ArticleNotFoundException, QteNegativeException, NotEnoughArticleException {

		ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

		Iservice service = (Iservice) appContext.getBean("serviceImpl");
		Stock s = (Stock) appContext.getBean("stock");
		s.setNom("ordinateur");
		s.setQuantite(40);
		//service.ajouter(s);
		Stock s2 = (Stock) appContext.getBean("stock");
		s2.setNom("clavier");
		s2.setQuantite(60);
		//service.ajouter(s2);
		Stock s3 = (Stock) appContext.getBean("stock");
		s3.setNom("souris");
		s3.setQuantite(40);
		//service.ajouter(s3);
		Stock s4 = (Stock) appContext.getBean("stock");
		s4.setNom("tapis");
		s4.setQuantite(60);
		//service.ajouter(s4);
		
		service.sortArticleDuStock(1, 1);
	}

}
