package com.example.recipe_api.recipe_package;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Recipe {
    @Id
    @SequenceGenerator(name = "recipe_sequence", sequenceName = "recipe_sequence", allocationSize = 1)
    @GeneratedValue(generator = "recipe_sequence", strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    @Column(columnDefinition = "TEXT")
    private String image;
    @Column(columnDefinition = "TEXT")
    private String description;
    private Integer rating;
    private Time totalTime;

    public Recipe() {
    }

    public Recipe(String name, String description, String image, Integer rating, Time totalTime) {
        this.name = name;
        this.description = description;
        this.image = image;
        this.totalTime = totalTime;
        this.rating = rating;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getRating() {
        return rating;
    }

    public void setInteger(Integer rating) {
        this.rating = rating;
    }

    public Time getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Time totalTime) {
        this.totalTime = totalTime;
    }

    @Override
    public String toString() {
        return "Recipe{" + " id: " + id + ", name: " + name + ", description: " + description + ", rating: " + rating
                + ", totalTime: " + totalTime + ", image: " + image + " }";
    }
}
