package com.workintech.model;

public enum Weapon {
    SWORD(10,1.9),
    AXE(14,1.5 ),
    MAZE(18,1.2);



private int damage;
private double attackSpeed;



     Weapon (int damage, double attackSpeed){
this.damage=damage;
this.attackSpeed=attackSpeed;
    }

    public int getDamage() {
        return damage;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }


}
