package com.metropolitan;

import com.metropolitan.servisi.KrugServis;
import com.metropolitan.servisi.JednakostranicniTrougaoServis;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Konfiguracija.class);

        KrugServis krugServis = context.getBean(KrugServis.class);
        JednakostranicniTrougaoServis trougaoServis = context.getBean(JednakostranicniTrougaoServis.class);

        System.out.println("Krug obim: " + krugServis.racunajObim());
        System.out.println("Krug povrsina: " + krugServis.racunajPovrsinu());

        System.out.println("Trougao obim: " + trougaoServis.racunajObim());
        System.out.println("Trougao povrsina: " + trougaoServis.racunajPovrsinu());
    }
}
