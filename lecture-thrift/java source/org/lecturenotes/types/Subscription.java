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

public class Subscription implements org.apache.thrift.TBase<Subscription, Subscription._Fields>, java.io.Serializable, Cloneable, Comparable<Subscription> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Subscription");

  private static final org.apache.thrift.protocol.TField USER_EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("userEmail", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField COURSE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("courseId", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new SubscriptionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new SubscriptionTupleSchemeFactory());
  }

  public String userEmail; // required
  public String courseId; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_EMAIL((short)1, "userEmail"),
    COURSE_ID((short)2, "courseId");

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
        case 2: // COURSE_ID
          return COURSE_ID;
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
    tmpMap.put(_Fields.USER_EMAIL, new org.apache.thrift.meta_data.FieldMetaData("userEmail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.COURSE_ID, new org.apache.thrift.meta_data.FieldMetaData("courseId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Subscription.class, metaDataMap);
  }

  public Subscription() {
  }

  public Subscription(
    String userEmail,
    String courseId)
  {
    this();
    this.userEmail = userEmail;
    this.courseId = courseId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Subscription(Subscription other) {
    if (other.isSetUserEmail()) {
      this.userEmail = other.userEmail;
    }
    if (other.isSetCourseId()) {
      this.courseId = other.courseId;
    }
  }

  public Subscription deepCopy() {
    return new Subscription(this);
  }

  @Override
  public void clear() {
    this.userEmail = null;
    this.courseId = null;
  }

  public String getUserEmail() {
    return this.userEmail;
  }

  public Subscription setUserEmail(String userEmail) {
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

  public String getCourseId() {
    return this.courseId;
  }

  public Subscription setCourseId(String courseId) {
    this.courseId = courseId;
    return this;
  }

  public void unsetCourseId() {
    this.courseId = null;
  }

  /** Returns true if field courseId is set (has been assigned a value) and false otherwise */
  public boolean isSetCourseId() {
    return this.courseId != null;
  }

  public void setCourseIdIsSet(boolean value) {
    if (!value) {
      this.courseId = null;
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

    case COURSE_ID:
      if (value == null) {
        unsetCourseId();
      } else {
        setCourseId((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_EMAIL:
      return getUserEmail();

    case COURSE_ID:
      return getCourseId();

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
    case COURSE_ID:
      return isSetCourseId();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Subscription)
      return this.equals((Subscription)that);
    return false;
  }

  public boolean equals(Subscription that) {
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

    boolean this_present_courseId = true && this.isSetCourseId();
    boolean that_present_courseId = true && that.isSetCourseId();
    if (this_present_courseId || that_present_courseId) {
      if (!(this_present_courseId && that_present_courseId))
        return false;
      if (!this.courseId.equals(that.courseId))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(Subscription other) {
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
    lastComparison = Boolean.valueOf(isSetCourseId()).compareTo(other.isSetCourseId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCourseId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.courseId, other.courseId);
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
    StringBuilder sb = new StringBuilder("Subscription(");
    boolean first = true;

    sb.append("userEmail:");
    if (this.userEmail == null) {
      sb.append("null");
    } else {
      sb.append(this.userEmail);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("courseId:");
    if (this.courseId == null) {
      sb.append("null");
    } else {
      sb.append(this.courseId);
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

  private static class SubscriptionStandardSchemeFactory implements SchemeFactory {
    public SubscriptionStandardScheme getScheme() {
      return new SubscriptionStandardScheme();
    }
  }

  private static class SubscriptionStandardScheme extends StandardScheme<Subscription> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Subscription struct) throws org.apache.thrift.TException {
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
          case 2: // COURSE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.courseId = iprot.readString();
              struct.setCourseIdIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Subscription struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.userEmail != null) {
        oprot.writeFieldBegin(USER_EMAIL_FIELD_DESC);
        oprot.writeString(struct.userEmail);
        oprot.writeFieldEnd();
      }
      if (struct.courseId != null) {
        oprot.writeFieldBegin(COURSE_ID_FIELD_DESC);
        oprot.writeString(struct.courseId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SubscriptionTupleSchemeFactory implements SchemeFactory {
    public SubscriptionTupleScheme getScheme() {
      return new SubscriptionTupleScheme();
    }
  }

  private static class SubscriptionTupleScheme extends TupleScheme<Subscription> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Subscription struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserEmail()) {
        optionals.set(0);
      }
      if (struct.isSetCourseId()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetUserEmail()) {
        oprot.writeString(struct.userEmail);
      }
      if (struct.isSetCourseId()) {
        oprot.writeString(struct.courseId);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Subscription struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.userEmail = iprot.readString();
        struct.setUserEmailIsSet(true);
      }
      if (incoming.get(1)) {
        struct.courseId = iprot.readString();
        struct.setCourseIdIsSet(true);
      }
    }
  }

}
