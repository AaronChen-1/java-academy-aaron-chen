package com.pluralsight;

public class Character {

    private static final int MAX_HEALTH = 100;

    private String name;
    private int health;
    private String outfitColor;
    private int attackDamage;
    private int power;

    // Constructor
    public Character(String name, String outfitColor) {
        this.name = name;
        this.outfitColor = outfitColor;
        this.power = 100;
        this.health = MAX_HEALTH;
        this.attackDamage = 100;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int newHealth) {
        if (newHealth >= 0 && newHealth <= MAX_HEALTH) {
            this.health = newHealth;
        } else {
            System.out.println("Invalid health value. Health must be between 0 and " + MAX_HEALTH + ".");
        }
    }

    public void heal(int amount) {
        System.out.println(name + " is drinking a potion...");
        int newHealth = Math.min(this.health + amount, MAX_HEALTH);
        setHealth(newHealth);

        if (newHealth == MAX_HEALTH) {
            System.out.println("Fully recovered!");
        } else {
            System.out.println("Recovered " + amount + " health. Current health: " + health);
        }
    }

    @Override
    public String toString() {
        return "Character{name='" + name + "', outfitColor='" + outfitColor + "', health=" + health +
                ", attackDamage=" + attackDamage + ", power=" + power + "}";
    }
}