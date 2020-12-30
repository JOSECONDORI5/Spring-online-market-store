package com.josecondoridev.onlinemarketstore.persistence.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "shopping")
public class Shopping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_shopping")
    private Integer idShopping;

    @Column(name = "id_client")
    private String idClient;

    private LocalDateTime date;

    @Column(name = "payment_method")
    private String paymentMethod;

    private String commentary;
    private Boolean status;

    @ManyToOne
    @JoinColumn(name = "id_client", insertable = false, updatable = false)
    private Client client;

    @OneToMany(mappedBy = "producto")
    private List<ShoppingProduct> shoppingProducts;

    public Integer getIdShopping() {
        return idShopping;
    }

    public void setIdShopping(Integer idShopping) {
        this.idShopping = idShopping;
    }

    public String getIdClient() {
        return idClient;
    }

    public void setIdClient(String idClient) {
        this.idClient = idClient;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
