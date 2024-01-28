package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu

    nakresliDomecek(); //1.domeček

    zofka.turnLeft(90);
    zofka.move(95);
    zofka.turnRight(90);

    nakresliDomecek(); //2.domeček

    zofka.turnLeft(90);
    zofka.move(95);
    zofka.turnRight(90);

    nakresliDomecek(); //3.domeček

    zofka.turnLeft(90);
    zofka.move(95);
    zofka.turnRight(90);

    nakresliDomecek(); //4.domeček

    zofka.turnLeft(90);
    zofka.move(95);
    zofka.turnRight(90);

    nakresliDomecek(); //5.domeček

    zofka.turnRight(180);
    zofka.move(250);
    zofka.turnLeft(180);

    nakresliDomecek(); // 1. domeček v 2. řadě

    zofka.turnRight(90);
    zofka.move(380);
    zofka.turnLeft(90);

    nakresliDomecek(); // 2. domeček v 2. řadě

    zofka.turnLeft(90);
    zofka.move(140);
    zofka.turnRight(90);

    nakresliPrasatko();

    zofka.turnLeft(90);
    zofka.move(200);
    zofka.turnLeft(90);
    zofka.move(160);
    zofka.turnRight(180);

    nakresliH(); //podpis
    nakresliA();
    nakresliN();
    nakresliA();

    zofka.turnLeft(90); //přesun želvy
    zofka.move(230);
    zofka.turnRight(90);
    zofka.move(620);

    nakresliSlunicko();

    /*
    nakresliPrasatko();

    zofka.turnLeft(90);
    zofka.move(190);

    nakresliOsmiuhelnik();

    zofka.move(200);

    nakresliKolecko();

    zofka.turnRight(180);
    zofka.move(700);

    nakresliSlunicko();
    */

}

  private void nakresliN() {
    zofka.penDown();
    zofka.move(80);
    zofka.turnRight(155);
    zofka.move(89);
    zofka.turnLeft(155);
    zofka.move(80);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(80);
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);

  }

  private void nakresliA() {
    zofka.penDown();
    zofka.turnRight(20);
    zofka.move(90);
    zofka.turnRight(140);
    zofka.move(90);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(40);
    zofka.turnLeft(70);
    zofka.penDown();
    zofka.move(25);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(25);
    zofka.turnRight(70);
    zofka.move(40);
    zofka.turnLeft(70);
    zofka.move(20);
    zofka.turnLeft(90);

  }

  private void nakresliH() {
    zofka.penDown();
    zofka.move(80);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.penDown();
    zofka.move(40);
    zofka.turnLeft(90);
    zofka.move(40);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(40);
    zofka.penDown();
    zofka.move(40);
    zofka.penUp();
    zofka.turnLeft(90);
    zofka.move(20);
    zofka.turnLeft(90);

  }

  private void nakresliDomecek() {
    nakresliCtverecek();
    
    zofka.move(75); //přesun želvy
    
    nakresliStrisku();
    navratNaZacatek();

  }

  private void navratNaZacatek() {
    zofka.penUp();
    zofka.turnRight(30);
    zofka.move(75);
    zofka.turnRight(90);
    zofka.move(75);
    zofka.turnRight(90);
  }

  private void nakresliStrisku() {
    zofka.penDown();
    zofka.turnRight(30);
    zofka.move(75);
    zofka.turnRight(120);
    zofka.move(75);
    zofka.penUp();
  }

  private void nakresliCtverecek() {
    zofka.penDown();
    for (int i = 0; i < 4; i++) {
      zofka.move(75);
      zofka.turnRight(90);
    }
    zofka.penUp();
  }

  private void nakresliSlunicko() {
    zofka.penDown();
    for (int i = 0; i < 24; i++) {
      nakresliCastSlunicka();

    }
    zofka.penUp();

  }

  private void nakresliCastSlunicka() {
    zofka.move(10);

    zofka.turnRight(90);
    zofka.move(10);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(10);
    zofka.turnRight(90);
    zofka.penDown();

    zofka.turnLeft(15);

  }

  private void nakresliKolecko() {
    zofka.penDown();
    for (int i = 0; i < 48; i++) {
      zofka.move(10);
      zofka.turnRight(7.5);
    }
    zofka.penUp();
  }

  private void nakresliOsmiuhelnik() {
    zofka.penDown();
    for (int i = 0; i < 8; i++) {
      zofka.move(50);
      zofka.turnRight(45);
    }
    zofka.penUp();

  }

  private void nakresliPrasatko() {
    zofka.penDown();
    zofka.move(75);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
    zofka.move(75);
    zofka.turnRight(90);
    zofka.move(100);

    nakresliStrechu();

    zofka.penUp();
    zofka.turnRight(120);
    zofka.move(75);

    nakresliNozicky();

    zofka.turnRight(130);
    zofka.move(100);
    zofka.turnRight(90);

    nakresliNozicky();

    zofka.turnLeft(50);
    zofka.move(100);
    zofka.turnRight(90);
  }

  private void nakresliNozicky() {
    zofka.penDown();
    zofka.turnRight(40);
    zofka.move(25);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(25);
    zofka.turnRight(100);
    zofka.penDown();
    zofka.move(25);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(25);
  }

  private void nakresliStrechu() {
    zofka.turnRight(30);
    zofka.move(75);
    zofka.turnRight(120);
    zofka.move(75);
  }

  }
