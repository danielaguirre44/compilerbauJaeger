/*
 * Anweisung.java -- Anweisungen
 */


abstract class Anweisung {
}


class Folge extends Anweisung {

  Anweisung anweisung1;
  Anweisung anweisung2;

  Folge(Anweisung a1, Anweisung a2) {
    anweisung1 = a1;
    anweisung2 = a2;
  }

}


class Zuweisung extends Anweisung {

  String variable;
  Ausdruck ausdruck;

  Zuweisung(String s, Ausdruck a) {
    variable = s;
    ausdruck = a;
  }

}


class Ausgabe extends Anweisung {

  Ausdruck ausdruck;

  Ausgabe(Ausdruck a) {
    ausdruck = a;
  }

}
