package com.FeedMe.repositories;

import com.FeedMe.models.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class UserRepository implements CrudRepository<User> {



    @Override
    public void save(User newObj) {
        try{}catch(SQLException e){e.printStackTrace();}
    }

    @Override
    public Set<User> findAll() {
        try{}catch(SQLException e){e.printStackTrace();}
        return null;
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Boolean update(User updatedObj) {
        try{}catch(SQLException e){e.printStackTrace();}
        return null;
    }

    @Override
    public Boolean deleteById(Integer id) {
        return null;
    }

    private Set<User> mapResultSet(ResultSet rs) throws SQLException{
        Set<User> users = new HashSet<>();

        while(rs.next()){
            User temp = new User();
            temp.setId(rs.getInt(""));
            temp.setFirstName(rs.getString(""));
            temp.setLastName(rs.getString(""));
            temp.setUsername(rs.getString(""));
            temp.setPassword(rs.getString(""));
            temp.setEmail(rs.getString(""));
            temp.setRole(Role.getById(rs.getInt("")));
            users.add(temp);
        }
        return users;
    }
}
