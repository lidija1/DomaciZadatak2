package com.metropolitan.servisi;

import com.metropolitan.oblici.Krug;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

@Service
public interface OblikServis {
    double racunajObim();
    double racunajPovrsinu();
//public static final Log LOG = LogFactory.getLog(OblikServis.class);
//
//    public void prikaziKrug(Krug krug) {
//        LOG.info("Podaci o osobi: " + krug.obim()+ " " + krug.povrsina());
//    }
}

