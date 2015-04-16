/*
 * Semant.java -- semantic checks
 */


package semant;

import absyn.*;
import sym.Sym;
import table.*;
import types.*;


public class Semant {

  private boolean showTables;

  public Semant(boolean s) {
    showTables = s;
  }

  public Table check(Absyn program) {
    /* generate built-in types */
    /* setup global symbol table */
    Table globalTable = ??;
    /* do semantic checks in 2 passes */
    /* check if "main()" is present */
    /* return global symbol table */
    return globalTable;
  }

}
