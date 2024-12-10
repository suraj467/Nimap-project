package com.category.product.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Category Name")
    private String categoryName;
    @Column(name = "Category Get Name")

    private String getName;
@OneToMany(mappedBy = "category")  
List<Product> product;
public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public String getCategoryName() {
    return categoryName;
}
public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
}
public List<Product> getProduct() {
    return product;
}
public void setProduct(List<Product> product) {
    this.product = product;
}
public Category() {
}
public Category(Long id, String categoryName, List<Product> product) {
    this.id = id;
    this.categoryName = categoryName;
    this.product = product;
}
public String getGetName() {
    return getName;
}
public void setGetName(String getName) {
    this.getName = getName;
}
public void setName(String getName2) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'setName'");
}

}
