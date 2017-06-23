package com.paul.repos;

import java.util.List;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.paul.models.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer>{
	@Modifying
	@Transactional
	@Query("UPDATE Product set pName = :productName where productId = :pId")
	public int updateProdName(
			@Param("pId")int productId,
			@Param("productName")String newProductName
	);
	
	@Query("SELECT p from Product p where pName like %:productName%")
	public List<Product> loadProd(@Param("productName")String productName);
}
