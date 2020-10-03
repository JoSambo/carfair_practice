package nl.novi.relaties.extra;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Sellers jan = new Sellers("Jan's Autofabriek",061234175, "jansfabriek.nl", "526415545B01");
        jan.addCarToSell(Arrays.asList("panda", "bmw", "volkswagen"));

        Sellers bob = new Sellers("Nice Cars",061325175, "nicecars.nl", "65461841565B01");
        bob.addCarToSell(Arrays.asList("seat", "kia"));

        Sellers henk = new Sellers("Garage Henkie",0622354175, "henkie.nl", "3265897498B01");
        henk.addCarToSell(Arrays.asList("ford", "honda", "fiat", "mercedes", "mini", "chrysler", "peugeot", "chevrolet", "bmw", "hummer"));

        Sellers niels = new Sellers("Auto Niels",061234557, "autoniels.nl", "2313215587B01");
        niels.addCarToSell(Arrays.asList("volkswagen", "renault", "opel", "ford", "suzuki"));

        Sellers bart = new Sellers("Bartjes Auto",065713215, "bartjes.nl", "6632684156B01");
        bart.addCarToSell(Arrays.asList("bmw", "fiat", "rover"));

        System.out.println(jan.toString());
        System.out.println(bob.toString());
        System.out.println(henk.toString());
        System.out.println(niels.toString());
        System.out.println(bart.toString());

        Cars panda = new Cars(2003, "seat", "station", "22lkud", 200000, 1400, 2000);

        System.out.println(panda.askPriceVatInclusive(1400));
    }
}

/*
    Op de auto verkoopbeurs hebben we verschillende verkopers met verschillende auto's. Van de verkopers willen we de
    bedrijfsnaam, telefoonnummers, website en btw-nummer registreren. De verkopers kunnen meerdere auto's verkopen.

       Van de auto's willen we het bouwjaar, merk, soort, kenteken en aantal gereden kilometers registreren. Daarnaast
       heeft elke auto een vraagprijs en willen we de uiteindelijke verkoopprijs registreren. De prijzen die we
       registreren zijn ex Btw.

       Maak bovenstaande klasse aan.

       Voeg aan de klasse auto twee methodes toes: askPriceVatInclusive() en sellPriceVatInclusive() en laat deze de
       vraag- en verkoopprijs inclusief btw teruggeven.

        Maak een vijftal verkopers aan. Geeft elke verkoper 2-10 auto's. Druk van elke verkoper zijn auto's af.
        Het netste is om dit in een toString() methode te doen in Verkoper!
*/