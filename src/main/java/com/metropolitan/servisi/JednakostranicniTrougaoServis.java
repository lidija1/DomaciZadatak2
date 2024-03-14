package com.metropolitan.servisi;

import com.metropolitan.PositiveAttribute;
import org.springframework.stereotype.Service;


@Service
public class JednakostranicniTrougaoServis {

    @PositiveAttribute
    public double racunajObim(double duzinaStranice) {
        if (duzinaStranice <= 0) {
            throw new IllegalArgumentException("Duzina stranice mora biti pozitivan broj");
        }
        return 3 * duzinaStranice;
    }

    @PositiveAttribute
    public double racunajPovrsinu(double duzinaStranice) {
        if (duzinaStranice <= 0) {
            throw new IllegalArgumentException("Duzina stranice mora biti pozitivan broj");
        }
        return (Math.sqrt(3) / 4) * duzinaStranice * duzinaStranice;
    }
}
