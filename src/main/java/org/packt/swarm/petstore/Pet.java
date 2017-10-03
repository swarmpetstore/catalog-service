package org.packt.swarm.petstore;

import javax.persistence.*;

@Entity
@Table(name = "Pet")
@NamedQueries({
        @NamedQuery(name="Pet.findByName",
                query="SELECT p FROM Pet p WHERE p.name = :name"),
})
public class Pet {

    //4
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pet_sequence")
    @SequenceGenerator(name = "pet_sequence", sequenceName = "pet_id_seq")
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
