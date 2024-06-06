// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.arrow.computeir.flatbuf;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class DecimalLiteral extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static DecimalLiteral getRootAsDecimalLiteral(ByteBuffer _bb) { return getRootAsDecimalLiteral(_bb, new DecimalLiteral()); }
  public static DecimalLiteral getRootAsDecimalLiteral(ByteBuffer _bb, DecimalLiteral obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public DecimalLiteral __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * Bytes of a Decimal value; bytes must be in little-endian order.
   */
  public byte value(int j) { int o = __offset(4); return o != 0 ? bb.get(__vector(o) + j * 1) : 0; }
  public int valueLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public ByteVector valueVector() { return valueVector(new ByteVector()); }
  public ByteVector valueVector(ByteVector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), bb) : null; }
  public ByteBuffer valueAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer valueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createDecimalLiteral(FlatBufferBuilder builder,
      int valueOffset) {
    builder.startTable(1);
    DecimalLiteral.addValue(builder, valueOffset);
    return DecimalLiteral.endDecimalLiteral(builder);
  }

  public static void startDecimalLiteral(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(0, valueOffset, 0); }
  public static int createValueVector(FlatBufferBuilder builder, byte[] data) { return builder.createByteVector(data); }
  public static int createValueVector(FlatBufferBuilder builder, ByteBuffer data) { return builder.createByteVector(data); }
  public static void startValueVector(FlatBufferBuilder builder, int numElems) { builder.startVector(1, numElems, 1); }
  public static int endDecimalLiteral(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // value
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public DecimalLiteral get(int j) { return get(new DecimalLiteral(), j); }
    public DecimalLiteral get(DecimalLiteral obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

