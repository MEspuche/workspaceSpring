package com.huios.TPTransactionGestionStock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.huios.TPTransactionGestionStock.dao.StockRepository;
import com.huios.TPTransactionGestionStock.exceptions.ArticleNotFoundException;
import com.huios.TPTransactionGestionStock.exceptions.NotEnoughArticleException;
import com.huios.TPTransactionGestionStock.exceptions.QteNegativeException;
import com.huios.TPTransactionGestionStock.metier.Stock;

@Service
//@Transactional
public class ServiceImpl implements Iservice {

	@Autowired
	StockRepository sr;

	public void sortArticleDuStock(int id, int qte)
			throws ArticleNotFoundException, QteNegativeException, NotEnoughArticleException {

		if (qte < 0) {
			throw new QteNegativeException();
		}
		if (!sr.exists(id)) {
			throw new ArticleNotFoundException();
		}
		if (sr.findOne(id).getQuantite() < qte) {
			throw new NotEnoughArticleException();
		}
		
		Stock s1 = sr.findOne(id);
	
		
	System.out.println(s1.getQuantite());
	
	
	sr.sortArticleDuStock(id, qte);
		Stock s2 = sr.findOne(id);
		System.out.println(s2.getQuantite());
	}

	public int getQteEnStock(int id) throws ArticleNotFoundException {
		if (!sr.exists(id)) {
			throw new ArticleNotFoundException();
		}
		return sr.findOne(id).getQuantite();
	}

	public boolean articleExist(int id) {
		return sr.exists(id);
	}

	@Override
	public void ajouter(Stock c) {
		sr.save(c);

	}

}
