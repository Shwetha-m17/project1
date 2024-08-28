package com.xworkz.inheritance;

public class Chicken {

    public String breed;
    public int age;
    public double weight;
    public String color;
    public boolean isLayingEggs;
    public String gender;
    public String habitat;
    public boolean isVaccinated;
    public String diet;
    public String name;

    public Chicken() {
        System.out.println("Constructor of Chicken Created");
    }

    public void cluck() {
        System.out.println("The chicken is clucking.");
    }

    public void layEgg() {

            System.out.println("The chicken is laying an egg.");

    }

    public void forage() {
        System.out.println("The chicken is foraging for food.");
    }

    public void sleep() {
        System.out.println("The chicken is sleeping.");
    }

    public void walk() {
        System.out.println("The chicken is walking.");
    }
}
