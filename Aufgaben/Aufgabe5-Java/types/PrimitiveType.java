/*
 * PrimitiveType.java -- primitive type representation
 */


package types;


public class PrimitiveType extends Type {

  public String printName;

  public PrimitiveType(String p) {
    printName = p;
  }

  public void show() {
    System.out.print(printName);
  }

}
