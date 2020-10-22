package nl.novi.relaties.extra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sellers jan = new Sellers("Jan's Autofabriek",061234175, "jansfabriek.nl", "526415545B01");

        Cars seat = new Cars(2003, "seat", "station", "22lkud", 200000, 1400, 2000);
        Cars fiat = new Cars(2000, "fiat", "panda", "hh55dd", 15008, 900, 1200);

        jan.addCarToSell(seat);
        jan.addCarToSell(fiat);

        Sellers bob = new Sellers("Nice Cars",061325175, "nicecars.nl", "65461841565B01");

        Cars bmw = new Cars(2005, "bmw", "hatchback", "df62fm", 235800, 2500.00,3500.00);
        Cars kia = new Cars(2018, "kia", "suv", "ks57fd", 36000, 8000.00, 10000.00);

        bob.addCarToSell(bmw);
        bob.addCarToSell(kia);

        Sellers henk = new Sellers("Garage Henkie",0622354175, "henkie.nl", "3265897498B01");

        Cars ford = new Cars(2006, "ford", "station", "ws51df", 300000, 1000.00, 800.00);
        Cars honda = new Cars(2000, "honda", "civic", "nc54cd", 280000, 900.00, 850.00);
        Cars fiat2 = new Cars(2018, "fiat", "500", "aa51dd", 25300, 9000.00, 8000.00);
        Cars mercedes = new Cars(2001, "mercedes", "vito", "lg5d5", 10000, 12000.00, 10000.00);
        Cars chrysler = new Cars(2003, "chrysler", "pt cruiser", "js52gz", 257000, 1200.00, 950.00);
        Cars peugeot = new Cars(2005, "peugeot", "206", "ld43sd", 201000, 1000.00, 950.00);
        Cars chevrolet = new Cars(2015, "chevrolet", "camaro", "ms543dd", 78000, 11000.00, 9000.00);
        Cars bmw2 = new Cars(2018, "bmw", "i3", "es51fc", 36000, 15000.00, 14500.00);
        Cars citroen = new Cars(2006, "citroen", "c4", "ir44dg", 68700, 15000.00, 10000.00);
        Cars volkswagen = new Cars(2003, "volkswagen", "golf", "de69fe", 250000, 1300.00, 1200.00);


        henk.addCarToSell(ford);
        henk.addCarToSell(honda);
        henk.addCarToSell(fiat2);
        henk.addCarToSell(mercedes);
        henk.addCarToSell(chrysler);
        henk.addCarToSell(peugeot);
        henk.addCarToSell(chevrolet);
        henk.addCarToSell(bmw2);
        henk.addCarToSell(citroen);
        henk.addCarToSell(volkswagen);

        Sellers niels = new Sellers("Auto Niels",061234557, "autoniels.nl", "2313215587B02");

        Cars volkswagen2 = new Cars(2003, "volkswagen", "polo", "ef54ge", 200000, 1100.00, 1000.00);
        Cars renault = new Cars(2011, "renault", "clio", "we88cd", 180000, 1300.00, 1200.00);
        Cars opel = new Cars(2000, "opel", "corsa", "pl45df", 280000, 900.00, 850.00);
        Cars ford2 = new Cars(2005, "ford", "focus", "de69fe", 250000, 1300.00, 1200.00);
        Cars suzuki = new Cars(2008, "suzuki", "alto", "kj68oj", 265000, 1100.00, 1200.00);

        niels.addCarToSell(volkswagen2);
        niels.addCarToSell(renault);
        niels.addCarToSell(opel);
        niels.addCarToSell(ford2);
        niels.addCarToSell(suzuki);

        Sellers bart = new Sellers("Bartjes Auto",065713215, "bartjes.nl", "6632684156B01");

        Cars bmw3 = new Cars(2001, "bmw", "alto", "kj68oj", 265000, 1100.00, 1200.00);
        Cars fiat3 = new Cars(2009, "fiat", "alto", "kj68oj", 265000, 1100.00, 1200.00);
        Cars rover = new Cars(2000, "rover", "alto", "kj68oj", 265000, 1100.00, 1200.00);

        bart.addCarToSell(bmw3);
        bart.addCarToSell(fiat3);
        bart.addCarToSell(rover);

        System.out.println(jan.toString());
        System.out.println(bob.toString());
        System.out.println(henk.toString());
        System.out.println(niels.toString());
        System.out.println(bart.toString());

        System.out.println(kia.askPriceVatInclusive(8000.00));
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