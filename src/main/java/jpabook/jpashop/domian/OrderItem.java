package jpabook.jpashop.domian;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter@Setter
public class OrderItem {
    private Long id;
    private Item item;

    private Order order;
}
