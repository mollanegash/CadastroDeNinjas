package dev.java10x.cadastrodeninjas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int health;
    private int attachPower;
    public Ninja() {
        // ✅ JPA needs this
    }
//constructor
    public Ninja(Long id,String name,int health,int attachPower){
        this.id=id;
        this.name=name;
        this.health=health;
        this.attachPower=attachPower;

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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttachPower() {
        return attachPower;
    }

    public void setAttachPower(int attachPower) {
        this.attachPower = attachPower;
    }

}
