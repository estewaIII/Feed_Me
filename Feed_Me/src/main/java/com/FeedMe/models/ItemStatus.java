package com.FeedMe.models;

public enum ItemStatus {
    IN_STOCK(1,"In Stock"),OUT_OF_STOCK(2,"Out Of Stock"), REMOVED(3,"Removed");

    private Integer id;
    private String itemStatusName;

    ItemStatus(Integer id, String itemStatusName) {
        this.id = id;
        this.itemStatusName = itemStatusName;
    }

    public Integer getId() {
        return id;
    }

    public static ItemStatus getById(Integer Id){
        for (ItemStatus itemStatus : ItemStatus.values()){
            if (itemStatus.id == Id){
                return itemStatus;
            }
        }
        return ItemStatus.OUT_OF_STOCK;
    }

    @Override
    public String toString() {
        return itemStatusName;
    }
}
