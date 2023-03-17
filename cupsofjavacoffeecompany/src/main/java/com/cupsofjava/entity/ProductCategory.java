package com.cupsofjava.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.Set;

@Entity
@Table(name="product_category")
@Getter
@Setter
public class ProductCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "category_name")
    private String categoryName;


    @OneToMany(cascade = CascadeType.ALL, mappedBy = "category")//"category" is the variable name located in the Product.java entity class of Datatype ProductCategory.
    private Set<Product> products;
}
