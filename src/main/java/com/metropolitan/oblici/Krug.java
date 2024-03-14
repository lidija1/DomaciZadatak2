package com.metropolitan.oblici;

import com.metropolitan.servisi.KrugServis;

public class Krug implements Oblik {
    private double poluprecnik;

    public Krug(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    public double getPoluprecnik() {
        return poluprecnik;
    }

    public void setPoluprecnik(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    @Override
    public double obim() {
        return 2 * Math.PI * poluprecnik;
    }

    @Override
    public double povrsina() {
        return Math.PI * poluprecnik * poluprecnik;
    }
}
