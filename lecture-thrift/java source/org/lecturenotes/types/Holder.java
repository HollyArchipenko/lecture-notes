/**
 * Autogenerated by Thrift Compiler (0.9.1)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.lecturenotes.types;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
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

public class Holder implements org.apache.thrift.TBase<Holder, Holder._Fields>, java.io.Serializable, Cloneable, Comparable<Holder> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Holder");

  private static final org.apache.thrift.protocol.TField HOLDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("holderId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("name", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField ORGANIZATION_BELONGS_FIELD_DESC = new org.apache.thrift.protocol.TField("organizationBelongs", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new HolderStandardSchemeFactory());
    schemes.put(TupleScheme.class, new HolderTupleSchemeFactory());
  }

  public String holderId; // required
  public String title; // required
  public String name; // required
  public String organizationBelongs; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    HOLDER_ID((short)1, "holderId"),
    TITLE((short)2, "title"),
    NAME((short)3, "name"),
    ORGANIZATION_BELONGS((short)4, "organizationBelongs");

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
        case 1: // HOLDER_ID
          return HOLDER_ID;
        case 2: // TITLE
          return TITLE;
        case 3: // NAME
          return NAME;
        case 4: // ORGANIZATION_BELONGS
          return ORGANIZATION_BELONGS;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.HOLDER_ID, new org.apache.thrift.meta_data.FieldMetaData("holderId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NAME, new org.apache.thrift.meta_data.FieldMetaData("name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.ORGANIZATION_BELONGS, new org.apache.thrift.meta_data.FieldMetaData("organizationBelongs", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Holder.class, metaDataMap);
  }

  public Holder() {
  }

  public Holder(
    String holderId,
    String title,
    String name,
    String organizationBelongs)
  {
    this();
    this.holderId = holderId;
    this.title = title;
    this.name = name;
    this.organizationBelongs = organizationBelongs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Holder(Holder other) {
    if (other.isSetHolderId()) {
      this.holderId = other.holderId;
    }
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetName()) {
      this.name = other.name;
    }
    if (other.isSetOrganizationBelongs()) {
      this.organizationBelongs = other.organizationBelongs;
    }
  }

  public Holder deepCopy() {
    return new Holder(this);
  }

  @Override
  public void clear() {
    this.holderId = null;
    this.title = null;
    this.name = null;
    this.organizationBelongs = null;
  }

  public String getHolderId() {
    return this.holderId;
  }

  public Holder setHolderId(String holderId) {
    this.holderId = holderId;
    return this;
  }

  public void unsetHolderId() {
    this.holderId = null;
  }

  /** Returns true if field holderId is set (has been assigned a value) and false otherwise */
  public boolean isSetHolderId() {
    return this.holderId != null;
  }

  public void setHolderIdIsSet(boolean value) {
    if (!value) {
      this.holderId = null;
    }
  }

  public String getTitle() {
    return this.title;
  }

  public Holder setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getName() {
    return this.name;
  }

  public Holder setName(String name) {
    this.name = name;
    return this;
  }

  public void unsetName() {
    this.name = null;
  }

  /** Returns true if field name is set (has been assigned a value) and false otherwise */
  public boolean isSetName() {
    return this.name != null;
  }

  public void setNameIsSet(boolean value) {
    if (!value) {
      this.name = null;
    }
  }

  public String getOrganizationBelongs() {
    return this.organizationBelongs;
  }

  public Holder setOrganizationBelongs(String organizationBelongs) {
    this.organizationBelongs = organizationBelongs;
    return this;
  }

  public void unsetOrganizationBelongs() {
    this.organizationBelongs = null;
  }

  /** Returns true if field organizationBelongs is set (has been assigned a value) and false otherwise */
  public boolean isSetOrganizationBelongs() {
    return this.organizationBelongs != null;
  }

  public void setOrganizationBelongsIsSet(boolean value) {
    if (!value) {
      this.organizationBelongs = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case HOLDER_ID:
      if (value == null) {
        unsetHolderId();
      } else {
        setHolderId((String)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case NAME:
      if (value == null) {
        unsetName();
      } else {
        setName((String)value);
      }
      break;

    case ORGANIZATION_BELONGS:
      if (value == null) {
        unsetOrganizationBelongs();
      } else {
        setOrganizationBelongs((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case HOLDER_ID:
      return getHolderId();

    case TITLE:
      return getTitle();

    case NAME:
      return getName();

    case ORGANIZATION_BELONGS:
      return getOrganizationBelongs();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case HOLDER_ID:
      return isSetHolderId();
    case TITLE:
      return isSetTitle();
    case NAME:
      return isSetName();
    case ORGANIZATION_BELONGS:
      return isSetOrganizationBelongs();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Holder)
      return this.equals((Holder)that);
    return false;
  }

  public boolean equals(Holder that) {
    if (that == null)
      return false;

    boolean this_present_holderId = true && this.isSetHolderId();
    boolean that_present_holderId = true && that.isSetHolderId();
    if (this_present_holderId || that_present_holderId) {
      if (!(this_present_holderId && that_present_holderId))
        return false;
      if (!this.holderId.equals(that.holderId))
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_name = true && this.isSetName();
    boolean that_present_name = true && that.isSetName();
    if (this_present_name || that_present_name) {
      if (!(this_present_name && that_present_name))
        return false;
      if (!this.name.equals(that.name))
        return false;
    }

    boolean this_present_organizationBelongs = true && this.isSetOrganizationBelongs();
    boolean that_present_organizationBelongs = true && that.isSetOrganizationBelongs();
    if (this_present_organizationBelongs || that_present_organizationBelongs) {
      if (!(this_present_organizationBelongs && that_present_organizationBelongs))
        return false;
      if (!this.organizationBelongs.equals(that.organizationBelongs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Holder other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetHolderId()).compareTo(other.isSetHolderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHolderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.holderId, other.holderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetName()).compareTo(other.isSetName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.name, other.name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOrganizationBelongs()).compareTo(other.isSetOrganizationBelongs());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOrganizationBelongs()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.organizationBelongs, other.organizationBelongs);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("Holder(");
    boolean first = true;

    sb.append("holderId:");
    if (this.holderId == null) {
      sb.append("null");
    } else {
      sb.append(this.holderId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("name:");
    if (this.name == null) {
      sb.append("null");
    } else {
      sb.append(this.name);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("organizationBelongs:");
    if (this.organizationBelongs == null) {
      sb.append("null");
    } else {
      sb.append(this.organizationBelongs);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class HolderStandardSchemeFactory implements SchemeFactory {
    public HolderStandardScheme getScheme() {
      return new HolderStandardScheme();
    }
  }

  private static class HolderStandardScheme extends StandardScheme<Holder> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Holder struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // HOLDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.holderId = iprot.readString();
              struct.setHolderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.name = iprot.readString();
              struct.setNameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // ORGANIZATION_BELONGS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.organizationBelongs = iprot.readString();
              struct.setOrganizationBelongsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Holder struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.holderId != null) {
        oprot.writeFieldBegin(HOLDER_ID_FIELD_DESC);
        oprot.writeString(struct.holderId);
        oprot.writeFieldEnd();
      }
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.name != null) {
        oprot.writeFieldBegin(NAME_FIELD_DESC);
        oprot.writeString(struct.name);
        oprot.writeFieldEnd();
      }
      if (struct.organizationBelongs != null) {
        oprot.writeFieldBegin(ORGANIZATION_BELONGS_FIELD_DESC);
        oprot.writeString(struct.organizationBelongs);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class HolderTupleSchemeFactory implements SchemeFactory {
    public HolderTupleScheme getScheme() {
      return new HolderTupleScheme();
    }
  }

  private static class HolderTupleScheme extends TupleScheme<Holder> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Holder struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetHolderId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetName()) {
        optionals.set(2);
      }
      if (struct.isSetOrganizationBelongs()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetHolderId()) {
        oprot.writeString(struct.holderId);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetName()) {
        oprot.writeString(struct.name);
      }
      if (struct.isSetOrganizationBelongs()) {
        oprot.writeString(struct.organizationBelongs);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Holder struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.holderId = iprot.readString();
        struct.setHolderIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.name = iprot.readString();
        struct.setNameIsSet(true);
      }
      if (incoming.get(3)) {
        struct.organizationBelongs = iprot.readString();
        struct.setOrganizationBelongsIsSet(true);
      }
    }
  }

}

