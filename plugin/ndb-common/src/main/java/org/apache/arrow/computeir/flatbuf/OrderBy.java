// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.arrow.computeir.flatbuf;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * Order by relation
 */
@SuppressWarnings("unused")
public final class OrderBy extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static OrderBy getRootAsOrderBy(ByteBuffer _bb) { return getRootAsOrderBy(_bb, new OrderBy()); }
  public static OrderBy getRootAsOrderBy(ByteBuffer _bb, OrderBy obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public OrderBy __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * An identifiier for the relation. The identifier should be unique over the
   * entire plan. Optional.
   */
  public org.apache.arrow.computeir.flatbuf.RelId id() { return id(new org.apache.arrow.computeir.flatbuf.RelId()); }
  public org.apache.arrow.computeir.flatbuf.RelId id(org.apache.arrow.computeir.flatbuf.RelId obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * Child relation
   */
  public org.apache.arrow.computeir.flatbuf.Relation rel() { return rel(new org.apache.arrow.computeir.flatbuf.Relation()); }
  public org.apache.arrow.computeir.flatbuf.Relation rel(org.apache.arrow.computeir.flatbuf.Relation obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  /**
   * Define sort order for rows of output.
   * Keys with higher precedence are ordered ahead of other keys.
   */
  public org.apache.arrow.computeir.flatbuf.SortKey keys(int j) { return keys(new org.apache.arrow.computeir.flatbuf.SortKey(), j); }
  public org.apache.arrow.computeir.flatbuf.SortKey keys(org.apache.arrow.computeir.flatbuf.SortKey obj, int j) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int keysLength() { int o = __offset(8); return o != 0 ? __vector_len(o) : 0; }
  public org.apache.arrow.computeir.flatbuf.SortKey.Vector keysVector() { return keysVector(new org.apache.arrow.computeir.flatbuf.SortKey.Vector()); }
  public org.apache.arrow.computeir.flatbuf.SortKey.Vector keysVector(org.apache.arrow.computeir.flatbuf.SortKey.Vector obj) { int o = __offset(8); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createOrderBy(FlatBufferBuilder builder,
      int idOffset,
      int relOffset,
      int keysOffset) {
    builder.startTable(3);
    OrderBy.addKeys(builder, keysOffset);
    OrderBy.addRel(builder, relOffset);
    OrderBy.addId(builder, idOffset);
    return OrderBy.endOrderBy(builder);
  }

  public static void startOrderBy(FlatBufferBuilder builder) { builder.startTable(3); }
  public static void addId(FlatBufferBuilder builder, int idOffset) { builder.addOffset(0, idOffset, 0); }
  public static void addRel(FlatBufferBuilder builder, int relOffset) { builder.addOffset(1, relOffset, 0); }
  public static void addKeys(FlatBufferBuilder builder, int keysOffset) { builder.addOffset(2, keysOffset, 0); }
  public static int createKeysVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startKeysVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endOrderBy(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 6);  // rel
    builder.required(o, 8);  // keys
    return o;
  }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public OrderBy get(int j) { return get(new OrderBy(), j); }
    public OrderBy get(OrderBy obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

