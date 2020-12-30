package com.josecondoridev.onlinemarketstore.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "shopping_product")
public class ShoppingProduct {

    @EmbeddedId
    private ShoppingProductPK id;

    private Integer quantity;
    private Double total;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "id_shopping", insertable = false, updatable = false)
    private Shopping shopping;

    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    public ShoppingProductPK getId() {
        return id;
    }

    public void setId(ShoppingProductPK id) {
        this.id = id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
