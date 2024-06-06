// automatically generated by the FlatBuffers compiler, do not modify

package org.apache.arrow.computeir.flatbuf;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

/**
 * A specification of a query.
 */
@SuppressWarnings("unused")
public final class Plan extends Table {
  public static void ValidateVersion() { Constants.FLATBUFFERS_2_0_0(); }
  public static Plan getRootAsPlan(ByteBuffer _bb) { return getRootAsPlan(_bb, new Plan()); }
  public static Plan getRootAsPlan(ByteBuffer _bb, Plan obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { __reset(_i, _bb); }
  public Plan __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  /**
   * One or more output relations.
   */
  public org.apache.arrow.computeir.flatbuf.Relation sinks(int j) { return sinks(new org.apache.arrow.computeir.flatbuf.Relation(), j); }
  public org.apache.arrow.computeir.flatbuf.Relation sinks(org.apache.arrow.computeir.flatbuf.Relation obj, int j) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(__vector(o) + j * 4), bb) : null; }
  public int sinksLength() { int o = __offset(4); return o != 0 ? __vector_len(o) : 0; }
  public org.apache.arrow.computeir.flatbuf.Relation.Vector sinksVector() { return sinksVector(new org.apache.arrow.computeir.flatbuf.Relation.Vector()); }
  public org.apache.arrow.computeir.flatbuf.Relation.Vector sinksVector(org.apache.arrow.computeir.flatbuf.Relation.Vector obj) { int o = __offset(4); return o != 0 ? obj.__assign(__vector(o), 4, bb) : null; }

  public static int createPlan(FlatBufferBuilder builder,
      int sinksOffset) {
    builder.startTable(1);
    Plan.addSinks(builder, sinksOffset);
    return Plan.endPlan(builder);
  }

  public static void startPlan(FlatBufferBuilder builder) { builder.startTable(1); }
  public static void addSinks(FlatBufferBuilder builder, int sinksOffset) { builder.addOffset(0, sinksOffset, 0); }
  public static int createSinksVector(FlatBufferBuilder builder, int[] data) { builder.startVector(4, data.length, 4); for (int i = data.length - 1; i >= 0; i--) builder.addOffset(data[i]); return builder.endVector(); }
  public static void startSinksVector(FlatBufferBuilder builder, int numElems) { builder.startVector(4, numElems, 4); }
  public static int endPlan(FlatBufferBuilder builder) {
    int o = builder.endTable();
    builder.required(o, 4);  // sinks
    return o;
  }
  public static void finishPlanBuffer(FlatBufferBuilder builder, int offset) { builder.finish(offset); }
  public static void finishSizePrefixedPlanBuffer(FlatBufferBuilder builder, int offset) { builder.finishSizePrefixed(offset); }

  public static final class Vector extends BaseVector {
    public Vector __assign(int _vector, int _element_size, ByteBuffer _bb) { __reset(_vector, _element_size, _bb); return this; }

    public Plan get(int j) { return get(new Plan(), j); }
    public Plan get(Plan obj, int j) {  return obj.__assign(__indirect(__element(j), bb), bb); }
  }
}

