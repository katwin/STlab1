package com.githab.eefimova.part3;

public class BrokianUltraCricket {
    private int hits;
    private int escapes;

    public void hit() {
        //System.out.println("неожиданно ударить человека без видимой на то причины");
        hits++;
    }
    public void runAway() {
        //System.out.println("убежать");
        escapes++;
    }

    public int getHits() {
        return hits;
    }

    public int getEscapes() {
        return escapes;
    }

    /*@Override
    public String toString() {
        return "брокианский ультра-крикет";
    }*/
}
