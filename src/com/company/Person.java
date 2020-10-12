package com.company;

public class Person {
    protected static String imie;
    protected static String nazwisko;
    protected static String firma;
    protected static String zawod;
    protected static String data;
    protected static Adres adres = new Adres();

    public static void setImie(String imie) {
        Person.imie = imie;
    }

    public static void setNazwisko(String nazwisko) {
        Person.nazwisko = nazwisko;
    }

    public static void setFirma(String firma) {
        Person.firma = firma;
    }

    public static void setZawod(String zawod) {
        Person.zawod = zawod;
    }

    public static void setData(String data) {
        Person.data = data;
    }

    @Override
    public String toString() {
        return "Person{" + "\n" +
                " Imie='" + imie + '\'' + " \n" +
                " Nazwisko='" + nazwisko + '\'' + " \n" +
                " Ulica='" + adres.getUlica() + '\'' + " \n" +
                " Numer mieszkania='" + adres.getNumer_mieszkania() + '\'' + " \n" +
                " Wartosc stala='" + adres.getWartosc_stala() + '\'' + " \n" +
                " Numer domu='" + adres.getNumer_domu() + '\'' + " \n" +
                " Kod pocztowy='" + adres.getKod_pocztowy() + '\'' + " \n" +
                " Miasto='" + adres.getMiasto() + '\'' + " \n" +
                " Firma='" + firma + '\'' + " \n" +
                " Zawod=' " + zawod + '\'' + " \n" +
                '}';
    }


}

