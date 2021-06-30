package com.example.springproject.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "receipt")
public class ReceiptEntity {

    @Column(name = "totalmoney")
    private int totalMoney;

    @Column(name = "status")
    private String status;

    public int getTotalMoney() {
        return totalMoney;
    }

    @ManyToMany
    @JoinTable(name = "receipt_product",
            joinColumns = @JoinColumn(name = "receipt_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<ProductEntity> productEntities = new ArrayList<>();

    public List<ProductEntity> getProductEntities() {
        return productEntities;
    }

    public void setProductEntities(List<ProductEntity> productEntities) {
        this.productEntities = productEntities;
    }

    @OneToMany(mappedBy = "account_id")
    private List<AccountEntity> accountEntities = new ArrayList<>();

    public List<AccountEntity> getAccountEntities() {
        return accountEntities;
    }

    public void setAccountEntities(List<AccountEntity> accountEntities) {
        this.accountEntities = accountEntities;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
