package com.FeedMe.models;

public enum ItemCategory {
    DOG_FOOD(1,"Dog Food"),DOG_TOYS(2,"Dog Toys"),DOG_NECESSITIES(3,"Dog Necessities"),
    CAT_FOOD(4,"Cat Food"),CAT_TOYS(5,"Cat Toys"),CAT_NECESSITIES(6,"Cat Necessities"),
    LIZARD_FOOD(7,"Lizard Food"),REPTILE_NECESSITIES(8,"Reptile Necessities"),
    SNAKE_FOOD(9,"Snake Food"),RODENT_FOOD(10,"Rodent Food"),RODENT_NECESSITIES(11,"Rodent Necessities")
    ,BIRD_FOOD(12,"Bird Food"),BIRD_NECESSITIES(13,"Bird Necessities")
    ,EXOTIC_ANIMAL_NECESSITIES(14,"Exotic Animal Necessities"),UNCATEGORIZED(15,"Uncategorized");

    private Integer id;
    private String itemCategoryName;

    ItemCategory(Integer id, String itemCategoryName) {
        this.id = id;
        this.itemCategoryName = itemCategoryName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getItemCategoryName() {
        return itemCategoryName;
    }

    public void setItemCategoryName(String itemCategoryName) {
        this.itemCategoryName = itemCategoryName;
    }
    public static ItemCategory getById(Integer Id){
        for (ItemCategory itemCategory: ItemCategory.values()){
            if(itemCategory.id == Id){
                return itemCategory;
            }
        }
        return ItemCategory.UNCATEGORIZED;
    }

    @Override
    public String toString() {
        return itemCategoryName;
    }
}
