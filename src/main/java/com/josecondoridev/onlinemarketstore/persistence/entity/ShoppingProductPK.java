package com.josecondoridev.onlinemarketstore.persistence.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class ShoppingProductPK implements Serializable {

    @Column(name = "id_shopping")
    private Integer idShopping;

    @Column(name = "id_product")
    private Integer idProduct;

    public Integer getIdShopping() {
        return idShopping;
    }

    public void setIdShopping(Integer idShopping) {
        this.idShopping = idShopping;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Integer idProduct) {
        this.idProduct = idProduct;
    }
}





