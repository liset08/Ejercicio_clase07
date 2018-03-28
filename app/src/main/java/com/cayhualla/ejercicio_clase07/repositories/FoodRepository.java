package com.cayhualla.ejercicio_clase07.repositories;

import com.cayhualla.ejercicio_clase07.models.Food;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LISET on 27/03/2018.
 */

public class FoodRepository {
    private static List<Food> comida = new ArrayList<>();

    static{
        comida.add(new Food(100, "Pizza Familiar", "Pizza Hut", "pizza","30-40","25.00"));
        comida.add( new Food(200, "Hamburguesas", "Bembos", "hamburguesa","15-30","14.00") );
        comida.add( new Food(300, "Hot Wings", "KFC", "pollo","20-30","30.00") );
        comida.add( new Food(400, "Hamburgers", "Mc-Donalds", "hamburguesa","15-30","6.00") );
        comida.add( new Food(500, "Chicken Wing", "KFC", "pollo","15-30","15.00") );


    }

    public static List<Food> getList(){
        return comida;
    }

}
