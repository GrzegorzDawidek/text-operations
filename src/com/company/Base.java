package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Base extends Person {
    public static int IMIE_POCZATEK = 0;
    public static int IMIE_KONIEC = 20;
    public static int NAZWISKO_POCZATEK = 20;
    public static int NAZWISKO_KONIEC = 50;
    public static int ULICA_POCZATEK = 50;
    public static int ULICA_KONIEC = 80;
    public static int NUMER_MIESZKANIA_POCZATEK = 80;
    public static int NUMER_MIESZKANIA_KONIEC = 85;
    public static int WARTOSC_STALA_POCZATEK = 85;
    public static int WARTOSC_STALA__KONIEC = 86;
    public static int NUMER_DOMU_POCZATEK = 86;
    public static int NUMER_DOMU_KONIEC = 90;
    public static int KOD_POCZTOWY_POCZATEK = 90;
    public static int KOD_POCZTOWY_KONIEC = 100;
    public static int MIASTO_POCZATEK = 100;
    public static int MIASTO_KONIEC = 130;
    public static int FIRMA_POCZATEK = 130;
    public static int FIRMA_KONIEC = 160;
    public static int ZAWOD_POCZATEK = 160;
    public static int ZAWOD_KONIEC = 190;

    public static void reader1() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("dane.txt"));
            setData(reader.readLine());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
