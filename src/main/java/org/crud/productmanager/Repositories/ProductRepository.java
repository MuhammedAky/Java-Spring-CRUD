package org.crud.productmanager.Repositories;

import org.crud.productmanager.Models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
