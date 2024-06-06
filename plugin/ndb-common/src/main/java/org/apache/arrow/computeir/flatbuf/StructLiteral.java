// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.arrow.computeir.flatbuf;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class StructLiteral extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static StructLiteral getRootAsStructLiteral(ByteBuffer _bb) { return getRootAsStructLiteral(_bb, new StructLiteral()); }
  public static StructLiteral getRootAsStructLiteral(ByteBuffer _bb, StructLiteral obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public StructLiteral __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * Values for each struct field; the order must match the order of fields
   * in the `type` field of `Literal`.
   */
  public org.apache.arrow.computeir.flatbuf.Literal values(int j) { return values(new org.apache.arrow.computeir.flatbuf.Literal(), j); }
  public org.apache.arrow.computeir.flatbuf.Literal values(org.apache.arrow.computeir.flatbuf.Literal obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int valuesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public org.apache.arrow.computeir.flatbuf.Literal.Vector valuesVector() { return valuesVector(new org.apache.arrow.computeir.flatbuf.Literal.Vector()); }
  public org.apache.arrow.computeir.flatbuf.Literal.Vector valuesVector(org.apache.arrow.computeir.flatbuf.Literal.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createStructLiteral(FlatBufferBuilder builder,
      int valuesOffset) {
    builder.startTable(1);
    StructLiteral.addValues(builder, valuesOffset);
    return StructLiteral.endStructLiteral(builder);
  }

  public static void startStructLiteral(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addValues(FlatBufferBuilder builder, int valuesOffset) { builder.addOffset(0, valuesOffset, 0); }
  public static int createValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endStructLiteral(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // values
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public StructLiteral get(int j) { return get(new StructLiteral(), j); }
    public StructLiteral get(StructLiteral obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

