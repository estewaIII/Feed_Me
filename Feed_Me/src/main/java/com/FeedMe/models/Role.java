package com.FeedMe.models;

public enum Role {
    MANAGER(1,"Manager"),ADMIN(2,"Admin"),GENERAL_USER(3,"General User");

    private Integer id;
    private String roleName;

    Role(Integer id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public int getId() {
        return id;
    }

    public static Role getById(int Id){
        for (Role role : Role.values()){
            if (role.id == Id){
                return role;
            }
        }
        return Role.GENERAL_USER;
    }

    @Override
    public String toString() {
        return roleName ;
    }
}
