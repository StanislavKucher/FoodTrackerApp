package com.foodTrackerApp.enteties;


import java.time.LocalDate;
import java.util.Objects;

public class Record {
    private Integer id;
    private Integer weight;
    private LocalDate date;
    private Integer food_id;
    private Integer user_id;

    public Record() {
    }

    public Record(Integer id, Integer weight, LocalDate date, Integer food_id, Integer user_id) {
        this.id = id;
        this.weight = weight;
        this.date = date;
        this.food_id = food_id;
        this.user_id = user_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Integer getFood_id() {
        return food_id;
    }

    public void setFood_id(Integer food_id) {
        this.food_id = food_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Record)) return false;
        Record record = (Record) o;
        return Objects.equals(id, record.id) &&
                Objects.equals(weight, record.weight) &&
                Objects.equals(date, record.date) &&
                Objects.equals(food_id, record.food_id) &&
                Objects.equals(user_id, record.user_id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, weight, date, food_id, user_id);
    }

    @Override
    public String toString() {
        return "Record{" +
                "id=" + id +
                ", weight=" + weight +
                ", date=" + date +
                ", food_id=" + food_id +
                ", user_id=" + user_id +
                '}';
    }
}