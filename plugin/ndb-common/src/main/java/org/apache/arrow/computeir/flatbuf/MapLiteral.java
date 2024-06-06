// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.arrow.computeir.flatbuf;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class MapLiteral extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static MapLiteral getRootAsMapLiteral(ByteBuffer _bb) { return getRootAsMapLiteral(_bb, new MapLiteral()); }
  public static MapLiteral getRootAsMapLiteral(ByteBuffer _bb, MapLiteral obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public MapLiteral __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public org.apache.arrow.computeir.flatbuf.KeyValue values(int j) { return values(new org.apache.arrow.computeir.flatbuf.KeyValue(), j); }
  public org.apache.arrow.computeir.flatbuf.KeyValue values(org.apache.arrow.computeir.flatbuf.KeyValue obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int valuesLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public org.apache.arrow.computeir.flatbuf.KeyValue.Vector valuesVector() { return valuesVector(new org.apache.arrow.computeir.flatbuf.KeyValue.Vector()); }
  public org.apache.arrow.computeir.flatbuf.KeyValue.Vector valuesVector(org.apache.arrow.computeir.flatbuf.KeyValue.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createMapLiteral(FlatBufferBuilder builder,
      int valuesOffset) {
    builder.startTable(1);
    MapLiteral.addValues(builder, valuesOffset);
    return MapLiteral.endMapLiteral(builder);
  }

  public static void startMapLiteral(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addValues(FlatBufferBuilder builder, int valuesOffset) { builder.addOffset(0, valuesOffset, 0); }
  public static int createValuesVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startValuesVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endMapLiteral(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // values
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public MapLiteral get(int j) { return get(new MapLiteral(), j); }
    public MapLiteral get(MapLiteral obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

