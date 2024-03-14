package com.metropolitan.servisi;

import org.springframework.stereotype.Service;

@Service
public class JednakostranicniTrougaoServis implements OblikServis {
    private double stranica;

    public JednakostranicniTrougaoServis(double stranica) {
        this.stranica = stranica;
    }

    @Override
    public double racunajObim() {
        return 3 * stranica;
    }

    @Override
    public double racunajPovrsinu() {
        return (Math.sqrt(3) / 4) * stranica * stranica;
    }
}
