// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.arrow.computeir.flatbuf;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class StringLiteral extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static StringLiteral getRootAsStringLiteral(ByteBuffer _bb) { return getRootAsStringLiteral(_bb, new StringLiteral()); }
  public static StringLiteral getRootAsStringLiteral(ByteBuffer _bb, StringLiteral obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public StringLiteral __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public String value() { int o = __offset(4); return o != 0 ? __string(o + bb_pos) : null; }
  public ByteBuffer valueAsByteBuffer() { return __vector_as_bytebuffer(4, 1); }
  public ByteBuffer valueInByteBuffer(ByteBuffer _bb) { return __vector_in_bytebuffer(_bb, 4, 1); }

  public static int createStringLiteral(FlatBufferBuilder builder,
      int valueOffset) {
    builder.startTable(1);
    StringLiteral.addValue(builder, valueOffset);
    return StringLiteral.endStringLiteral(builder);
  }

  public static void startStringLiteral(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addValue(FlatBufferBuilder builder, int valueOffset) { builder.addOffset(0, valueOffset, 0); }
  public static int endStringLiteral(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // value
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public StringLiteral get(int j) { return get(new StringLiteral(), j); }
    public StringLiteral get(StringLiteral obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

