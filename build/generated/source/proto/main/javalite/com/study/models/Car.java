// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.study.models;

/**
 * Protobuf type {@code Car}
 */
public  final class Car extends
    com.google.protobuf.GeneratedMessageLite<
        Car, Car.Builder> implements
    // @@protoc_insertion_point(message_implements:Car)
    CarOrBuilder {
  private Car() {
    maker_ = "";
    model_ = "";
  }
  public static final int MAKER_FIELD_NUMBER = 1;
  private java.lang.String maker_;
  /**
   * <code>optional string maker = 1;</code>
   */
  public java.lang.String getMaker() {
    return maker_;
  }
  /**
   * <code>optional string maker = 1;</code>
   */
  public com.google.protobuf.ByteString
      getMakerBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(maker_);
  }
  /**
   * <code>optional string maker = 1;</code>
   */
  private void setMaker(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    maker_ = value;
  }
  /**
   * <code>optional string maker = 1;</code>
   */
  private void clearMaker() {
    
    maker_ = getDefaultInstance().getMaker();
  }
  /**
   * <code>optional string maker = 1;</code>
   */
  private void setMakerBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    maker_ = value.toStringUtf8();
  }

  public static final int MODEL_FIELD_NUMBER = 2;
  private java.lang.String model_;
  /**
   * <code>optional string model = 2;</code>
   */
  public java.lang.String getModel() {
    return model_;
  }
  /**
   * <code>optional string model = 2;</code>
   */
  public com.google.protobuf.ByteString
      getModelBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(model_);
  }
  /**
   * <code>optional string model = 2;</code>
   */
  private void setModel(
      java.lang.String value) {
    if (value == null) {
    throw new NullPointerException();
  }
  
    model_ = value;
  }
  /**
   * <code>optional string model = 2;</code>
   */
  private void clearModel() {
    
    model_ = getDefaultInstance().getModel();
  }
  /**
   * <code>optional string model = 2;</code>
   */
  private void setModelBytes(
      com.google.protobuf.ByteString value) {
    if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
    
    model_ = value.toStringUtf8();
  }

  public static final int YEAR_FIELD_NUMBER = 3;
  private int year_;
  /**
   * <code>optional int32 year = 3;</code>
   */
  public int getYear() {
    return year_;
  }
  /**
   * <code>optional int32 year = 3;</code>
   */
  private void setYear(int value) {
    
    year_ = value;
  }
  /**
   * <code>optional int32 year = 3;</code>
   */
  private void clearYear() {
    
    year_ = 0;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!maker_.isEmpty()) {
      output.writeString(1, getMaker());
    }
    if (!model_.isEmpty()) {
      output.writeString(2, getModel());
    }
    if (year_ != 0) {
      output.writeInt32(3, year_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSerializedSize;
    if (size != -1) return size;

    size = 0;
    if (!maker_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(1, getMaker());
    }
    if (!model_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeStringSize(2, getModel());
    }
    if (year_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, year_);
    }
    memoizedSerializedSize = size;
    return size;
  }

  public static com.study.models.Car parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.study.models.Car parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.study.models.Car parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.study.models.Car parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.study.models.Car parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.study.models.Car parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.study.models.Car parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.study.models.Car parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.study.models.Car parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.study.models.Car parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.study.models.Car prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  /**
   * Protobuf type {@code Car}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.study.models.Car, Builder> implements
      // @@protoc_insertion_point(builder_implements:Car)
      com.study.models.CarOrBuilder {
    // Construct using com.study.models.Car.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>optional string maker = 1;</code>
     */
    public java.lang.String getMaker() {
      return instance.getMaker();
    }
    /**
     * <code>optional string maker = 1;</code>
     */
    public com.google.protobuf.ByteString
        getMakerBytes() {
      return instance.getMakerBytes();
    }
    /**
     * <code>optional string maker = 1;</code>
     */
    public Builder setMaker(
        java.lang.String value) {
      copyOnWrite();
      instance.setMaker(value);
      return this;
    }
    /**
     * <code>optional string maker = 1;</code>
     */
    public Builder clearMaker() {
      copyOnWrite();
      instance.clearMaker();
      return this;
    }
    /**
     * <code>optional string maker = 1;</code>
     */
    public Builder setMakerBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setMakerBytes(value);
      return this;
    }

    /**
     * <code>optional string model = 2;</code>
     */
    public java.lang.String getModel() {
      return instance.getModel();
    }
    /**
     * <code>optional string model = 2;</code>
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      return instance.getModelBytes();
    }
    /**
     * <code>optional string model = 2;</code>
     */
    public Builder setModel(
        java.lang.String value) {
      copyOnWrite();
      instance.setModel(value);
      return this;
    }
    /**
     * <code>optional string model = 2;</code>
     */
    public Builder clearModel() {
      copyOnWrite();
      instance.clearModel();
      return this;
    }
    /**
     * <code>optional string model = 2;</code>
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setModelBytes(value);
      return this;
    }

    /**
     * <code>optional int32 year = 3;</code>
     */
    public int getYear() {
      return instance.getYear();
    }
    /**
     * <code>optional int32 year = 3;</code>
     */
    public Builder setYear(int value) {
      copyOnWrite();
      instance.setYear(value);
      return this;
    }
    /**
     * <code>optional int32 year = 3;</code>
     */
    public Builder clearYear() {
      copyOnWrite();
      instance.clearYear();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Car)
  }
  protected final Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      Object arg0, Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.study.models.Car();
      }
      case IS_INITIALIZED: {
        return DEFAULT_INSTANCE;
      }
      case MAKE_IMMUTABLE: {
        return null;
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case VISIT: {
        Visitor visitor = (Visitor) arg0;
        com.study.models.Car other = (com.study.models.Car) arg1;
        maker_ = visitor.visitString(!maker_.isEmpty(), maker_,
            !other.maker_.isEmpty(), other.maker_);
        model_ = visitor.visitString(!model_.isEmpty(), model_,
            !other.model_.isEmpty(), other.model_);
        year_ = visitor.visitInt(year_ != 0, year_,
            other.year_ != 0, other.year_);
        if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
            .INSTANCE) {
        }
        return this;
      }
      case MERGE_FROM_STREAM: {
        com.google.protobuf.CodedInputStream input =
            (com.google.protobuf.CodedInputStream) arg0;
        com.google.protobuf.ExtensionRegistryLite extensionRegistry =
            (com.google.protobuf.ExtensionRegistryLite) arg1;
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              default: {
                if (!input.skipField(tag)) {
                  done = true;
                }
                break;
              }
              case 10: {
                String s = input.readStringRequireUtf8();

                maker_ = s;
                break;
              }
              case 18: {
                String s = input.readStringRequireUtf8();

                model_ = s;
                break;
              }
              case 24: {

                year_ = input.readInt32();
                break;
              }
            }
          }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw new RuntimeException(e.setUnfinishedMessage(this));
        } catch (java.io.IOException e) {
          throw new RuntimeException(
              new com.google.protobuf.InvalidProtocolBufferException(
                  e.getMessage()).setUnfinishedMessage(this));
        } finally {
        }
      }
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        if (PARSER == null) {    synchronized (com.study.models.Car.class) {
            if (PARSER == null) {
              PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
            }
          }
        }
        return PARSER;
      }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:Car)
  private static final com.study.models.Car DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new Car();
    DEFAULT_INSTANCE.makeImmutable();
  }

  public static com.study.models.Car getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<Car> PARSER;

  public static com.google.protobuf.Parser<Car> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

