package com.huios.TPTransactionGestionStock.service;

import com.huios.TPTransactionGestionStock.exceptions.ArticleNotFoundException;
import com.huios.TPTransactionGestionStock.exceptions.NotEnoughArticleException;
import com.huios.TPTransactionGestionStock.exceptions.QteNegativeException;
import com.huios.TPTransactionGestionStock.metier.Stock;

public interface Iservice {

	public void sortArticleDuStock(int id, int qte) throws ArticleNotFoundException, QteNegativeException, NotEnoughArticleException;
	public int getQteEnStock (int id) throws ArticleNotFoundException;
	public boolean articleExist(int id);
	public void ajouter(Stock c);
	
}
