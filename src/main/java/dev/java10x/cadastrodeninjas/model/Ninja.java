package dev.java10x.cadastrodeninjas.model;

import jakarta.persistence.*;

@Entity
public class Ninja {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int health;
    private int attachPower;

    public Ninja() {
    }

    public Ninja(Long id, String name, int health, int attachPower) {
        this.id = id;
        this.name = name;
        this.health = health;
        this.attachPower = attachPower;
    }

    // Getters and Setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getAttachPower() { return attachPower; }
    public void setAttachPower(int attachPower) { this.attachPower = attachPower; }
}