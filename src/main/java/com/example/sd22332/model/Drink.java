package com.example.sd22332.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "drinks")
public class Drink {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;
    @Column(name = "name")
    String name;
    @Column(name = "price")
    Integer price;
    @Column(name = "image")
    String image;
    @Column(name = "description")
    String description;
    @Column(name = "active")
    Integer active;
    @ManyToOne
    @JoinColumn(name = "category_id")
    Category category;
}
