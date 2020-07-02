package com.company.java.core;

/**
 * JavaCore
 *
 * @author Tung lam
 * @created_at 15/05/2020 - 16:00
 * @created_by Tung lam
 * @since 15/05/2020
 */
public class Bee {
    public String Type;

    public float Health;

    protected int HealthLimit;


    public boolean Alive() {
        return (this.Health > this.HealthLimit);
    }

    public void Damage(int damage) {
        if (this.Alive() && damage > 0 && damage < 100) {
            this.Health -= damage;
        }
        if (this.Health < 0) {
            this.Health = 0;
        }
    }

    protected Bee(String type, int healthLimit) {
        this.Type = type;
        this.Health = 100;
        this.HealthLimit = healthLimit;
    }

}
