package com.FeedMe.repositories;

import com.FeedMe.models.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class StoreRepository implements CrudRepository<Store> {





    @Override
    public void save(Store newObj) {
        try{}catch(SQLException e){e.printStackTrace();}
    }

    @Override
    public Set<Store> findAll() {
            try{}catch(SQLException e){e.printStackTrace();}

        return null;
    }

    @Override
    public Optional<Store> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Boolean update(Store updatedObj) {
        try{}catch(SQLException e){e.printStackTrace();}
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        try{}catch(SQLException e){e.printStackTrace();}
        return null;
    }

    private Set<Store> mapResultSet(ResultSet rs) throws SQLException{
        Set<Store> stores = new HashSet<>();

        while(rs.next()){
            Store temp = new Store();
            temp.setId(rs.getInt(""));
            temp.setOperatingManager(rs.getInt(""));
            temp.setStreetAddress(rs.getString(""));
            temp.setState(rs.getString(""));
            temp.setZip(rs.getInt(""));
            temp.setPhoneNumber(rs.getString(""));
            temp.setStoreStatus(StoreStatus.getById(rs.getInt("")));
            stores.add(temp);
        }
        return stores;
    }
}
