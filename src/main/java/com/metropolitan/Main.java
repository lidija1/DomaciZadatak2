package com.metropolitan;

import com.metropolitan.servisi.JednakostranicniTrougaoServis;
import com.metropolitan.servisi.KrugServis;
import com.metropolitan.servisi.KvadratServis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Konfiguracija.class);

        KvadratServis kvadratServis = context.getBean(KvadratServis.class);
        KrugServis krugServis = context.getBean(KrugServis.class);
        JednakostranicniTrougaoServis trougaoServis = context.getBean(JednakostranicniTrougaoServis.class);

        double duzinaStraniceKvadrata = 5.0;
        double poluprecnikKruga = 3.0;
        double duzinaStraniceTrougla = 4.0;

        try {
            double obimKvadrata = kvadratServis.racunajObim(duzinaStraniceKvadrata);
            double povrsinaKvadrata = kvadratServis.racunajPovrsinu(duzinaStraniceKvadrata);

            double obimKruga = krugServis.racunajObim(poluprecnikKruga);
            double povrsinaKruga = krugServis.racunajPovrsinu(poluprecnikKruga);

            double obimTrougla = trougaoServis.racunajObim(duzinaStraniceTrougla);
            double povrsinaTrougla = trougaoServis.racunajPovrsinu(duzinaStraniceTrougla);

            System.out.println("Kvadrat - Obim: " + obimKvadrata + ", Povrsina: " + povrsinaKvadrata);
            System.out.println("Krug - Obim: " + obimKruga + ", Povrsina: " + povrsinaKruga);
            System.out.println("Trougao - Obim: " + obimTrougla + ", Povrsina: " + povrsinaTrougla);
        } catch (IllegalArgumentException e) {
            System.out.println("Doslo je do greske: " + e.getMessage());
        }
    }
}
