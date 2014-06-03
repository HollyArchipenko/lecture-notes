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

public class ChangeUser implements org.apache.thrift.TBase<ChangeUser, ChangeUser._Fields>, java.io.Serializable, Cloneable, Comparable<ChangeUser> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("ChangeUser");

  private static final org.apache.thrift.protocol.TField USER_EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("userEmail", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("password", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new ChangeUserStandardSchemeFactory());
    schemes.put(TupleScheme.class, new ChangeUserTupleSchemeFactory());
  }

  public String userEmail; // optional
  public PasswordChange password; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_EMAIL((short)1, "userEmail"),
    PASSWORD((short)2, "password");

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
        case 1: // USER_EMAIL
          return USER_EMAIL;
        case 2: // PASSWORD
          return PASSWORD;
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
  private _Fields optionals[] = {_Fields.USER_EMAIL,_Fields.PASSWORD};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_EMAIL, new org.apache.thrift.meta_data.FieldMetaData("userEmail", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("password", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PasswordChange.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(ChangeUser.class, metaDataMap);
  }

  public ChangeUser() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ChangeUser(ChangeUser other) {
    if (other.isSetUserEmail()) {
      this.userEmail = other.userEmail;
    }
    if (other.isSetPassword()) {
      this.password = new PasswordChange(other.password);
    }
  }

  public ChangeUser deepCopy() {
    return new ChangeUser(this);
  }

  @Override
  public void clear() {
    this.userEmail = null;
    this.password = null;
  }

  public String getUserEmail() {
    return this.userEmail;
  }

  public ChangeUser setUserEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }

  public void unsetUserEmail() {
    this.userEmail = null;
  }

  /** Returns true if field userEmail is set (has been assigned a value) and false otherwise */
  public boolean isSetUserEmail() {
    return this.userEmail != null;
  }

  public void setUserEmailIsSet(boolean value) {
    if (!value) {
      this.userEmail = null;
    }
  }

  public PasswordChange getPassword() {
    return this.password;
  }

  public ChangeUser setPassword(PasswordChange password) {
    this.password = password;
    return this;
  }

  public void unsetPassword() {
    this.password = null;
  }

  /** Returns true if field password is set (has been assigned a value) and false otherwise */
  public boolean isSetPassword() {
    return this.password != null;
  }

  public void setPasswordIsSet(boolean value) {
    if (!value) {
      this.password = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_EMAIL:
      if (value == null) {
        unsetUserEmail();
      } else {
        setUserEmail((String)value);
      }
      break;

    case PASSWORD:
      if (value == null) {
        unsetPassword();
      } else {
        setPassword((PasswordChange)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_EMAIL:
      return getUserEmail();

    case PASSWORD:
      return getPassword();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_EMAIL:
      return isSetUserEmail();
    case PASSWORD:
      return isSetPassword();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ChangeUser)
      return this.equals((ChangeUser)that);
    return false;
  }

  public boolean equals(ChangeUser that) {
    if (that == null)
      return false;

    boolean this_present_userEmail = true && this.isSetUserEmail();
    boolean that_present_userEmail = true && that.isSetUserEmail();
    if (this_present_userEmail || that_present_userEmail) {
      if (!(this_present_userEmail && that_present_userEmail))
        return false;
      if (!this.userEmail.equals(that.userEmail))
        return false;
    }

    boolean this_present_password = true && this.isSetPassword();
    boolean that_present_password = true && that.isSetPassword();
    if (this_present_password || that_present_password) {
      if (!(this_present_password && that_present_password))
        return false;
      if (!this.password.equals(that.password))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(ChangeUser other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserEmail()).compareTo(other.isSetUserEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userEmail, other.userEmail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPassword()).compareTo(other.isSetPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.password, other.password);
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
    StringBuilder sb = new StringBuilder("ChangeUser(");
    boolean first = true;

    if (isSetUserEmail()) {
      sb.append("userEmail:");
      if (this.userEmail == null) {
        sb.append("null");
      } else {
        sb.append(this.userEmail);
      }
      first = false;
    }
    if (isSetPassword()) {
      if (!first) sb.append(", ");
      sb.append("password:");
      if (this.password == null) {
        sb.append("null");
      } else {
        sb.append(this.password);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (password != null) {
      password.validate();
    }
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

  private static class ChangeUserStandardSchemeFactory implements SchemeFactory {
    public ChangeUserStandardScheme getScheme() {
      return new ChangeUserStandardScheme();
    }
  }

  private static class ChangeUserStandardScheme extends StandardScheme<ChangeUser> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, ChangeUser struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userEmail = iprot.readString();
              struct.setUserEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.password = new PasswordChange();
              struct.password.read(iprot);
              struct.setPasswordIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, ChangeUser struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userEmail != null) {
        if (struct.isSetUserEmail()) {
          oprot.writeFieldBegin(USER_EMAIL_FIELD_DESC);
          oprot.writeString(struct.userEmail);
          oprot.writeFieldEnd();
        }
      }
      if (struct.password != null) {
        if (struct.isSetPassword()) {
          oprot.writeFieldBegin(PASSWORD_FIELD_DESC);
          struct.password.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ChangeUserTupleSchemeFactory implements SchemeFactory {
    public ChangeUserTupleScheme getScheme() {
      return new ChangeUserTupleScheme();
    }
  }

  private static class ChangeUserTupleScheme extends TupleScheme<ChangeUser> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, ChangeUser struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserEmail()) {
        optionals.set(0);
      }
      if (struct.isSetPassword()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUserEmail()) {
        oprot.writeString(struct.userEmail);
      }
      if (struct.isSetPassword()) {
        struct.password.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, ChangeUser struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.userEmail = iprot.readString();
        struct.setUserEmailIsSet(true);
      }
      if (incoming.get(1)) {
        struct.password = new PasswordChange();
        struct.password.read(iprot);
        struct.setPasswordIsSet(true);
      }
    }
  }

}
