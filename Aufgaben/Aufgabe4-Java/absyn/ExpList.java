/*
 * ExpList.java -- abstract syntax for a list of expressions
 */


package absyn;

import sym.Sym;


public class ExpList extends Absyn {

  public boolean isEmpty;
  public Exp head;
  public ExpList tail;

  public ExpList() {
    row = -1;
    col = -1;
    isEmpty = true;
  }

  public ExpList(Exp h, ExpList t) {
    row = -1;
    col = -1;
    isEmpty = false;
    head = h;
    tail = t;
  }

  public void show(int n) {
    indent(n);
    ExpList list = this;
    say("ExpList(");
    while (!list.isEmpty) {
      say("\n");
      list.head.show(n + 1);
      list = list.tail;
      if (!list.isEmpty) {
        say(",");
      }
    }
    say(")");
  }

}
