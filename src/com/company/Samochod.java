package com.company;

public class Samochod {

    public String nazwa;
    public int predkosc;

// konstruktor

   public Samochod (String nazwa, int predkosc){
       this.nazwa = nazwa;
       this.predkosc = predkosc;

   }
   public void wypiszInformacjeOSamochodzie(){
       System.out.println("Auto " + nazwa + " predkosc " + predkosc + "kmh");
   }

   public void przyspieszO5kmh(){
       System.out.println(nazwa + " "+ (predkosc + 5) + "kmh");
   }

   public void zwolnijO5kmh(){
       System.out.println(nazwa + " " + (predkosc - 5) + "kmh");
   }

}
