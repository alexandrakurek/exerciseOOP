package com.company;

public class Main {

    public static void main(String[] args) {

        SalaLekcyjna sala1 = new SalaLekcyjna("kolorowa", 5);
        SalaLekcyjna sala2 = new SalaLekcyjna("niebieska", 2);
        SalaLekcyjna sala3 = new SalaLekcyjna("czerwona", 6);

        sala1.wypiszDaneSali();
        sala2.wypiszDaneSali();
        sala3.wypiszDaneSali();

        //zadanie 2

        Samochod auto1 = new Samochod("BMW", 160);
        Samochod auto2 = new Samochod("AUDI", 140);

        auto1.wypiszInformacjeOSamochodzie();
        auto2.wypiszInformacjeOSamochodzie();

        auto1.przyspieszO5kmh();
        auto2.zwolnijO5kmh();

        // zadanie 3

        RachunekBankowy rachuneMarcina = new RachunekBankowy(64747477,700,"Marcin Kowalski" ); // dane z konstruktora nr konta, ilosci srodkow, imie i nazwisko
        RachunekBankowy rachunekKasi = new RachunekBankowy(82837373, 9000, "Kasia Nowak");
        RachunekBankowy [] tablicaRachunkowBankowych = new RachunekBankowy[]{rachuneMarcina, rachunekKasi};

        Bank mbank = new Bank("mBank", tablicaRachunkowBankowych);
        mbank.wypiszRachunkiWBanku();


       mbank.wykonajPrzelew("64747477","82837373", 10000);
       mbank.wypiszRachunkiWBanku();

       RachunekBankowy rachunekBankowy = new RachunekBankowy(5258493, 40000, "Krzysztof Kurek");

       Bank pekao = new Bank("pekao", tablicaRachunkowBankowych);















    }


}






