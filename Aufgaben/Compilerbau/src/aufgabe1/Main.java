/*
 * Main.java -- Hauptprogramm
 */
package aufgabe1;

class Main {

	// private static Map<String, Integer> variablen = new HashMap<String,
	// Integer>();
	private static Tabelle t = new Tabelle();

	public static void main(String[] args) {
		Anweisung programm = konstrProgramm();
		zeige(programm);
		System.out.println();
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
			System.out.println(",");
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
		if (ausdruck instanceof Literal) {
			System.out.print("Literal(" + ((Literal) ausdruck).wert + ")");
		} else if (ausdruck instanceof Variable) {
			System.out
					.print("Variable(\"" + ((Variable) ausdruck).name + "\")");
		} else if (ausdruck instanceof Summe) {
			Summe s = (Summe) ausdruck;
			System.out.println("Summe(");
			zeige(s.ausdruck1);
			System.out.println(",");
			zeige(s.ausdruck2);
			System.out.print(")");
		} else if (ausdruck instanceof Differenz) {
			Differenz s = (Differenz) ausdruck;
			System.out.println("Differenz(");
			zeige(s.ausdruck1);
			System.out.println(",");
			zeige(s.ausdruck2);
			System.out.print(")");
		} else if (ausdruck instanceof Produkt) {
			Produkt s = (Produkt) ausdruck;
			System.out.println("Produkt(");
			zeige(s.ausdruck1);
			System.out.println(",");
			zeige(s.ausdruck2);
			System.out.print(")");
		} else if (ausdruck instanceof Quotient) {
			Quotient s = (Quotient) ausdruck;
			System.out.println("Quotient(");
			zeige(s.ausdruck1);
			System.out.println(",");
			zeige(s.ausdruck2);
			System.out.print(")");

		}
	}

	static void interpretiere(Anweisung anweisung) {
		if (anweisung instanceof Folge) {

			interpretiere(((Folge) anweisung).anweisung1);

			interpretiere(((Folge) anweisung).anweisung2);

		} else if (anweisung instanceof Zuweisung) {

			t = new Tabelle(((Zuweisung) anweisung).variable,
					interpretiere(((Zuweisung) anweisung).ausdruck), t);

		} else if (anweisung instanceof Ausgabe) {
			System.out.print(interpretiere(((Ausgabe) anweisung).ausdruck)
					+ "\t");
		}
	}

	static int interpretiere(Ausdruck ausdruck) {
		if (ausdruck instanceof Literal) {
			return ((Literal) ausdruck).wert;
		} else if (ausdruck instanceof Variable) {
			return t.sucheWert(((Variable) ausdruck).name);
		} else if (ausdruck instanceof Summe) {
			Summe s = (Summe) ausdruck;
			return interpretiere(s.ausdruck1) + interpretiere(s.ausdruck2);
		} else if (ausdruck instanceof Differenz) {
			Differenz s = (Differenz) ausdruck;
			return interpretiere(s.ausdruck1) - interpretiere(s.ausdruck2);
		} else if (ausdruck instanceof Produkt) {
			Produkt s = (Produkt) ausdruck;
			return interpretiere(s.ausdruck1) * interpretiere(s.ausdruck2);
		} else if (ausdruck instanceof Quotient) {
			Quotient s = (Quotient) ausdruck;
			int i = interpretiere(s.ausdruck2);
			if (i == 0)
				throw new IllegalArgumentException(
						"Nur Chuck Norris kann durch 0 teilen!!!!!!!");
			return interpretiere(s.ausdruck1) / i;

		}
		throw new IllegalArgumentException(
				"Ausdruck konnte nicht zugeordnet werden!");
	}
}
