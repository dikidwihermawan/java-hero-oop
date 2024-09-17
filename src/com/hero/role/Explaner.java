package com.hero.role;

public class Explaner implements Role {

    private double gpm = 3;
    private double epm = 10;

    public double getGpm() {
        return gpm;
    }

    public void setGpm(double gpm) {
        this.gpm = gpm;
    }

    public double getEpm() {
        return epm;
    }

    public void setEpm(double epm) {
        this.epm = epm;
    }

    public void attack() {
    }

    public void defend() {
    }

}
