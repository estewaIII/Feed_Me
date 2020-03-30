package com.FeedMe.models;

public enum StoreStatus {
    OPEN(1,"Open"), CLOSED(2,"Closed"), IN_DEVELOPMENT(3,"In Development");

    private Integer Id;
    private String storeStatusName;

    StoreStatus(Integer id, String storeStatusName) {
        Id = id;
        this.storeStatusName = storeStatusName;
    }

    public Integer getId() {
        return Id;
    }

    public static StoreStatus getById(int Id){
        for (StoreStatus storeStatus : StoreStatus.values()){
            if (storeStatus.Id == Id){
                return storeStatus;
            }
        }
        return StoreStatus.CLOSED;
    }


    @Override
    public String toString() {
        return storeStatusName;
    }
}
