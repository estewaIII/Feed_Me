package com.FeedMe.models;

import java.util.Objects;

public class Item {
    private Integer id;
    private String Description;
    private Double cost;
    private ItemCategory itemCategory;
    private ItemStatus itemStatus;

    public Item(){super();}

    public Item(String description, Double cost) {
        Description = description;
        this.cost = cost;
    }

    public Item(Integer id, String description, Double cost, ItemCategory itemCategory, ItemStatus itemStatus) {
        this.id = id;
        Description = description;
        this.cost = cost;
        this.itemCategory = itemCategory;
        this.itemStatus = itemStatus;
    }

    public Item(String description, Double cost, ItemCategory itemCategory, ItemStatus itemStatus) {
        Description = description;
        this.cost = cost;
        this.itemCategory = itemCategory;
        this.itemStatus = itemStatus;
    }

    public Item(String description, Double cost, ItemCategory itemCategory) {
        Description = description;
        this.cost = cost;
        this.itemCategory = itemCategory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public ItemCategory getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(ItemCategory itemCategory) {
        this.itemCategory = itemCategory;
    }

    public ItemStatus getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(ItemStatus itemStatus) {
        this.itemStatus = itemStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id) &&
                Objects.equals(Description, item.Description) &&
                Objects.equals(cost, item.cost) &&
                itemCategory == item.itemCategory &&
                itemStatus == item.itemStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Description, cost, itemCategory, itemStatus);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", Description='" + Description + '\'' +
                ", cost=" + cost +
                ", itemCategory=" + itemCategory +
                ", itemStatus=" + itemStatus +
                '}';
    }
}
