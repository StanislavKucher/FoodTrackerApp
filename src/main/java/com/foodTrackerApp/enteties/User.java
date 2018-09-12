package com.foodTrackerApp.enteties;

import java.math.BigDecimal;
import java.util.Objects;

public class User {
    private Integer id;
    private String login;
    private String password;
    private String email;
    private String firstName;
    private String lastName;
    private String birthday;
    private Integer age;
    private Integer height;
    private Integer weight;
    private String sex;
    private String lifestyle;
    private BigDecimal lifestyleCoefficient;
    private Integer calorieRate;
    private Integer roleId;

    public User() {
    }

    public User(Integer id, String login, String password, String email, String firstName, String lastName, String birthday,Integer age,
                Integer height,Integer weight, String sex, String lifestyle, BigDecimal lifestyleCoefficient, Integer calorieRate, Integer roleId) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sex = sex;
        this.lifestyle = lifestyle;
        this.lifestyleCoefficient = lifestyleCoefficient;
        this.calorieRate = calorieRate;
        this.roleId = roleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getLifestyle() {
        return lifestyle;
    }

    public void setLifestyle(String lifestyle) {
        this.lifestyle = lifestyle;
    }

    public BigDecimal getLifestyleCoefficient() {
        return lifestyleCoefficient;
    }

    public void setLifestyleCoefficient(BigDecimal lifestyleCoefficient) {
        this.lifestyleCoefficient = lifestyleCoefficient;
    }

    public Integer getCalorieRate() {
        return calorieRate;
    }

    public void setCalorieRate(Integer colorieRate) {
        this.calorieRate = colorieRate;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(id, user.id) &&
                Objects.equals(login, user.login) &&
                Objects.equals(email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, email);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday='" + birthday + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sex='" + sex + '\'' +
                ", lifestyle='" + lifestyle + '\'' +
                ", lifestyleCoefficient=" + lifestyleCoefficient +
                ", calorieRate=" + calorieRate +
                ", roleId=" + roleId +
                '}';
    }
}
