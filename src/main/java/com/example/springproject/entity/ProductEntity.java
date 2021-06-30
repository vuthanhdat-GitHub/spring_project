package com.example.springproject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity{

    @Column(name = "display")
    private String display;

    @Column(name = "priceIn")
    private int priceIn;

    @Column(name = "priceOut")
    private int priceOut;

    @Column(name = "priceSale")
    private int priceSale;

    @Column(name = "amount")
    private int amount;

    @Column(name = "shipday")
    private int shipDay;

    @Column(name = "description")
    private String description;

    @Column(name = "images")
    private String images;

    @ManyToMany(mappedBy = "productEntities")
    private List<AccountEntity> accountEntities = new ArrayList<>();

    public List<AccountEntity> getAccountEntities() {
        return accountEntities;
    }

    public void setReceiptEntities(List<ReceiptEntity> receiptEntities) {
        this.receiptEntities = receiptEntities;
    }

    @ManyToMany(mappedBy = "productEntities")
    private List<ReceiptEntity> receiptEntities = new ArrayList<>();

    public List<ReceiptEntity> getReceiptEntities() {
        return receiptEntities;
    }

    public void setAccountEntities(List<AccountEntity> accountEntities) {
        this.accountEntities = accountEntities;
    }

    public ProductEntity(String display, int priceIn, int priceOut, int priceSale, int amount, int shipDay, String description, String images, List<AccountEntity> accountEntities, List<ReceiptEntity> receiptEntities) {
        this.display = display;
        this.priceIn = priceIn;
        this.priceOut = priceOut;
        this.priceSale = priceSale;
        this.amount = amount;
        this.shipDay = shipDay;
        this.description = description;
        this.images = images;
        this.accountEntities = accountEntities;
        this.receiptEntities = receiptEntities;
    }

    public ProductEntity() {
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public int getPriceIn() {
        return priceIn;
    }

    public void setPriceIn(int priceIn) {
        this.priceIn = priceIn;
    }

    public int getPriceOut() {
        return priceOut;
    }

    public void setPriceOut(int priceOut) {
        this.priceOut = priceOut;
    }

    public int getPriceSale() {
        return priceSale;
    }

    public void setPriceSale(int priceSale) {
        this.priceSale = priceSale;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getShipDay() {
        return shipDay;
    }

    public void setShipDay(int shipDay) {
        this.shipDay = shipDay;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
