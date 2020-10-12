package com.company;

public class Wypelnianie {
    public static void wypelnij() {
        System.out.println(Base.data);
        Base.setImie(Base.data.substring(Base.IMIE_POCZATEK, Base.IMIE_KONIEC).trim());
        Base.setNazwisko(Base.data.substring(Base.NAZWISKO_POCZATEK, Base.NAZWISKO_KONIEC).trim());
        Base.adres.setUlica(Base.data.substring(Base.ULICA_POCZATEK, Base.ULICA_KONIEC).trim());
        Base.adres.setNumer_mieszkania(Base.data.substring(Base.NUMER_MIESZKANIA_POCZATEK, Base.NUMER_MIESZKANIA_KONIEC).trim());
        Base.adres.setWartosc_stala(Base.data.substring(Base.WARTOSC_STALA_POCZATEK, Base.WARTOSC_STALA__KONIEC).trim());
        Base.adres.setNumer_domu(Base.data.substring(Base.NUMER_DOMU_POCZATEK, Base.NUMER_DOMU_KONIEC).trim());
        Base.adres.setKod_pocztowy(Base.data.substring(Base.KOD_POCZTOWY_POCZATEK, Base.KOD_POCZTOWY_KONIEC).trim());
        Base.adres.setMiasto(Base.data.substring(Base.MIASTO_POCZATEK, Base.MIASTO_KONIEC).trim());
        Base.setFirma(Base.data.substring(Base.FIRMA_POCZATEK, Base.FIRMA_KONIEC).trim());
        Base.setZawod(Base.data.substring(Base.ZAWOD_POCZATEK, Base.ZAWOD_KONIEC).trim());

    }
}
