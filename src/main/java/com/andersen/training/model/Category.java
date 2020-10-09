package com.andersen.training.model;

import lombok.*;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "category")
@NoArgsConstructor
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "category_id")
    private long categoryId;

    @Column(name = "category_name", nullable = false)
    private String categoryName;

    @ManyToMany
    @JoinColumn(name = "categories")
    private List<Product> products;

}
