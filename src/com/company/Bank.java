package com.company;

public class Bank {

    private String nazwaBanku;
    private RachunekBankowy[] tablicaRachunkow;

    // dwa konstruktory = przeciazanie funkcji = przeciazenie konstruktora

    public Bank(String nazwaBanku, RachunekBankowy[] tablicarachunkow) {
        this.nazwaBanku = nazwaBanku;
        this.tablicaRachunkow = tablicarachunkow;
    }

    public Bank (String nazwaBanku, int liczbaRachunkowBankowych) {
        this.nazwaBanku = nazwaBanku;
        this.tablicaRachunkow = new RachunekBankowy[liczbaRachunkowBankowych];
    }

    // metoda wypiszRachunkiWBanku

    public void wypiszRachunkiWBanku() {
        for (int i = 0; i < tablicaRachunkow.length; i++) {
            tablicaRachunkow[i].wypiszInformacjeORachunku();
        }
    }

// wykonaj przelew (String numerKontaZ, String numerKontaNa, double kwotaPrzlewu

    public void wykonajPrzelew(String numerKontaZ, String numerKontaNa, double kwotaPrzelewu) {
        long longNumerKontaZ = Long.parseLong(numerKontaZ);
        long longNumerKontaNa = Long.parseLong(numerKontaNa);

        for (int i = 0; i < tablicaRachunkow.length; i++) {
            if (longNumerKontaZ == tablicaRachunkow[i].getNumerKonta()) {
                tablicaRachunkow[i].wykonajPrzelewSrodkowWychodzacych(kwotaPrzelewu);
            }
            if (longNumerKontaNa == tablicaRachunkow[i].getNumerKonta()) {
                tablicaRachunkow[i].wykonajPrzelewSrodkowPrzychodzacych(kwotaPrzelewu);
            }
        }
    }
    // dodajKontaDoRachunku (RachunekBankowy):void

    public void dodajKontaDoRachunku (RachunekBankowy doDodania){
         RachunekBankowy[] nowaTablica = new RachunekBankowy[this.tablicaRachunkow.length+1];
         for(int i=0; i<this.tablicaRachunkow.length; i++){
             nowaTablica[i] = tablicaRachunkow[i];
         }
         nowaTablica[this.tablicaRachunkow.length] = doDodania;
         this.tablicaRachunkow = nowaTablica; // zastapilismy stara tablice nowa
    }




}
