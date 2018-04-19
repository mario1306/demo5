package org.fastbit.demo5.repositories;

import org.fastbit.demo5.model.OrderHead;
import org.fastbit.demo5.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface OrderHeadRepository extends CrudRepository<OrderHead, Long> {
}
