/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package zu.finagle.rpc;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.thrift.*;
import org.apache.thrift.async.*;
import org.apache.thrift.meta_data.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

// No additional import required for struct/union.

public class ZuRequestTransport implements TBase<ZuRequestTransport, ZuRequestTransport._Fields>, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ZuRequestTransport");

  private static final TField NAME_FIELD_DESC = new TField("name", TType.STRING, (short)1);
  private static final TField SHARDS_FIELD_DESC = new TField("shards", TType.LIST, (short)2);
  private static final TField DATA_FIELD_DESC = new TField("data", TType.STRING, (short)3);

  public String name;
  public List<Integer> shards;
  public ByteBuffer data;

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements TFieldIdEnum {
    NAME((short)1, "name"),
    SHARDS((short)2, "shards"),
    DATA((short)3, "data");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // NAME
          return NAME;
        case 2: // SHARDS
          return SHARDS;
        case 3: // DATA
          return DATA;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments

  public static final Map<_Fields, FieldMetaData> metaDataMap;
  static {
    Map<_Fields, FieldMetaData> tmpMap = new EnumMap<_Fields, FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.NAME, new FieldMetaData("name", TFieldRequirementType.REQUIRED, 
        new FieldValueMetaData(TType.STRING)));
    tmpMap.put(_Fields.SHARDS, new FieldMetaData("shards", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMap.put(_Fields.DATA, new FieldMetaData("data", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    FieldMetaData.addStructMetaDataMap(ZuRequestTransport.class, metaDataMap);
  }

  public ZuRequestTransport() {
  }

  public ZuRequestTransport(
    String name)
  {
    this();
    this.name = name;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ZuRequestTransport(ZuRequestTransport other) {
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetShards()) {
      List<Integer> __this__shards = new ArrayList<Integer>();
      for (Integer other_element : other.shards) {
        __this__shards.add(other_element);
      }
      this.shards = __this__shards;
    }
    if (other.isSetData()) {
      this.data = TBaseHelper.copyBinary(other.data);
;
    }
  }

  public ZuRequestTransport deepCopy() {
    return new ZuRequestTransport(this);
  }

  @Override
  public void clear() {
    this.name = null;
    this.shards = null;
    this.data = null;
  }

  public String getName() {
    return this.name;
  }

  public ZuRequestTransport setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been asigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public int getShardsSize() {
    return (this.shards == null) ? 0 : this.shards.size();
  }

  public java.util.Iterator<Integer> getShardsIterator() {
    return (this.shards == null) ? null : this.shards.iterator();
  }

  public void addToShards(int elem) {
    if (this.shards == null) {
      this.shards = new ArrayList<Integer>();
    }
    this.shards.add(elem);
  }

  public List<Integer> getShards() {
    return this.shards;
  }

  public ZuRequestTransport setShards(List<Integer> shards) {
    this.shards = shards;
    return this;
  }

  public void unsetShards() {
    this.shards = null;
  }

  /** Returns true if field shards is set (has been asigned a value) and false otherwise */
  public boolean isSetShards() {
    return this.shards != null;
  }

  public void setShardsIsSet(boolean value) {
    if (!value) {
      this.shards = null;
    }
  }

  public byte[] getData() {
    setData(TBaseHelper.rightSize(data));
    return data.array();
  }

  public ByteBuffer BufferForData() {
    return data;
  }

  public ZuRequestTransport setData(byte[] data) {
    setData(ByteBuffer.wrap(data));
    return this;
  }

  public ZuRequestTransport setData(ByteBuffer data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been asigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case SHARDS:
      if (value == null) {
        unsetShards();
      } else {
        setShards((List<Integer>)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((ByteBuffer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case NAME:
      return getName();

    case SHARDS:
      return getShards();

    case DATA:
      return getData();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been asigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case NAME:
      return isSetName();
    case SHARDS:
      return isSetShards();
    case DATA:
      return isSetData();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ZuRequestTransport)
      return this.equals((ZuRequestTransport)that);
    return false;
  }

  public boolean equals(ZuRequestTransport that) {
    if (that == null)
      return false;

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_shards = true && this.isSetShards();
    boolean that_present_shards = true && that.isSetShards();
    if (this_present_shards || that_present_shards) {
      if (!(this_present_shards && that_present_shards))
        return false;
      if (!this.shards.equals(that.shards))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(ZuRequestTransport other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    ZuRequestTransport typedOther = (ZuRequestTransport)other;

    lastComparison = Boolean.valueOf(isSetName()).compareTo(typedOther.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = TBaseHelper.compareTo(this.name, typedOther.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShards()).compareTo(typedOther.isSetShards());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShards()) {
      lastComparison = TBaseHelper.compareTo(this.shards, typedOther.shards);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(typedOther.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = TBaseHelper.compareTo(this.data, typedOther.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin();
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id) {
        case 1: // NAME
          if (field.type == TType.STRING) {
            this.name = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 2: // SHARDS
          if (field.type == TType.LIST) {
            {
              TList _list0 = iprot.readListBegin();
              this.shards = new ArrayList<Integer>(_list0.size);
              for (int _i1 = 0; _i1 < _list0.size; ++_i1)
              {
                int _elem2;
                _elem2 = iprot.readI32();
                this.shards.add(_elem2);
              }
              iprot.readListEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case 3: // DATA
          if (field.type == TType.STRING) {
            this.data = iprot.readBinary();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();

    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.name != null) {
      oprot.writeFieldBegin(NAME_FIELD_DESC);
      oprot.writeString(this.name);
      oprot.writeFieldEnd();
    }
    if (this.shards != null) {
      if (isSetShards()) {
        oprot.writeFieldBegin(SHARDS_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.shards.size()));
          for (int _iter3 : this.shards)
          {
            oprot.writeI32(_iter3);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.data != null) {
      if (isSetData()) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        oprot.writeBinary(this.data);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("ZuRequestTransport(");
    boolean first = true;

    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (isSetShards()) {
      if (!first) sb.append(", ");
      sb.append("shards:");
      if (this.shards == null) {
        sb.append("null");
      } else {
        sb.append(this.shards);
      }
      first = false;
    }
    if (isSetData()) {
      if (!first) sb.append(", ");
      sb.append("data:");
      if (this.data == null) {
        sb.append("null");
      } else {
        TBaseHelper.toString(this.data, sb);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    if (name == null) {
      throw new TProtocolException("Required field 'name' was not present! Struct: " + toString());
    }
  }

}

