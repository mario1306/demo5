package org.fastbit.demo5.model;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.OrderUtils;

@Entity
public class OrderHead {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String name;

  @OneToMany(cascade = CascadeType.ALL, mappedBy = "order")
  //@JoinColumn(name = "line")  // product_id otherwise
  private Set<OrderLine> orderLines = new HashSet<>();

  private Double total;

  public OrderHead() {
  }

  public OrderHead(String name) {
    this.name = name;
    //this.orderLines = null;
    this.total = 0d;
  }

  public void OrderUpdate() {
    this.total = orderLines.stream().mapToDouble(orderLine -> orderLine.getTotal().doubleValue()).sum();
  }

  public OrderHead(String name, Set<OrderLine> orderlines) {
    this.name = name;
    this.orderLines = orderlines;
    //this.total = 0;
    OrderUpdate();

  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Set<OrderLine> getOrderLines() {
    return orderLines;
  }

  public void setOrderLines(Set<OrderLine> orderlines) {
    this.orderLines = orderlines;
  }

  public void addOrderLine(OrderLine line) {
    line.setOrder(this);
    this.orderLines.add(line);
  }

  public Double getTotal() {
    return total;
  }

  public void setTotal(Double total) {
    this.total = total;
  }
}
