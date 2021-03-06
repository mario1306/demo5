package org.fastbit.demo5.model;

import javax.persistence.*;
import java.math.BigDecimal;


@Entity
public class OrderLine {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "order_id")
  private OrderHead order;

  @OneToOne
  private Product product;

  private Integer quantity;
  private BigDecimal total;

  public OrderLine() {
  }

  public OrderLine(Product product, Integer quantity) {
    this.product = product;
    this.quantity = quantity;
    this.total = BigDecimal.valueOf(product.getPrice().doubleValue() * quantity);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public OrderHead getOrder() {
    return order;
  }

  public void setOrder(OrderHead order) {
    this.order = order;
  }

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }
}
