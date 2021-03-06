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

public class PasswordChange implements org.apache.thrift.TBase<PasswordChange, PasswordChange._Fields>, java.io.Serializable, Cloneable, Comparable<PasswordChange> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PasswordChange");

  private static final org.apache.thrift.protocol.TField OLD_PASS_FIELD_DESC = new org.apache.thrift.protocol.TField("oldPass", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField NEW_PASS_FIELD_DESC = new org.apache.thrift.protocol.TField("newPass", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PasswordChangeStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PasswordChangeTupleSchemeFactory());
  }

  public String oldPass; // required
  public String newPass; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    OLD_PASS((short)1, "oldPass"),
    NEW_PASS((short)2, "newPass");

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
        case 1: // OLD_PASS
          return OLD_PASS;
        case 2: // NEW_PASS
          return NEW_PASS;
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
    tmpMap.put(_Fields.OLD_PASS, new org.apache.thrift.meta_data.FieldMetaData("oldPass", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NEW_PASS, new org.apache.thrift.meta_data.FieldMetaData("newPass", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PasswordChange.class, metaDataMap);
  }

  public PasswordChange() {
  }

  public PasswordChange(
    String oldPass,
    String newPass)
  {
    this();
    this.oldPass = oldPass;
    this.newPass = newPass;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PasswordChange(PasswordChange other) {
    if (other.isSetOldPass()) {
      this.oldPass = other.oldPass;
    }
    if (other.isSetNewPass()) {
      this.newPass = other.newPass;
    }
  }

  public PasswordChange deepCopy() {
    return new PasswordChange(this);
  }

  @Override
  public void clear() {
    this.oldPass = null;
    this.newPass = null;
  }

  public String getOldPass() {
    return this.oldPass;
  }

  public PasswordChange setOldPass(String oldPass) {
    this.oldPass = oldPass;
    return this;
  }

  public void unsetOldPass() {
    this.oldPass = null;
  }

  /** Returns true if field oldPass is set (has been assigned a value) and false otherwise */
  public boolean isSetOldPass() {
    return this.oldPass != null;
  }

  public void setOldPassIsSet(boolean value) {
    if (!value) {
      this.oldPass = null;
    }
  }

  public String getNewPass() {
    return this.newPass;
  }

  public PasswordChange setNewPass(String newPass) {
    this.newPass = newPass;
    return this;
  }

  public void unsetNewPass() {
    this.newPass = null;
  }

  /** Returns true if field newPass is set (has been assigned a value) and false otherwise */
  public boolean isSetNewPass() {
    return this.newPass != null;
  }

  public void setNewPassIsSet(boolean value) {
    if (!value) {
      this.newPass = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case OLD_PASS:
      if (value == null) {
        unsetOldPass();
      } else {
        setOldPass((String)value);
      }
      break;

    case NEW_PASS:
      if (value == null) {
        unsetNewPass();
      } else {
        setNewPass((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case OLD_PASS:
      return getOldPass();

    case NEW_PASS:
      return getNewPass();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case OLD_PASS:
      return isSetOldPass();
    case NEW_PASS:
      return isSetNewPass();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PasswordChange)
      return this.equals((PasswordChange)that);
    return false;
  }

  public boolean equals(PasswordChange that) {
    if (that == null)
      return false;

    boolean this_present_oldPass = true && this.isSetOldPass();
    boolean that_present_oldPass = true && that.isSetOldPass();
    if (this_present_oldPass || that_present_oldPass) {
      if (!(this_present_oldPass && that_present_oldPass))
        return false;
      if (!this.oldPass.equals(that.oldPass))
        return false;
    }

    boolean this_present_newPass = true && this.isSetNewPass();
    boolean that_present_newPass = true && that.isSetNewPass();
    if (this_present_newPass || that_present_newPass) {
      if (!(this_present_newPass && that_present_newPass))
        return false;
      if (!this.newPass.equals(that.newPass))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(PasswordChange other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetOldPass()).compareTo(other.isSetOldPass());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldPass()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldPass, other.oldPass);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewPass()).compareTo(other.isSetNewPass());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewPass()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newPass, other.newPass);
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
    StringBuilder sb = new StringBuilder("PasswordChange(");
    boolean first = true;

    sb.append("oldPass:");
    if (this.oldPass == null) {
      sb.append("null");
    } else {
      sb.append(this.oldPass);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("newPass:");
    if (this.newPass == null) {
      sb.append("null");
    } else {
      sb.append(this.newPass);
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

  private static class PasswordChangeStandardSchemeFactory implements SchemeFactory {
    public PasswordChangeStandardScheme getScheme() {
      return new PasswordChangeStandardScheme();
    }
  }

  private static class PasswordChangeStandardScheme extends StandardScheme<PasswordChange> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PasswordChange struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // OLD_PASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.oldPass = iprot.readString();
              struct.setOldPassIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // NEW_PASS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.newPass = iprot.readString();
              struct.setNewPassIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PasswordChange struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.oldPass != null) {
        oprot.writeFieldBegin(OLD_PASS_FIELD_DESC);
        oprot.writeString(struct.oldPass);
        oprot.writeFieldEnd();
      }
      if (struct.newPass != null) {
        oprot.writeFieldBegin(NEW_PASS_FIELD_DESC);
        oprot.writeString(struct.newPass);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PasswordChangeTupleSchemeFactory implements SchemeFactory {
    public PasswordChangeTupleScheme getScheme() {
      return new PasswordChangeTupleScheme();
    }
  }

  private static class PasswordChangeTupleScheme extends TupleScheme<PasswordChange> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PasswordChange struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetOldPass()) {
        optionals.set(0);
      }
      if (struct.isSetNewPass()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetOldPass()) {
        oprot.writeString(struct.oldPass);
      }
      if (struct.isSetNewPass()) {
        oprot.writeString(struct.newPass);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PasswordChange struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.oldPass = iprot.readString();
        struct.setOldPassIsSet(true);
      }
      if (incoming.get(1)) {
        struct.newPass = iprot.readString();
        struct.setNewPassIsSet(true);
      }
    }
  }

}

