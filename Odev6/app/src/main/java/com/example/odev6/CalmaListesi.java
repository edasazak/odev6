package com.example.odev6;

import java.io.Serializable;

public class CalmaListesi implements Serializable {
    private String aciklama;
    private String resimAdi;

    public CalmaListesi(String aciklama, String resimAdi) {
        this.aciklama = aciklama;
        this.resimAdi = resimAdi;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getResimAdi() {
        return resimAdi;
    }

    public void setResimAdi(String resimAdi) {
        this.resimAdi = resimAdi;
    }
}
