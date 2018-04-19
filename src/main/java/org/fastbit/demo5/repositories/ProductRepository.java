package org.fastbit.demo5.repositories;

import org.fastbit.demo5.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
