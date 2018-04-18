package org.fastbit.demo5.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Mkorder {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  private String name;

  @OneToMany
  @JoinColumn(name = "line")
  private Set<Orderline> orderlines = new HashSet<>();

  private Number total;

  public Mkorder() {
  }

  public Mkorder(String name, Set<Orderline> orderlines, Number total) {
    this.name = name;
    this.orderlines = orderlines;
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

  public Set<Orderline> getOrderlines() {
    return orderlines;
  }

  public void setOrderlines(Set<Orderline> orderlines) {
    this.orderlines = orderlines;
  }

  public Number getTotal() {
    return total;
  }

  public void setTotal(Number total) {
    this.total = total;
  }
}
