/*
 * Main.java -- Hauptprogramm
 */
package aufgabe1;

class Main {

  public static void main(String[] args) {
    Anweisung programm = konstrProgramm();
    zeige(programm);
    System.out.println();
    interpretiere(programm);
    System.out.println();
  }

  static Anweisung konstrProgramm() {
    return
      new Folge(
        new Zuweisung(
          "x",
          new Summe(
            new Literal(5),
            new Literal(3))),
        new Folge(
          new Ausgabe(
            new Variable("x")),
          new Folge(
            new Zuweisung(
              "y",
              new Differenz(
                new Produkt(
                  new Literal(7),
                  new Variable("x")),
                new Literal(2))),
            new Ausgabe(
              new Quotient(
                new Variable("y"),
                new Literal(2))))));
  }

  static void zeige(Anweisung anweisung) {
    /******************************/
    /* Das muessen Sie schreiben! 
	  askfdnjasmfkasmkdmsakdmlasdka
    */
    System.out.print("Hier sollte die von Ihnen programmierte ");
    System.out.print("Ausgabe des Programmbaumes stehen!");
  }

  static void interpretiere(Anweisung anweisung) {
    /******************************/
    /* Das muessen Sie schreiben! */
    /******************************/
    System.out.print("Hier sollte die Ausgabe des von Ihnen ");
    System.out.print("programmierten Interpreters stehen!");
  }

}
