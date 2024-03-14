package com.metropolitan.servisi;

import org.springframework.stereotype.Service;

@Service
public class KvadratServis implements OblikServis {
    private double duzinaStranice;

    public KvadratServis(double duzinaStranice) {
        this.duzinaStranice = duzinaStranice;
    }

    @Override
    public double racunajObim() {
        return 4 * duzinaStranice;
    }

    @Override
    public double racunajPovrsinu() {
        return duzinaStranice * duzinaStranice;
    }
}

