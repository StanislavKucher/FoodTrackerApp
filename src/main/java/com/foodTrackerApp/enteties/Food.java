package com.foodTrackerApp.enteties;

import java.math.BigDecimal;
import java.util.Objects;

public class Food {
    private Integer id;
    private String name;
    private BigDecimal protein;
    private BigDecimal fat;
    private BigDecimal carbohydrate;
    private Integer calorie;
    private Integer category_id;

    public Food() {
    }

    public Food(Integer id, String name, BigDecimal protein, BigDecimal fat, BigDecimal carbohydrate, Integer calorie, Integer category_id) {
        this.id = id;
        this.name = name;
        this.protein = protein;
        this.fat = fat;
        this.carbohydrate = carbohydrate;
        this.calorie = calorie;
        this.category_id = category_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getProtein() {
        return protein;
    }

    public void setProtein(BigDecimal protein) {
        this.protein = protein;
    }

    public BigDecimal getFat() {
        return fat;
    }

    public void setFat(BigDecimal fat) {
        this.fat = fat;
    }

    public BigDecimal getCarbohydrate() {
        return carbohydrate;
    }

    public void setCarbohydrate(BigDecimal carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public Integer getCalorie() {
        return calorie;
    }

    public void setCalorie(Integer calorie) {
        this.calorie = calorie;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Food)) return false;
        Food food = (Food) o;
        return Objects.equals(id, food.id) &&
                Objects.equals(name, food.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", protein=" + protein +
                ", fat=" + fat +
                ", carbohydrate=" + carbohydrate +
                ", calorie=" + calorie +
                ", category_id=" + category_id +
                '}';
    }
}