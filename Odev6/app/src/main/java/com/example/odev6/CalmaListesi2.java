package com.example.odev6;

import java.io.Serializable;

public class CalmaListesi2 implements Serializable {
    private String resimAdi;
    private String baslik;
    private String aciklama;

    public CalmaListesi2(String resimAdi, String baslik, String aciklama) {
        this.resimAdi = resimAdi;
        this.baslik = baslik;
        this.aciklama = aciklama;
    }

    public String getResimAdi() {
        return resimAdi;
    }

    public void setResimAdi(String resimAdi) {
        this.resimAdi = resimAdi;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }
}
