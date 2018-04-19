package org.fastbit.demo5.repositories;

import org.fastbit.demo5.model.OrderLine;
import org.fastbit.demo5.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface OrderLineRepository extends CrudRepository<OrderLine, Long> {
}
