package com.cayhualla.ejercicio_clase07.models;

/**
 * Created by LISET on 27/03/2018.
 */

public class Food {


    public Food(Integer id, String name, String tipo ,String picture, String time, String price) {
        this.name = name;
        this.picture = picture;
        this.id = id;
        this.time = time;
        this.tipo = tipo;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", picture='" + picture + '\'' +
                ", id=" + id +
                ", time='" + time + '\'' +
                ", tipo='" + tipo + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    private String name;
    private String picture;

    private Integer id;
    private String time;
    private String tipo;
    private String price;


}
