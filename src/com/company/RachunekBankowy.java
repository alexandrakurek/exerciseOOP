package com.company;

public class RachunekBankowy {

    private long numerKonta;
    private double iloscSrodkow;
    private String imieINazwisko;

    public RachunekBankowy(long numerKonta, double iloscSrodkow, String imieINazwisko) {
        this.numerKonta = numerKonta;
        this.iloscSrodkow = iloscSrodkow;
        this.imieINazwisko = imieINazwisko;
    }

    public void wykonajPrzelewSrodkowWychodzacych (double doWyjecia){
        this.iloscSrodkow -= doWyjecia;
        System.out.println("Wyplacono"+doWyjecia + "pozostalo:" + this.iloscSrodkow);
    }


    public void wykonajPrzelewSrodkowPrzychodzacych (double doWplacenia){
      this.iloscSrodkow += doWplacenia;
        System.out.println("Wyplacono" + doWplacenia + "pozostalo" + this.iloscSrodkow);
    }
    public void wypiszInformacjeORachunku(){
        System.out.println("konto nalezy do:" + this.imieINazwisko);
        System.out.println("numer konta:" + this.numerKonta);
        System.out.println("na koncie jest:" + this.iloscSrodkow);
        System.out.println();
    }
    public long getNumerKonta(){
        return numerKonta;
    }
    public double getIloscSrodkow(){
        return iloscSrodkow;
    }
    public String getImieINazwisko(){
        return imieINazwisko;
    }






}
