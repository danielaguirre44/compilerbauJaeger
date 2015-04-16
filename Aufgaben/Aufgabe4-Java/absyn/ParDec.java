/*
 * ParDec.java -- abstract syntax for parameter declaration
 */


package absyn;

import sym.Sym;


public class ParDec extends Dec {

  public Sym name;
  public Ty ty;
  public boolean isRef;

  public ParDec(int r, int c, Sym n, Ty t, boolean i) {
    row = r;
    col = c;
    name = n;
    ty = t;
    isRef = i;
  }

  public void show(int n) {
    indent(n);
    say("ParDec(\n");
    indent(n + 1);
    say(name.toString());
    say(",\n");
    ty.show(n + 1);
    say(",\n");
    indent(n + 1);
    sayBoolean(isRef);
    say(")");
  }

}
