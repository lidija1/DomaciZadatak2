package com.metropolitan.servisi;

import com.metropolitan.PositiveAttribute;
import org.springframework.stereotype.Service;

@Service
public class KrugServis {
    private double poluprecnik;





     @PositiveAttribute
        public double racunajObim(double poluprecnik) {
            if (poluprecnik <= 0) {
                throw new IllegalArgumentException("Poluprečnik mora biti pozitivan broj");
            }
            return 2 * Math.PI * poluprecnik;
        }

        @PositiveAttribute
        public double racunajPovrsinu(double poluprecnik) {
            if (poluprecnik <= 0) {
                throw new IllegalArgumentException("Poluprečnik mora biti pozitivan broj");
            }
            return Math.PI * poluprecnik * poluprecnik;
        }
    }

