package com.metropolitan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.metropolitan.servisi.KvadratServis;
import com.metropolitan.servisi.KrugServis;
import com.metropolitan.servisi.JednakostranicniTrougaoServis;

@Configuration
public class Konfiguracija {


    @Bean
    public KvadratServis kvadratServis() {
        return new KvadratServis(5);
    }
    @Bean
    public KrugServis krugServis() {
        return new KrugServis(3.3);
    }
    @Bean
    public JednakostranicniTrougaoServis trougaoServis() {
        return new JednakostranicniTrougaoServis(4.7);
    }

}
