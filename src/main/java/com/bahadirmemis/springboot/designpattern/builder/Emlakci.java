package com.bahadirmemis.springboot.designpattern.builder;

public class Emlakci {

    public static void main(String[] args) {

        Ev ev1 = new Ev();
        ev1.setIl("İstanbul");
        ev1.setIlce("Ümraniye");
        ev1.setBinaYili(2010);

        print(ev1);

        Ev ev2 = new Ev("İstanbul", "Ümraniye", 2010);

        print(ev2);

        Ev ev3 = EvBuilder.startNormalEvBuild("Çankırı", "Merkez", "Kırkevler", 2010, 3)
                .esyali(false)
                .banyoSayisi(2)
                .hasKlima(true)
                .build();

        print(ev3);

        Ev villa = EvBuilder.startVillaEvBuild("Çankırı", "Merkez", "Kırkevler", 2010, 3)
                .esyali(false)
                .banyoSayisi(2)
                .hasKlima(true)
                .build();

        print(villa);
    }

    private static void print(Ev ev1) {
        System.out.println(ev1);
    }
}
