package com.FeedMe.repositories;

import com.FeedMe.models.Item;

import java.util.Optional;
import java.util.Set;

public class ItemRepository implements CrudRepository<Item> {



    @Override
    public void save(Item newObj) {

    }

    @Override
    public Set<Item> findAll() {
        return null;
    }

    @Override
    public Optional<Item> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Boolean update(Item updatedObj) {
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }
}
