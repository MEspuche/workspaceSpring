package com.huios.TPTransactionGestionStock.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.huios.TPTransactionGestionStock.metier.Stock;
@Transactional
public interface StockRepository extends JpaRepository<Stock, Integer> {

	@Modifying
	@Query("update Stock s set s.quantite=s.quantite- ?2 where s.id = ?1")
	public void sortArticleDuStock(int id, int qte);
	
	
}
