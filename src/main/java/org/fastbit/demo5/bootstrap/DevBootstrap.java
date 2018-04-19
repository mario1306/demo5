package org.fastbit.demo5.bootstrap;

import org.fastbit.demo5.model.OrderHead;
import org.fastbit.demo5.model.OrderLine;
import org.fastbit.demo5.model.Product;
import org.fastbit.demo5.repositories.OrderHeadRepository;
import org.fastbit.demo5.repositories.OrderLineRepository;
import org.fastbit.demo5.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.Set;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

  @Autowired
  private ProductRepository productRepository;
  @Autowired
  private OrderLineRepository orderLineRepository;
  @Autowired
  private OrderHeadRepository orderHeadRepository;

  @Override
  public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
    initData();
  }

  private void initData() {
    Product bananas = new Product("bananas", "2.50");
    productRepository.save(bananas);

    Product oranges = new Product("oranges", "3.50");
    productRepository.save(oranges);

    OrderLine line1 = new OrderLine(bananas, 3);
    OrderLine line2 = new OrderLine(oranges, 2);

    // OK
//    Set<OrderLine> lines = new HashSet<>();
//    lines.add(line1);
//    lines.add(line2);
//    OrderHead order = new OrderHead("order 1", lines);

    // another approach
    OrderHead order2 = new OrderHead("order 2");
//    Set<OrderLine> lines = order2.getOrderLines();
    order2.getOrderLines().add(line1);
    order2.getOrderLines().add(line2);
    order2.OrderUpdate();

    orderHeadRepository.save(order2);

  }
}
