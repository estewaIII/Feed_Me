package com.FeedMe.models;

import java.util.Objects;

public class Store {

    private Integer id;
    private Integer operatingManager;
    private String streetAddress;
    private String State;
    private Integer zip;
    private String phoneNumber;
    private StoreStatus storeStatus;

    public Store(){
        super();
    }

    public Store(Integer operatingManager, String streetAddress, String state, Integer zip, String phoneNumber) {
        this.operatingManager = operatingManager;
        this.streetAddress = streetAddress;
        State = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
    }

    public Store(Integer operatingManager, String streetAddress, String state, Integer zip, StoreStatus storeStatus) {
        this.operatingManager = operatingManager;
        this.streetAddress = streetAddress;
        this.State = state;
        this.zip = zip;
        this.storeStatus = storeStatus;
    }

    public Store(Integer id, Integer operatingManager, String streetAddress, String state, Integer zip, StoreStatus storeStatus) {
        this.id = id;
        this.operatingManager = operatingManager;
        this.streetAddress = streetAddress;
        this.State = state;
        this.zip = zip;
        this.storeStatus = storeStatus;
    }

    public Store(Integer id, Integer operatingManager, String streetAddress, String state, Integer zip, String phoneNumber, StoreStatus storeStatus) {
        this.id = id;
        this.operatingManager = operatingManager;
        this.streetAddress = streetAddress;
        State = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.storeStatus = storeStatus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperatingManager() {
        return operatingManager;
    }

    public void setOperatingManager(Integer operatingManager) {
        this.operatingManager = operatingManager;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        this.State = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public StoreStatus getStoreStatus() {
        return storeStatus;
    }

    public void setStoreStatus(StoreStatus storeStatus) {
        this.storeStatus = storeStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Store store = (Store) o;
        return Objects.equals(id, store.id) &&
                Objects.equals(operatingManager, store.operatingManager) &&
                Objects.equals(streetAddress, store.streetAddress) &&
                Objects.equals(State, store.State) &&
                Objects.equals(zip, store.zip) &&
                Objects.equals(phoneNumber, store.phoneNumber) &&
                storeStatus == store.storeStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, operatingManager, streetAddress, State, zip, phoneNumber, storeStatus);
    }

    @Override
    public String toString() {
        return "Store{" +
                "id=" + id +
                ", operatingManager=" + operatingManager +
                ", streetAddress='" + streetAddress + '\'' +
                ", State='" + State + '\'' +
                ", zip=" + zip +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", storeStatus=" + storeStatus +
                '}';
    }
}
