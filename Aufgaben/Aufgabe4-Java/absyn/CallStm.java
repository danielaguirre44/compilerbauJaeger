/*
 * CallStm.java -- abstract syntax for call statement
 */


package absyn;

import sym.Sym;


public class CallStm extends Stm {

  public Sym name;
  public ExpList args;

  public CallStm(int r, int c, Sym n, ExpList a) {
    row = r;
    col = c;
    name = n;
    args = a;
  }

  public void show(int n) {
    indent(n);
    say("CallStm(\n");
    indent(n + 1);
    say(name.toString());
    say(",\n");
    args.show(n + 1);
    say(")");
  }

}
