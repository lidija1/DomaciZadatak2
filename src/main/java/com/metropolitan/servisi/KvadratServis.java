package com.metropolitan.servisi;

import org.springframework.stereotype.Service;
import com.metropolitan.PositiveAttribute;
@Service
public class KvadratServis {

    @PositiveAttribute
    public double racunajObim(double duzinaStranice) {
        if (duzinaStranice <= 0) {
            throw new IllegalArgumentException("Duzina stranice mora biti pozitivan broj");
        }
        return 4 * duzinaStranice;
    }

    @PositiveAttribute
    public double racunajPovrsinu(double duzinaStranice) {
        if (duzinaStranice <= 0) {
            throw new IllegalArgumentException("Duzina stranice mora biti pozitivan broj");
        }
        return duzinaStranice * duzinaStranice;
    }
}

