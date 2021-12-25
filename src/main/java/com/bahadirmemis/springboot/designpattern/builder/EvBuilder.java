package com.bahadirmemis.springboot.designpattern.builder;

public class EvBuilder {

    private String il;
    private String ilce;
    private String mahalle;

    private int binaYili;
    private int balkonSayisi;
    private int odaSayisi;
    private int banyoSayisi;
    private int tuvaletSayisi;

    private boolean isDublex;
    private boolean isEsyali;
    private boolean hasOtopark;
    private boolean hasCocukParki;
    private boolean hasKlima;
    private boolean hasHavuz;

//    public static EvBuilder startBuild(){
//        return new EvBuilder();
//    }

    public static EvBuilder startNormalEvBuild(String il, String ilce, String mahalle, int binaYili, int odaSayisi){

        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.mahalle = mahalle;
        evBuilder.binaYili = binaYili;
        evBuilder.odaSayisi = odaSayisi;

        return evBuilder;
    }

    public static EvBuilder startVillaEvBuild(String il, String ilce, String mahalle, int binaYili, int odaSayisi){

        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.mahalle = mahalle;
        evBuilder.binaYili = binaYili;
        evBuilder.odaSayisi = odaSayisi;
        evBuilder.isDublex = true;

        return evBuilder;
    }

    public Ev build(){
        Ev ev = new Ev();
        ev.setIl(il);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);
        ev.setBinaYili(binaYili);
        ev.setBalkonSayisi(balkonSayisi);
        ev.setOdaSayisi(odaSayisi);
        ev.setBanyoSayisi(banyoSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);
        ev.setDublex(isDublex);
        ev.setEsyali(isEsyali);
        ev.setHasOtopark(hasOtopark);
        ev.setHasCocukParki(hasCocukParki);
        ev.setHasKlima(hasKlima);
        ev.setHasHavuz(hasHavuz);

        return ev;
    }

    public EvBuilder il(String il) {
        this.il = il;
        return this;
    }

    public EvBuilder ilce(String ilce) {
        this.ilce = ilce;
        return this;
    }

    public EvBuilder mahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;
    }

    public EvBuilder binaYili(int binaYili) {
        this.binaYili = binaYili;
        return this;
    }

    public EvBuilder balkonSayisi(int balkonSayisi) {
        this.balkonSayisi = balkonSayisi;
        return this;
    }

    public EvBuilder odaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;
    }

    public EvBuilder banyoSayisi(int banyoSayisi) {
        this.banyoSayisi = banyoSayisi;
        return this;
    }

    public EvBuilder tuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;
    }

    public EvBuilder dublex(boolean dublex) {
        isDublex = dublex;
        return this;
    }

    public EvBuilder esyali(boolean esyali) {
        isEsyali = esyali;
        return this;
    }

    public EvBuilder hasOtopark(boolean hasOtopark) {
        this.hasOtopark = hasOtopark;
        return this;
    }

    public EvBuilder hasCocukParki(boolean hasCocukParki) {
        this.hasCocukParki = hasCocukParki;
        return this;
    }

    public EvBuilder hasKlima(boolean hasKlima) {
        this.hasKlima = hasKlima;
        return this;
    }

    public EvBuilder hasHavuz(boolean hasHavuz) {
        this.hasHavuz = hasHavuz;
        return this;
    }
}
