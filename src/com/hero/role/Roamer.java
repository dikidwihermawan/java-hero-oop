package com.hero.role;

public class Roamer implements Role {

    private double gpm = 3;
    private double epm = 5;

    public double getGpm() {
        return gpm;
    }

    public void setGpm(double gpm) {
        this.gpm = gpm;
    }

    public double getEpm() {
        return epm;
    }

    public void attack() {
    }

    public void defend() {
    }

}
