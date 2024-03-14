package com.metropolitan.servisi;

import org.springframework.stereotype.Service;
@Service
public class KrugServis implements OblikServis {
    private double poluprecnik;

    public KrugServis(double poluprecnik) {
        this.poluprecnik = poluprecnik;
    }

    @Override
    public double racunajObim() {
        return 2 * Math.PI * poluprecnik;
    }

    @Override
    public double racunajPovrsinu() {
        return Math.PI * poluprecnik * poluprecnik;
    }
}
