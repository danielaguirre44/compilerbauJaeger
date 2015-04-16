/*
 * ProcEntry.java -- table entry for a procedure
 */


package table;

import types.*;


public class ProcEntry extends Entry {

  public ParamTypeList paramTypes;
  public Table localTable;

  public ProcEntry(ParamTypeList p, Table t) {
    paramTypes = p;
    localTable = t;
  }

  public void show() {
    System.out.print("proc: ");
    paramTypes.show();
  }

}
