// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.arrow.computeir.flatbuf;

/**
 * A union of possible dereference operations
 */
public final class Deref {
  private Deref() { }
  public static final byte NONE = 0;
  /**
   * Access a value for a given map key
   */
  public static final byte MapKey = 1;
  /**
   * Access the value at a struct field
   */
  public static final byte StructField = 2;
  /**
   * Access the element at a given index in an array
   */
  public static final byte ArraySubscript = 3;
  /**
   * Access a range of elements in an array
   */
  public static final byte ArraySlice = 4;
  /**
   * Access a field of a relation
   */
  public static final byte FieldIndex = 5;

  public static final String[] names = { "NONE", "MapKey", "StructField", "ArraySubscript", "ArraySlice", "FieldIndex", };

  public static String name(int e) { return names[e]; }
}

