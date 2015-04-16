/*
 * Tabelle.java -- Variablentabelle
 */
package aufgabe1;

class Tabelle {

	private String[] key;
	private int[] value;

	/*
	 * Erzeugt eine leere Tabelle.
	 */
	Tabelle() {
		key = new String[0];
		value = new int[0];
	}

	/*
	 * Erzeugt eine geaenderte Tabelle.
	 */
	Tabelle(String n, int w, Tabelle t) {
		int i = 0;
		key = new String[t.key.length + 1];
		value = new int[t.value.length + 1];
		for (; i < t.key.length; i++) {
			key[i] = t.key[i];
			value[i] = t.value[i];
		}
		key[i] = n;
		value[i] = w;

	}

	/*
	 * Sucht den Wert einer Variablen in der Tabelle und gibt ihn zurueck
	 * (Fehlerabbruch, falls nicht gefunden).
	 */
	int sucheWert(String n) {
		int i = 0;
		for (String s : key) {
			if (s.equals(n)) {
				return value[i];
			}
			i++;
		}
		throw new IllegalArgumentException("Wert nicht gefunden!");
	}

}
