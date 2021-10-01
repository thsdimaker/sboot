package jpabook.jpashop.domian;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public class Category {

    private Long id;
    private String name;



    private List<Item> items = new ArrayList<>();

    private Category parent;

    private List<Category> child = new ArrayList<>();

    /*
    RelationShips Method
    */
    public void addChildCategory(Category child){
        this.child.add(child);
        child.setParent(this);
    }

}
