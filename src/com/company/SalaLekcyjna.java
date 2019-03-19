package com.company;

public class SalaLekcyjna {

    public String nazwa;
    public int numerSali;

    //konstruktor

    public SalaLekcyjna (String nazwa, int numerSali){
        this.nazwa = nazwa;
        this.numerSali = numerSali;
    }

    // zadanie 1

    public void wypiszDaneSali (){
        System.out.println(nazwa + " " + numerSali);
    }

}
