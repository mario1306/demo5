package org.fastbit.demo5.services;

import org.fastbit.demo5.model.OrderHead;
import org.springframework.stereotype.Service;

import java.util.Set;

public interface OrderHeadService {
  Set<OrderHead> getOrders();
}
