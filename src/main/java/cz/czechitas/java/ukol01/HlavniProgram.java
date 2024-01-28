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

    nakresliPrasatko();

}

  private void nakresliPrasatko() {
    zofka.penDown();
    zofka.move(150);
    zofka.turnRight(90);
    zofka.move(200);
    zofka.turnRight(90);
    zofka.move(150);
    zofka.turnRight(90);
    zofka.move(200);

    nakresliStrechu();

    zofka.penUp();
    zofka.turnRight(120);
    zofka.move(150);

    nakresliNozicky();

    zofka.turnRight(130);
    zofka.move(200);
    zofka.turnRight(90);

    nakresliNozicky();

    zofka.turnLeft(50);
    zofka.move(200);
    zofka.turnRight(90);
  }

  private void nakresliNozicky() {
    zofka.penDown();
    zofka.turnRight(40);
    zofka.move(50);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(50);
    zofka.turnRight(100);
    zofka.penDown();
    zofka.move(50);
    zofka.penUp();
    zofka.turnRight(180);
    zofka.move(50);
  }

  private void nakresliStrechu() {
    zofka.turnRight(30);
    zofka.move(150);
    zofka.turnRight(120);
    zofka.move(150);
  }

  }
