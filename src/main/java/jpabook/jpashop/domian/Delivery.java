package jpabook.jpashop.domian;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Delivery {

    private Long id;

    private Order order;

    private Address address;

}
