package com.workintech.model;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;





    public void checkHealth(int healthPercentage){
        if (healthPercentage <0) {
            this.healthPercentage=0;
        } else if(healthPercentage>100) {
            this.healthPercentage=100;
        } else {
            this.healthPercentage=healthPercentage;
        }
    }

    public Player(String name, int healthPercentage){
        this.name = name;
        checkHealth(healthPercentage);
    }
    public Player( String name, int healthPercentage, Weapon weapon) {
    this(name,healthPercentage);
        this.weapon=weapon;
    }


    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        int hpRemain = healthPercentage-damage;
        if (hpRemain<=0){
            System.out.println(name + " player has been knocked out of game");
        }
        checkHealth(hpRemain);

    }

    public void restoreHealth(int healthPotion) {
        healthPercentage = healthPercentage+healthPotion;

        checkHealth(healthPercentage);

    }

    @Override
    public String toString() {
        return "Name: " + name + " HealthPercentage: " + healthPercentage +
                " Weapon: " + (weapon.getDamage() + " - " + weapon.getAttackSpeed());
    }
}
