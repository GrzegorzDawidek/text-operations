package com.company;

public class Adres {
    protected String ulica;
    protected String numer_mieszkania;
    protected String wartosc_stala;
    protected String numer_domu;
    protected String kod_pocztowy;
    protected String miasto;

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public void setNumer_mieszkania(String numer_mieszkania) {
        this.numer_mieszkania = numer_mieszkania;
    }

    public void setWartosc_stala(String wartosc_stala) {
        this.wartosc_stala = wartosc_stala;
    }

    public void setNumer_domu(String numer_domu) {
        this.numer_domu = numer_domu;
    }

    public void setKod_pocztowy(String kod_pocztowy) {
        this.kod_pocztowy = kod_pocztowy;
    }

    public void setMiasto(String miasto) {
        this.miasto = miasto;
    }

    public String getUlica() {
        return ulica;
    }

    public String getNumer_mieszkania() {
        return numer_mieszkania;
    }

    public String getWartosc_stala() {
        return wartosc_stala;
    }

    public String getNumer_domu() {
        return numer_domu;
    }

    public String getKod_pocztowy() {
        return kod_pocztowy;
    }

    public String getMiasto() {
        return miasto;
    }
}
