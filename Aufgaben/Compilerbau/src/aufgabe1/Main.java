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
		return new Folge(new Zuweisung("x", new Summe(new Literal(5),
				new Literal(3))), new Folge(new Ausgabe(new Variable("x")),
				new Folge(new Zuweisung("y", new Differenz(new Produkt(
						new Literal(7), new Variable("x")), new Literal(2))),
						new Ausgabe(new Quotient(new Variable("y"),
								new Literal(2))))));
	}

	static void zeige(Anweisung anweisung) {
		if (anweisung instanceof Folge) {

			System.out.println("Folge(");
			zeige(((Folge) anweisung).anweisung1);
			zeige(((Folge) anweisung).anweisung2);
			System.out.print(")");

		} else if (anweisung instanceof Zuweisung) {

			System.out.println("Zuweisung(");
			System.out.println("\"" + ((Zuweisung) anweisung).variable + "\",");
			zeige(((Zuweisung) anweisung).ausdruck);
			System.out.print(")");

		} else if (anweisung instanceof Ausgabe) {

			System.out.println("Ausgabe(");
			zeige(((Ausgabe) anweisung).ausdruck);
			System.out.print(")");
		}
	}

	static void zeige(Ausdruck ausdruck) {
	}

	static void interpretiere(Anweisung anweisung) {
		/******************************/
		/* Das muessen Sie schreiben! Arschwasser */
		/******************************/
		System.out.print("Hier sollte die Ausgabe des von Ihnen ");
		System.out.print("programmierten Interpreters stehen!");
	}

}
