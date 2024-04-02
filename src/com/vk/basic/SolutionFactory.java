package com.vk.basic;

import java.util.*;

interface Food {
    String getType();
}

class Pizza implements Food {
    public String getType() {
        return "Someone ordered a Fast Food!";
    }
}

class Cake implements Food {
    public String getType() {
        return "Someone ordered a Dessert!";
    }
}

class FoodFactory {
    public Food getFood(String order) {
        if (order.equalsIgnoreCase("Pizza")) {
            return new Pizza();
        } else if (order.equalsIgnoreCase("Cake")) {
            return new Cake();
        }
        return null;

    }
}

public class SolutionFactory {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            // creating the factory
            FoodFactory foodFactory = new FoodFactory();

            // factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());

            System.out.println("The factory returned " + food.getClass());
            System.out.println(food.getType());
            sc.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

}
