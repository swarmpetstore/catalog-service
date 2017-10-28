package org.packt.swarm.petstore.catalog;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "item")
@NamedQueries({
        @NamedQuery(name="Item.findByName",
                query="SELECT i FROM Item i WHERE i.name = :name"),
        @NamedQuery(name="Item.findAll",
                query="SELECT i FROM Item i"),
})
public class Item {

    //4
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "item_sequence")
    @SequenceGenerator(name = "item_sequence", sequenceName = "item_id_seq")
    @JsonIgnore
    private int id;

    //5
    @Column(length = 30)
    private String name;
    @Column
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
