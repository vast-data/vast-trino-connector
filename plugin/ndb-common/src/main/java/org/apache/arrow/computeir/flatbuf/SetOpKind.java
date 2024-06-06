// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.arrow.computeir.flatbuf;

/**
 * The kind of set operation being performed.
 */
public final class SetOpKind {
  private SetOpKind() { }
  public static final int Union = 0;
  public static final int Intersection = 1;
  public static final int Difference = 2;

  public static final String[] names = { "Union", "Intersection", "Difference", };

  public static String name(int e) { return names[e]; }
}

