package com.codechef.newBackEnd.recipe;

import jakarta.persistence.*;

@Entity
@Table(name = "RECIPES")
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false, unique= true)
    private Long id;

    @Column(name = "NAME")
    private String name;


    @Column(name = "DESCRIPTION")
    private String description;




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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



    public Recipe(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;

    }

    public Recipe(String name, String description) {
        this.name = name;
        this.description = description;

    }

    public Recipe() {
    }

    @Override
    public String toString() {
        return "Recipe{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +

                '}';
    }
}
