package org.fastbit.demo5.model;

import javax.persistence.*;


@Entity
public class Orderline {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  @OneToOne
  private Product product;

  private Integer quantity;
  private Integer total;

  public Orderline() {
  }

  public Orderline(String name, Product product, Integer quantity, Integer total) {
    this.name = name;
    this.product = product;
    this.quantity = quantity;
    this.total = total;
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

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }
}
