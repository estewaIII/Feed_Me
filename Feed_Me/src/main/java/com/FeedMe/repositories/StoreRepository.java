package com.FeedMe.repositories;

import com.FeedMe.models.Store;

import java.util.Optional;
import java.util.Set;

public class StoreRepository implements CrudRepository<Store> {





    @Override
    public void save(Store newObj) {

    }

    @Override
    public Set<Store> findAll() {
        return null;
    }

    @Override
    public Optional<Store> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Boolean update(Store updatedObj) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }
}
