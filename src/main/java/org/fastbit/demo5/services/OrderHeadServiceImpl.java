package org.fastbit.demo5.services;

import org.fastbit.demo5.model.OrderHead;
import org.fastbit.demo5.repositories.OrderHeadRepository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class OrderHeadServiceImpl implements OrderHeadService{

  OrderHeadRepository orderHeadRepository;

  @Override
  public Set<OrderHead> getOrders() {
    Set<OrderHead> orderSet = new HashSet<>();
    orderHeadRepository.findAll().iterator().forEachRemaining(orderSet::add);
    return orderSet;
  }
}
