/*
 * Varalloc.java -- variable allocation
 */


package varalloc;

import absyn.*;
import table.*;

public class Varalloc {

  public static final int intByteSize = 4;
  public static final int boolByteSize = 4;
  public static final int refByteSize = 4;

  private Table globalTable;
  private boolean showVarAlloc;

  public Varalloc(Table t, boolean s) {
    globalTable = t;
    showVarAlloc = s;
  }

  public void allocVars(Absyn program) {
    /* compute access information for arguments of predefined procs */
    /* compute access information for arguments, parameters and local vars */
    /* compute outgoing area sizes */
    /* show variable allocation if requested */
  }

}
