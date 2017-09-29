package org.packt.swarm.petstore;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Pet")
@NamedQueries({
        @NamedQuery(name="Pet.findById",
                query="SELECT p FROM Pet p WHERE p.id = :id"),
})
public class Pet {

    //4
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
