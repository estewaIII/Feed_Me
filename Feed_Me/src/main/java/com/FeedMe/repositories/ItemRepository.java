package com.FeedMe.repositories;

import com.FeedMe.models.Item;
import com.FeedMe.models.ItemCategory;
import com.FeedMe.models.ItemStatus;
import com.FeedMe.models.User;
import com.FeedMe.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ItemRepository implements CrudRepository<Item> {



    @Override
    public void save(Item newObj) {
    try(Connection conn = ConnectionFactory.getInstance().getConnection()){
    String sql = "INSERT Into ";
        PreparedStatement pstmt = conn.prepareStatement((sql);
        pstmt.setString(1,newObj);

    }catch(SQLException e){e.printStackTrace();}
    }

    @Override
    public Set<Item> findAll() {
        try{





        }catch(SQLException e){e.printStackTrace();}
        return null;
    }

    @Override
    public Optional<Item> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Boolean update(Item updatedObj) {
        try{




        }catch(SQLException e){e.printStackTrace();}
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        try{



        }catch(SQLException e){e.printStackTrace();}
        return null;
    }

    private Set<Item> mapResultSet(ResultSet rs) throws SQLException{
        Set<Item> items = new HashSet<>();

        while(rs.next()){
            Item temp = new Item();
            temp.setId(rs.getInt(""));
            temp.setDescription(rs.getString(""));
            temp.setCost(rs.getDouble(""));
            temp.setItemImage(rs.getString(""));
            temp.setItemCategory(ItemCategory.getById(rs.getInt("")));
            temp.setItemStatus(ItemStatus.getById(rs.getInt("")));
            items.add(temp);
        }
        return items;
    }
}
