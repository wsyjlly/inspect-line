package com.tyjw.inspectline.entity.projo;

public final class ServiceData {
  private ServiceData() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PositionPbOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PositionPb)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *经度
     * </pre>
     *
     * <code>double lng = 1;</code>
     */
    double getLng();

    /**
     * <pre>
     *纬度
     * </pre>
     *
     * <code>double lat = 2;</code>
     */
    double getLat();

    /**
     * <pre>
     *高度
     * </pre>
     *
     * <code>float height = 3;</code>
     */
    float getHeight();
  }
  /**
   * <pre>
   *地理坐标
   * </pre>
   *
   * Protobuf type {@code PositionPb}
   */
  public  static final class PositionPb extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PositionPb)
      PositionPbOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PositionPb.newBuilder() to construct.
    private PositionPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PositionPb() {
      lng_ = 0D;
      lat_ = 0D;
      height_ = 0F;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PositionPb(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 9: {

              lng_ = input.readDouble();
              break;
            }
            case 17: {

              lat_ = input.readDouble();
              break;
            }
            case 29: {

              height_ = input.readFloat();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_PositionPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_PositionPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.PositionPb.class, ServiceData.PositionPb.Builder.class);
    }

    public static final int LNG_FIELD_NUMBER = 1;
    private double lng_;
    /**
     * <pre>
     *经度
     * </pre>
     *
     * <code>double lng = 1;</code>
     */
    public double getLng() {
      return lng_;
    }

    public static final int LAT_FIELD_NUMBER = 2;
    private double lat_;
    /**
     * <pre>
     *纬度
     * </pre>
     *
     * <code>double lat = 2;</code>
     */
    public double getLat() {
      return lat_;
    }

    public static final int HEIGHT_FIELD_NUMBER = 3;
    private float height_;
    /**
     * <pre>
     *高度
     * </pre>
     *
     * <code>float height = 3;</code>
     */
    public float getHeight() {
      return height_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (lng_ != 0D) {
        output.writeDouble(1, lng_);
      }
      if (lat_ != 0D) {
        output.writeDouble(2, lat_);
      }
      if (height_ != 0F) {
        output.writeFloat(3, height_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (lng_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(1, lng_);
      }
      if (lat_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(2, lat_);
      }
      if (height_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, height_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.PositionPb)) {
        return super.equals(obj);
      }
      ServiceData.PositionPb other = (ServiceData.PositionPb) obj;

      boolean result = true;
      result = result && (
          java.lang.Double.doubleToLongBits(getLng())
          == java.lang.Double.doubleToLongBits(
              other.getLng()));
      result = result && (
          java.lang.Double.doubleToLongBits(getLat())
          == java.lang.Double.doubleToLongBits(
              other.getLat()));
      result = result && (
          java.lang.Float.floatToIntBits(getHeight())
          == java.lang.Float.floatToIntBits(
              other.getHeight()));
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LNG_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLng()));
      hash = (37 * hash) + LAT_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLat()));
      hash = (37 * hash) + HEIGHT_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getHeight());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.PositionPb parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.PositionPb parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.PositionPb parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.PositionPb parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.PositionPb parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.PositionPb parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.PositionPb parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.PositionPb parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.PositionPb parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.PositionPb parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.PositionPb parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.PositionPb parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.PositionPb prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *地理坐标
     * </pre>
     *
     * Protobuf type {@code PositionPb}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PositionPb)
        ServiceData.PositionPbOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_PositionPb_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_PositionPb_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.PositionPb.class, ServiceData.PositionPb.Builder.class);
      }

      // Construct using ServiceData.PositionPb.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lng_ = 0D;

        lat_ = 0D;

        height_ = 0F;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_PositionPb_descriptor;
      }

      @java.lang.Override
      public ServiceData.PositionPb getDefaultInstanceForType() {
        return ServiceData.PositionPb.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.PositionPb build() {
        ServiceData.PositionPb result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.PositionPb buildPartial() {
        ServiceData.PositionPb result = new ServiceData.PositionPb(this);
        result.lng_ = lng_;
        result.lat_ = lat_;
        result.height_ = height_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.PositionPb) {
          return mergeFrom((ServiceData.PositionPb)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.PositionPb other) {
        if (other == ServiceData.PositionPb.getDefaultInstance()) return this;
        if (other.getLng() != 0D) {
          setLng(other.getLng());
        }
        if (other.getLat() != 0D) {
          setLat(other.getLat());
        }
        if (other.getHeight() != 0F) {
          setHeight(other.getHeight());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.PositionPb parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.PositionPb) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private double lng_ ;
      /**
       * <pre>
       *经度
       * </pre>
       *
       * <code>double lng = 1;</code>
       */
      public double getLng() {
        return lng_;
      }
      /**
       * <pre>
       *经度
       * </pre>
       *
       * <code>double lng = 1;</code>
       */
      public Builder setLng(double value) {
        
        lng_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *经度
       * </pre>
       *
       * <code>double lng = 1;</code>
       */
      public Builder clearLng() {
        
        lng_ = 0D;
        onChanged();
        return this;
      }

      private double lat_ ;
      /**
       * <pre>
       *纬度
       * </pre>
       *
       * <code>double lat = 2;</code>
       */
      public double getLat() {
        return lat_;
      }
      /**
       * <pre>
       *纬度
       * </pre>
       *
       * <code>double lat = 2;</code>
       */
      public Builder setLat(double value) {
        
        lat_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *纬度
       * </pre>
       *
       * <code>double lat = 2;</code>
       */
      public Builder clearLat() {
        
        lat_ = 0D;
        onChanged();
        return this;
      }

      private float height_ ;
      /**
       * <pre>
       *高度
       * </pre>
       *
       * <code>float height = 3;</code>
       */
      public float getHeight() {
        return height_;
      }
      /**
       * <pre>
       *高度
       * </pre>
       *
       * <code>float height = 3;</code>
       */
      public Builder setHeight(float value) {
        
        height_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *高度
       * </pre>
       *
       * <code>float height = 3;</code>
       */
      public Builder clearHeight() {
        
        height_ = 0F;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PositionPb)
    }

    // @@protoc_insertion_point(class_scope:PositionPb)
    private static final ServiceData.PositionPb DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.PositionPb();
    }

    public static ServiceData.PositionPb getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PositionPb>
        PARSER = new com.google.protobuf.AbstractParser<PositionPb>() {
      @java.lang.Override
      public PositionPb parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PositionPb(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PositionPb> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PositionPb> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.PositionPb getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LabelInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LabelInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 xmin = 1;</code>
     */
    int getXmin();

    /**
     * <code>int32 ymin = 2;</code>
     */
    int getYmin();

    /**
     * <code>int32 xmax = 3;</code>
     */
    int getXmax();

    /**
     * <code>int32 ymax = 4;</code>
     */
    int getYmax();
  }
  /**
   * <pre>
   *标注信息
   * </pre>
   *
   * Protobuf type {@code LabelInfo}
   */
  public  static final class LabelInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LabelInfo)
      LabelInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LabelInfo.newBuilder() to construct.
    private LabelInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LabelInfo() {
      xmin_ = 0;
      ymin_ = 0;
      xmax_ = 0;
      ymax_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LabelInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              xmin_ = input.readInt32();
              break;
            }
            case 16: {

              ymin_ = input.readInt32();
              break;
            }
            case 24: {

              xmax_ = input.readInt32();
              break;
            }
            case 32: {

              ymax_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_LabelInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_LabelInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.LabelInfo.class, ServiceData.LabelInfo.Builder.class);
    }

    public static final int XMIN_FIELD_NUMBER = 1;
    private int xmin_;
    /**
     * <code>int32 xmin = 1;</code>
     */
    public int getXmin() {
      return xmin_;
    }

    public static final int YMIN_FIELD_NUMBER = 2;
    private int ymin_;
    /**
     * <code>int32 ymin = 2;</code>
     */
    public int getYmin() {
      return ymin_;
    }

    public static final int XMAX_FIELD_NUMBER = 3;
    private int xmax_;
    /**
     * <code>int32 xmax = 3;</code>
     */
    public int getXmax() {
      return xmax_;
    }

    public static final int YMAX_FIELD_NUMBER = 4;
    private int ymax_;
    /**
     * <code>int32 ymax = 4;</code>
     */
    public int getYmax() {
      return ymax_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (xmin_ != 0) {
        output.writeInt32(1, xmin_);
      }
      if (ymin_ != 0) {
        output.writeInt32(2, ymin_);
      }
      if (xmax_ != 0) {
        output.writeInt32(3, xmax_);
      }
      if (ymax_ != 0) {
        output.writeInt32(4, ymax_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (xmin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, xmin_);
      }
      if (ymin_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, ymin_);
      }
      if (xmax_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, xmax_);
      }
      if (ymax_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, ymax_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.LabelInfo)) {
        return super.equals(obj);
      }
      ServiceData.LabelInfo other = (ServiceData.LabelInfo) obj;

      boolean result = true;
      result = result && (getXmin()
          == other.getXmin());
      result = result && (getYmin()
          == other.getYmin());
      result = result && (getXmax()
          == other.getXmax());
      result = result && (getYmax()
          == other.getYmax());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + XMIN_FIELD_NUMBER;
      hash = (53 * hash) + getXmin();
      hash = (37 * hash) + YMIN_FIELD_NUMBER;
      hash = (53 * hash) + getYmin();
      hash = (37 * hash) + XMAX_FIELD_NUMBER;
      hash = (53 * hash) + getXmax();
      hash = (37 * hash) + YMAX_FIELD_NUMBER;
      hash = (53 * hash) + getYmax();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.LabelInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LabelInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LabelInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LabelInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LabelInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LabelInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LabelInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.LabelInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.LabelInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.LabelInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.LabelInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.LabelInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.LabelInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * Protobuf type {@code LabelInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LabelInfo)
        ServiceData.LabelInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_LabelInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_LabelInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.LabelInfo.class, ServiceData.LabelInfo.Builder.class);
      }

      // Construct using ServiceData.LabelInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        xmin_ = 0;

        ymin_ = 0;

        xmax_ = 0;

        ymax_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_LabelInfo_descriptor;
      }

      @java.lang.Override
      public ServiceData.LabelInfo getDefaultInstanceForType() {
        return ServiceData.LabelInfo.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.LabelInfo build() {
        ServiceData.LabelInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.LabelInfo buildPartial() {
        ServiceData.LabelInfo result = new ServiceData.LabelInfo(this);
        result.xmin_ = xmin_;
        result.ymin_ = ymin_;
        result.xmax_ = xmax_;
        result.ymax_ = ymax_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.LabelInfo) {
          return mergeFrom((ServiceData.LabelInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.LabelInfo other) {
        if (other == ServiceData.LabelInfo.getDefaultInstance()) return this;
        if (other.getXmin() != 0) {
          setXmin(other.getXmin());
        }
        if (other.getYmin() != 0) {
          setYmin(other.getYmin());
        }
        if (other.getXmax() != 0) {
          setXmax(other.getXmax());
        }
        if (other.getYmax() != 0) {
          setYmax(other.getYmax());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.LabelInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.LabelInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int xmin_ ;
      /**
       * <code>int32 xmin = 1;</code>
       */
      public int getXmin() {
        return xmin_;
      }
      /**
       * <code>int32 xmin = 1;</code>
       */
      public Builder setXmin(int value) {
        
        xmin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 xmin = 1;</code>
       */
      public Builder clearXmin() {
        
        xmin_ = 0;
        onChanged();
        return this;
      }

      private int ymin_ ;
      /**
       * <code>int32 ymin = 2;</code>
       */
      public int getYmin() {
        return ymin_;
      }
      /**
       * <code>int32 ymin = 2;</code>
       */
      public Builder setYmin(int value) {
        
        ymin_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 ymin = 2;</code>
       */
      public Builder clearYmin() {
        
        ymin_ = 0;
        onChanged();
        return this;
      }

      private int xmax_ ;
      /**
       * <code>int32 xmax = 3;</code>
       */
      public int getXmax() {
        return xmax_;
      }
      /**
       * <code>int32 xmax = 3;</code>
       */
      public Builder setXmax(int value) {
        
        xmax_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 xmax = 3;</code>
       */
      public Builder clearXmax() {
        
        xmax_ = 0;
        onChanged();
        return this;
      }

      private int ymax_ ;
      /**
       * <code>int32 ymax = 4;</code>
       */
      public int getYmax() {
        return ymax_;
      }
      /**
       * <code>int32 ymax = 4;</code>
       */
      public Builder setYmax(int value) {
        
        ymax_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 ymax = 4;</code>
       */
      public Builder clearYmax() {
        
        ymax_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LabelInfo)
    }

    // @@protoc_insertion_point(class_scope:LabelInfo)
    private static final ServiceData.LabelInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.LabelInfo();
    }

    public static ServiceData.LabelInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LabelInfo>
        PARSER = new com.google.protobuf.AbstractParser<LabelInfo>() {
      @java.lang.Override
      public LabelInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LabelInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LabelInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LabelInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.LabelInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LinePbOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LinePb)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *线段编号，例如 "779-3"
     * </pre>
     *
     * <code>string lineNumber = 1;</code>
     */
    java.lang.String getLineNumber();
    /**
     * <pre>
     *线段编号，例如 "779-3"
     * </pre>
     *
     * <code>string lineNumber = 1;</code>
     */
    com.google.protobuf.ByteString
        getLineNumberBytes();

    /**
     * <pre>
     *名称，例如"xx水库"
     * </pre>
     *
     * <code>string lineName = 2;</code>
     */
    java.lang.String getLineName();
    /**
     * <pre>
     *名称，例如"xx水库"
     * </pre>
     *
     * <code>string lineName = 2;</code>
     */
    com.google.protobuf.ByteString
        getLineNameBytes();

    /**
     * <pre>
     *起点
     * </pre>
     *
     * <code>.PositionPb start = 3;</code>
     */
    boolean hasStart();
    /**
     * <pre>
     *起点
     * </pre>
     *
     * <code>.PositionPb start = 3;</code>
     */
    ServiceData.PositionPb getStart();
    /**
     * <pre>
     *起点
     * </pre>
     *
     * <code>.PositionPb start = 3;</code>
     */
    ServiceData.PositionPbOrBuilder getStartOrBuilder();

    /**
     * <pre>
     *终点
     * </pre>
     *
     * <code>.PositionPb end = 4;</code>
     */
    boolean hasEnd();
    /**
     * <pre>
     *终点
     * </pre>
     *
     * <code>.PositionPb end = 4;</code>
     */
    ServiceData.PositionPb getEnd();
    /**
     * <pre>
     *终点
     * </pre>
     *
     * <code>.PositionPb end = 4;</code>
     */
    ServiceData.PositionPbOrBuilder getEndOrBuilder();
  }
  /**
   * <pre>
   *地理线段
   * </pre>
   *
   * Protobuf type {@code LinePb}
   */
  public  static final class LinePb extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LinePb)
      LinePbOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LinePb.newBuilder() to construct.
    private LinePb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LinePb() {
      lineNumber_ = "";
      lineName_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LinePb(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              lineNumber_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              lineName_ = s;
              break;
            }
            case 26: {
              ServiceData.PositionPb.Builder subBuilder = null;
              if (start_ != null) {
                subBuilder = start_.toBuilder();
              }
              start_ = input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(start_);
                start_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              ServiceData.PositionPb.Builder subBuilder = null;
              if (end_ != null) {
                subBuilder = end_.toBuilder();
              }
              end_ = input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(end_);
                end_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_LinePb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_LinePb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.LinePb.class, ServiceData.LinePb.Builder.class);
    }

    public static final int LINENUMBER_FIELD_NUMBER = 1;
    private volatile java.lang.Object lineNumber_;
    /**
     * <pre>
     *线段编号，例如 "779-3"
     * </pre>
     *
     * <code>string lineNumber = 1;</code>
     */
    public java.lang.String getLineNumber() {
      java.lang.Object ref = lineNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lineNumber_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *线段编号，例如 "779-3"
     * </pre>
     *
     * <code>string lineNumber = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLineNumberBytes() {
      java.lang.Object ref = lineNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lineNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LINENAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object lineName_;
    /**
     * <pre>
     *名称，例如"xx水库"
     * </pre>
     *
     * <code>string lineName = 2;</code>
     */
    public java.lang.String getLineName() {
      java.lang.Object ref = lineName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lineName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *名称，例如"xx水库"
     * </pre>
     *
     * <code>string lineName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLineNameBytes() {
      java.lang.Object ref = lineName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lineName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int START_FIELD_NUMBER = 3;
    private ServiceData.PositionPb start_;
    /**
     * <pre>
     *起点
     * </pre>
     *
     * <code>.PositionPb start = 3;</code>
     */
    public boolean hasStart() {
      return start_ != null;
    }
    /**
     * <pre>
     *起点
     * </pre>
     *
     * <code>.PositionPb start = 3;</code>
     */
    public ServiceData.PositionPb getStart() {
      return start_ == null ? ServiceData.PositionPb.getDefaultInstance() : start_;
    }
    /**
     * <pre>
     *起点
     * </pre>
     *
     * <code>.PositionPb start = 3;</code>
     */
    public ServiceData.PositionPbOrBuilder getStartOrBuilder() {
      return getStart();
    }

    public static final int END_FIELD_NUMBER = 4;
    private ServiceData.PositionPb end_;
    /**
     * <pre>
     *终点
     * </pre>
     *
     * <code>.PositionPb end = 4;</code>
     */
    public boolean hasEnd() {
      return end_ != null;
    }
    /**
     * <pre>
     *终点
     * </pre>
     *
     * <code>.PositionPb end = 4;</code>
     */
    public ServiceData.PositionPb getEnd() {
      return end_ == null ? ServiceData.PositionPb.getDefaultInstance() : end_;
    }
    /**
     * <pre>
     *终点
     * </pre>
     *
     * <code>.PositionPb end = 4;</code>
     */
    public ServiceData.PositionPbOrBuilder getEndOrBuilder() {
      return getEnd();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getLineNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lineNumber_);
      }
      if (!getLineNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lineName_);
      }
      if (start_ != null) {
        output.writeMessage(3, getStart());
      }
      if (end_ != null) {
        output.writeMessage(4, getEnd());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getLineNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lineNumber_);
      }
      if (!getLineNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lineName_);
      }
      if (start_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getStart());
      }
      if (end_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getEnd());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.LinePb)) {
        return super.equals(obj);
      }
      ServiceData.LinePb other = (ServiceData.LinePb) obj;

      boolean result = true;
      result = result && getLineNumber()
          .equals(other.getLineNumber());
      result = result && getLineName()
          .equals(other.getLineName());
      result = result && (hasStart() == other.hasStart());
      if (hasStart()) {
        result = result && getStart()
            .equals(other.getStart());
      }
      result = result && (hasEnd() == other.hasEnd());
      if (hasEnd()) {
        result = result && getEnd()
            .equals(other.getEnd());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LINENUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getLineNumber().hashCode();
      hash = (37 * hash) + LINENAME_FIELD_NUMBER;
      hash = (53 * hash) + getLineName().hashCode();
      if (hasStart()) {
        hash = (37 * hash) + START_FIELD_NUMBER;
        hash = (53 * hash) + getStart().hashCode();
      }
      if (hasEnd()) {
        hash = (37 * hash) + END_FIELD_NUMBER;
        hash = (53 * hash) + getEnd().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.LinePb parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LinePb parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LinePb parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LinePb parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LinePb parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LinePb parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LinePb parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.LinePb parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.LinePb parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.LinePb parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.LinePb parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.LinePb parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.LinePb prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *地理线段
     * </pre>
     *
     * Protobuf type {@code LinePb}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LinePb)
        ServiceData.LinePbOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_LinePb_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_LinePb_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.LinePb.class, ServiceData.LinePb.Builder.class);
      }

      // Construct using ServiceData.LinePb.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lineNumber_ = "";

        lineName_ = "";

        if (startBuilder_ == null) {
          start_ = null;
        } else {
          start_ = null;
          startBuilder_ = null;
        }
        if (endBuilder_ == null) {
          end_ = null;
        } else {
          end_ = null;
          endBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_LinePb_descriptor;
      }

      @java.lang.Override
      public ServiceData.LinePb getDefaultInstanceForType() {
        return ServiceData.LinePb.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.LinePb build() {
        ServiceData.LinePb result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.LinePb buildPartial() {
        ServiceData.LinePb result = new ServiceData.LinePb(this);
        result.lineNumber_ = lineNumber_;
        result.lineName_ = lineName_;
        if (startBuilder_ == null) {
          result.start_ = start_;
        } else {
          result.start_ = startBuilder_.build();
        }
        if (endBuilder_ == null) {
          result.end_ = end_;
        } else {
          result.end_ = endBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.LinePb) {
          return mergeFrom((ServiceData.LinePb)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.LinePb other) {
        if (other == ServiceData.LinePb.getDefaultInstance()) return this;
        if (!other.getLineNumber().isEmpty()) {
          lineNumber_ = other.lineNumber_;
          onChanged();
        }
        if (!other.getLineName().isEmpty()) {
          lineName_ = other.lineName_;
          onChanged();
        }
        if (other.hasStart()) {
          mergeStart(other.getStart());
        }
        if (other.hasEnd()) {
          mergeEnd(other.getEnd());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.LinePb parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.LinePb) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object lineNumber_ = "";
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public java.lang.String getLineNumber() {
        java.lang.Object ref = lineNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lineNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public com.google.protobuf.ByteString
          getLineNumberBytes() {
        java.lang.Object ref = lineNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lineNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public Builder setLineNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lineNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public Builder clearLineNumber() {
        
        lineNumber_ = getDefaultInstance().getLineNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public Builder setLineNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lineNumber_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object lineName_ = "";
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public java.lang.String getLineName() {
        java.lang.Object ref = lineName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lineName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLineNameBytes() {
        java.lang.Object ref = lineName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lineName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public Builder setLineName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lineName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public Builder clearLineName() {
        
        lineName_ = getDefaultInstance().getLineName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public Builder setLineNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lineName_ = value;
        onChanged();
        return this;
      }

      private ServiceData.PositionPb start_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> startBuilder_;
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      public boolean hasStart() {
        return startBuilder_ != null || start_ != null;
      }
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      public ServiceData.PositionPb getStart() {
        if (startBuilder_ == null) {
          return start_ == null ? ServiceData.PositionPb.getDefaultInstance() : start_;
        } else {
          return startBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      public Builder setStart(ServiceData.PositionPb value) {
        if (startBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          start_ = value;
          onChanged();
        } else {
          startBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      public Builder setStart(
          ServiceData.PositionPb.Builder builderForValue) {
        if (startBuilder_ == null) {
          start_ = builderForValue.build();
          onChanged();
        } else {
          startBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      public Builder mergeStart(ServiceData.PositionPb value) {
        if (startBuilder_ == null) {
          if (start_ != null) {
            start_ =
              ServiceData.PositionPb.newBuilder(start_).mergeFrom(value).buildPartial();
          } else {
            start_ = value;
          }
          onChanged();
        } else {
          startBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      public Builder clearStart() {
        if (startBuilder_ == null) {
          start_ = null;
          onChanged();
        } else {
          start_ = null;
          startBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      public ServiceData.PositionPb.Builder getStartBuilder() {
        
        onChanged();
        return getStartFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      public ServiceData.PositionPbOrBuilder getStartOrBuilder() {
        if (startBuilder_ != null) {
          return startBuilder_.getMessageOrBuilder();
        } else {
          return start_ == null ?
              ServiceData.PositionPb.getDefaultInstance() : start_;
        }
      }
      /**
       * <pre>
       *起点
       * </pre>
       *
       * <code>.PositionPb start = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getStartFieldBuilder() {
        if (startBuilder_ == null) {
          startBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  getStart(),
                  getParentForChildren(),
                  isClean());
          start_ = null;
        }
        return startBuilder_;
      }

      private ServiceData.PositionPb end_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> endBuilder_;
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      public boolean hasEnd() {
        return endBuilder_ != null || end_ != null;
      }
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      public ServiceData.PositionPb getEnd() {
        if (endBuilder_ == null) {
          return end_ == null ? ServiceData.PositionPb.getDefaultInstance() : end_;
        } else {
          return endBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      public Builder setEnd(ServiceData.PositionPb value) {
        if (endBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          end_ = value;
          onChanged();
        } else {
          endBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      public Builder setEnd(
          ServiceData.PositionPb.Builder builderForValue) {
        if (endBuilder_ == null) {
          end_ = builderForValue.build();
          onChanged();
        } else {
          endBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      public Builder mergeEnd(ServiceData.PositionPb value) {
        if (endBuilder_ == null) {
          if (end_ != null) {
            end_ =
              ServiceData.PositionPb.newBuilder(end_).mergeFrom(value).buildPartial();
          } else {
            end_ = value;
          }
          onChanged();
        } else {
          endBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      public Builder clearEnd() {
        if (endBuilder_ == null) {
          end_ = null;
          onChanged();
        } else {
          end_ = null;
          endBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      public ServiceData.PositionPb.Builder getEndBuilder() {
        
        onChanged();
        return getEndFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      public ServiceData.PositionPbOrBuilder getEndOrBuilder() {
        if (endBuilder_ != null) {
          return endBuilder_.getMessageOrBuilder();
        } else {
          return end_ == null ?
              ServiceData.PositionPb.getDefaultInstance() : end_;
        }
      }
      /**
       * <pre>
       *终点
       * </pre>
       *
       * <code>.PositionPb end = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getEndFieldBuilder() {
        if (endBuilder_ == null) {
          endBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  getEnd(),
                  getParentForChildren(),
                  isClean());
          end_ = null;
        }
        return endBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LinePb)
    }

    // @@protoc_insertion_point(class_scope:LinePb)
    private static final ServiceData.LinePb DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.LinePb();
    }

    public static ServiceData.LinePb getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LinePb>
        PARSER = new com.google.protobuf.AbstractParser<LinePb>() {
      @java.lang.Override
      public LinePb parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LinePb(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LinePb> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LinePb> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.LinePb getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface LineStylePbOrBuilder extends
      // @@protoc_insertion_point(interface_extends:LineStylePb)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
     * </pre>
     *
     * <code>string color = 1;</code>
     */
    java.lang.String getColor();
    /**
     * <pre>
     *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
     * </pre>
     *
     * <code>string color = 1;</code>
     */
    com.google.protobuf.ByteString
        getColorBytes();

    /**
     * <pre>
     *管线线条粗细，单位：px
     * </pre>
     *
     * <code>int32 width = 2;</code>
     */
    int getWidth();

    /**
     * <pre>
     *线形, 0：实线，1：虚线
     * </pre>
     *
     * <code>int32 type = 3;</code>
     */
    int getType();
  }
  /**
   * <pre>
   *配色及形状参数结构，用于信息叠加时线条或者图标的表示
   * </pre>
   *
   * Protobuf type {@code LineStylePb}
   */
  public  static final class LineStylePb extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:LineStylePb)
      LineStylePbOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use LineStylePb.newBuilder() to construct.
    private LineStylePb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private LineStylePb() {
      color_ = "";
      width_ = 0;
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private LineStylePb(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              color_ = s;
              break;
            }
            case 16: {

              width_ = input.readInt32();
              break;
            }
            case 24: {

              type_ = input.readInt32();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_LineStylePb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_LineStylePb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.LineStylePb.class, ServiceData.LineStylePb.Builder.class);
    }

    public static final int COLOR_FIELD_NUMBER = 1;
    private volatile java.lang.Object color_;
    /**
     * <pre>
     *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
     * </pre>
     *
     * <code>string color = 1;</code>
     */
    public java.lang.String getColor() {
      java.lang.Object ref = color_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        color_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
     * </pre>
     *
     * <code>string color = 1;</code>
     */
    public com.google.protobuf.ByteString
        getColorBytes() {
      java.lang.Object ref = color_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        color_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int WIDTH_FIELD_NUMBER = 2;
    private int width_;
    /**
     * <pre>
     *管线线条粗细，单位：px
     * </pre>
     *
     * <code>int32 width = 2;</code>
     */
    public int getWidth() {
      return width_;
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <pre>
     *线形, 0：实线，1：虚线
     * </pre>
     *
     * <code>int32 type = 3;</code>
     */
    public int getType() {
      return type_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getColorBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, color_);
      }
      if (width_ != 0) {
        output.writeInt32(2, width_);
      }
      if (type_ != 0) {
        output.writeInt32(3, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getColorBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, color_);
      }
      if (width_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, width_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, type_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.LineStylePb)) {
        return super.equals(obj);
      }
      ServiceData.LineStylePb other = (ServiceData.LineStylePb) obj;

      boolean result = true;
      result = result && getColor()
          .equals(other.getColor());
      result = result && (getWidth()
          == other.getWidth());
      result = result && (getType()
          == other.getType());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + COLOR_FIELD_NUMBER;
      hash = (53 * hash) + getColor().hashCode();
      hash = (37 * hash) + WIDTH_FIELD_NUMBER;
      hash = (53 * hash) + getWidth();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.LineStylePb parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LineStylePb parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LineStylePb parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LineStylePb parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LineStylePb parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.LineStylePb parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.LineStylePb parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.LineStylePb parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.LineStylePb parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.LineStylePb parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.LineStylePb parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.LineStylePb parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.LineStylePb prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *配色及形状参数结构，用于信息叠加时线条或者图标的表示
     * </pre>
     *
     * Protobuf type {@code LineStylePb}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:LineStylePb)
        ServiceData.LineStylePbOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_LineStylePb_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_LineStylePb_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.LineStylePb.class, ServiceData.LineStylePb.Builder.class);
      }

      // Construct using ServiceData.LineStylePb.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        color_ = "";

        width_ = 0;

        type_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_LineStylePb_descriptor;
      }

      @java.lang.Override
      public ServiceData.LineStylePb getDefaultInstanceForType() {
        return ServiceData.LineStylePb.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.LineStylePb build() {
        ServiceData.LineStylePb result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.LineStylePb buildPartial() {
        ServiceData.LineStylePb result = new ServiceData.LineStylePb(this);
        result.color_ = color_;
        result.width_ = width_;
        result.type_ = type_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.LineStylePb) {
          return mergeFrom((ServiceData.LineStylePb)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.LineStylePb other) {
        if (other == ServiceData.LineStylePb.getDefaultInstance()) return this;
        if (!other.getColor().isEmpty()) {
          color_ = other.color_;
          onChanged();
        }
        if (other.getWidth() != 0) {
          setWidth(other.getWidth());
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.LineStylePb parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.LineStylePb) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object color_ = "";
      /**
       * <pre>
       *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
       * </pre>
       *
       * <code>string color = 1;</code>
       */
      public java.lang.String getColor() {
        java.lang.Object ref = color_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          color_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
       * </pre>
       *
       * <code>string color = 1;</code>
       */
      public com.google.protobuf.ByteString
          getColorBytes() {
        java.lang.Object ref = color_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          color_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
       * </pre>
       *
       * <code>string color = 1;</code>
       */
      public Builder setColor(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        color_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
       * </pre>
       *
       * <code>string color = 1;</code>
       */
      public Builder clearColor() {
        
        color_ = getDefaultInstance().getColor();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *管线颜色，RGBA编码，字符串表示，格式例如"100,100,100,0.2"。
       * </pre>
       *
       * <code>string color = 1;</code>
       */
      public Builder setColorBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        color_ = value;
        onChanged();
        return this;
      }

      private int width_ ;
      /**
       * <pre>
       *管线线条粗细，单位：px
       * </pre>
       *
       * <code>int32 width = 2;</code>
       */
      public int getWidth() {
        return width_;
      }
      /**
       * <pre>
       *管线线条粗细，单位：px
       * </pre>
       *
       * <code>int32 width = 2;</code>
       */
      public Builder setWidth(int value) {
        
        width_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *管线线条粗细，单位：px
       * </pre>
       *
       * <code>int32 width = 2;</code>
       */
      public Builder clearWidth() {
        
        width_ = 0;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <pre>
       *线形, 0：实线，1：虚线
       * </pre>
       *
       * <code>int32 type = 3;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       *线形, 0：实线，1：虚线
       * </pre>
       *
       * <code>int32 type = 3;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *线形, 0：实线，1：虚线
       * </pre>
       *
       * <code>int32 type = 3;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:LineStylePb)
    }

    // @@protoc_insertion_point(class_scope:LineStylePb)
    private static final ServiceData.LineStylePb DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.LineStylePb();
    }

    public static ServiceData.LineStylePb getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LineStylePb>
        PARSER = new com.google.protobuf.AbstractParser<LineStylePb>() {
      @java.lang.Override
      public LineStylePb parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new LineStylePb(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<LineStylePb> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LineStylePb> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.LineStylePb getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface RegionPbOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RegionPb)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    java.util.List<ServiceData.PositionPb> 
        getPositionsList();
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    ServiceData.PositionPb getPositions(int index);
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    int getPositionsCount();
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getPositionsOrBuilderList();
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
        int index);

    /**
     * <pre>
     *标记信息，文字，比如 "西南警戒区"
     * </pre>
     *
     * <code>string markinfo = 2;</code>
     */
    java.lang.String getMarkinfo();
    /**
     * <pre>
     *标记信息，文字，比如 "西南警戒区"
     * </pre>
     *
     * <code>string markinfo = 2;</code>
     */
    com.google.protobuf.ByteString
        getMarkinfoBytes();

    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    boolean hasLineStyle();
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    ServiceData.LineStylePb getLineStyle();
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder();
  }
  /**
   * <pre>
   *关注区域结构，带配色和形状
   * </pre>
   *
   * Protobuf type {@code RegionPb}
   */
  public  static final class RegionPb extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RegionPb)
      RegionPbOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RegionPb.newBuilder() to construct.
    private RegionPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RegionPb() {
      positions_ = java.util.Collections.emptyList();
      markinfo_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RegionPb(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                positions_ = new java.util.ArrayList<ServiceData.PositionPb>();
                mutable_bitField0_ |= 0x00000001;
              }
              positions_.add(
                  input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry));
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              markinfo_ = s;
              break;
            }
            case 26: {
              ServiceData.LineStylePb.Builder subBuilder = null;
              if (lineStyle_ != null) {
                subBuilder = lineStyle_.toBuilder();
              }
              lineStyle_ = input.readMessage(ServiceData.LineStylePb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lineStyle_);
                lineStyle_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_RegionPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_RegionPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.RegionPb.class, ServiceData.RegionPb.Builder.class);
    }

    private int bitField0_;
    public static final int POSITIONS_FIELD_NUMBER = 1;
    private java.util.List<ServiceData.PositionPb> positions_;
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public java.util.List<ServiceData.PositionPb> getPositionsList() {
      return positions_;
    }
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getPositionsOrBuilderList() {
      return positions_;
    }
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public int getPositionsCount() {
      return positions_.size();
    }
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public ServiceData.PositionPb getPositions(int index) {
      return positions_.get(index);
    }
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
        int index) {
      return positions_.get(index);
    }

    public static final int MARKINFO_FIELD_NUMBER = 2;
    private volatile java.lang.Object markinfo_;
    /**
     * <pre>
     *标记信息，文字，比如 "西南警戒区"
     * </pre>
     *
     * <code>string markinfo = 2;</code>
     */
    public java.lang.String getMarkinfo() {
      java.lang.Object ref = markinfo_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        markinfo_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *标记信息，文字，比如 "西南警戒区"
     * </pre>
     *
     * <code>string markinfo = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMarkinfoBytes() {
      java.lang.Object ref = markinfo_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        markinfo_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LINESTYLE_FIELD_NUMBER = 3;
    private ServiceData.LineStylePb lineStyle_;
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public boolean hasLineStyle() {
      return lineStyle_ != null;
    }
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public ServiceData.LineStylePb getLineStyle() {
      return lineStyle_ == null ? ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
    }
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder() {
      return getLineStyle();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < positions_.size(); i++) {
        output.writeMessage(1, positions_.get(i));
      }
      if (!getMarkinfoBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, markinfo_);
      }
      if (lineStyle_ != null) {
        output.writeMessage(3, getLineStyle());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < positions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, positions_.get(i));
      }
      if (!getMarkinfoBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, markinfo_);
      }
      if (lineStyle_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLineStyle());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.RegionPb)) {
        return super.equals(obj);
      }
      ServiceData.RegionPb other = (ServiceData.RegionPb) obj;

      boolean result = true;
      result = result && getPositionsList()
          .equals(other.getPositionsList());
      result = result && getMarkinfo()
          .equals(other.getMarkinfo());
      result = result && (hasLineStyle() == other.hasLineStyle());
      if (hasLineStyle()) {
        result = result && getLineStyle()
            .equals(other.getLineStyle());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPositionsCount() > 0) {
        hash = (37 * hash) + POSITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getPositionsList().hashCode();
      }
      hash = (37 * hash) + MARKINFO_FIELD_NUMBER;
      hash = (53 * hash) + getMarkinfo().hashCode();
      if (hasLineStyle()) {
        hash = (37 * hash) + LINESTYLE_FIELD_NUMBER;
        hash = (53 * hash) + getLineStyle().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.RegionPb parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.RegionPb parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.RegionPb parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.RegionPb parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.RegionPb parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.RegionPb parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.RegionPb parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.RegionPb parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.RegionPb parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.RegionPb parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.RegionPb parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.RegionPb parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.RegionPb prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *关注区域结构，带配色和形状
     * </pre>
     *
     * Protobuf type {@code RegionPb}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RegionPb)
        ServiceData.RegionPbOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_RegionPb_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_RegionPb_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.RegionPb.class, ServiceData.RegionPb.Builder.class);
      }

      // Construct using ServiceData.RegionPb.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPositionsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          positionsBuilder_.clear();
        }
        markinfo_ = "";

        if (lineStyleBuilder_ == null) {
          lineStyle_ = null;
        } else {
          lineStyle_ = null;
          lineStyleBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_RegionPb_descriptor;
      }

      @java.lang.Override
      public ServiceData.RegionPb getDefaultInstanceForType() {
        return ServiceData.RegionPb.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.RegionPb build() {
        ServiceData.RegionPb result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.RegionPb buildPartial() {
        ServiceData.RegionPb result = new ServiceData.RegionPb(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (positionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            positions_ = java.util.Collections.unmodifiableList(positions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.positions_ = positions_;
        } else {
          result.positions_ = positionsBuilder_.build();
        }
        result.markinfo_ = markinfo_;
        if (lineStyleBuilder_ == null) {
          result.lineStyle_ = lineStyle_;
        } else {
          result.lineStyle_ = lineStyleBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.RegionPb) {
          return mergeFrom((ServiceData.RegionPb)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.RegionPb other) {
        if (other == ServiceData.RegionPb.getDefaultInstance()) return this;
        if (positionsBuilder_ == null) {
          if (!other.positions_.isEmpty()) {
            if (positions_.isEmpty()) {
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePositionsIsMutable();
              positions_.addAll(other.positions_);
            }
            onChanged();
          }
        } else {
          if (!other.positions_.isEmpty()) {
            if (positionsBuilder_.isEmpty()) {
              positionsBuilder_.dispose();
              positionsBuilder_ = null;
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              positionsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPositionsFieldBuilder() : null;
            } else {
              positionsBuilder_.addAllMessages(other.positions_);
            }
          }
        }
        if (!other.getMarkinfo().isEmpty()) {
          markinfo_ = other.markinfo_;
          onChanged();
        }
        if (other.hasLineStyle()) {
          mergeLineStyle(other.getLineStyle());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.RegionPb parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.RegionPb) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ServiceData.PositionPb> positions_ =
        java.util.Collections.emptyList();
      private void ensurePositionsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          positions_ = new java.util.ArrayList<ServiceData.PositionPb>(positions_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> positionsBuilder_;

      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public java.util.List<ServiceData.PositionPb> getPositionsList() {
        if (positionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(positions_);
        } else {
          return positionsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public int getPositionsCount() {
        if (positionsBuilder_ == null) {
          return positions_.size();
        } else {
          return positionsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPb getPositions(int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);
        } else {
          return positionsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder setPositions(
          int index, ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.set(index, value);
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder setPositions(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.set(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addPositions(ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addPositions(
          int index, ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(index, value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addPositions(
          ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addPositions(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addAllPositions(
          java.lang.Iterable<? extends ServiceData.PositionPb> values) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, positions_);
          onChanged();
        } else {
          positionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder clearPositions() {
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          positionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder removePositions(int index) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.remove(index);
          onChanged();
        } else {
          positionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPb.Builder getPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
          int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);  } else {
          return positionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
           getPositionsOrBuilderList() {
        if (positionsBuilder_ != null) {
          return positionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(positions_);
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPb.Builder addPositionsBuilder() {
        return getPositionsFieldBuilder().addBuilder(
            ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPb.Builder addPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().addBuilder(
            index, ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public java.util.List<ServiceData.PositionPb.Builder> 
           getPositionsBuilderList() {
        return getPositionsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getPositionsFieldBuilder() {
        if (positionsBuilder_ == null) {
          positionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  positions_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          positions_ = null;
        }
        return positionsBuilder_;
      }

      private java.lang.Object markinfo_ = "";
      /**
       * <pre>
       *标记信息，文字，比如 "西南警戒区"
       * </pre>
       *
       * <code>string markinfo = 2;</code>
       */
      public java.lang.String getMarkinfo() {
        java.lang.Object ref = markinfo_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          markinfo_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *标记信息，文字，比如 "西南警戒区"
       * </pre>
       *
       * <code>string markinfo = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMarkinfoBytes() {
        java.lang.Object ref = markinfo_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          markinfo_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *标记信息，文字，比如 "西南警戒区"
       * </pre>
       *
       * <code>string markinfo = 2;</code>
       */
      public Builder setMarkinfo(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        markinfo_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *标记信息，文字，比如 "西南警戒区"
       * </pre>
       *
       * <code>string markinfo = 2;</code>
       */
      public Builder clearMarkinfo() {
        
        markinfo_ = getDefaultInstance().getMarkinfo();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *标记信息，文字，比如 "西南警戒区"
       * </pre>
       *
       * <code>string markinfo = 2;</code>
       */
      public Builder setMarkinfoBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        markinfo_ = value;
        onChanged();
        return this;
      }

      private ServiceData.LineStylePb lineStyle_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder> lineStyleBuilder_;
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public boolean hasLineStyle() {
        return lineStyleBuilder_ != null || lineStyle_ != null;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePb getLineStyle() {
        if (lineStyleBuilder_ == null) {
          return lineStyle_ == null ? ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
        } else {
          return lineStyleBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder setLineStyle(ServiceData.LineStylePb value) {
        if (lineStyleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lineStyle_ = value;
          onChanged();
        } else {
          lineStyleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder setLineStyle(
          ServiceData.LineStylePb.Builder builderForValue) {
        if (lineStyleBuilder_ == null) {
          lineStyle_ = builderForValue.build();
          onChanged();
        } else {
          lineStyleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder mergeLineStyle(ServiceData.LineStylePb value) {
        if (lineStyleBuilder_ == null) {
          if (lineStyle_ != null) {
            lineStyle_ =
              ServiceData.LineStylePb.newBuilder(lineStyle_).mergeFrom(value).buildPartial();
          } else {
            lineStyle_ = value;
          }
          onChanged();
        } else {
          lineStyleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder clearLineStyle() {
        if (lineStyleBuilder_ == null) {
          lineStyle_ = null;
          onChanged();
        } else {
          lineStyle_ = null;
          lineStyleBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePb.Builder getLineStyleBuilder() {
        
        onChanged();
        return getLineStyleFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder() {
        if (lineStyleBuilder_ != null) {
          return lineStyleBuilder_.getMessageOrBuilder();
        } else {
          return lineStyle_ == null ?
              ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
        }
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder> 
          getLineStyleFieldBuilder() {
        if (lineStyleBuilder_ == null) {
          lineStyleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder>(
                  getLineStyle(),
                  getParentForChildren(),
                  isClean());
          lineStyle_ = null;
        }
        return lineStyleBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RegionPb)
    }

    // @@protoc_insertion_point(class_scope:RegionPb)
    private static final ServiceData.RegionPb DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.RegionPb();
    }

    public static ServiceData.RegionPb getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RegionPb>
        PARSER = new com.google.protobuf.AbstractParser<RegionPb>() {
      @java.lang.Override
      public RegionPb parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RegionPb(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RegionPb> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<RegionPb> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.RegionPb getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TargetPbOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TargetPb)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *目标坐标
     * </pre>
     *
     * <code>.PositionPb position = 1;</code>
     */
    boolean hasPosition();
    /**
     * <pre>
     *目标坐标
     * </pre>
     *
     * <code>.PositionPb position = 1;</code>
     */
    ServiceData.PositionPb getPosition();
    /**
     * <pre>
     *目标坐标
     * </pre>
     *
     * <code>.PositionPb position = 1;</code>
     */
    ServiceData.PositionPbOrBuilder getPositionOrBuilder();

    /**
     * <pre>
     *目标标记信息，文字，比如 "灯塔"
     * </pre>
     *
     * <code>string markType = 2;</code>
     */
    java.lang.String getMarkType();
    /**
     * <pre>
     *目标标记信息，文字，比如 "灯塔"
     * </pre>
     *
     * <code>string markType = 2;</code>
     */
    com.google.protobuf.ByteString
        getMarkTypeBytes();

    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    boolean hasLineStyle();
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    ServiceData.LineStylePb getLineStyle();
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder();
  }
  /**
   * <pre>
   *关注目标结构，带配色和形状
   * </pre>
   *
   * Protobuf type {@code TargetPb}
   */
  public  static final class TargetPb extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TargetPb)
      TargetPbOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TargetPb.newBuilder() to construct.
    private TargetPb(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TargetPb() {
      markType_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TargetPb(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              ServiceData.PositionPb.Builder subBuilder = null;
              if (position_ != null) {
                subBuilder = position_.toBuilder();
              }
              position_ = input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(position_);
                position_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              markType_ = s;
              break;
            }
            case 26: {
              ServiceData.LineStylePb.Builder subBuilder = null;
              if (lineStyle_ != null) {
                subBuilder = lineStyle_.toBuilder();
              }
              lineStyle_ = input.readMessage(ServiceData.LineStylePb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lineStyle_);
                lineStyle_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_TargetPb_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_TargetPb_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.TargetPb.class, ServiceData.TargetPb.Builder.class);
    }

    public static final int POSITION_FIELD_NUMBER = 1;
    private ServiceData.PositionPb position_;
    /**
     * <pre>
     *目标坐标
     * </pre>
     *
     * <code>.PositionPb position = 1;</code>
     */
    public boolean hasPosition() {
      return position_ != null;
    }
    /**
     * <pre>
     *目标坐标
     * </pre>
     *
     * <code>.PositionPb position = 1;</code>
     */
    public ServiceData.PositionPb getPosition() {
      return position_ == null ? ServiceData.PositionPb.getDefaultInstance() : position_;
    }
    /**
     * <pre>
     *目标坐标
     * </pre>
     *
     * <code>.PositionPb position = 1;</code>
     */
    public ServiceData.PositionPbOrBuilder getPositionOrBuilder() {
      return getPosition();
    }

    public static final int MARKTYPE_FIELD_NUMBER = 2;
    private volatile java.lang.Object markType_;
    /**
     * <pre>
     *目标标记信息，文字，比如 "灯塔"
     * </pre>
     *
     * <code>string markType = 2;</code>
     */
    public java.lang.String getMarkType() {
      java.lang.Object ref = markType_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        markType_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *目标标记信息，文字，比如 "灯塔"
     * </pre>
     *
     * <code>string markType = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMarkTypeBytes() {
      java.lang.Object ref = markType_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        markType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LINESTYLE_FIELD_NUMBER = 3;
    private ServiceData.LineStylePb lineStyle_;
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public boolean hasLineStyle() {
      return lineStyle_ != null;
    }
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public ServiceData.LineStylePb getLineStyle() {
      return lineStyle_ == null ? ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
    }
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder() {
      return getLineStyle();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (position_ != null) {
        output.writeMessage(1, getPosition());
      }
      if (!getMarkTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, markType_);
      }
      if (lineStyle_ != null) {
        output.writeMessage(3, getLineStyle());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (position_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getPosition());
      }
      if (!getMarkTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, markType_);
      }
      if (lineStyle_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLineStyle());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.TargetPb)) {
        return super.equals(obj);
      }
      ServiceData.TargetPb other = (ServiceData.TargetPb) obj;

      boolean result = true;
      result = result && (hasPosition() == other.hasPosition());
      if (hasPosition()) {
        result = result && getPosition()
            .equals(other.getPosition());
      }
      result = result && getMarkType()
          .equals(other.getMarkType());
      result = result && (hasLineStyle() == other.hasLineStyle());
      if (hasLineStyle()) {
        result = result && getLineStyle()
            .equals(other.getLineStyle());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasPosition()) {
        hash = (37 * hash) + POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getPosition().hashCode();
      }
      hash = (37 * hash) + MARKTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getMarkType().hashCode();
      if (hasLineStyle()) {
        hash = (37 * hash) + LINESTYLE_FIELD_NUMBER;
        hash = (53 * hash) + getLineStyle().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.TargetPb parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetPb parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetPb parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetPb parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetPb parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetPb parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetPb parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.TargetPb parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.TargetPb parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.TargetPb parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.TargetPb parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.TargetPb parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.TargetPb prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *关注目标结构，带配色和形状
     * </pre>
     *
     * Protobuf type {@code TargetPb}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TargetPb)
        ServiceData.TargetPbOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_TargetPb_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_TargetPb_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.TargetPb.class, ServiceData.TargetPb.Builder.class);
      }

      // Construct using ServiceData.TargetPb.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (positionBuilder_ == null) {
          position_ = null;
        } else {
          position_ = null;
          positionBuilder_ = null;
        }
        markType_ = "";

        if (lineStyleBuilder_ == null) {
          lineStyle_ = null;
        } else {
          lineStyle_ = null;
          lineStyleBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_TargetPb_descriptor;
      }

      @java.lang.Override
      public ServiceData.TargetPb getDefaultInstanceForType() {
        return ServiceData.TargetPb.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.TargetPb build() {
        ServiceData.TargetPb result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.TargetPb buildPartial() {
        ServiceData.TargetPb result = new ServiceData.TargetPb(this);
        if (positionBuilder_ == null) {
          result.position_ = position_;
        } else {
          result.position_ = positionBuilder_.build();
        }
        result.markType_ = markType_;
        if (lineStyleBuilder_ == null) {
          result.lineStyle_ = lineStyle_;
        } else {
          result.lineStyle_ = lineStyleBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.TargetPb) {
          return mergeFrom((ServiceData.TargetPb)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.TargetPb other) {
        if (other == ServiceData.TargetPb.getDefaultInstance()) return this;
        if (other.hasPosition()) {
          mergePosition(other.getPosition());
        }
        if (!other.getMarkType().isEmpty()) {
          markType_ = other.markType_;
          onChanged();
        }
        if (other.hasLineStyle()) {
          mergeLineStyle(other.getLineStyle());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.TargetPb parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.TargetPb) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private ServiceData.PositionPb position_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> positionBuilder_;
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      public boolean hasPosition() {
        return positionBuilder_ != null || position_ != null;
      }
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      public ServiceData.PositionPb getPosition() {
        if (positionBuilder_ == null) {
          return position_ == null ? ServiceData.PositionPb.getDefaultInstance() : position_;
        } else {
          return positionBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      public Builder setPosition(ServiceData.PositionPb value) {
        if (positionBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          position_ = value;
          onChanged();
        } else {
          positionBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      public Builder setPosition(
          ServiceData.PositionPb.Builder builderForValue) {
        if (positionBuilder_ == null) {
          position_ = builderForValue.build();
          onChanged();
        } else {
          positionBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      public Builder mergePosition(ServiceData.PositionPb value) {
        if (positionBuilder_ == null) {
          if (position_ != null) {
            position_ =
              ServiceData.PositionPb.newBuilder(position_).mergeFrom(value).buildPartial();
          } else {
            position_ = value;
          }
          onChanged();
        } else {
          positionBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      public Builder clearPosition() {
        if (positionBuilder_ == null) {
          position_ = null;
          onChanged();
        } else {
          position_ = null;
          positionBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      public ServiceData.PositionPb.Builder getPositionBuilder() {
        
        onChanged();
        return getPositionFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      public ServiceData.PositionPbOrBuilder getPositionOrBuilder() {
        if (positionBuilder_ != null) {
          return positionBuilder_.getMessageOrBuilder();
        } else {
          return position_ == null ?
              ServiceData.PositionPb.getDefaultInstance() : position_;
        }
      }
      /**
       * <pre>
       *目标坐标
       * </pre>
       *
       * <code>.PositionPb position = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getPositionFieldBuilder() {
        if (positionBuilder_ == null) {
          positionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  getPosition(),
                  getParentForChildren(),
                  isClean());
          position_ = null;
        }
        return positionBuilder_;
      }

      private java.lang.Object markType_ = "";
      /**
       * <pre>
       *目标标记信息，文字，比如 "灯塔"
       * </pre>
       *
       * <code>string markType = 2;</code>
       */
      public java.lang.String getMarkType() {
        java.lang.Object ref = markType_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          markType_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *目标标记信息，文字，比如 "灯塔"
       * </pre>
       *
       * <code>string markType = 2;</code>
       */
      public com.google.protobuf.ByteString
          getMarkTypeBytes() {
        java.lang.Object ref = markType_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          markType_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *目标标记信息，文字，比如 "灯塔"
       * </pre>
       *
       * <code>string markType = 2;</code>
       */
      public Builder setMarkType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        markType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标标记信息，文字，比如 "灯塔"
       * </pre>
       *
       * <code>string markType = 2;</code>
       */
      public Builder clearMarkType() {
        
        markType_ = getDefaultInstance().getMarkType();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标标记信息，文字，比如 "灯塔"
       * </pre>
       *
       * <code>string markType = 2;</code>
       */
      public Builder setMarkTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        markType_ = value;
        onChanged();
        return this;
      }

      private ServiceData.LineStylePb lineStyle_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder> lineStyleBuilder_;
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public boolean hasLineStyle() {
        return lineStyleBuilder_ != null || lineStyle_ != null;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePb getLineStyle() {
        if (lineStyleBuilder_ == null) {
          return lineStyle_ == null ? ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
        } else {
          return lineStyleBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder setLineStyle(ServiceData.LineStylePb value) {
        if (lineStyleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lineStyle_ = value;
          onChanged();
        } else {
          lineStyleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder setLineStyle(
          ServiceData.LineStylePb.Builder builderForValue) {
        if (lineStyleBuilder_ == null) {
          lineStyle_ = builderForValue.build();
          onChanged();
        } else {
          lineStyleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder mergeLineStyle(ServiceData.LineStylePb value) {
        if (lineStyleBuilder_ == null) {
          if (lineStyle_ != null) {
            lineStyle_ =
              ServiceData.LineStylePb.newBuilder(lineStyle_).mergeFrom(value).buildPartial();
          } else {
            lineStyle_ = value;
          }
          onChanged();
        } else {
          lineStyleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder clearLineStyle() {
        if (lineStyleBuilder_ == null) {
          lineStyle_ = null;
          onChanged();
        } else {
          lineStyle_ = null;
          lineStyleBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePb.Builder getLineStyleBuilder() {
        
        onChanged();
        return getLineStyleFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder() {
        if (lineStyleBuilder_ != null) {
          return lineStyleBuilder_.getMessageOrBuilder();
        } else {
          return lineStyle_ == null ?
              ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
        }
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder> 
          getLineStyleFieldBuilder() {
        if (lineStyleBuilder_ == null) {
          lineStyleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder>(
                  getLineStyle(),
                  getParentForChildren(),
                  isClean());
          lineStyle_ = null;
        }
        return lineStyleBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TargetPb)
    }

    // @@protoc_insertion_point(class_scope:TargetPb)
    private static final ServiceData.TargetPb DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.TargetPb();
    }

    public static ServiceData.TargetPb getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TargetPb>
        PARSER = new com.google.protobuf.AbstractParser<TargetPb>() {
      @java.lang.Override
      public TargetPb parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TargetPb(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TargetPb> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TargetPb> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.TargetPb getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface PipeDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:PipeData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    java.util.List<ServiceData.PositionPb> 
        getPositionsList();
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    ServiceData.PositionPb getPositions(int index);
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    int getPositionsCount();
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getPositionsOrBuilderList();
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
        int index);

    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 2;</code>
     */
    boolean hasLineStyle();
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 2;</code>
     */
    ServiceData.LineStylePb getLineStyle();
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 2;</code>
     */
    ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder();
  }
  /**
   * <pre>
   *管线数据结构，用于信息叠加，将管线以自定义线条形式叠加的视频流中
   * </pre>
   *
   * Protobuf type {@code PipeData}
   */
  public  static final class PipeData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:PipeData)
      PipeDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PipeData.newBuilder() to construct.
    private PipeData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PipeData() {
      positions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private PipeData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                positions_ = new java.util.ArrayList<ServiceData.PositionPb>();
                mutable_bitField0_ |= 0x00000001;
              }
              positions_.add(
                  input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry));
              break;
            }
            case 18: {
              ServiceData.LineStylePb.Builder subBuilder = null;
              if (lineStyle_ != null) {
                subBuilder = lineStyle_.toBuilder();
              }
              lineStyle_ = input.readMessage(ServiceData.LineStylePb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lineStyle_);
                lineStyle_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_PipeData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_PipeData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.PipeData.class, ServiceData.PipeData.Builder.class);
    }

    private int bitField0_;
    public static final int POSITIONS_FIELD_NUMBER = 1;
    private java.util.List<ServiceData.PositionPb> positions_;
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public java.util.List<ServiceData.PositionPb> getPositionsList() {
      return positions_;
    }
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getPositionsOrBuilderList() {
      return positions_;
    }
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public int getPositionsCount() {
      return positions_.size();
    }
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public ServiceData.PositionPb getPositions(int index) {
      return positions_.get(index);
    }
    /**
     * <pre>
     *坐标列表
     * </pre>
     *
     * <code>repeated .PositionPb positions = 1;</code>
     */
    public ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
        int index) {
      return positions_.get(index);
    }

    public static final int LINESTYLE_FIELD_NUMBER = 2;
    private ServiceData.LineStylePb lineStyle_;
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 2;</code>
     */
    public boolean hasLineStyle() {
      return lineStyle_ != null;
    }
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 2;</code>
     */
    public ServiceData.LineStylePb getLineStyle() {
      return lineStyle_ == null ? ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
    }
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 2;</code>
     */
    public ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder() {
      return getLineStyle();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < positions_.size(); i++) {
        output.writeMessage(1, positions_.get(i));
      }
      if (lineStyle_ != null) {
        output.writeMessage(2, getLineStyle());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < positions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, positions_.get(i));
      }
      if (lineStyle_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLineStyle());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.PipeData)) {
        return super.equals(obj);
      }
      ServiceData.PipeData other = (ServiceData.PipeData) obj;

      boolean result = true;
      result = result && getPositionsList()
          .equals(other.getPositionsList());
      result = result && (hasLineStyle() == other.hasLineStyle());
      if (hasLineStyle()) {
        result = result && getLineStyle()
            .equals(other.getLineStyle());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getPositionsCount() > 0) {
        hash = (37 * hash) + POSITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getPositionsList().hashCode();
      }
      if (hasLineStyle()) {
        hash = (37 * hash) + LINESTYLE_FIELD_NUMBER;
        hash = (53 * hash) + getLineStyle().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.PipeData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.PipeData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.PipeData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.PipeData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.PipeData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.PipeData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.PipeData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.PipeData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.PipeData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.PipeData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.PipeData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.PipeData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.PipeData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *管线数据结构，用于信息叠加，将管线以自定义线条形式叠加的视频流中
     * </pre>
     *
     * Protobuf type {@code PipeData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:PipeData)
        ServiceData.PipeDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_PipeData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_PipeData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.PipeData.class, ServiceData.PipeData.Builder.class);
      }

      // Construct using ServiceData.PipeData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPositionsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          positionsBuilder_.clear();
        }
        if (lineStyleBuilder_ == null) {
          lineStyle_ = null;
        } else {
          lineStyle_ = null;
          lineStyleBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_PipeData_descriptor;
      }

      @java.lang.Override
      public ServiceData.PipeData getDefaultInstanceForType() {
        return ServiceData.PipeData.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.PipeData build() {
        ServiceData.PipeData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.PipeData buildPartial() {
        ServiceData.PipeData result = new ServiceData.PipeData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (positionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            positions_ = java.util.Collections.unmodifiableList(positions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.positions_ = positions_;
        } else {
          result.positions_ = positionsBuilder_.build();
        }
        if (lineStyleBuilder_ == null) {
          result.lineStyle_ = lineStyle_;
        } else {
          result.lineStyle_ = lineStyleBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.PipeData) {
          return mergeFrom((ServiceData.PipeData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.PipeData other) {
        if (other == ServiceData.PipeData.getDefaultInstance()) return this;
        if (positionsBuilder_ == null) {
          if (!other.positions_.isEmpty()) {
            if (positions_.isEmpty()) {
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensurePositionsIsMutable();
              positions_.addAll(other.positions_);
            }
            onChanged();
          }
        } else {
          if (!other.positions_.isEmpty()) {
            if (positionsBuilder_.isEmpty()) {
              positionsBuilder_.dispose();
              positionsBuilder_ = null;
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              positionsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPositionsFieldBuilder() : null;
            } else {
              positionsBuilder_.addAllMessages(other.positions_);
            }
          }
        }
        if (other.hasLineStyle()) {
          mergeLineStyle(other.getLineStyle());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.PipeData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.PipeData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ServiceData.PositionPb> positions_ =
        java.util.Collections.emptyList();
      private void ensurePositionsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          positions_ = new java.util.ArrayList<ServiceData.PositionPb>(positions_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> positionsBuilder_;

      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public java.util.List<ServiceData.PositionPb> getPositionsList() {
        if (positionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(positions_);
        } else {
          return positionsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public int getPositionsCount() {
        if (positionsBuilder_ == null) {
          return positions_.size();
        } else {
          return positionsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPb getPositions(int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);
        } else {
          return positionsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder setPositions(
          int index, ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.set(index, value);
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder setPositions(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.set(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addPositions(ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addPositions(
          int index, ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(index, value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addPositions(
          ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addPositions(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder addAllPositions(
          java.lang.Iterable<? extends ServiceData.PositionPb> values) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, positions_);
          onChanged();
        } else {
          positionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder clearPositions() {
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          positionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public Builder removePositions(int index) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.remove(index);
          onChanged();
        } else {
          positionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPb.Builder getPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
          int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);  } else {
          return positionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
           getPositionsOrBuilderList() {
        if (positionsBuilder_ != null) {
          return positionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(positions_);
        }
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPb.Builder addPositionsBuilder() {
        return getPositionsFieldBuilder().addBuilder(
            ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public ServiceData.PositionPb.Builder addPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().addBuilder(
            index, ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *坐标列表
       * </pre>
       *
       * <code>repeated .PositionPb positions = 1;</code>
       */
      public java.util.List<ServiceData.PositionPb.Builder> 
           getPositionsBuilderList() {
        return getPositionsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getPositionsFieldBuilder() {
        if (positionsBuilder_ == null) {
          positionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  positions_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          positions_ = null;
        }
        return positionsBuilder_;
      }

      private ServiceData.LineStylePb lineStyle_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder> lineStyleBuilder_;
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      public boolean hasLineStyle() {
        return lineStyleBuilder_ != null || lineStyle_ != null;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      public ServiceData.LineStylePb getLineStyle() {
        if (lineStyleBuilder_ == null) {
          return lineStyle_ == null ? ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
        } else {
          return lineStyleBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      public Builder setLineStyle(ServiceData.LineStylePb value) {
        if (lineStyleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lineStyle_ = value;
          onChanged();
        } else {
          lineStyleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      public Builder setLineStyle(
          ServiceData.LineStylePb.Builder builderForValue) {
        if (lineStyleBuilder_ == null) {
          lineStyle_ = builderForValue.build();
          onChanged();
        } else {
          lineStyleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      public Builder mergeLineStyle(ServiceData.LineStylePb value) {
        if (lineStyleBuilder_ == null) {
          if (lineStyle_ != null) {
            lineStyle_ =
              ServiceData.LineStylePb.newBuilder(lineStyle_).mergeFrom(value).buildPartial();
          } else {
            lineStyle_ = value;
          }
          onChanged();
        } else {
          lineStyleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      public Builder clearLineStyle() {
        if (lineStyleBuilder_ == null) {
          lineStyle_ = null;
          onChanged();
        } else {
          lineStyle_ = null;
          lineStyleBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      public ServiceData.LineStylePb.Builder getLineStyleBuilder() {
        
        onChanged();
        return getLineStyleFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      public ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder() {
        if (lineStyleBuilder_ != null) {
          return lineStyleBuilder_.getMessageOrBuilder();
        } else {
          return lineStyle_ == null ?
              ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
        }
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder> 
          getLineStyleFieldBuilder() {
        if (lineStyleBuilder_ == null) {
          lineStyleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder>(
                  getLineStyle(),
                  getParentForChildren(),
                  isClean());
          lineStyle_ = null;
        }
        return lineStyleBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:PipeData)
    }

    // @@protoc_insertion_point(class_scope:PipeData)
    private static final ServiceData.PipeData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.PipeData();
    }

    public static ServiceData.PipeData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PipeData>
        PARSER = new com.google.protobuf.AbstractParser<PipeData>() {
      @java.lang.Override
      public PipeData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PipeData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<PipeData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PipeData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.PipeData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface CordonDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:CordonData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    java.util.List<ServiceData.PositionPb> 
        getLine1List();
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    ServiceData.PositionPb getLine1(int index);
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    int getLine1Count();
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getLine1OrBuilderList();
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    ServiceData.PositionPbOrBuilder getLine1OrBuilder(
        int index);

    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    java.util.List<ServiceData.PositionPb> 
        getLine2List();
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    ServiceData.PositionPb getLine2(int index);
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    int getLine2Count();
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getLine2OrBuilderList();
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    ServiceData.PositionPbOrBuilder getLine2OrBuilder(
        int index);

    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    boolean hasLineStyle();
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    ServiceData.LineStylePb getLineStyle();
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder();
  }
  /**
   * <pre>
   *管线附近警戒线数据结构，用于信息叠加，将多条警戒线以自定义线条形式叠加到视频流中
   *v1.2更新：替换警戒距离为警戒线坐标列表
   * </pre>
   *
   * Protobuf type {@code CordonData}
   */
  public  static final class CordonData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:CordonData)
      CordonDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CordonData.newBuilder() to construct.
    private CordonData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CordonData() {
      line1_ = java.util.Collections.emptyList();
      line2_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CordonData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                line1_ = new java.util.ArrayList<ServiceData.PositionPb>();
                mutable_bitField0_ |= 0x00000001;
              }
              line1_.add(
                  input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                line2_ = new java.util.ArrayList<ServiceData.PositionPb>();
                mutable_bitField0_ |= 0x00000002;
              }
              line2_.add(
                  input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry));
              break;
            }
            case 26: {
              ServiceData.LineStylePb.Builder subBuilder = null;
              if (lineStyle_ != null) {
                subBuilder = lineStyle_.toBuilder();
              }
              lineStyle_ = input.readMessage(ServiceData.LineStylePb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lineStyle_);
                lineStyle_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          line1_ = java.util.Collections.unmodifiableList(line1_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          line2_ = java.util.Collections.unmodifiableList(line2_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_CordonData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_CordonData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.CordonData.class, ServiceData.CordonData.Builder.class);
    }

    private int bitField0_;
    public static final int LINE1_FIELD_NUMBER = 1;
    private java.util.List<ServiceData.PositionPb> line1_;
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    public java.util.List<ServiceData.PositionPb> getLine1List() {
      return line1_;
    }
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getLine1OrBuilderList() {
      return line1_;
    }
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    public int getLine1Count() {
      return line1_.size();
    }
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    public ServiceData.PositionPb getLine1(int index) {
      return line1_.get(index);
    }
    /**
     * <pre>
     *警戒线坐标列表1
     * </pre>
     *
     * <code>repeated .PositionPb line1 = 1;</code>
     */
    public ServiceData.PositionPbOrBuilder getLine1OrBuilder(
        int index) {
      return line1_.get(index);
    }

    public static final int LINE2_FIELD_NUMBER = 2;
    private java.util.List<ServiceData.PositionPb> line2_;
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    public java.util.List<ServiceData.PositionPb> getLine2List() {
      return line2_;
    }
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getLine2OrBuilderList() {
      return line2_;
    }
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    public int getLine2Count() {
      return line2_.size();
    }
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    public ServiceData.PositionPb getLine2(int index) {
      return line2_.get(index);
    }
    /**
     * <pre>
     *警戒线坐标列表2
     * </pre>
     *
     * <code>repeated .PositionPb line2 = 2;</code>
     */
    public ServiceData.PositionPbOrBuilder getLine2OrBuilder(
        int index) {
      return line2_.get(index);
    }

    public static final int LINESTYLE_FIELD_NUMBER = 3;
    private ServiceData.LineStylePb lineStyle_;
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public boolean hasLineStyle() {
      return lineStyle_ != null;
    }
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public ServiceData.LineStylePb getLineStyle() {
      return lineStyle_ == null ? ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
    }
    /**
     * <pre>
     *配色及形状参数
     * </pre>
     *
     * <code>.LineStylePb lineStyle = 3;</code>
     */
    public ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder() {
      return getLineStyle();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < line1_.size(); i++) {
        output.writeMessage(1, line1_.get(i));
      }
      for (int i = 0; i < line2_.size(); i++) {
        output.writeMessage(2, line2_.get(i));
      }
      if (lineStyle_ != null) {
        output.writeMessage(3, getLineStyle());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < line1_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, line1_.get(i));
      }
      for (int i = 0; i < line2_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, line2_.get(i));
      }
      if (lineStyle_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLineStyle());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.CordonData)) {
        return super.equals(obj);
      }
      ServiceData.CordonData other = (ServiceData.CordonData) obj;

      boolean result = true;
      result = result && getLine1List()
          .equals(other.getLine1List());
      result = result && getLine2List()
          .equals(other.getLine2List());
      result = result && (hasLineStyle() == other.hasLineStyle());
      if (hasLineStyle()) {
        result = result && getLineStyle()
            .equals(other.getLineStyle());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getLine1Count() > 0) {
        hash = (37 * hash) + LINE1_FIELD_NUMBER;
        hash = (53 * hash) + getLine1List().hashCode();
      }
      if (getLine2Count() > 0) {
        hash = (37 * hash) + LINE2_FIELD_NUMBER;
        hash = (53 * hash) + getLine2List().hashCode();
      }
      if (hasLineStyle()) {
        hash = (37 * hash) + LINESTYLE_FIELD_NUMBER;
        hash = (53 * hash) + getLineStyle().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.CordonData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.CordonData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.CordonData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.CordonData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.CordonData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.CordonData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.CordonData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.CordonData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.CordonData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.CordonData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.CordonData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.CordonData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.CordonData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *管线附近警戒线数据结构，用于信息叠加，将多条警戒线以自定义线条形式叠加到视频流中
     *v1.2更新：替换警戒距离为警戒线坐标列表
     * </pre>
     *
     * Protobuf type {@code CordonData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:CordonData)
        ServiceData.CordonDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_CordonData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_CordonData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.CordonData.class, ServiceData.CordonData.Builder.class);
      }

      // Construct using ServiceData.CordonData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getLine1FieldBuilder();
          getLine2FieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (line1Builder_ == null) {
          line1_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          line1Builder_.clear();
        }
        if (line2Builder_ == null) {
          line2_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          line2Builder_.clear();
        }
        if (lineStyleBuilder_ == null) {
          lineStyle_ = null;
        } else {
          lineStyle_ = null;
          lineStyleBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_CordonData_descriptor;
      }

      @java.lang.Override
      public ServiceData.CordonData getDefaultInstanceForType() {
        return ServiceData.CordonData.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.CordonData build() {
        ServiceData.CordonData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.CordonData buildPartial() {
        ServiceData.CordonData result = new ServiceData.CordonData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (line1Builder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            line1_ = java.util.Collections.unmodifiableList(line1_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.line1_ = line1_;
        } else {
          result.line1_ = line1Builder_.build();
        }
        if (line2Builder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            line2_ = java.util.Collections.unmodifiableList(line2_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.line2_ = line2_;
        } else {
          result.line2_ = line2Builder_.build();
        }
        if (lineStyleBuilder_ == null) {
          result.lineStyle_ = lineStyle_;
        } else {
          result.lineStyle_ = lineStyleBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.CordonData) {
          return mergeFrom((ServiceData.CordonData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.CordonData other) {
        if (other == ServiceData.CordonData.getDefaultInstance()) return this;
        if (line1Builder_ == null) {
          if (!other.line1_.isEmpty()) {
            if (line1_.isEmpty()) {
              line1_ = other.line1_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureLine1IsMutable();
              line1_.addAll(other.line1_);
            }
            onChanged();
          }
        } else {
          if (!other.line1_.isEmpty()) {
            if (line1Builder_.isEmpty()) {
              line1Builder_.dispose();
              line1Builder_ = null;
              line1_ = other.line1_;
              bitField0_ = (bitField0_ & ~0x00000001);
              line1Builder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLine1FieldBuilder() : null;
            } else {
              line1Builder_.addAllMessages(other.line1_);
            }
          }
        }
        if (line2Builder_ == null) {
          if (!other.line2_.isEmpty()) {
            if (line2_.isEmpty()) {
              line2_ = other.line2_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureLine2IsMutable();
              line2_.addAll(other.line2_);
            }
            onChanged();
          }
        } else {
          if (!other.line2_.isEmpty()) {
            if (line2Builder_.isEmpty()) {
              line2Builder_.dispose();
              line2Builder_ = null;
              line2_ = other.line2_;
              bitField0_ = (bitField0_ & ~0x00000002);
              line2Builder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLine2FieldBuilder() : null;
            } else {
              line2Builder_.addAllMessages(other.line2_);
            }
          }
        }
        if (other.hasLineStyle()) {
          mergeLineStyle(other.getLineStyle());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.CordonData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.CordonData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ServiceData.PositionPb> line1_ =
        java.util.Collections.emptyList();
      private void ensureLine1IsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          line1_ = new java.util.ArrayList<ServiceData.PositionPb>(line1_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> line1Builder_;

      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public java.util.List<ServiceData.PositionPb> getLine1List() {
        if (line1Builder_ == null) {
          return java.util.Collections.unmodifiableList(line1_);
        } else {
          return line1Builder_.getMessageList();
        }
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public int getLine1Count() {
        if (line1Builder_ == null) {
          return line1_.size();
        } else {
          return line1Builder_.getCount();
        }
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public ServiceData.PositionPb getLine1(int index) {
        if (line1Builder_ == null) {
          return line1_.get(index);
        } else {
          return line1Builder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder setLine1(
          int index, ServiceData.PositionPb value) {
        if (line1Builder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLine1IsMutable();
          line1_.set(index, value);
          onChanged();
        } else {
          line1Builder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder setLine1(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (line1Builder_ == null) {
          ensureLine1IsMutable();
          line1_.set(index, builderForValue.build());
          onChanged();
        } else {
          line1Builder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder addLine1(ServiceData.PositionPb value) {
        if (line1Builder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLine1IsMutable();
          line1_.add(value);
          onChanged();
        } else {
          line1Builder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder addLine1(
          int index, ServiceData.PositionPb value) {
        if (line1Builder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLine1IsMutable();
          line1_.add(index, value);
          onChanged();
        } else {
          line1Builder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder addLine1(
          ServiceData.PositionPb.Builder builderForValue) {
        if (line1Builder_ == null) {
          ensureLine1IsMutable();
          line1_.add(builderForValue.build());
          onChanged();
        } else {
          line1Builder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder addLine1(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (line1Builder_ == null) {
          ensureLine1IsMutable();
          line1_.add(index, builderForValue.build());
          onChanged();
        } else {
          line1Builder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder addAllLine1(
          java.lang.Iterable<? extends ServiceData.PositionPb> values) {
        if (line1Builder_ == null) {
          ensureLine1IsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, line1_);
          onChanged();
        } else {
          line1Builder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder clearLine1() {
        if (line1Builder_ == null) {
          line1_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          line1Builder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public Builder removeLine1(int index) {
        if (line1Builder_ == null) {
          ensureLine1IsMutable();
          line1_.remove(index);
          onChanged();
        } else {
          line1Builder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public ServiceData.PositionPb.Builder getLine1Builder(
          int index) {
        return getLine1FieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public ServiceData.PositionPbOrBuilder getLine1OrBuilder(
          int index) {
        if (line1Builder_ == null) {
          return line1_.get(index);  } else {
          return line1Builder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
           getLine1OrBuilderList() {
        if (line1Builder_ != null) {
          return line1Builder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(line1_);
        }
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public ServiceData.PositionPb.Builder addLine1Builder() {
        return getLine1FieldBuilder().addBuilder(
            ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public ServiceData.PositionPb.Builder addLine1Builder(
          int index) {
        return getLine1FieldBuilder().addBuilder(
            index, ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *警戒线坐标列表1
       * </pre>
       *
       * <code>repeated .PositionPb line1 = 1;</code>
       */
      public java.util.List<ServiceData.PositionPb.Builder> 
           getLine1BuilderList() {
        return getLine1FieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getLine1FieldBuilder() {
        if (line1Builder_ == null) {
          line1Builder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  line1_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          line1_ = null;
        }
        return line1Builder_;
      }

      private java.util.List<ServiceData.PositionPb> line2_ =
        java.util.Collections.emptyList();
      private void ensureLine2IsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          line2_ = new java.util.ArrayList<ServiceData.PositionPb>(line2_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> line2Builder_;

      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public java.util.List<ServiceData.PositionPb> getLine2List() {
        if (line2Builder_ == null) {
          return java.util.Collections.unmodifiableList(line2_);
        } else {
          return line2Builder_.getMessageList();
        }
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public int getLine2Count() {
        if (line2Builder_ == null) {
          return line2_.size();
        } else {
          return line2Builder_.getCount();
        }
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public ServiceData.PositionPb getLine2(int index) {
        if (line2Builder_ == null) {
          return line2_.get(index);
        } else {
          return line2Builder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder setLine2(
          int index, ServiceData.PositionPb value) {
        if (line2Builder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLine2IsMutable();
          line2_.set(index, value);
          onChanged();
        } else {
          line2Builder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder setLine2(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (line2Builder_ == null) {
          ensureLine2IsMutable();
          line2_.set(index, builderForValue.build());
          onChanged();
        } else {
          line2Builder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder addLine2(ServiceData.PositionPb value) {
        if (line2Builder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLine2IsMutable();
          line2_.add(value);
          onChanged();
        } else {
          line2Builder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder addLine2(
          int index, ServiceData.PositionPb value) {
        if (line2Builder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLine2IsMutable();
          line2_.add(index, value);
          onChanged();
        } else {
          line2Builder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder addLine2(
          ServiceData.PositionPb.Builder builderForValue) {
        if (line2Builder_ == null) {
          ensureLine2IsMutable();
          line2_.add(builderForValue.build());
          onChanged();
        } else {
          line2Builder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder addLine2(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (line2Builder_ == null) {
          ensureLine2IsMutable();
          line2_.add(index, builderForValue.build());
          onChanged();
        } else {
          line2Builder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder addAllLine2(
          java.lang.Iterable<? extends ServiceData.PositionPb> values) {
        if (line2Builder_ == null) {
          ensureLine2IsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, line2_);
          onChanged();
        } else {
          line2Builder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder clearLine2() {
        if (line2Builder_ == null) {
          line2_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          line2Builder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public Builder removeLine2(int index) {
        if (line2Builder_ == null) {
          ensureLine2IsMutable();
          line2_.remove(index);
          onChanged();
        } else {
          line2Builder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public ServiceData.PositionPb.Builder getLine2Builder(
          int index) {
        return getLine2FieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public ServiceData.PositionPbOrBuilder getLine2OrBuilder(
          int index) {
        if (line2Builder_ == null) {
          return line2_.get(index);  } else {
          return line2Builder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
           getLine2OrBuilderList() {
        if (line2Builder_ != null) {
          return line2Builder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(line2_);
        }
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public ServiceData.PositionPb.Builder addLine2Builder() {
        return getLine2FieldBuilder().addBuilder(
            ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public ServiceData.PositionPb.Builder addLine2Builder(
          int index) {
        return getLine2FieldBuilder().addBuilder(
            index, ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *警戒线坐标列表2
       * </pre>
       *
       * <code>repeated .PositionPb line2 = 2;</code>
       */
      public java.util.List<ServiceData.PositionPb.Builder> 
           getLine2BuilderList() {
        return getLine2FieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getLine2FieldBuilder() {
        if (line2Builder_ == null) {
          line2Builder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  line2_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          line2_ = null;
        }
        return line2Builder_;
      }

      private ServiceData.LineStylePb lineStyle_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder> lineStyleBuilder_;
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public boolean hasLineStyle() {
        return lineStyleBuilder_ != null || lineStyle_ != null;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePb getLineStyle() {
        if (lineStyleBuilder_ == null) {
          return lineStyle_ == null ? ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
        } else {
          return lineStyleBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder setLineStyle(ServiceData.LineStylePb value) {
        if (lineStyleBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lineStyle_ = value;
          onChanged();
        } else {
          lineStyleBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder setLineStyle(
          ServiceData.LineStylePb.Builder builderForValue) {
        if (lineStyleBuilder_ == null) {
          lineStyle_ = builderForValue.build();
          onChanged();
        } else {
          lineStyleBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder mergeLineStyle(ServiceData.LineStylePb value) {
        if (lineStyleBuilder_ == null) {
          if (lineStyle_ != null) {
            lineStyle_ =
              ServiceData.LineStylePb.newBuilder(lineStyle_).mergeFrom(value).buildPartial();
          } else {
            lineStyle_ = value;
          }
          onChanged();
        } else {
          lineStyleBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public Builder clearLineStyle() {
        if (lineStyleBuilder_ == null) {
          lineStyle_ = null;
          onChanged();
        } else {
          lineStyle_ = null;
          lineStyleBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePb.Builder getLineStyleBuilder() {
        
        onChanged();
        return getLineStyleFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      public ServiceData.LineStylePbOrBuilder getLineStyleOrBuilder() {
        if (lineStyleBuilder_ != null) {
          return lineStyleBuilder_.getMessageOrBuilder();
        } else {
          return lineStyle_ == null ?
              ServiceData.LineStylePb.getDefaultInstance() : lineStyle_;
        }
      }
      /**
       * <pre>
       *配色及形状参数
       * </pre>
       *
       * <code>.LineStylePb lineStyle = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder> 
          getLineStyleFieldBuilder() {
        if (lineStyleBuilder_ == null) {
          lineStyleBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.LineStylePb, ServiceData.LineStylePb.Builder, ServiceData.LineStylePbOrBuilder>(
                  getLineStyle(),
                  getParentForChildren(),
                  isClean());
          lineStyle_ = null;
        }
        return lineStyleBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:CordonData)
    }

    // @@protoc_insertion_point(class_scope:CordonData)
    private static final ServiceData.CordonData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.CordonData();
    }

    public static ServiceData.CordonData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CordonData>
        PARSER = new com.google.protobuf.AbstractParser<CordonData>() {
      @java.lang.Override
      public CordonData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CordonData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CordonData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CordonData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.CordonData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface FocusDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:FocusData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    java.util.List<ServiceData.RegionPb> 
        getRegionsList();
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    ServiceData.RegionPb getRegions(int index);
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    int getRegionsCount();
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    java.util.List<? extends ServiceData.RegionPbOrBuilder> 
        getRegionsOrBuilderList();
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    ServiceData.RegionPbOrBuilder getRegionsOrBuilder(
        int index);

    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    java.util.List<ServiceData.TargetPb> 
        getTargetsList();
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    ServiceData.TargetPb getTargets(int index);
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    int getTargetsCount();
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    java.util.List<? extends ServiceData.TargetPbOrBuilder> 
        getTargetsOrBuilderList();
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    ServiceData.TargetPbOrBuilder getTargetsOrBuilder(
        int index);
  }
  /**
   * <pre>
   *关注区域和目标列表信息结构，整合关注区域和目标，用于信息叠加，在视频中将这些区域和目标进行叠加
   * </pre>
   *
   * Protobuf type {@code FocusData}
   */
  public  static final class FocusData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:FocusData)
      FocusDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use FocusData.newBuilder() to construct.
    private FocusData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private FocusData() {
      regions_ = java.util.Collections.emptyList();
      targets_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private FocusData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                regions_ = new java.util.ArrayList<ServiceData.RegionPb>();
                mutable_bitField0_ |= 0x00000001;
              }
              regions_.add(
                  input.readMessage(ServiceData.RegionPb.parser(), extensionRegistry));
              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                targets_ = new java.util.ArrayList<ServiceData.TargetPb>();
                mutable_bitField0_ |= 0x00000002;
              }
              targets_.add(
                  input.readMessage(ServiceData.TargetPb.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          regions_ = java.util.Collections.unmodifiableList(regions_);
        }
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          targets_ = java.util.Collections.unmodifiableList(targets_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_FocusData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_FocusData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.FocusData.class, ServiceData.FocusData.Builder.class);
    }

    public static final int REGIONS_FIELD_NUMBER = 1;
    private java.util.List<ServiceData.RegionPb> regions_;
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    public java.util.List<ServiceData.RegionPb> getRegionsList() {
      return regions_;
    }
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    public java.util.List<? extends ServiceData.RegionPbOrBuilder> 
        getRegionsOrBuilderList() {
      return regions_;
    }
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    public int getRegionsCount() {
      return regions_.size();
    }
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    public ServiceData.RegionPb getRegions(int index) {
      return regions_.get(index);
    }
    /**
     * <pre>
     *关注区域列表
     * </pre>
     *
     * <code>repeated .RegionPb regions = 1;</code>
     */
    public ServiceData.RegionPbOrBuilder getRegionsOrBuilder(
        int index) {
      return regions_.get(index);
    }

    public static final int TARGETS_FIELD_NUMBER = 2;
    private java.util.List<ServiceData.TargetPb> targets_;
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    public java.util.List<ServiceData.TargetPb> getTargetsList() {
      return targets_;
    }
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    public java.util.List<? extends ServiceData.TargetPbOrBuilder> 
        getTargetsOrBuilderList() {
      return targets_;
    }
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    public int getTargetsCount() {
      return targets_.size();
    }
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    public ServiceData.TargetPb getTargets(int index) {
      return targets_.get(index);
    }
    /**
     * <pre>
     *关注目标列表
     * </pre>
     *
     * <code>repeated .TargetPb targets = 2;</code>
     */
    public ServiceData.TargetPbOrBuilder getTargetsOrBuilder(
        int index) {
      return targets_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < regions_.size(); i++) {
        output.writeMessage(1, regions_.get(i));
      }
      for (int i = 0; i < targets_.size(); i++) {
        output.writeMessage(2, targets_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < regions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, regions_.get(i));
      }
      for (int i = 0; i < targets_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, targets_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.FocusData)) {
        return super.equals(obj);
      }
      ServiceData.FocusData other = (ServiceData.FocusData) obj;

      boolean result = true;
      result = result && getRegionsList()
          .equals(other.getRegionsList());
      result = result && getTargetsList()
          .equals(other.getTargetsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getRegionsCount() > 0) {
        hash = (37 * hash) + REGIONS_FIELD_NUMBER;
        hash = (53 * hash) + getRegionsList().hashCode();
      }
      if (getTargetsCount() > 0) {
        hash = (37 * hash) + TARGETS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.FocusData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.FocusData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.FocusData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.FocusData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.FocusData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.FocusData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.FocusData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.FocusData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.FocusData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.FocusData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.FocusData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.FocusData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.FocusData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *关注区域和目标列表信息结构，整合关注区域和目标，用于信息叠加，在视频中将这些区域和目标进行叠加
     * </pre>
     *
     * Protobuf type {@code FocusData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:FocusData)
        ServiceData.FocusDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_FocusData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_FocusData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.FocusData.class, ServiceData.FocusData.Builder.class);
      }

      // Construct using ServiceData.FocusData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getRegionsFieldBuilder();
          getTargetsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (regionsBuilder_ == null) {
          regions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          regionsBuilder_.clear();
        }
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          targetsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_FocusData_descriptor;
      }

      @java.lang.Override
      public ServiceData.FocusData getDefaultInstanceForType() {
        return ServiceData.FocusData.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.FocusData build() {
        ServiceData.FocusData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.FocusData buildPartial() {
        ServiceData.FocusData result = new ServiceData.FocusData(this);
        int from_bitField0_ = bitField0_;
        if (regionsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            regions_ = java.util.Collections.unmodifiableList(regions_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.regions_ = regions_;
        } else {
          result.regions_ = regionsBuilder_.build();
        }
        if (targetsBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            targets_ = java.util.Collections.unmodifiableList(targets_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.targets_ = targets_;
        } else {
          result.targets_ = targetsBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.FocusData) {
          return mergeFrom((ServiceData.FocusData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.FocusData other) {
        if (other == ServiceData.FocusData.getDefaultInstance()) return this;
        if (regionsBuilder_ == null) {
          if (!other.regions_.isEmpty()) {
            if (regions_.isEmpty()) {
              regions_ = other.regions_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRegionsIsMutable();
              regions_.addAll(other.regions_);
            }
            onChanged();
          }
        } else {
          if (!other.regions_.isEmpty()) {
            if (regionsBuilder_.isEmpty()) {
              regionsBuilder_.dispose();
              regionsBuilder_ = null;
              regions_ = other.regions_;
              bitField0_ = (bitField0_ & ~0x00000001);
              regionsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRegionsFieldBuilder() : null;
            } else {
              regionsBuilder_.addAllMessages(other.regions_);
            }
          }
        }
        if (targetsBuilder_ == null) {
          if (!other.targets_.isEmpty()) {
            if (targets_.isEmpty()) {
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureTargetsIsMutable();
              targets_.addAll(other.targets_);
            }
            onChanged();
          }
        } else {
          if (!other.targets_.isEmpty()) {
            if (targetsBuilder_.isEmpty()) {
              targetsBuilder_.dispose();
              targetsBuilder_ = null;
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000002);
              targetsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTargetsFieldBuilder() : null;
            } else {
              targetsBuilder_.addAllMessages(other.targets_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.FocusData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.FocusData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ServiceData.RegionPb> regions_ =
        java.util.Collections.emptyList();
      private void ensureRegionsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          regions_ = new java.util.ArrayList<ServiceData.RegionPb>(regions_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.RegionPb, ServiceData.RegionPb.Builder, ServiceData.RegionPbOrBuilder> regionsBuilder_;

      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public java.util.List<ServiceData.RegionPb> getRegionsList() {
        if (regionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(regions_);
        } else {
          return regionsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public int getRegionsCount() {
        if (regionsBuilder_ == null) {
          return regions_.size();
        } else {
          return regionsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public ServiceData.RegionPb getRegions(int index) {
        if (regionsBuilder_ == null) {
          return regions_.get(index);
        } else {
          return regionsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder setRegions(
          int index, ServiceData.RegionPb value) {
        if (regionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionsIsMutable();
          regions_.set(index, value);
          onChanged();
        } else {
          regionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder setRegions(
          int index, ServiceData.RegionPb.Builder builderForValue) {
        if (regionsBuilder_ == null) {
          ensureRegionsIsMutable();
          regions_.set(index, builderForValue.build());
          onChanged();
        } else {
          regionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder addRegions(ServiceData.RegionPb value) {
        if (regionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionsIsMutable();
          regions_.add(value);
          onChanged();
        } else {
          regionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder addRegions(
          int index, ServiceData.RegionPb value) {
        if (regionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRegionsIsMutable();
          regions_.add(index, value);
          onChanged();
        } else {
          regionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder addRegions(
          ServiceData.RegionPb.Builder builderForValue) {
        if (regionsBuilder_ == null) {
          ensureRegionsIsMutable();
          regions_.add(builderForValue.build());
          onChanged();
        } else {
          regionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder addRegions(
          int index, ServiceData.RegionPb.Builder builderForValue) {
        if (regionsBuilder_ == null) {
          ensureRegionsIsMutable();
          regions_.add(index, builderForValue.build());
          onChanged();
        } else {
          regionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder addAllRegions(
          java.lang.Iterable<? extends ServiceData.RegionPb> values) {
        if (regionsBuilder_ == null) {
          ensureRegionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, regions_);
          onChanged();
        } else {
          regionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder clearRegions() {
        if (regionsBuilder_ == null) {
          regions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          regionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public Builder removeRegions(int index) {
        if (regionsBuilder_ == null) {
          ensureRegionsIsMutable();
          regions_.remove(index);
          onChanged();
        } else {
          regionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public ServiceData.RegionPb.Builder getRegionsBuilder(
          int index) {
        return getRegionsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public ServiceData.RegionPbOrBuilder getRegionsOrBuilder(
          int index) {
        if (regionsBuilder_ == null) {
          return regions_.get(index);  } else {
          return regionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public java.util.List<? extends ServiceData.RegionPbOrBuilder> 
           getRegionsOrBuilderList() {
        if (regionsBuilder_ != null) {
          return regionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(regions_);
        }
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public ServiceData.RegionPb.Builder addRegionsBuilder() {
        return getRegionsFieldBuilder().addBuilder(
            ServiceData.RegionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public ServiceData.RegionPb.Builder addRegionsBuilder(
          int index) {
        return getRegionsFieldBuilder().addBuilder(
            index, ServiceData.RegionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *关注区域列表
       * </pre>
       *
       * <code>repeated .RegionPb regions = 1;</code>
       */
      public java.util.List<ServiceData.RegionPb.Builder> 
           getRegionsBuilderList() {
        return getRegionsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.RegionPb, ServiceData.RegionPb.Builder, ServiceData.RegionPbOrBuilder> 
          getRegionsFieldBuilder() {
        if (regionsBuilder_ == null) {
          regionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.RegionPb, ServiceData.RegionPb.Builder, ServiceData.RegionPbOrBuilder>(
                  regions_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          regions_ = null;
        }
        return regionsBuilder_;
      }

      private java.util.List<ServiceData.TargetPb> targets_ =
        java.util.Collections.emptyList();
      private void ensureTargetsIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          targets_ = new java.util.ArrayList<ServiceData.TargetPb>(targets_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.TargetPb, ServiceData.TargetPb.Builder, ServiceData.TargetPbOrBuilder> targetsBuilder_;

      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public java.util.List<ServiceData.TargetPb> getTargetsList() {
        if (targetsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(targets_);
        } else {
          return targetsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public int getTargetsCount() {
        if (targetsBuilder_ == null) {
          return targets_.size();
        } else {
          return targetsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public ServiceData.TargetPb getTargets(int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);
        } else {
          return targetsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder setTargets(
          int index, ServiceData.TargetPb value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.set(index, value);
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder setTargets(
          int index, ServiceData.TargetPb.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.set(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder addTargets(ServiceData.TargetPb value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder addTargets(
          int index, ServiceData.TargetPb value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(index, value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder addTargets(
          ServiceData.TargetPb.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder addTargets(
          int index, ServiceData.TargetPb.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder addAllTargets(
          java.lang.Iterable<? extends ServiceData.TargetPb> values) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, targets_);
          onChanged();
        } else {
          targetsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder clearTargets() {
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          targetsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public Builder removeTargets(int index) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.remove(index);
          onChanged();
        } else {
          targetsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public ServiceData.TargetPb.Builder getTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public ServiceData.TargetPbOrBuilder getTargetsOrBuilder(
          int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);  } else {
          return targetsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public java.util.List<? extends ServiceData.TargetPbOrBuilder> 
           getTargetsOrBuilderList() {
        if (targetsBuilder_ != null) {
          return targetsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(targets_);
        }
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public ServiceData.TargetPb.Builder addTargetsBuilder() {
        return getTargetsFieldBuilder().addBuilder(
            ServiceData.TargetPb.getDefaultInstance());
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public ServiceData.TargetPb.Builder addTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().addBuilder(
            index, ServiceData.TargetPb.getDefaultInstance());
      }
      /**
       * <pre>
       *关注目标列表
       * </pre>
       *
       * <code>repeated .TargetPb targets = 2;</code>
       */
      public java.util.List<ServiceData.TargetPb.Builder> 
           getTargetsBuilderList() {
        return getTargetsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.TargetPb, ServiceData.TargetPb.Builder, ServiceData.TargetPbOrBuilder> 
          getTargetsFieldBuilder() {
        if (targetsBuilder_ == null) {
          targetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.TargetPb, ServiceData.TargetPb.Builder, ServiceData.TargetPbOrBuilder>(
                  targets_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          targets_ = null;
        }
        return targetsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:FocusData)
    }

    // @@protoc_insertion_point(class_scope:FocusData)
    private static final ServiceData.FocusData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.FocusData();
    }

    public static ServiceData.FocusData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FocusData>
        PARSER = new com.google.protobuf.AbstractParser<FocusData>() {
      @java.lang.Override
      public FocusData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FocusData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<FocusData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<FocusData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.FocusData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface HistoryImageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HistoryImage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息
     * </pre>
     *
     * <code>.PositionPb location = 1;</code>
     */
    boolean hasLocation();
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息
     * </pre>
     *
     * <code>.PositionPb location = 1;</code>
     */
    ServiceData.PositionPb getLocation();
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息
     * </pre>
     *
     * <code>.PositionPb location = 1;</code>
     */
    ServiceData.PositionPbOrBuilder getLocationOrBuilder();

    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    java.util.List<ServiceData.PositionPb> 
        getViewFildList();
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    ServiceData.PositionPb getViewFild(int index);
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    int getViewFildCount();
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getViewFildOrBuilderList();
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    ServiceData.PositionPbOrBuilder getViewFildOrBuilder(
        int index);

    /**
     * <pre>
     *图片访问url
     * </pre>
     *
     * <code>string url = 3;</code>
     */
    java.lang.String getUrl();
    /**
     * <pre>
     *图片访问url
     * </pre>
     *
     * <code>string url = 3;</code>
     */
    com.google.protobuf.ByteString
        getUrlBytes();
  }
  /**
   * <pre>
   *历史图片结构，包括图片GPS信息、视场数据和访问URL
   * </pre>
   *
   * Protobuf type {@code HistoryImage}
   */
  public  static final class HistoryImage extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HistoryImage)
      HistoryImageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HistoryImage.newBuilder() to construct.
    private HistoryImage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HistoryImage() {
      viewFild_ = java.util.Collections.emptyList();
      url_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HistoryImage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              ServiceData.PositionPb.Builder subBuilder = null;
              if (location_ != null) {
                subBuilder = location_.toBuilder();
              }
              location_ = input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(location_);
                location_ = subBuilder.buildPartial();
              }

              break;
            }
            case 18: {
              if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                viewFild_ = new java.util.ArrayList<ServiceData.PositionPb>();
                mutable_bitField0_ |= 0x00000002;
              }
              viewFild_.add(
                  input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry));
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              url_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
          viewFild_ = java.util.Collections.unmodifiableList(viewFild_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_HistoryImage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_HistoryImage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.HistoryImage.class, ServiceData.HistoryImage.Builder.class);
    }

    private int bitField0_;
    public static final int LOCATION_FIELD_NUMBER = 1;
    private ServiceData.PositionPb location_;
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息
     * </pre>
     *
     * <code>.PositionPb location = 1;</code>
     */
    public boolean hasLocation() {
      return location_ != null;
    }
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息
     * </pre>
     *
     * <code>.PositionPb location = 1;</code>
     */
    public ServiceData.PositionPb getLocation() {
      return location_ == null ? ServiceData.PositionPb.getDefaultInstance() : location_;
    }
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息
     * </pre>
     *
     * <code>.PositionPb location = 1;</code>
     */
    public ServiceData.PositionPbOrBuilder getLocationOrBuilder() {
      return getLocation();
    }

    public static final int VIEWFILD_FIELD_NUMBER = 2;
    private java.util.List<ServiceData.PositionPb> viewFild_;
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    public java.util.List<ServiceData.PositionPb> getViewFildList() {
      return viewFild_;
    }
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getViewFildOrBuilderList() {
      return viewFild_;
    }
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    public int getViewFildCount() {
      return viewFild_.size();
    }
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    public ServiceData.PositionPb getViewFild(int index) {
      return viewFild_.get(index);
    }
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
     * </pre>
     *
     * <code>repeated .PositionPb viewFild = 2;</code>
     */
    public ServiceData.PositionPbOrBuilder getViewFildOrBuilder(
        int index) {
      return viewFild_.get(index);
    }

    public static final int URL_FIELD_NUMBER = 3;
    private volatile java.lang.Object url_;
    /**
     * <pre>
     *图片访问url
     * </pre>
     *
     * <code>string url = 3;</code>
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *图片访问url
     * </pre>
     *
     * <code>string url = 3;</code>
     */
    public com.google.protobuf.ByteString
        getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (location_ != null) {
        output.writeMessage(1, getLocation());
      }
      for (int i = 0; i < viewFild_.size(); i++) {
        output.writeMessage(2, viewFild_.get(i));
      }
      if (!getUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, url_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (location_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getLocation());
      }
      for (int i = 0; i < viewFild_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, viewFild_.get(i));
      }
      if (!getUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, url_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.HistoryImage)) {
        return super.equals(obj);
      }
      ServiceData.HistoryImage other = (ServiceData.HistoryImage) obj;

      boolean result = true;
      result = result && (hasLocation() == other.hasLocation());
      if (hasLocation()) {
        result = result && getLocation()
            .equals(other.getLocation());
      }
      result = result && getViewFildList()
          .equals(other.getViewFildList());
      result = result && getUrl()
          .equals(other.getUrl());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasLocation()) {
        hash = (37 * hash) + LOCATION_FIELD_NUMBER;
        hash = (53 * hash) + getLocation().hashCode();
      }
      if (getViewFildCount() > 0) {
        hash = (37 * hash) + VIEWFILD_FIELD_NUMBER;
        hash = (53 * hash) + getViewFildList().hashCode();
      }
      hash = (37 * hash) + URL_FIELD_NUMBER;
      hash = (53 * hash) + getUrl().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.HistoryImage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.HistoryImage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.HistoryImage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.HistoryImage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.HistoryImage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.HistoryImage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.HistoryImage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.HistoryImage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.HistoryImage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.HistoryImage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.HistoryImage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.HistoryImage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.HistoryImage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *历史图片结构，包括图片GPS信息、视场数据和访问URL
     * </pre>
     *
     * Protobuf type {@code HistoryImage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HistoryImage)
        ServiceData.HistoryImageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_HistoryImage_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_HistoryImage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.HistoryImage.class, ServiceData.HistoryImage.Builder.class);
      }

      // Construct using ServiceData.HistoryImage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getViewFildFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (locationBuilder_ == null) {
          location_ = null;
        } else {
          location_ = null;
          locationBuilder_ = null;
        }
        if (viewFildBuilder_ == null) {
          viewFild_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          viewFildBuilder_.clear();
        }
        url_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_HistoryImage_descriptor;
      }

      @java.lang.Override
      public ServiceData.HistoryImage getDefaultInstanceForType() {
        return ServiceData.HistoryImage.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.HistoryImage build() {
        ServiceData.HistoryImage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.HistoryImage buildPartial() {
        ServiceData.HistoryImage result = new ServiceData.HistoryImage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (locationBuilder_ == null) {
          result.location_ = location_;
        } else {
          result.location_ = locationBuilder_.build();
        }
        if (viewFildBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002)) {
            viewFild_ = java.util.Collections.unmodifiableList(viewFild_);
            bitField0_ = (bitField0_ & ~0x00000002);
          }
          result.viewFild_ = viewFild_;
        } else {
          result.viewFild_ = viewFildBuilder_.build();
        }
        result.url_ = url_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.HistoryImage) {
          return mergeFrom((ServiceData.HistoryImage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.HistoryImage other) {
        if (other == ServiceData.HistoryImage.getDefaultInstance()) return this;
        if (other.hasLocation()) {
          mergeLocation(other.getLocation());
        }
        if (viewFildBuilder_ == null) {
          if (!other.viewFild_.isEmpty()) {
            if (viewFild_.isEmpty()) {
              viewFild_ = other.viewFild_;
              bitField0_ = (bitField0_ & ~0x00000002);
            } else {
              ensureViewFildIsMutable();
              viewFild_.addAll(other.viewFild_);
            }
            onChanged();
          }
        } else {
          if (!other.viewFild_.isEmpty()) {
            if (viewFildBuilder_.isEmpty()) {
              viewFildBuilder_.dispose();
              viewFildBuilder_ = null;
              viewFild_ = other.viewFild_;
              bitField0_ = (bitField0_ & ~0x00000002);
              viewFildBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getViewFildFieldBuilder() : null;
            } else {
              viewFildBuilder_.addAllMessages(other.viewFild_);
            }
          }
        }
        if (!other.getUrl().isEmpty()) {
          url_ = other.url_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.HistoryImage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.HistoryImage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private ServiceData.PositionPb location_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> locationBuilder_;
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      public boolean hasLocation() {
        return locationBuilder_ != null || location_ != null;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      public ServiceData.PositionPb getLocation() {
        if (locationBuilder_ == null) {
          return location_ == null ? ServiceData.PositionPb.getDefaultInstance() : location_;
        } else {
          return locationBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      public Builder setLocation(ServiceData.PositionPb value) {
        if (locationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          location_ = value;
          onChanged();
        } else {
          locationBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      public Builder setLocation(
          ServiceData.PositionPb.Builder builderForValue) {
        if (locationBuilder_ == null) {
          location_ = builderForValue.build();
          onChanged();
        } else {
          locationBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      public Builder mergeLocation(ServiceData.PositionPb value) {
        if (locationBuilder_ == null) {
          if (location_ != null) {
            location_ =
              ServiceData.PositionPb.newBuilder(location_).mergeFrom(value).buildPartial();
          } else {
            location_ = value;
          }
          onChanged();
        } else {
          locationBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      public Builder clearLocation() {
        if (locationBuilder_ == null) {
          location_ = null;
          onChanged();
        } else {
          location_ = null;
          locationBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      public ServiceData.PositionPb.Builder getLocationBuilder() {
        
        onChanged();
        return getLocationFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      public ServiceData.PositionPbOrBuilder getLocationOrBuilder() {
        if (locationBuilder_ != null) {
          return locationBuilder_.getMessageOrBuilder();
        } else {
          return location_ == null ?
              ServiceData.PositionPb.getDefaultInstance() : location_;
        }
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息
       * </pre>
       *
       * <code>.PositionPb location = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getLocationFieldBuilder() {
        if (locationBuilder_ == null) {
          locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  getLocation(),
                  getParentForChildren(),
                  isClean());
          location_ = null;
        }
        return locationBuilder_;
      }

      private java.util.List<ServiceData.PositionPb> viewFild_ =
        java.util.Collections.emptyList();
      private void ensureViewFildIsMutable() {
        if (!((bitField0_ & 0x00000002) == 0x00000002)) {
          viewFild_ = new java.util.ArrayList<ServiceData.PositionPb>(viewFild_);
          bitField0_ |= 0x00000002;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> viewFildBuilder_;

      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public java.util.List<ServiceData.PositionPb> getViewFildList() {
        if (viewFildBuilder_ == null) {
          return java.util.Collections.unmodifiableList(viewFild_);
        } else {
          return viewFildBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public int getViewFildCount() {
        if (viewFildBuilder_ == null) {
          return viewFild_.size();
        } else {
          return viewFildBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public ServiceData.PositionPb getViewFild(int index) {
        if (viewFildBuilder_ == null) {
          return viewFild_.get(index);
        } else {
          return viewFildBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder setViewFild(
          int index, ServiceData.PositionPb value) {
        if (viewFildBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureViewFildIsMutable();
          viewFild_.set(index, value);
          onChanged();
        } else {
          viewFildBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder setViewFild(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (viewFildBuilder_ == null) {
          ensureViewFildIsMutable();
          viewFild_.set(index, builderForValue.build());
          onChanged();
        } else {
          viewFildBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder addViewFild(ServiceData.PositionPb value) {
        if (viewFildBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureViewFildIsMutable();
          viewFild_.add(value);
          onChanged();
        } else {
          viewFildBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder addViewFild(
          int index, ServiceData.PositionPb value) {
        if (viewFildBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureViewFildIsMutable();
          viewFild_.add(index, value);
          onChanged();
        } else {
          viewFildBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder addViewFild(
          ServiceData.PositionPb.Builder builderForValue) {
        if (viewFildBuilder_ == null) {
          ensureViewFildIsMutable();
          viewFild_.add(builderForValue.build());
          onChanged();
        } else {
          viewFildBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder addViewFild(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (viewFildBuilder_ == null) {
          ensureViewFildIsMutable();
          viewFild_.add(index, builderForValue.build());
          onChanged();
        } else {
          viewFildBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder addAllViewFild(
          java.lang.Iterable<? extends ServiceData.PositionPb> values) {
        if (viewFildBuilder_ == null) {
          ensureViewFildIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, viewFild_);
          onChanged();
        } else {
          viewFildBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder clearViewFild() {
        if (viewFildBuilder_ == null) {
          viewFild_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000002);
          onChanged();
        } else {
          viewFildBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public Builder removeViewFild(int index) {
        if (viewFildBuilder_ == null) {
          ensureViewFildIsMutable();
          viewFild_.remove(index);
          onChanged();
        } else {
          viewFildBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public ServiceData.PositionPb.Builder getViewFildBuilder(
          int index) {
        return getViewFildFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public ServiceData.PositionPbOrBuilder getViewFildOrBuilder(
          int index) {
        if (viewFildBuilder_ == null) {
          return viewFild_.get(index);  } else {
          return viewFildBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
           getViewFildOrBuilderList() {
        if (viewFildBuilder_ != null) {
          return viewFildBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(viewFild_);
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public ServiceData.PositionPb.Builder addViewFildBuilder() {
        return getViewFildFieldBuilder().addBuilder(
            ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public ServiceData.PositionPb.Builder addViewFildBuilder(
          int index) {
        return getViewFildFieldBuilder().addBuilder(
            index, ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心地理位置
       * </pre>
       *
       * <code>repeated .PositionPb viewFild = 2;</code>
       */
      public java.util.List<ServiceData.PositionPb.Builder> 
           getViewFildBuilderList() {
        return getViewFildFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getViewFildFieldBuilder() {
        if (viewFildBuilder_ == null) {
          viewFildBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  viewFild_,
                  ((bitField0_ & 0x00000002) == 0x00000002),
                  getParentForChildren(),
                  isClean());
          viewFild_ = null;
        }
        return viewFildBuilder_;
      }

      private java.lang.Object url_ = "";
      /**
       * <pre>
       *图片访问url
       * </pre>
       *
       * <code>string url = 3;</code>
       */
      public java.lang.String getUrl() {
        java.lang.Object ref = url_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          url_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *图片访问url
       * </pre>
       *
       * <code>string url = 3;</code>
       */
      public com.google.protobuf.ByteString
          getUrlBytes() {
        java.lang.Object ref = url_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          url_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *图片访问url
       * </pre>
       *
       * <code>string url = 3;</code>
       */
      public Builder setUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        url_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片访问url
       * </pre>
       *
       * <code>string url = 3;</code>
       */
      public Builder clearUrl() {
        
        url_ = getDefaultInstance().getUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片访问url
       * </pre>
       *
       * <code>string url = 3;</code>
       */
      public Builder setUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        url_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:HistoryImage)
    }

    // @@protoc_insertion_point(class_scope:HistoryImage)
    private static final ServiceData.HistoryImage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.HistoryImage();
    }

    public static ServiceData.HistoryImage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HistoryImage>
        PARSER = new com.google.protobuf.AbstractParser<HistoryImage>() {
      @java.lang.Override
      public HistoryImage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HistoryImage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HistoryImage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HistoryImage> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.HistoryImage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface DemoParamOrBuilder extends
      // @@protoc_insertion_point(interface_extends:DemoParam)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *水平像素元数量
     * </pre>
     *
     * <code>int32 m_nPixelNum_w = 1;</code>
     */
    int getMNPixelNumW();

    /**
     * <pre>
     *垂直像素元数量
     * </pre>
     *
     * <code>int32 m_nPixelNum_h = 2;</code>
     */
    int getMNPixelNumH();

    /**
     * <pre>
     *有效芯片尺寸-宽度  (mm)
     * </pre>
     *
     * <code>float m_fChipSize_w = 3;</code>
     */
    float getMFChipSizeW();

    /**
     * <pre>
     *有效芯片尺寸-高度  (mm)     
     * </pre>
     *
     * <code>float m_fChipSize_h = 4;</code>
     */
    float getMFChipSizeH();

    /**
     * <pre>
     *基础焦距 (mm)                   
     * </pre>
     *
     * <code>float m_fFocal_min = 5;</code>
     */
    float getMFFocalMin();

    /**
     * <pre>
     *俯仰偏移(°)
     * </pre>
     *
     * <code>float m_fPitch_Offset = 6;</code>
     */
    float getMFPitchOffset();

    /**
     * <pre>
     *航向偏移(°)
     * </pre>
     *
     * <code>float m_fHeading_Offset = 7;</code>
     */
    float getMFHeadingOffset();

    /**
     * <pre>
     *放大倍数-传输值列表
     * </pre>
     *
     * <code>repeated int32 m_vValueList = 8;</code>
     */
    java.util.List<java.lang.Integer> getMVValueListList();
    /**
     * <pre>
     *放大倍数-传输值列表
     * </pre>
     *
     * <code>repeated int32 m_vValueList = 8;</code>
     */
    int getMVValueListCount();
    /**
     * <pre>
     *放大倍数-传输值列表
     * </pre>
     *
     * <code>repeated int32 m_vValueList = 8;</code>
     */
    int getMVValueList(int index);

    /**
     * <pre>
     *放大倍数-实际倍数列表      
     * </pre>
     *
     * <code>repeated int32 m_vZoomList = 9;</code>
     */
    java.util.List<java.lang.Integer> getMVZoomListList();
    /**
     * <pre>
     *放大倍数-实际倍数列表      
     * </pre>
     *
     * <code>repeated int32 m_vZoomList = 9;</code>
     */
    int getMVZoomListCount();
    /**
     * <pre>
     *放大倍数-实际倍数列表      
     * </pre>
     *
     * <code>repeated int32 m_vZoomList = 9;</code>
     */
    int getMVZoomList(int index);
  }
  /**
   * <pre>
   *吊舱参数
   * </pre>
   *
   * Protobuf type {@code DemoParam}
   */
  public  static final class DemoParam extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:DemoParam)
      DemoParamOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use DemoParam.newBuilder() to construct.
    private DemoParam(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private DemoParam() {
      mNPixelNumW_ = 0;
      mNPixelNumH_ = 0;
      mFChipSizeW_ = 0F;
      mFChipSizeH_ = 0F;
      mFFocalMin_ = 0F;
      mFPitchOffset_ = 0F;
      mFHeadingOffset_ = 0F;
      mVValueList_ = java.util.Collections.emptyList();
      mVZoomList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private DemoParam(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              mNPixelNumW_ = input.readInt32();
              break;
            }
            case 16: {

              mNPixelNumH_ = input.readInt32();
              break;
            }
            case 29: {

              mFChipSizeW_ = input.readFloat();
              break;
            }
            case 37: {

              mFChipSizeH_ = input.readFloat();
              break;
            }
            case 45: {

              mFFocalMin_ = input.readFloat();
              break;
            }
            case 53: {

              mFPitchOffset_ = input.readFloat();
              break;
            }
            case 61: {

              mFHeadingOffset_ = input.readFloat();
              break;
            }
            case 64: {
              if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                mVValueList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000080;
              }
              mVValueList_.add(input.readInt32());
              break;
            }
            case 66: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000080) == 0x00000080) && input.getBytesUntilLimit() > 0) {
                mVValueList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000080;
              }
              while (input.getBytesUntilLimit() > 0) {
                mVValueList_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 72: {
              if (!((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
                mVZoomList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000100;
              }
              mVZoomList_.add(input.readInt32());
              break;
            }
            case 74: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000100) == 0x00000100) && input.getBytesUntilLimit() > 0) {
                mVZoomList_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000100;
              }
              while (input.getBytesUntilLimit() > 0) {
                mVZoomList_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
          mVValueList_ = java.util.Collections.unmodifiableList(mVValueList_);
        }
        if (((mutable_bitField0_ & 0x00000100) == 0x00000100)) {
          mVZoomList_ = java.util.Collections.unmodifiableList(mVZoomList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_DemoParam_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_DemoParam_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.DemoParam.class, ServiceData.DemoParam.Builder.class);
    }

    private int bitField0_;
    public static final int M_NPIXELNUM_W_FIELD_NUMBER = 1;
    private int mNPixelNumW_;
    /**
     * <pre>
     *水平像素元数量
     * </pre>
     *
     * <code>int32 m_nPixelNum_w = 1;</code>
     */
    public int getMNPixelNumW() {
      return mNPixelNumW_;
    }

    public static final int M_NPIXELNUM_H_FIELD_NUMBER = 2;
    private int mNPixelNumH_;
    /**
     * <pre>
     *垂直像素元数量
     * </pre>
     *
     * <code>int32 m_nPixelNum_h = 2;</code>
     */
    public int getMNPixelNumH() {
      return mNPixelNumH_;
    }

    public static final int M_FCHIPSIZE_W_FIELD_NUMBER = 3;
    private float mFChipSizeW_;
    /**
     * <pre>
     *有效芯片尺寸-宽度  (mm)
     * </pre>
     *
     * <code>float m_fChipSize_w = 3;</code>
     */
    public float getMFChipSizeW() {
      return mFChipSizeW_;
    }

    public static final int M_FCHIPSIZE_H_FIELD_NUMBER = 4;
    private float mFChipSizeH_;
    /**
     * <pre>
     *有效芯片尺寸-高度  (mm)     
     * </pre>
     *
     * <code>float m_fChipSize_h = 4;</code>
     */
    public float getMFChipSizeH() {
      return mFChipSizeH_;
    }

    public static final int M_FFOCAL_MIN_FIELD_NUMBER = 5;
    private float mFFocalMin_;
    /**
     * <pre>
     *基础焦距 (mm)                   
     * </pre>
     *
     * <code>float m_fFocal_min = 5;</code>
     */
    public float getMFFocalMin() {
      return mFFocalMin_;
    }

    public static final int M_FPITCH_OFFSET_FIELD_NUMBER = 6;
    private float mFPitchOffset_;
    /**
     * <pre>
     *俯仰偏移(°)
     * </pre>
     *
     * <code>float m_fPitch_Offset = 6;</code>
     */
    public float getMFPitchOffset() {
      return mFPitchOffset_;
    }

    public static final int M_FHEADING_OFFSET_FIELD_NUMBER = 7;
    private float mFHeadingOffset_;
    /**
     * <pre>
     *航向偏移(°)
     * </pre>
     *
     * <code>float m_fHeading_Offset = 7;</code>
     */
    public float getMFHeadingOffset() {
      return mFHeadingOffset_;
    }

    public static final int M_VVALUELIST_FIELD_NUMBER = 8;
    private java.util.List<java.lang.Integer> mVValueList_;
    /**
     * <pre>
     *放大倍数-传输值列表
     * </pre>
     *
     * <code>repeated int32 m_vValueList = 8;</code>
     */
    public java.util.List<java.lang.Integer>
        getMVValueListList() {
      return mVValueList_;
    }
    /**
     * <pre>
     *放大倍数-传输值列表
     * </pre>
     *
     * <code>repeated int32 m_vValueList = 8;</code>
     */
    public int getMVValueListCount() {
      return mVValueList_.size();
    }
    /**
     * <pre>
     *放大倍数-传输值列表
     * </pre>
     *
     * <code>repeated int32 m_vValueList = 8;</code>
     */
    public int getMVValueList(int index) {
      return mVValueList_.get(index);
    }
    private int mVValueListMemoizedSerializedSize = -1;

    public static final int M_VZOOMLIST_FIELD_NUMBER = 9;
    private java.util.List<java.lang.Integer> mVZoomList_;
    /**
     * <pre>
     *放大倍数-实际倍数列表      
     * </pre>
     *
     * <code>repeated int32 m_vZoomList = 9;</code>
     */
    public java.util.List<java.lang.Integer>
        getMVZoomListList() {
      return mVZoomList_;
    }
    /**
     * <pre>
     *放大倍数-实际倍数列表      
     * </pre>
     *
     * <code>repeated int32 m_vZoomList = 9;</code>
     */
    public int getMVZoomListCount() {
      return mVZoomList_.size();
    }
    /**
     * <pre>
     *放大倍数-实际倍数列表      
     * </pre>
     *
     * <code>repeated int32 m_vZoomList = 9;</code>
     */
    public int getMVZoomList(int index) {
      return mVZoomList_.get(index);
    }
    private int mVZoomListMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (mNPixelNumW_ != 0) {
        output.writeInt32(1, mNPixelNumW_);
      }
      if (mNPixelNumH_ != 0) {
        output.writeInt32(2, mNPixelNumH_);
      }
      if (mFChipSizeW_ != 0F) {
        output.writeFloat(3, mFChipSizeW_);
      }
      if (mFChipSizeH_ != 0F) {
        output.writeFloat(4, mFChipSizeH_);
      }
      if (mFFocalMin_ != 0F) {
        output.writeFloat(5, mFFocalMin_);
      }
      if (mFPitchOffset_ != 0F) {
        output.writeFloat(6, mFPitchOffset_);
      }
      if (mFHeadingOffset_ != 0F) {
        output.writeFloat(7, mFHeadingOffset_);
      }
      if (getMVValueListList().size() > 0) {
        output.writeUInt32NoTag(66);
        output.writeUInt32NoTag(mVValueListMemoizedSerializedSize);
      }
      for (int i = 0; i < mVValueList_.size(); i++) {
        output.writeInt32NoTag(mVValueList_.get(i));
      }
      if (getMVZoomListList().size() > 0) {
        output.writeUInt32NoTag(74);
        output.writeUInt32NoTag(mVZoomListMemoizedSerializedSize);
      }
      for (int i = 0; i < mVZoomList_.size(); i++) {
        output.writeInt32NoTag(mVZoomList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mNPixelNumW_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, mNPixelNumW_);
      }
      if (mNPixelNumH_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, mNPixelNumH_);
      }
      if (mFChipSizeW_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(3, mFChipSizeW_);
      }
      if (mFChipSizeH_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(4, mFChipSizeH_);
      }
      if (mFFocalMin_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(5, mFFocalMin_);
      }
      if (mFPitchOffset_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(6, mFPitchOffset_);
      }
      if (mFHeadingOffset_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(7, mFHeadingOffset_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mVValueList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(mVValueList_.get(i));
        }
        size += dataSize;
        if (!getMVValueListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mVValueListMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < mVZoomList_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(mVZoomList_.get(i));
        }
        size += dataSize;
        if (!getMVZoomListList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        mVZoomListMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.DemoParam)) {
        return super.equals(obj);
      }
      ServiceData.DemoParam other = (ServiceData.DemoParam) obj;

      boolean result = true;
      result = result && (getMNPixelNumW()
          == other.getMNPixelNumW());
      result = result && (getMNPixelNumH()
          == other.getMNPixelNumH());
      result = result && (
          java.lang.Float.floatToIntBits(getMFChipSizeW())
          == java.lang.Float.floatToIntBits(
              other.getMFChipSizeW()));
      result = result && (
          java.lang.Float.floatToIntBits(getMFChipSizeH())
          == java.lang.Float.floatToIntBits(
              other.getMFChipSizeH()));
      result = result && (
          java.lang.Float.floatToIntBits(getMFFocalMin())
          == java.lang.Float.floatToIntBits(
              other.getMFFocalMin()));
      result = result && (
          java.lang.Float.floatToIntBits(getMFPitchOffset())
          == java.lang.Float.floatToIntBits(
              other.getMFPitchOffset()));
      result = result && (
          java.lang.Float.floatToIntBits(getMFHeadingOffset())
          == java.lang.Float.floatToIntBits(
              other.getMFHeadingOffset()));
      result = result && getMVValueListList()
          .equals(other.getMVValueListList());
      result = result && getMVZoomListList()
          .equals(other.getMVZoomListList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + M_NPIXELNUM_W_FIELD_NUMBER;
      hash = (53 * hash) + getMNPixelNumW();
      hash = (37 * hash) + M_NPIXELNUM_H_FIELD_NUMBER;
      hash = (53 * hash) + getMNPixelNumH();
      hash = (37 * hash) + M_FCHIPSIZE_W_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMFChipSizeW());
      hash = (37 * hash) + M_FCHIPSIZE_H_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMFChipSizeH());
      hash = (37 * hash) + M_FFOCAL_MIN_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMFFocalMin());
      hash = (37 * hash) + M_FPITCH_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMFPitchOffset());
      hash = (37 * hash) + M_FHEADING_OFFSET_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getMFHeadingOffset());
      if (getMVValueListCount() > 0) {
        hash = (37 * hash) + M_VVALUELIST_FIELD_NUMBER;
        hash = (53 * hash) + getMVValueListList().hashCode();
      }
      if (getMVZoomListCount() > 0) {
        hash = (37 * hash) + M_VZOOMLIST_FIELD_NUMBER;
        hash = (53 * hash) + getMVZoomListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.DemoParam parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.DemoParam parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.DemoParam parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.DemoParam parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.DemoParam parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.DemoParam parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.DemoParam parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.DemoParam parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.DemoParam parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.DemoParam parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.DemoParam parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.DemoParam parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.DemoParam prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *吊舱参数
     * </pre>
     *
     * Protobuf type {@code DemoParam}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:DemoParam)
        ServiceData.DemoParamOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_DemoParam_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_DemoParam_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.DemoParam.class, ServiceData.DemoParam.Builder.class);
      }

      // Construct using ServiceData.DemoParam.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        mNPixelNumW_ = 0;

        mNPixelNumH_ = 0;

        mFChipSizeW_ = 0F;

        mFChipSizeH_ = 0F;

        mFFocalMin_ = 0F;

        mFPitchOffset_ = 0F;

        mFHeadingOffset_ = 0F;

        mVValueList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000080);
        mVZoomList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000100);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_DemoParam_descriptor;
      }

      @java.lang.Override
      public ServiceData.DemoParam getDefaultInstanceForType() {
        return ServiceData.DemoParam.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.DemoParam build() {
        ServiceData.DemoParam result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.DemoParam buildPartial() {
        ServiceData.DemoParam result = new ServiceData.DemoParam(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.mNPixelNumW_ = mNPixelNumW_;
        result.mNPixelNumH_ = mNPixelNumH_;
        result.mFChipSizeW_ = mFChipSizeW_;
        result.mFChipSizeH_ = mFChipSizeH_;
        result.mFFocalMin_ = mFFocalMin_;
        result.mFPitchOffset_ = mFPitchOffset_;
        result.mFHeadingOffset_ = mFHeadingOffset_;
        if (((bitField0_ & 0x00000080) == 0x00000080)) {
          mVValueList_ = java.util.Collections.unmodifiableList(mVValueList_);
          bitField0_ = (bitField0_ & ~0x00000080);
        }
        result.mVValueList_ = mVValueList_;
        if (((bitField0_ & 0x00000100) == 0x00000100)) {
          mVZoomList_ = java.util.Collections.unmodifiableList(mVZoomList_);
          bitField0_ = (bitField0_ & ~0x00000100);
        }
        result.mVZoomList_ = mVZoomList_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.DemoParam) {
          return mergeFrom((ServiceData.DemoParam)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.DemoParam other) {
        if (other == ServiceData.DemoParam.getDefaultInstance()) return this;
        if (other.getMNPixelNumW() != 0) {
          setMNPixelNumW(other.getMNPixelNumW());
        }
        if (other.getMNPixelNumH() != 0) {
          setMNPixelNumH(other.getMNPixelNumH());
        }
        if (other.getMFChipSizeW() != 0F) {
          setMFChipSizeW(other.getMFChipSizeW());
        }
        if (other.getMFChipSizeH() != 0F) {
          setMFChipSizeH(other.getMFChipSizeH());
        }
        if (other.getMFFocalMin() != 0F) {
          setMFFocalMin(other.getMFFocalMin());
        }
        if (other.getMFPitchOffset() != 0F) {
          setMFPitchOffset(other.getMFPitchOffset());
        }
        if (other.getMFHeadingOffset() != 0F) {
          setMFHeadingOffset(other.getMFHeadingOffset());
        }
        if (!other.mVValueList_.isEmpty()) {
          if (mVValueList_.isEmpty()) {
            mVValueList_ = other.mVValueList_;
            bitField0_ = (bitField0_ & ~0x00000080);
          } else {
            ensureMVValueListIsMutable();
            mVValueList_.addAll(other.mVValueList_);
          }
          onChanged();
        }
        if (!other.mVZoomList_.isEmpty()) {
          if (mVZoomList_.isEmpty()) {
            mVZoomList_ = other.mVZoomList_;
            bitField0_ = (bitField0_ & ~0x00000100);
          } else {
            ensureMVZoomListIsMutable();
            mVZoomList_.addAll(other.mVZoomList_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.DemoParam parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.DemoParam) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int mNPixelNumW_ ;
      /**
       * <pre>
       *水平像素元数量
       * </pre>
       *
       * <code>int32 m_nPixelNum_w = 1;</code>
       */
      public int getMNPixelNumW() {
        return mNPixelNumW_;
      }
      /**
       * <pre>
       *水平像素元数量
       * </pre>
       *
       * <code>int32 m_nPixelNum_w = 1;</code>
       */
      public Builder setMNPixelNumW(int value) {
        
        mNPixelNumW_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *水平像素元数量
       * </pre>
       *
       * <code>int32 m_nPixelNum_w = 1;</code>
       */
      public Builder clearMNPixelNumW() {
        
        mNPixelNumW_ = 0;
        onChanged();
        return this;
      }

      private int mNPixelNumH_ ;
      /**
       * <pre>
       *垂直像素元数量
       * </pre>
       *
       * <code>int32 m_nPixelNum_h = 2;</code>
       */
      public int getMNPixelNumH() {
        return mNPixelNumH_;
      }
      /**
       * <pre>
       *垂直像素元数量
       * </pre>
       *
       * <code>int32 m_nPixelNum_h = 2;</code>
       */
      public Builder setMNPixelNumH(int value) {
        
        mNPixelNumH_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *垂直像素元数量
       * </pre>
       *
       * <code>int32 m_nPixelNum_h = 2;</code>
       */
      public Builder clearMNPixelNumH() {
        
        mNPixelNumH_ = 0;
        onChanged();
        return this;
      }

      private float mFChipSizeW_ ;
      /**
       * <pre>
       *有效芯片尺寸-宽度  (mm)
       * </pre>
       *
       * <code>float m_fChipSize_w = 3;</code>
       */
      public float getMFChipSizeW() {
        return mFChipSizeW_;
      }
      /**
       * <pre>
       *有效芯片尺寸-宽度  (mm)
       * </pre>
       *
       * <code>float m_fChipSize_w = 3;</code>
       */
      public Builder setMFChipSizeW(float value) {
        
        mFChipSizeW_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *有效芯片尺寸-宽度  (mm)
       * </pre>
       *
       * <code>float m_fChipSize_w = 3;</code>
       */
      public Builder clearMFChipSizeW() {
        
        mFChipSizeW_ = 0F;
        onChanged();
        return this;
      }

      private float mFChipSizeH_ ;
      /**
       * <pre>
       *有效芯片尺寸-高度  (mm)     
       * </pre>
       *
       * <code>float m_fChipSize_h = 4;</code>
       */
      public float getMFChipSizeH() {
        return mFChipSizeH_;
      }
      /**
       * <pre>
       *有效芯片尺寸-高度  (mm)     
       * </pre>
       *
       * <code>float m_fChipSize_h = 4;</code>
       */
      public Builder setMFChipSizeH(float value) {
        
        mFChipSizeH_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *有效芯片尺寸-高度  (mm)     
       * </pre>
       *
       * <code>float m_fChipSize_h = 4;</code>
       */
      public Builder clearMFChipSizeH() {
        
        mFChipSizeH_ = 0F;
        onChanged();
        return this;
      }

      private float mFFocalMin_ ;
      /**
       * <pre>
       *基础焦距 (mm)                   
       * </pre>
       *
       * <code>float m_fFocal_min = 5;</code>
       */
      public float getMFFocalMin() {
        return mFFocalMin_;
      }
      /**
       * <pre>
       *基础焦距 (mm)                   
       * </pre>
       *
       * <code>float m_fFocal_min = 5;</code>
       */
      public Builder setMFFocalMin(float value) {
        
        mFFocalMin_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *基础焦距 (mm)                   
       * </pre>
       *
       * <code>float m_fFocal_min = 5;</code>
       */
      public Builder clearMFFocalMin() {
        
        mFFocalMin_ = 0F;
        onChanged();
        return this;
      }

      private float mFPitchOffset_ ;
      /**
       * <pre>
       *俯仰偏移(°)
       * </pre>
       *
       * <code>float m_fPitch_Offset = 6;</code>
       */
      public float getMFPitchOffset() {
        return mFPitchOffset_;
      }
      /**
       * <pre>
       *俯仰偏移(°)
       * </pre>
       *
       * <code>float m_fPitch_Offset = 6;</code>
       */
      public Builder setMFPitchOffset(float value) {
        
        mFPitchOffset_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *俯仰偏移(°)
       * </pre>
       *
       * <code>float m_fPitch_Offset = 6;</code>
       */
      public Builder clearMFPitchOffset() {
        
        mFPitchOffset_ = 0F;
        onChanged();
        return this;
      }

      private float mFHeadingOffset_ ;
      /**
       * <pre>
       *航向偏移(°)
       * </pre>
       *
       * <code>float m_fHeading_Offset = 7;</code>
       */
      public float getMFHeadingOffset() {
        return mFHeadingOffset_;
      }
      /**
       * <pre>
       *航向偏移(°)
       * </pre>
       *
       * <code>float m_fHeading_Offset = 7;</code>
       */
      public Builder setMFHeadingOffset(float value) {
        
        mFHeadingOffset_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *航向偏移(°)
       * </pre>
       *
       * <code>float m_fHeading_Offset = 7;</code>
       */
      public Builder clearMFHeadingOffset() {
        
        mFHeadingOffset_ = 0F;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> mVValueList_ = java.util.Collections.emptyList();
      private void ensureMVValueListIsMutable() {
        if (!((bitField0_ & 0x00000080) == 0x00000080)) {
          mVValueList_ = new java.util.ArrayList<java.lang.Integer>(mVValueList_);
          bitField0_ |= 0x00000080;
         }
      }
      /**
       * <pre>
       *放大倍数-传输值列表
       * </pre>
       *
       * <code>repeated int32 m_vValueList = 8;</code>
       */
      public java.util.List<java.lang.Integer>
          getMVValueListList() {
        return java.util.Collections.unmodifiableList(mVValueList_);
      }
      /**
       * <pre>
       *放大倍数-传输值列表
       * </pre>
       *
       * <code>repeated int32 m_vValueList = 8;</code>
       */
      public int getMVValueListCount() {
        return mVValueList_.size();
      }
      /**
       * <pre>
       *放大倍数-传输值列表
       * </pre>
       *
       * <code>repeated int32 m_vValueList = 8;</code>
       */
      public int getMVValueList(int index) {
        return mVValueList_.get(index);
      }
      /**
       * <pre>
       *放大倍数-传输值列表
       * </pre>
       *
       * <code>repeated int32 m_vValueList = 8;</code>
       */
      public Builder setMVValueList(
          int index, int value) {
        ensureMVValueListIsMutable();
        mVValueList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *放大倍数-传输值列表
       * </pre>
       *
       * <code>repeated int32 m_vValueList = 8;</code>
       */
      public Builder addMVValueList(int value) {
        ensureMVValueListIsMutable();
        mVValueList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *放大倍数-传输值列表
       * </pre>
       *
       * <code>repeated int32 m_vValueList = 8;</code>
       */
      public Builder addAllMVValueList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMVValueListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mVValueList_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *放大倍数-传输值列表
       * </pre>
       *
       * <code>repeated int32 m_vValueList = 8;</code>
       */
      public Builder clearMVValueList() {
        mVValueList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000080);
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> mVZoomList_ = java.util.Collections.emptyList();
      private void ensureMVZoomListIsMutable() {
        if (!((bitField0_ & 0x00000100) == 0x00000100)) {
          mVZoomList_ = new java.util.ArrayList<java.lang.Integer>(mVZoomList_);
          bitField0_ |= 0x00000100;
         }
      }
      /**
       * <pre>
       *放大倍数-实际倍数列表      
       * </pre>
       *
       * <code>repeated int32 m_vZoomList = 9;</code>
       */
      public java.util.List<java.lang.Integer>
          getMVZoomListList() {
        return java.util.Collections.unmodifiableList(mVZoomList_);
      }
      /**
       * <pre>
       *放大倍数-实际倍数列表      
       * </pre>
       *
       * <code>repeated int32 m_vZoomList = 9;</code>
       */
      public int getMVZoomListCount() {
        return mVZoomList_.size();
      }
      /**
       * <pre>
       *放大倍数-实际倍数列表      
       * </pre>
       *
       * <code>repeated int32 m_vZoomList = 9;</code>
       */
      public int getMVZoomList(int index) {
        return mVZoomList_.get(index);
      }
      /**
       * <pre>
       *放大倍数-实际倍数列表      
       * </pre>
       *
       * <code>repeated int32 m_vZoomList = 9;</code>
       */
      public Builder setMVZoomList(
          int index, int value) {
        ensureMVZoomListIsMutable();
        mVZoomList_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *放大倍数-实际倍数列表      
       * </pre>
       *
       * <code>repeated int32 m_vZoomList = 9;</code>
       */
      public Builder addMVZoomList(int value) {
        ensureMVZoomListIsMutable();
        mVZoomList_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *放大倍数-实际倍数列表      
       * </pre>
       *
       * <code>repeated int32 m_vZoomList = 9;</code>
       */
      public Builder addAllMVZoomList(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureMVZoomListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mVZoomList_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *放大倍数-实际倍数列表      
       * </pre>
       *
       * <code>repeated int32 m_vZoomList = 9;</code>
       */
      public Builder clearMVZoomList() {
        mVZoomList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000100);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:DemoParam)
    }

    // @@protoc_insertion_point(class_scope:DemoParam)
    private static final ServiceData.DemoParam DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.DemoParam();
    }

    public static ServiceData.DemoParam getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<DemoParam>
        PARSER = new com.google.protobuf.AbstractParser<DemoParam>() {
      @java.lang.Override
      public DemoParam parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new DemoParam(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<DemoParam> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<DemoParam> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.DemoParam getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ImageExtendDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ImageExtendData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *任务id
     * </pre>
     *
     * <code>int32 tid = 1;</code>
     */
    int getTid();

    /**
     * <pre>
     *图片帧编号
     * </pre>
     *
     * <code>int32 number = 2;</code>
     */
    int getNumber();

    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
     * </pre>
     *
     * <code>.PositionPb location = 3;</code>
     */
    boolean hasLocation();
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
     * </pre>
     *
     * <code>.PositionPb location = 3;</code>
     */
    ServiceData.PositionPb getLocation();
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
     * </pre>
     *
     * <code>.PositionPb location = 3;</code>
     */
    ServiceData.PositionPbOrBuilder getLocationOrBuilder();

    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    java.util.List<ServiceData.PositionPb> 
        getViewFieldList();
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    ServiceData.PositionPb getViewField(int index);
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    int getViewFieldCount();
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getViewFieldOrBuilderList();
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    ServiceData.PositionPbOrBuilder getViewFieldOrBuilder(
        int index);

    /**
     * <pre>
     *图片二进制数据
     * </pre>
     *
     * <code>bytes imageData = 5;</code>
     */
    com.google.protobuf.ByteString getImageData();

    /**
     * <pre>
     *图片的url
     * </pre>
     *
     * <code>string imageUrl = 6;</code>
     */
    java.lang.String getImageUrl();
    /**
     * <pre>
     *图片的url
     * </pre>
     *
     * <code>string imageUrl = 6;</code>
     */
    com.google.protobuf.ByteString
        getImageUrlBytes();
  }
  /**
   * <pre>
   *图片扩展数据
   * </pre>
   *
   * Protobuf type {@code ImageExtendData}
   */
  public  static final class ImageExtendData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ImageExtendData)
      ImageExtendDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ImageExtendData.newBuilder() to construct.
    private ImageExtendData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ImageExtendData() {
      tid_ = 0;
      number_ = 0;
      viewField_ = java.util.Collections.emptyList();
      imageData_ = com.google.protobuf.ByteString.EMPTY;
      imageUrl_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ImageExtendData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              tid_ = input.readInt32();
              break;
            }
            case 16: {

              number_ = input.readInt32();
              break;
            }
            case 26: {
              ServiceData.PositionPb.Builder subBuilder = null;
              if (location_ != null) {
                subBuilder = location_.toBuilder();
              }
              location_ = input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(location_);
                location_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                viewField_ = new java.util.ArrayList<ServiceData.PositionPb>();
                mutable_bitField0_ |= 0x00000008;
              }
              viewField_.add(
                  input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry));
              break;
            }
            case 42: {

              imageData_ = input.readBytes();
              break;
            }
            case 50: {
              java.lang.String s = input.readStringRequireUtf8();

              imageUrl_ = s;
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          viewField_ = java.util.Collections.unmodifiableList(viewField_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_ImageExtendData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_ImageExtendData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.ImageExtendData.class, ServiceData.ImageExtendData.Builder.class);
    }

    private int bitField0_;
    public static final int TID_FIELD_NUMBER = 1;
    private int tid_;
    /**
     * <pre>
     *任务id
     * </pre>
     *
     * <code>int32 tid = 1;</code>
     */
    public int getTid() {
      return tid_;
    }

    public static final int NUMBER_FIELD_NUMBER = 2;
    private int number_;
    /**
     * <pre>
     *图片帧编号
     * </pre>
     *
     * <code>int32 number = 2;</code>
     */
    public int getNumber() {
      return number_;
    }

    public static final int LOCATION_FIELD_NUMBER = 3;
    private ServiceData.PositionPb location_;
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
     * </pre>
     *
     * <code>.PositionPb location = 3;</code>
     */
    public boolean hasLocation() {
      return location_ != null;
    }
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
     * </pre>
     *
     * <code>.PositionPb location = 3;</code>
     */
    public ServiceData.PositionPb getLocation() {
      return location_ == null ? ServiceData.PositionPb.getDefaultInstance() : location_;
    }
    /**
     * <pre>
     *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
     * </pre>
     *
     * <code>.PositionPb location = 3;</code>
     */
    public ServiceData.PositionPbOrBuilder getLocationOrBuilder() {
      return getLocation();
    }

    public static final int VIEWFIELD_FIELD_NUMBER = 4;
    private java.util.List<ServiceData.PositionPb> viewField_;
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    public java.util.List<ServiceData.PositionPb> getViewFieldList() {
      return viewField_;
    }
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getViewFieldOrBuilderList() {
      return viewField_;
    }
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    public int getViewFieldCount() {
      return viewField_.size();
    }
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    public ServiceData.PositionPb getViewField(int index) {
      return viewField_.get(index);
    }
    /**
     * <pre>
     *图片对应的视场数据，包含左上、左下、右上、右下、中心
     * </pre>
     *
     * <code>repeated .PositionPb viewField = 4;</code>
     */
    public ServiceData.PositionPbOrBuilder getViewFieldOrBuilder(
        int index) {
      return viewField_.get(index);
    }

    public static final int IMAGEDATA_FIELD_NUMBER = 5;
    private com.google.protobuf.ByteString imageData_;
    /**
     * <pre>
     *图片二进制数据
     * </pre>
     *
     * <code>bytes imageData = 5;</code>
     */
    public com.google.protobuf.ByteString getImageData() {
      return imageData_;
    }

    public static final int IMAGEURL_FIELD_NUMBER = 6;
    private volatile java.lang.Object imageUrl_;
    /**
     * <pre>
     *图片的url
     * </pre>
     *
     * <code>string imageUrl = 6;</code>
     */
    public java.lang.String getImageUrl() {
      java.lang.Object ref = imageUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        imageUrl_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *图片的url
     * </pre>
     *
     * <code>string imageUrl = 6;</code>
     */
    public com.google.protobuf.ByteString
        getImageUrlBytes() {
      java.lang.Object ref = imageUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        imageUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (tid_ != 0) {
        output.writeInt32(1, tid_);
      }
      if (number_ != 0) {
        output.writeInt32(2, number_);
      }
      if (location_ != null) {
        output.writeMessage(3, getLocation());
      }
      for (int i = 0; i < viewField_.size(); i++) {
        output.writeMessage(4, viewField_.get(i));
      }
      if (!imageData_.isEmpty()) {
        output.writeBytes(5, imageData_);
      }
      if (!getImageUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 6, imageUrl_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, tid_);
      }
      if (number_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, number_);
      }
      if (location_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLocation());
      }
      for (int i = 0; i < viewField_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, viewField_.get(i));
      }
      if (!imageData_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, imageData_);
      }
      if (!getImageUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, imageUrl_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.ImageExtendData)) {
        return super.equals(obj);
      }
      ServiceData.ImageExtendData other = (ServiceData.ImageExtendData) obj;

      boolean result = true;
      result = result && (getTid()
          == other.getTid());
      result = result && (getNumber()
          == other.getNumber());
      result = result && (hasLocation() == other.hasLocation());
      if (hasLocation()) {
        result = result && getLocation()
            .equals(other.getLocation());
      }
      result = result && getViewFieldList()
          .equals(other.getViewFieldList());
      result = result && getImageData()
          .equals(other.getImageData());
      result = result && getImageUrl()
          .equals(other.getImageUrl());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TID_FIELD_NUMBER;
      hash = (53 * hash) + getTid();
      hash = (37 * hash) + NUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getNumber();
      if (hasLocation()) {
        hash = (37 * hash) + LOCATION_FIELD_NUMBER;
        hash = (53 * hash) + getLocation().hashCode();
      }
      if (getViewFieldCount() > 0) {
        hash = (37 * hash) + VIEWFIELD_FIELD_NUMBER;
        hash = (53 * hash) + getViewFieldList().hashCode();
      }
      hash = (37 * hash) + IMAGEDATA_FIELD_NUMBER;
      hash = (53 * hash) + getImageData().hashCode();
      hash = (37 * hash) + IMAGEURL_FIELD_NUMBER;
      hash = (53 * hash) + getImageUrl().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.ImageExtendData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ImageExtendData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ImageExtendData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ImageExtendData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ImageExtendData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ImageExtendData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ImageExtendData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.ImageExtendData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.ImageExtendData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.ImageExtendData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.ImageExtendData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.ImageExtendData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.ImageExtendData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *图片扩展数据
     * </pre>
     *
     * Protobuf type {@code ImageExtendData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ImageExtendData)
        ServiceData.ImageExtendDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_ImageExtendData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_ImageExtendData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.ImageExtendData.class, ServiceData.ImageExtendData.Builder.class);
      }

      // Construct using ServiceData.ImageExtendData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getViewFieldFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tid_ = 0;

        number_ = 0;

        if (locationBuilder_ == null) {
          location_ = null;
        } else {
          location_ = null;
          locationBuilder_ = null;
        }
        if (viewFieldBuilder_ == null) {
          viewField_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          viewFieldBuilder_.clear();
        }
        imageData_ = com.google.protobuf.ByteString.EMPTY;

        imageUrl_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_ImageExtendData_descriptor;
      }

      @java.lang.Override
      public ServiceData.ImageExtendData getDefaultInstanceForType() {
        return ServiceData.ImageExtendData.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.ImageExtendData build() {
        ServiceData.ImageExtendData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.ImageExtendData buildPartial() {
        ServiceData.ImageExtendData result = new ServiceData.ImageExtendData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.tid_ = tid_;
        result.number_ = number_;
        if (locationBuilder_ == null) {
          result.location_ = location_;
        } else {
          result.location_ = locationBuilder_.build();
        }
        if (viewFieldBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            viewField_ = java.util.Collections.unmodifiableList(viewField_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.viewField_ = viewField_;
        } else {
          result.viewField_ = viewFieldBuilder_.build();
        }
        result.imageData_ = imageData_;
        result.imageUrl_ = imageUrl_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.ImageExtendData) {
          return mergeFrom((ServiceData.ImageExtendData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.ImageExtendData other) {
        if (other == ServiceData.ImageExtendData.getDefaultInstance()) return this;
        if (other.getTid() != 0) {
          setTid(other.getTid());
        }
        if (other.getNumber() != 0) {
          setNumber(other.getNumber());
        }
        if (other.hasLocation()) {
          mergeLocation(other.getLocation());
        }
        if (viewFieldBuilder_ == null) {
          if (!other.viewField_.isEmpty()) {
            if (viewField_.isEmpty()) {
              viewField_ = other.viewField_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensureViewFieldIsMutable();
              viewField_.addAll(other.viewField_);
            }
            onChanged();
          }
        } else {
          if (!other.viewField_.isEmpty()) {
            if (viewFieldBuilder_.isEmpty()) {
              viewFieldBuilder_.dispose();
              viewFieldBuilder_ = null;
              viewField_ = other.viewField_;
              bitField0_ = (bitField0_ & ~0x00000008);
              viewFieldBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getViewFieldFieldBuilder() : null;
            } else {
              viewFieldBuilder_.addAllMessages(other.viewField_);
            }
          }
        }
        if (other.getImageData() != com.google.protobuf.ByteString.EMPTY) {
          setImageData(other.getImageData());
        }
        if (!other.getImageUrl().isEmpty()) {
          imageUrl_ = other.imageUrl_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.ImageExtendData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.ImageExtendData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int tid_ ;
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int32 tid = 1;</code>
       */
      public int getTid() {
        return tid_;
      }
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int32 tid = 1;</code>
       */
      public Builder setTid(int value) {
        
        tid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int32 tid = 1;</code>
       */
      public Builder clearTid() {
        
        tid_ = 0;
        onChanged();
        return this;
      }

      private int number_ ;
      /**
       * <pre>
       *图片帧编号
       * </pre>
       *
       * <code>int32 number = 2;</code>
       */
      public int getNumber() {
        return number_;
      }
      /**
       * <pre>
       *图片帧编号
       * </pre>
       *
       * <code>int32 number = 2;</code>
       */
      public Builder setNumber(int value) {
        
        number_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片帧编号
       * </pre>
       *
       * <code>int32 number = 2;</code>
       */
      public Builder clearNumber() {
        
        number_ = 0;
        onChanged();
        return this;
      }

      private ServiceData.PositionPb location_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> locationBuilder_;
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      public boolean hasLocation() {
        return locationBuilder_ != null || location_ != null;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      public ServiceData.PositionPb getLocation() {
        if (locationBuilder_ == null) {
          return location_ == null ? ServiceData.PositionPb.getDefaultInstance() : location_;
        } else {
          return locationBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      public Builder setLocation(ServiceData.PositionPb value) {
        if (locationBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          location_ = value;
          onChanged();
        } else {
          locationBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      public Builder setLocation(
          ServiceData.PositionPb.Builder builderForValue) {
        if (locationBuilder_ == null) {
          location_ = builderForValue.build();
          onChanged();
        } else {
          locationBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      public Builder mergeLocation(ServiceData.PositionPb value) {
        if (locationBuilder_ == null) {
          if (location_ != null) {
            location_ =
              ServiceData.PositionPb.newBuilder(location_).mergeFrom(value).buildPartial();
          } else {
            location_ = value;
          }
          onChanged();
        } else {
          locationBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      public Builder clearLocation() {
        if (locationBuilder_ == null) {
          location_ = null;
          onChanged();
        } else {
          location_ = null;
          locationBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      public ServiceData.PositionPb.Builder getLocationBuilder() {
        
        onChanged();
        return getLocationFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      public ServiceData.PositionPbOrBuilder getLocationOrBuilder() {
        if (locationBuilder_ != null) {
          return locationBuilder_.getMessageOrBuilder();
        } else {
          return location_ == null ?
              ServiceData.PositionPb.getDefaultInstance() : location_;
        }
      }
      /**
       * <pre>
       *该图片帧SEI中解析出的GPS信息即飞机当前的地理坐标
       * </pre>
       *
       * <code>.PositionPb location = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getLocationFieldBuilder() {
        if (locationBuilder_ == null) {
          locationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  getLocation(),
                  getParentForChildren(),
                  isClean());
          location_ = null;
        }
        return locationBuilder_;
      }

      private java.util.List<ServiceData.PositionPb> viewField_ =
        java.util.Collections.emptyList();
      private void ensureViewFieldIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          viewField_ = new java.util.ArrayList<ServiceData.PositionPb>(viewField_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> viewFieldBuilder_;

      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public java.util.List<ServiceData.PositionPb> getViewFieldList() {
        if (viewFieldBuilder_ == null) {
          return java.util.Collections.unmodifiableList(viewField_);
        } else {
          return viewFieldBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public int getViewFieldCount() {
        if (viewFieldBuilder_ == null) {
          return viewField_.size();
        } else {
          return viewFieldBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public ServiceData.PositionPb getViewField(int index) {
        if (viewFieldBuilder_ == null) {
          return viewField_.get(index);
        } else {
          return viewFieldBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder setViewField(
          int index, ServiceData.PositionPb value) {
        if (viewFieldBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureViewFieldIsMutable();
          viewField_.set(index, value);
          onChanged();
        } else {
          viewFieldBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder setViewField(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (viewFieldBuilder_ == null) {
          ensureViewFieldIsMutable();
          viewField_.set(index, builderForValue.build());
          onChanged();
        } else {
          viewFieldBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder addViewField(ServiceData.PositionPb value) {
        if (viewFieldBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureViewFieldIsMutable();
          viewField_.add(value);
          onChanged();
        } else {
          viewFieldBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder addViewField(
          int index, ServiceData.PositionPb value) {
        if (viewFieldBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureViewFieldIsMutable();
          viewField_.add(index, value);
          onChanged();
        } else {
          viewFieldBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder addViewField(
          ServiceData.PositionPb.Builder builderForValue) {
        if (viewFieldBuilder_ == null) {
          ensureViewFieldIsMutable();
          viewField_.add(builderForValue.build());
          onChanged();
        } else {
          viewFieldBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder addViewField(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (viewFieldBuilder_ == null) {
          ensureViewFieldIsMutable();
          viewField_.add(index, builderForValue.build());
          onChanged();
        } else {
          viewFieldBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder addAllViewField(
          java.lang.Iterable<? extends ServiceData.PositionPb> values) {
        if (viewFieldBuilder_ == null) {
          ensureViewFieldIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, viewField_);
          onChanged();
        } else {
          viewFieldBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder clearViewField() {
        if (viewFieldBuilder_ == null) {
          viewField_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          viewFieldBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public Builder removeViewField(int index) {
        if (viewFieldBuilder_ == null) {
          ensureViewFieldIsMutable();
          viewField_.remove(index);
          onChanged();
        } else {
          viewFieldBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public ServiceData.PositionPb.Builder getViewFieldBuilder(
          int index) {
        return getViewFieldFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public ServiceData.PositionPbOrBuilder getViewFieldOrBuilder(
          int index) {
        if (viewFieldBuilder_ == null) {
          return viewField_.get(index);  } else {
          return viewFieldBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
           getViewFieldOrBuilderList() {
        if (viewFieldBuilder_ != null) {
          return viewFieldBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(viewField_);
        }
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public ServiceData.PositionPb.Builder addViewFieldBuilder() {
        return getViewFieldFieldBuilder().addBuilder(
            ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public ServiceData.PositionPb.Builder addViewFieldBuilder(
          int index) {
        return getViewFieldFieldBuilder().addBuilder(
            index, ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *图片对应的视场数据，包含左上、左下、右上、右下、中心
       * </pre>
       *
       * <code>repeated .PositionPb viewField = 4;</code>
       */
      public java.util.List<ServiceData.PositionPb.Builder> 
           getViewFieldBuilderList() {
        return getViewFieldFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getViewFieldFieldBuilder() {
        if (viewFieldBuilder_ == null) {
          viewFieldBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  viewField_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          viewField_ = null;
        }
        return viewFieldBuilder_;
      }

      private com.google.protobuf.ByteString imageData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *图片二进制数据
       * </pre>
       *
       * <code>bytes imageData = 5;</code>
       */
      public com.google.protobuf.ByteString getImageData() {
        return imageData_;
      }
      /**
       * <pre>
       *图片二进制数据
       * </pre>
       *
       * <code>bytes imageData = 5;</code>
       */
      public Builder setImageData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        imageData_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片二进制数据
       * </pre>
       *
       * <code>bytes imageData = 5;</code>
       */
      public Builder clearImageData() {
        
        imageData_ = getDefaultInstance().getImageData();
        onChanged();
        return this;
      }

      private java.lang.Object imageUrl_ = "";
      /**
       * <pre>
       *图片的url
       * </pre>
       *
       * <code>string imageUrl = 6;</code>
       */
      public java.lang.String getImageUrl() {
        java.lang.Object ref = imageUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          imageUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *图片的url
       * </pre>
       *
       * <code>string imageUrl = 6;</code>
       */
      public com.google.protobuf.ByteString
          getImageUrlBytes() {
        java.lang.Object ref = imageUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          imageUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *图片的url
       * </pre>
       *
       * <code>string imageUrl = 6;</code>
       */
      public Builder setImageUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        imageUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片的url
       * </pre>
       *
       * <code>string imageUrl = 6;</code>
       */
      public Builder clearImageUrl() {
        
        imageUrl_ = getDefaultInstance().getImageUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片的url
       * </pre>
       *
       * <code>string imageUrl = 6;</code>
       */
      public Builder setImageUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        imageUrl_ = value;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ImageExtendData)
    }

    // @@protoc_insertion_point(class_scope:ImageExtendData)
    private static final ServiceData.ImageExtendData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.ImageExtendData();
    }

    public static ServiceData.ImageExtendData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ImageExtendData>
        PARSER = new com.google.protobuf.AbstractParser<ImageExtendData>() {
      @java.lang.Override
      public ImageExtendData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ImageExtendData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ImageExtendData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ImageExtendData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.ImageExtendData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TargetInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TargetInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *目标类别中文/英文名，例如 "车辆/car"
     * </pre>
     *
     * <code>string targetName = 1;</code>
     */
    java.lang.String getTargetName();
    /**
     * <pre>
     *目标类别中文/英文名，例如 "车辆/car"
     * </pre>
     *
     * <code>string targetName = 1;</code>
     */
    com.google.protobuf.ByteString
        getTargetNameBytes();

    /**
     * <pre>
     *目标概率，比如0.8
     * </pre>
     *
     * <code>float targetProbability = 2;</code>
     */
    float getTargetProbability();

    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 3;</code>
     */
    boolean hasLable();
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 3;</code>
     */
    ServiceData.LabelInfo getLable();
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 3;</code>
     */
    ServiceData.LabelInfoOrBuilder getLableOrBuilder();

    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    java.util.List<ServiceData.PositionPb> 
        getPositionsList();
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    ServiceData.PositionPb getPositions(int index);
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    int getPositionsCount();
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getPositionsOrBuilderList();
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
        int index);
  }
  /**
   * <pre>
   *目标识别的结果信息
   * </pre>
   *
   * Protobuf type {@code TargetInfo}
   */
  public  static final class TargetInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TargetInfo)
      TargetInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TargetInfo.newBuilder() to construct.
    private TargetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TargetInfo() {
      targetName_ = "";
      targetProbability_ = 0F;
      positions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TargetInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              targetName_ = s;
              break;
            }
            case 21: {

              targetProbability_ = input.readFloat();
              break;
            }
            case 26: {
              ServiceData.LabelInfo.Builder subBuilder = null;
              if (lable_ != null) {
                subBuilder = lable_.toBuilder();
              }
              lable_ = input.readMessage(ServiceData.LabelInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lable_);
                lable_ = subBuilder.buildPartial();
              }

              break;
            }
            case 34: {
              if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                positions_ = new java.util.ArrayList<ServiceData.PositionPb>();
                mutable_bitField0_ |= 0x00000008;
              }
              positions_.add(
                  input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_TargetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_TargetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.TargetInfo.class, ServiceData.TargetInfo.Builder.class);
    }

    private int bitField0_;
    public static final int TARGETNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object targetName_;
    /**
     * <pre>
     *目标类别中文/英文名，例如 "车辆/car"
     * </pre>
     *
     * <code>string targetName = 1;</code>
     */
    public java.lang.String getTargetName() {
      java.lang.Object ref = targetName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        targetName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *目标类别中文/英文名，例如 "车辆/car"
     * </pre>
     *
     * <code>string targetName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTargetNameBytes() {
      java.lang.Object ref = targetName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        targetName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TARGETPROBABILITY_FIELD_NUMBER = 2;
    private float targetProbability_;
    /**
     * <pre>
     *目标概率，比如0.8
     * </pre>
     *
     * <code>float targetProbability = 2;</code>
     */
    public float getTargetProbability() {
      return targetProbability_;
    }

    public static final int LABLE_FIELD_NUMBER = 3;
    private ServiceData.LabelInfo lable_;
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 3;</code>
     */
    public boolean hasLable() {
      return lable_ != null;
    }
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 3;</code>
     */
    public ServiceData.LabelInfo getLable() {
      return lable_ == null ? ServiceData.LabelInfo.getDefaultInstance() : lable_;
    }
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 3;</code>
     */
    public ServiceData.LabelInfoOrBuilder getLableOrBuilder() {
      return getLable();
    }

    public static final int POSITIONS_FIELD_NUMBER = 4;
    private java.util.List<ServiceData.PositionPb> positions_;
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    public java.util.List<ServiceData.PositionPb> getPositionsList() {
      return positions_;
    }
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getPositionsOrBuilderList() {
      return positions_;
    }
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    public int getPositionsCount() {
      return positions_.size();
    }
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    public ServiceData.PositionPb getPositions(int index) {
      return positions_.get(index);
    }
    /**
     * <pre>
     *目标框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 4;</code>
     */
    public ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
        int index) {
      return positions_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTargetNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, targetName_);
      }
      if (targetProbability_ != 0F) {
        output.writeFloat(2, targetProbability_);
      }
      if (lable_ != null) {
        output.writeMessage(3, getLable());
      }
      for (int i = 0; i < positions_.size(); i++) {
        output.writeMessage(4, positions_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTargetNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, targetName_);
      }
      if (targetProbability_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(2, targetProbability_);
      }
      if (lable_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getLable());
      }
      for (int i = 0; i < positions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, positions_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.TargetInfo)) {
        return super.equals(obj);
      }
      ServiceData.TargetInfo other = (ServiceData.TargetInfo) obj;

      boolean result = true;
      result = result && getTargetName()
          .equals(other.getTargetName());
      result = result && (
          java.lang.Float.floatToIntBits(getTargetProbability())
          == java.lang.Float.floatToIntBits(
              other.getTargetProbability()));
      result = result && (hasLable() == other.hasLable());
      if (hasLable()) {
        result = result && getLable()
            .equals(other.getLable());
      }
      result = result && getPositionsList()
          .equals(other.getPositionsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TARGETNAME_FIELD_NUMBER;
      hash = (53 * hash) + getTargetName().hashCode();
      hash = (37 * hash) + TARGETPROBABILITY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getTargetProbability());
      if (hasLable()) {
        hash = (37 * hash) + LABLE_FIELD_NUMBER;
        hash = (53 * hash) + getLable().hashCode();
      }
      if (getPositionsCount() > 0) {
        hash = (37 * hash) + POSITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getPositionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.TargetInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.TargetInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.TargetInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.TargetInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.TargetInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.TargetInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.TargetInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *目标识别的结果信息
     * </pre>
     *
     * Protobuf type {@code TargetInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TargetInfo)
        ServiceData.TargetInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_TargetInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_TargetInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.TargetInfo.class, ServiceData.TargetInfo.Builder.class);
      }

      // Construct using ServiceData.TargetInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPositionsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetName_ = "";

        targetProbability_ = 0F;

        if (lableBuilder_ == null) {
          lable_ = null;
        } else {
          lable_ = null;
          lableBuilder_ = null;
        }
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
        } else {
          positionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_TargetInfo_descriptor;
      }

      @java.lang.Override
      public ServiceData.TargetInfo getDefaultInstanceForType() {
        return ServiceData.TargetInfo.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.TargetInfo build() {
        ServiceData.TargetInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.TargetInfo buildPartial() {
        ServiceData.TargetInfo result = new ServiceData.TargetInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.targetName_ = targetName_;
        result.targetProbability_ = targetProbability_;
        if (lableBuilder_ == null) {
          result.lable_ = lable_;
        } else {
          result.lable_ = lableBuilder_.build();
        }
        if (positionsBuilder_ == null) {
          if (((bitField0_ & 0x00000008) == 0x00000008)) {
            positions_ = java.util.Collections.unmodifiableList(positions_);
            bitField0_ = (bitField0_ & ~0x00000008);
          }
          result.positions_ = positions_;
        } else {
          result.positions_ = positionsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.TargetInfo) {
          return mergeFrom((ServiceData.TargetInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.TargetInfo other) {
        if (other == ServiceData.TargetInfo.getDefaultInstance()) return this;
        if (!other.getTargetName().isEmpty()) {
          targetName_ = other.targetName_;
          onChanged();
        }
        if (other.getTargetProbability() != 0F) {
          setTargetProbability(other.getTargetProbability());
        }
        if (other.hasLable()) {
          mergeLable(other.getLable());
        }
        if (positionsBuilder_ == null) {
          if (!other.positions_.isEmpty()) {
            if (positions_.isEmpty()) {
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000008);
            } else {
              ensurePositionsIsMutable();
              positions_.addAll(other.positions_);
            }
            onChanged();
          }
        } else {
          if (!other.positions_.isEmpty()) {
            if (positionsBuilder_.isEmpty()) {
              positionsBuilder_.dispose();
              positionsBuilder_ = null;
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000008);
              positionsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPositionsFieldBuilder() : null;
            } else {
              positionsBuilder_.addAllMessages(other.positions_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.TargetInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.TargetInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object targetName_ = "";
      /**
       * <pre>
       *目标类别中文/英文名，例如 "车辆/car"
       * </pre>
       *
       * <code>string targetName = 1;</code>
       */
      public java.lang.String getTargetName() {
        java.lang.Object ref = targetName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          targetName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *目标类别中文/英文名，例如 "车辆/car"
       * </pre>
       *
       * <code>string targetName = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTargetNameBytes() {
        java.lang.Object ref = targetName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          targetName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *目标类别中文/英文名，例如 "车辆/car"
       * </pre>
       *
       * <code>string targetName = 1;</code>
       */
      public Builder setTargetName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        targetName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标类别中文/英文名，例如 "车辆/car"
       * </pre>
       *
       * <code>string targetName = 1;</code>
       */
      public Builder clearTargetName() {
        
        targetName_ = getDefaultInstance().getTargetName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标类别中文/英文名，例如 "车辆/car"
       * </pre>
       *
       * <code>string targetName = 1;</code>
       */
      public Builder setTargetNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        targetName_ = value;
        onChanged();
        return this;
      }

      private float targetProbability_ ;
      /**
       * <pre>
       *目标概率，比如0.8
       * </pre>
       *
       * <code>float targetProbability = 2;</code>
       */
      public float getTargetProbability() {
        return targetProbability_;
      }
      /**
       * <pre>
       *目标概率，比如0.8
       * </pre>
       *
       * <code>float targetProbability = 2;</code>
       */
      public Builder setTargetProbability(float value) {
        
        targetProbability_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标概率，比如0.8
       * </pre>
       *
       * <code>float targetProbability = 2;</code>
       */
      public Builder clearTargetProbability() {
        
        targetProbability_ = 0F;
        onChanged();
        return this;
      }

      private ServiceData.LabelInfo lable_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LabelInfo, ServiceData.LabelInfo.Builder, ServiceData.LabelInfoOrBuilder> lableBuilder_;
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      public boolean hasLable() {
        return lableBuilder_ != null || lable_ != null;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      public ServiceData.LabelInfo getLable() {
        if (lableBuilder_ == null) {
          return lable_ == null ? ServiceData.LabelInfo.getDefaultInstance() : lable_;
        } else {
          return lableBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      public Builder setLable(ServiceData.LabelInfo value) {
        if (lableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lable_ = value;
          onChanged();
        } else {
          lableBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      public Builder setLable(
          ServiceData.LabelInfo.Builder builderForValue) {
        if (lableBuilder_ == null) {
          lable_ = builderForValue.build();
          onChanged();
        } else {
          lableBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      public Builder mergeLable(ServiceData.LabelInfo value) {
        if (lableBuilder_ == null) {
          if (lable_ != null) {
            lable_ =
              ServiceData.LabelInfo.newBuilder(lable_).mergeFrom(value).buildPartial();
          } else {
            lable_ = value;
          }
          onChanged();
        } else {
          lableBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      public Builder clearLable() {
        if (lableBuilder_ == null) {
          lable_ = null;
          onChanged();
        } else {
          lable_ = null;
          lableBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      public ServiceData.LabelInfo.Builder getLableBuilder() {
        
        onChanged();
        return getLableFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      public ServiceData.LabelInfoOrBuilder getLableOrBuilder() {
        if (lableBuilder_ != null) {
          return lableBuilder_.getMessageOrBuilder();
        } else {
          return lable_ == null ?
              ServiceData.LabelInfo.getDefaultInstance() : lable_;
        }
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LabelInfo, ServiceData.LabelInfo.Builder, ServiceData.LabelInfoOrBuilder> 
          getLableFieldBuilder() {
        if (lableBuilder_ == null) {
          lableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.LabelInfo, ServiceData.LabelInfo.Builder, ServiceData.LabelInfoOrBuilder>(
                  getLable(),
                  getParentForChildren(),
                  isClean());
          lable_ = null;
        }
        return lableBuilder_;
      }

      private java.util.List<ServiceData.PositionPb> positions_ =
        java.util.Collections.emptyList();
      private void ensurePositionsIsMutable() {
        if (!((bitField0_ & 0x00000008) == 0x00000008)) {
          positions_ = new java.util.ArrayList<ServiceData.PositionPb>(positions_);
          bitField0_ |= 0x00000008;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> positionsBuilder_;

      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public java.util.List<ServiceData.PositionPb> getPositionsList() {
        if (positionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(positions_);
        } else {
          return positionsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public int getPositionsCount() {
        if (positionsBuilder_ == null) {
          return positions_.size();
        } else {
          return positionsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public ServiceData.PositionPb getPositions(int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);
        } else {
          return positionsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder setPositions(
          int index, ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.set(index, value);
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder setPositions(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.set(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder addPositions(ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder addPositions(
          int index, ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(index, value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder addPositions(
          ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder addPositions(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder addAllPositions(
          java.lang.Iterable<? extends ServiceData.PositionPb> values) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, positions_);
          onChanged();
        } else {
          positionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder clearPositions() {
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000008);
          onChanged();
        } else {
          positionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public Builder removePositions(int index) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.remove(index);
          onChanged();
        } else {
          positionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public ServiceData.PositionPb.Builder getPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
          int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);  } else {
          return positionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
           getPositionsOrBuilderList() {
        if (positionsBuilder_ != null) {
          return positionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(positions_);
        }
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public ServiceData.PositionPb.Builder addPositionsBuilder() {
        return getPositionsFieldBuilder().addBuilder(
            ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public ServiceData.PositionPb.Builder addPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().addBuilder(
            index, ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *目标框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 4;</code>
       */
      public java.util.List<ServiceData.PositionPb.Builder> 
           getPositionsBuilderList() {
        return getPositionsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getPositionsFieldBuilder() {
        if (positionsBuilder_ == null) {
          positionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  positions_,
                  ((bitField0_ & 0x00000008) == 0x00000008),
                  getParentForChildren(),
                  isClean());
          positions_ = null;
        }
        return positionsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TargetInfo)
    }

    // @@protoc_insertion_point(class_scope:TargetInfo)
    private static final ServiceData.TargetInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.TargetInfo();
    }

    public static ServiceData.TargetInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TargetInfo>
        PARSER = new com.google.protobuf.AbstractParser<TargetInfo>() {
      @java.lang.Override
      public TargetInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TargetInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TargetInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TargetInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.TargetInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChangeInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *概率，比如0.8
     * </pre>
     *
     * <code>float targetProbability = 1;</code>
     */
    float getTargetProbability();

    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 2;</code>
     */
    boolean hasLable();
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 2;</code>
     */
    ServiceData.LabelInfo getLable();
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 2;</code>
     */
    ServiceData.LabelInfoOrBuilder getLableOrBuilder();

    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    java.util.List<ServiceData.PositionPb> 
        getPositionsList();
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    ServiceData.PositionPb getPositions(int index);
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    int getPositionsCount();
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getPositionsOrBuilderList();
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
        int index);
  }
  /**
   * <pre>
   *变化区域信息
   * </pre>
   *
   * Protobuf type {@code ChangeInfo}
   */
  public  static final class ChangeInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeInfo)
      ChangeInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeInfo.newBuilder() to construct.
    private ChangeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeInfo() {
      targetProbability_ = 0F;
      positions_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 13: {

              targetProbability_ = input.readFloat();
              break;
            }
            case 18: {
              ServiceData.LabelInfo.Builder subBuilder = null;
              if (lable_ != null) {
                subBuilder = lable_.toBuilder();
              }
              lable_ = input.readMessage(ServiceData.LabelInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(lable_);
                lable_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
                positions_ = new java.util.ArrayList<ServiceData.PositionPb>();
                mutable_bitField0_ |= 0x00000004;
              }
              positions_.add(
                  input.readMessage(ServiceData.PositionPb.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
          positions_ = java.util.Collections.unmodifiableList(positions_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_ChangeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_ChangeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.ChangeInfo.class, ServiceData.ChangeInfo.Builder.class);
    }

    private int bitField0_;
    public static final int TARGETPROBABILITY_FIELD_NUMBER = 1;
    private float targetProbability_;
    /**
     * <pre>
     *概率，比如0.8
     * </pre>
     *
     * <code>float targetProbability = 1;</code>
     */
    public float getTargetProbability() {
      return targetProbability_;
    }

    public static final int LABLE_FIELD_NUMBER = 2;
    private ServiceData.LabelInfo lable_;
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 2;</code>
     */
    public boolean hasLable() {
      return lable_ != null;
    }
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 2;</code>
     */
    public ServiceData.LabelInfo getLable() {
      return lable_ == null ? ServiceData.LabelInfo.getDefaultInstance() : lable_;
    }
    /**
     * <pre>
     *标注信息
     * </pre>
     *
     * <code>.LabelInfo lable = 2;</code>
     */
    public ServiceData.LabelInfoOrBuilder getLableOrBuilder() {
      return getLable();
    }

    public static final int POSITIONS_FIELD_NUMBER = 3;
    private java.util.List<ServiceData.PositionPb> positions_;
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    public java.util.List<ServiceData.PositionPb> getPositionsList() {
      return positions_;
    }
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
        getPositionsOrBuilderList() {
      return positions_;
    }
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    public int getPositionsCount() {
      return positions_.size();
    }
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    public ServiceData.PositionPb getPositions(int index) {
      return positions_.get(index);
    }
    /**
     * <pre>
     *区域框的地理坐标
     * </pre>
     *
     * <code>repeated .PositionPb positions = 3;</code>
     */
    public ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
        int index) {
      return positions_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (targetProbability_ != 0F) {
        output.writeFloat(1, targetProbability_);
      }
      if (lable_ != null) {
        output.writeMessage(2, getLable());
      }
      for (int i = 0; i < positions_.size(); i++) {
        output.writeMessage(3, positions_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (targetProbability_ != 0F) {
        size += com.google.protobuf.CodedOutputStream
          .computeFloatSize(1, targetProbability_);
      }
      if (lable_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getLable());
      }
      for (int i = 0; i < positions_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, positions_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.ChangeInfo)) {
        return super.equals(obj);
      }
      ServiceData.ChangeInfo other = (ServiceData.ChangeInfo) obj;

      boolean result = true;
      result = result && (
          java.lang.Float.floatToIntBits(getTargetProbability())
          == java.lang.Float.floatToIntBits(
              other.getTargetProbability()));
      result = result && (hasLable() == other.hasLable());
      if (hasLable()) {
        result = result && getLable()
            .equals(other.getLable());
      }
      result = result && getPositionsList()
          .equals(other.getPositionsList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TARGETPROBABILITY_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(
          getTargetProbability());
      if (hasLable()) {
        hash = (37 * hash) + LABLE_FIELD_NUMBER;
        hash = (53 * hash) + getLable().hashCode();
      }
      if (getPositionsCount() > 0) {
        hash = (37 * hash) + POSITIONS_FIELD_NUMBER;
        hash = (53 * hash) + getPositionsList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.ChangeInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ChangeInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ChangeInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ChangeInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ChangeInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ChangeInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ChangeInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.ChangeInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.ChangeInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.ChangeInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.ChangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.ChangeInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.ChangeInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *变化区域信息
     * </pre>
     *
     * Protobuf type {@code ChangeInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeInfo)
        ServiceData.ChangeInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_ChangeInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_ChangeInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.ChangeInfo.class, ServiceData.ChangeInfo.Builder.class);
      }

      // Construct using ServiceData.ChangeInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getPositionsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        targetProbability_ = 0F;

        if (lableBuilder_ == null) {
          lable_ = null;
        } else {
          lable_ = null;
          lableBuilder_ = null;
        }
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          positionsBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_ChangeInfo_descriptor;
      }

      @java.lang.Override
      public ServiceData.ChangeInfo getDefaultInstanceForType() {
        return ServiceData.ChangeInfo.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.ChangeInfo build() {
        ServiceData.ChangeInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.ChangeInfo buildPartial() {
        ServiceData.ChangeInfo result = new ServiceData.ChangeInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.targetProbability_ = targetProbability_;
        if (lableBuilder_ == null) {
          result.lable_ = lable_;
        } else {
          result.lable_ = lableBuilder_.build();
        }
        if (positionsBuilder_ == null) {
          if (((bitField0_ & 0x00000004) == 0x00000004)) {
            positions_ = java.util.Collections.unmodifiableList(positions_);
            bitField0_ = (bitField0_ & ~0x00000004);
          }
          result.positions_ = positions_;
        } else {
          result.positions_ = positionsBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.ChangeInfo) {
          return mergeFrom((ServiceData.ChangeInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.ChangeInfo other) {
        if (other == ServiceData.ChangeInfo.getDefaultInstance()) return this;
        if (other.getTargetProbability() != 0F) {
          setTargetProbability(other.getTargetProbability());
        }
        if (other.hasLable()) {
          mergeLable(other.getLable());
        }
        if (positionsBuilder_ == null) {
          if (!other.positions_.isEmpty()) {
            if (positions_.isEmpty()) {
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000004);
            } else {
              ensurePositionsIsMutable();
              positions_.addAll(other.positions_);
            }
            onChanged();
          }
        } else {
          if (!other.positions_.isEmpty()) {
            if (positionsBuilder_.isEmpty()) {
              positionsBuilder_.dispose();
              positionsBuilder_ = null;
              positions_ = other.positions_;
              bitField0_ = (bitField0_ & ~0x00000004);
              positionsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getPositionsFieldBuilder() : null;
            } else {
              positionsBuilder_.addAllMessages(other.positions_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.ChangeInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.ChangeInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private float targetProbability_ ;
      /**
       * <pre>
       *概率，比如0.8
       * </pre>
       *
       * <code>float targetProbability = 1;</code>
       */
      public float getTargetProbability() {
        return targetProbability_;
      }
      /**
       * <pre>
       *概率，比如0.8
       * </pre>
       *
       * <code>float targetProbability = 1;</code>
       */
      public Builder setTargetProbability(float value) {
        
        targetProbability_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *概率，比如0.8
       * </pre>
       *
       * <code>float targetProbability = 1;</code>
       */
      public Builder clearTargetProbability() {
        
        targetProbability_ = 0F;
        onChanged();
        return this;
      }

      private ServiceData.LabelInfo lable_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LabelInfo, ServiceData.LabelInfo.Builder, ServiceData.LabelInfoOrBuilder> lableBuilder_;
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      public boolean hasLable() {
        return lableBuilder_ != null || lable_ != null;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      public ServiceData.LabelInfo getLable() {
        if (lableBuilder_ == null) {
          return lable_ == null ? ServiceData.LabelInfo.getDefaultInstance() : lable_;
        } else {
          return lableBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      public Builder setLable(ServiceData.LabelInfo value) {
        if (lableBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          lable_ = value;
          onChanged();
        } else {
          lableBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      public Builder setLable(
          ServiceData.LabelInfo.Builder builderForValue) {
        if (lableBuilder_ == null) {
          lable_ = builderForValue.build();
          onChanged();
        } else {
          lableBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      public Builder mergeLable(ServiceData.LabelInfo value) {
        if (lableBuilder_ == null) {
          if (lable_ != null) {
            lable_ =
              ServiceData.LabelInfo.newBuilder(lable_).mergeFrom(value).buildPartial();
          } else {
            lable_ = value;
          }
          onChanged();
        } else {
          lableBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      public Builder clearLable() {
        if (lableBuilder_ == null) {
          lable_ = null;
          onChanged();
        } else {
          lable_ = null;
          lableBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      public ServiceData.LabelInfo.Builder getLableBuilder() {
        
        onChanged();
        return getLableFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      public ServiceData.LabelInfoOrBuilder getLableOrBuilder() {
        if (lableBuilder_ != null) {
          return lableBuilder_.getMessageOrBuilder();
        } else {
          return lable_ == null ?
              ServiceData.LabelInfo.getDefaultInstance() : lable_;
        }
      }
      /**
       * <pre>
       *标注信息
       * </pre>
       *
       * <code>.LabelInfo lable = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.LabelInfo, ServiceData.LabelInfo.Builder, ServiceData.LabelInfoOrBuilder> 
          getLableFieldBuilder() {
        if (lableBuilder_ == null) {
          lableBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.LabelInfo, ServiceData.LabelInfo.Builder, ServiceData.LabelInfoOrBuilder>(
                  getLable(),
                  getParentForChildren(),
                  isClean());
          lable_ = null;
        }
        return lableBuilder_;
      }

      private java.util.List<ServiceData.PositionPb> positions_ =
        java.util.Collections.emptyList();
      private void ensurePositionsIsMutable() {
        if (!((bitField0_ & 0x00000004) == 0x00000004)) {
          positions_ = new java.util.ArrayList<ServiceData.PositionPb>(positions_);
          bitField0_ |= 0x00000004;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> positionsBuilder_;

      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public java.util.List<ServiceData.PositionPb> getPositionsList() {
        if (positionsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(positions_);
        } else {
          return positionsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public int getPositionsCount() {
        if (positionsBuilder_ == null) {
          return positions_.size();
        } else {
          return positionsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public ServiceData.PositionPb getPositions(int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);
        } else {
          return positionsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder setPositions(
          int index, ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.set(index, value);
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder setPositions(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.set(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder addPositions(ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder addPositions(
          int index, ServiceData.PositionPb value) {
        if (positionsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensurePositionsIsMutable();
          positions_.add(index, value);
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder addPositions(
          ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder addPositions(
          int index, ServiceData.PositionPb.Builder builderForValue) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.add(index, builderForValue.build());
          onChanged();
        } else {
          positionsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder addAllPositions(
          java.lang.Iterable<? extends ServiceData.PositionPb> values) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, positions_);
          onChanged();
        } else {
          positionsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder clearPositions() {
        if (positionsBuilder_ == null) {
          positions_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000004);
          onChanged();
        } else {
          positionsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public Builder removePositions(int index) {
        if (positionsBuilder_ == null) {
          ensurePositionsIsMutable();
          positions_.remove(index);
          onChanged();
        } else {
          positionsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public ServiceData.PositionPb.Builder getPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public ServiceData.PositionPbOrBuilder getPositionsOrBuilder(
          int index) {
        if (positionsBuilder_ == null) {
          return positions_.get(index);  } else {
          return positionsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public java.util.List<? extends ServiceData.PositionPbOrBuilder> 
           getPositionsOrBuilderList() {
        if (positionsBuilder_ != null) {
          return positionsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(positions_);
        }
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public ServiceData.PositionPb.Builder addPositionsBuilder() {
        return getPositionsFieldBuilder().addBuilder(
            ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public ServiceData.PositionPb.Builder addPositionsBuilder(
          int index) {
        return getPositionsFieldBuilder().addBuilder(
            index, ServiceData.PositionPb.getDefaultInstance());
      }
      /**
       * <pre>
       *区域框的地理坐标
       * </pre>
       *
       * <code>repeated .PositionPb positions = 3;</code>
       */
      public java.util.List<ServiceData.PositionPb.Builder> 
           getPositionsBuilderList() {
        return getPositionsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder> 
          getPositionsFieldBuilder() {
        if (positionsBuilder_ == null) {
          positionsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.PositionPb, ServiceData.PositionPb.Builder, ServiceData.PositionPbOrBuilder>(
                  positions_,
                  ((bitField0_ & 0x00000004) == 0x00000004),
                  getParentForChildren(),
                  isClean());
          positions_ = null;
        }
        return positionsBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ChangeInfo)
    }

    // @@protoc_insertion_point(class_scope:ChangeInfo)
    private static final ServiceData.ChangeInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.ChangeInfo();
    }

    public static ServiceData.ChangeInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChangeInfo>() {
      @java.lang.Override
      public ChangeInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.ChangeInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TaskDataOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TaskData)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *任务id
     * </pre>
     *
     * <code>int32 tid = 1;</code>
     */
    int getTid();

    /**
     * <pre>
     *任务类型，1:信息叠加 2:变化检测 3:目标检测  4:视频解码  5:大图拼接
     *不影响原有算法注册流程，注册时携带算法类型，代理服务根据算法类型分配任务
     *备用字段，用于后续可能的修改或升级
     * </pre>
     *
     * <code>int32 type = 2;</code>
     */
    int getType();

    /**
     * <pre>
     *视频类型，值为1或者2
     * 1表示实时流处理，videoUrl为rtsp拉流地址(例如: rtsp://www.wogrid.com/a-3-1)，outUrl为rtsp推流地址(例如: rtsp://www.wogrid.com/a-3-2)
     * 2表示历史视频文件处理，videoUrl为视频文件url(例如：http://vod.wogrid.com/a/b.mp4)，outUrl为视频本地存储地址(例如：/data/video/ai/3-2.mp4)
     * </pre>
     *
     * <code>int32 videoType = 3;</code>
     */
    int getVideoType();

    /**
     * <pre>
     *吊舱参数，用于视频解算
     * </pre>
     *
     * <code>.DemoParam demoParam = 4;</code>
     */
    boolean hasDemoParam();
    /**
     * <pre>
     *吊舱参数，用于视频解算
     * </pre>
     *
     * <code>.DemoParam demoParam = 4;</code>
     */
    ServiceData.DemoParam getDemoParam();
    /**
     * <pre>
     *吊舱参数，用于视频解算
     * </pre>
     *
     * <code>.DemoParam demoParam = 4;</code>
     */
    ServiceData.DemoParamOrBuilder getDemoParamOrBuilder();

    /**
     * <pre>
     *图片帧处理间隔（抽帧检测），单位为秒，比如2表示每2秒处理一帧图片，0表示每一帧都处理
     *目前可以不用考虑该字段，默认值位0，表示每一帧都检测
     * </pre>
     *
     * <code>int32 interval = 5;</code>
     */
    int getInterval();

    /**
     * <pre>
     *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
     * </pre>
     *
     * <code>repeated int32 targetNumbers = 6;</code>
     */
    java.util.List<java.lang.Integer> getTargetNumbersList();
    /**
     * <pre>
     *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
     * </pre>
     *
     * <code>repeated int32 targetNumbers = 6;</code>
     */
    int getTargetNumbersCount();
    /**
     * <pre>
     *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
     * </pre>
     *
     * <code>repeated int32 targetNumbers = 6;</code>
     */
    int getTargetNumbers(int index);

    /**
     * <pre>
     *管线数据，用于信息叠加算法
     * </pre>
     *
     * <code>.PipeData pipeData = 7;</code>
     */
    boolean hasPipeData();
    /**
     * <pre>
     *管线数据，用于信息叠加算法
     * </pre>
     *
     * <code>.PipeData pipeData = 7;</code>
     */
    ServiceData.PipeData getPipeData();
    /**
     * <pre>
     *管线数据，用于信息叠加算法
     * </pre>
     *
     * <code>.PipeData pipeData = 7;</code>
     */
    ServiceData.PipeDataOrBuilder getPipeDataOrBuilder();

    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    java.util.List<ServiceData.CordonData> 
        getCordonDatasList();
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    ServiceData.CordonData getCordonDatas(int index);
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    int getCordonDatasCount();
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    java.util.List<? extends ServiceData.CordonDataOrBuilder> 
        getCordonDatasOrBuilderList();
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    ServiceData.CordonDataOrBuilder getCordonDatasOrBuilder(
        int index);

    /**
     * <pre>
     *关注区域（目标）数据，用于信息叠加算法
     * </pre>
     *
     * <code>.FocusData focusData = 9;</code>
     */
    boolean hasFocusData();
    /**
     * <pre>
     *关注区域（目标）数据，用于信息叠加算法
     * </pre>
     *
     * <code>.FocusData focusData = 9;</code>
     */
    ServiceData.FocusData getFocusData();
    /**
     * <pre>
     *关注区域（目标）数据，用于信息叠加算法
     * </pre>
     *
     * <code>.FocusData focusData = 9;</code>
     */
    ServiceData.FocusDataOrBuilder getFocusDataOrBuilder();

    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    java.util.List<ServiceData.HistoryImage> 
        getHistoryImagesList();
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    ServiceData.HistoryImage getHistoryImages(int index);
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    int getHistoryImagesCount();
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    java.util.List<? extends ServiceData.HistoryImageOrBuilder> 
        getHistoryImagesOrBuilderList();
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    ServiceData.HistoryImageOrBuilder getHistoryImagesOrBuilder(
        int index);

    /**
     * <pre>
     *拉流地址或者历史视频url
     * </pre>
     *
     * <code>string videoUrl = 11;</code>
     */
    java.lang.String getVideoUrl();
    /**
     * <pre>
     *拉流地址或者历史视频url
     * </pre>
     *
     * <code>string videoUrl = 11;</code>
     */
    com.google.protobuf.ByteString
        getVideoUrlBytes();

    /**
     * <pre>
     *推流地址或者视频文件本地存储路径
     * </pre>
     *
     * <code>string outUrl = 12;</code>
     */
    java.lang.String getOutUrl();
    /**
     * <pre>
     *推流地址或者视频文件本地存储路径
     * </pre>
     *
     * <code>string outUrl = 12;</code>
     */
    com.google.protobuf.ByteString
        getOutUrlBytes();

    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    java.util.List<ServiceData.LinePb> 
        getLinesList();
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    ServiceData.LinePb getLines(int index);
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    int getLinesCount();
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    java.util.List<? extends ServiceData.LinePbOrBuilder> 
        getLinesOrBuilderList();
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    ServiceData.LinePbOrBuilder getLinesOrBuilder(
        int index);
  }
  /**
   * <pre>
   *任务数据
   * </pre>
   *
   * Protobuf type {@code TaskData}
   */
  public  static final class TaskData extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TaskData)
      TaskDataOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TaskData.newBuilder() to construct.
    private TaskData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TaskData() {
      tid_ = 0;
      type_ = 0;
      videoType_ = 0;
      interval_ = 0;
      targetNumbers_ = java.util.Collections.emptyList();
      cordonDatas_ = java.util.Collections.emptyList();
      historyImages_ = java.util.Collections.emptyList();
      videoUrl_ = "";
      outUrl_ = "";
      lines_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TaskData(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              tid_ = input.readInt32();
              break;
            }
            case 16: {

              type_ = input.readInt32();
              break;
            }
            case 24: {

              videoType_ = input.readInt32();
              break;
            }
            case 34: {
              ServiceData.DemoParam.Builder subBuilder = null;
              if (demoParam_ != null) {
                subBuilder = demoParam_.toBuilder();
              }
              demoParam_ = input.readMessage(ServiceData.DemoParam.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(demoParam_);
                demoParam_ = subBuilder.buildPartial();
              }

              break;
            }
            case 40: {

              interval_ = input.readInt32();
              break;
            }
            case 48: {
              if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                targetNumbers_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000020;
              }
              targetNumbers_.add(input.readInt32());
              break;
            }
            case 50: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000020) == 0x00000020) && input.getBytesUntilLimit() > 0) {
                targetNumbers_ = new java.util.ArrayList<java.lang.Integer>();
                mutable_bitField0_ |= 0x00000020;
              }
              while (input.getBytesUntilLimit() > 0) {
                targetNumbers_.add(input.readInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 58: {
              ServiceData.PipeData.Builder subBuilder = null;
              if (pipeData_ != null) {
                subBuilder = pipeData_.toBuilder();
              }
              pipeData_ = input.readMessage(ServiceData.PipeData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(pipeData_);
                pipeData_ = subBuilder.buildPartial();
              }

              break;
            }
            case 66: {
              if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                cordonDatas_ = new java.util.ArrayList<ServiceData.CordonData>();
                mutable_bitField0_ |= 0x00000080;
              }
              cordonDatas_.add(
                  input.readMessage(ServiceData.CordonData.parser(), extensionRegistry));
              break;
            }
            case 74: {
              ServiceData.FocusData.Builder subBuilder = null;
              if (focusData_ != null) {
                subBuilder = focusData_.toBuilder();
              }
              focusData_ = input.readMessage(ServiceData.FocusData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(focusData_);
                focusData_ = subBuilder.buildPartial();
              }

              break;
            }
            case 82: {
              if (!((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
                historyImages_ = new java.util.ArrayList<ServiceData.HistoryImage>();
                mutable_bitField0_ |= 0x00000200;
              }
              historyImages_.add(
                  input.readMessage(ServiceData.HistoryImage.parser(), extensionRegistry));
              break;
            }
            case 90: {
              java.lang.String s = input.readStringRequireUtf8();

              videoUrl_ = s;
              break;
            }
            case 98: {
              java.lang.String s = input.readStringRequireUtf8();

              outUrl_ = s;
              break;
            }
            case 106: {
              if (!((mutable_bitField0_ & 0x00001000) == 0x00001000)) {
                lines_ = new java.util.ArrayList<ServiceData.LinePb>();
                mutable_bitField0_ |= 0x00001000;
              }
              lines_.add(
                  input.readMessage(ServiceData.LinePb.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
          targetNumbers_ = java.util.Collections.unmodifiableList(targetNumbers_);
        }
        if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
          cordonDatas_ = java.util.Collections.unmodifiableList(cordonDatas_);
        }
        if (((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
          historyImages_ = java.util.Collections.unmodifiableList(historyImages_);
        }
        if (((mutable_bitField0_ & 0x00001000) == 0x00001000)) {
          lines_ = java.util.Collections.unmodifiableList(lines_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_TaskData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_TaskData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.TaskData.class, ServiceData.TaskData.Builder.class);
    }

    private int bitField0_;
    public static final int TID_FIELD_NUMBER = 1;
    private int tid_;
    /**
     * <pre>
     *任务id
     * </pre>
     *
     * <code>int32 tid = 1;</code>
     */
    public int getTid() {
      return tid_;
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <pre>
     *任务类型，1:信息叠加 2:变化检测 3:目标检测  4:视频解码  5:大图拼接
     *不影响原有算法注册流程，注册时携带算法类型，代理服务根据算法类型分配任务
     *备用字段，用于后续可能的修改或升级
     * </pre>
     *
     * <code>int32 type = 2;</code>
     */
    public int getType() {
      return type_;
    }

    public static final int VIDEOTYPE_FIELD_NUMBER = 3;
    private int videoType_;
    /**
     * <pre>
     *视频类型，值为1或者2
     * 1表示实时流处理，videoUrl为rtsp拉流地址(例如: rtsp://www.wogrid.com/a-3-1)，outUrl为rtsp推流地址(例如: rtsp://www.wogrid.com/a-3-2)
     * 2表示历史视频文件处理，videoUrl为视频文件url(例如：http://vod.wogrid.com/a/b.mp4)，outUrl为视频本地存储地址(例如：/data/video/ai/3-2.mp4)
     * </pre>
     *
     * <code>int32 videoType = 3;</code>
     */
    public int getVideoType() {
      return videoType_;
    }

    public static final int DEMOPARAM_FIELD_NUMBER = 4;
    private ServiceData.DemoParam demoParam_;
    /**
     * <pre>
     *吊舱参数，用于视频解算
     * </pre>
     *
     * <code>.DemoParam demoParam = 4;</code>
     */
    public boolean hasDemoParam() {
      return demoParam_ != null;
    }
    /**
     * <pre>
     *吊舱参数，用于视频解算
     * </pre>
     *
     * <code>.DemoParam demoParam = 4;</code>
     */
    public ServiceData.DemoParam getDemoParam() {
      return demoParam_ == null ? ServiceData.DemoParam.getDefaultInstance() : demoParam_;
    }
    /**
     * <pre>
     *吊舱参数，用于视频解算
     * </pre>
     *
     * <code>.DemoParam demoParam = 4;</code>
     */
    public ServiceData.DemoParamOrBuilder getDemoParamOrBuilder() {
      return getDemoParam();
    }

    public static final int INTERVAL_FIELD_NUMBER = 5;
    private int interval_;
    /**
     * <pre>
     *图片帧处理间隔（抽帧检测），单位为秒，比如2表示每2秒处理一帧图片，0表示每一帧都处理
     *目前可以不用考虑该字段，默认值位0，表示每一帧都检测
     * </pre>
     *
     * <code>int32 interval = 5;</code>
     */
    public int getInterval() {
      return interval_;
    }

    public static final int TARGETNUMBERS_FIELD_NUMBER = 6;
    private java.util.List<java.lang.Integer> targetNumbers_;
    /**
     * <pre>
     *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
     * </pre>
     *
     * <code>repeated int32 targetNumbers = 6;</code>
     */
    public java.util.List<java.lang.Integer>
        getTargetNumbersList() {
      return targetNumbers_;
    }
    /**
     * <pre>
     *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
     * </pre>
     *
     * <code>repeated int32 targetNumbers = 6;</code>
     */
    public int getTargetNumbersCount() {
      return targetNumbers_.size();
    }
    /**
     * <pre>
     *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
     * </pre>
     *
     * <code>repeated int32 targetNumbers = 6;</code>
     */
    public int getTargetNumbers(int index) {
      return targetNumbers_.get(index);
    }
    private int targetNumbersMemoizedSerializedSize = -1;

    public static final int PIPEDATA_FIELD_NUMBER = 7;
    private ServiceData.PipeData pipeData_;
    /**
     * <pre>
     *管线数据，用于信息叠加算法
     * </pre>
     *
     * <code>.PipeData pipeData = 7;</code>
     */
    public boolean hasPipeData() {
      return pipeData_ != null;
    }
    /**
     * <pre>
     *管线数据，用于信息叠加算法
     * </pre>
     *
     * <code>.PipeData pipeData = 7;</code>
     */
    public ServiceData.PipeData getPipeData() {
      return pipeData_ == null ? ServiceData.PipeData.getDefaultInstance() : pipeData_;
    }
    /**
     * <pre>
     *管线数据，用于信息叠加算法
     * </pre>
     *
     * <code>.PipeData pipeData = 7;</code>
     */
    public ServiceData.PipeDataOrBuilder getPipeDataOrBuilder() {
      return getPipeData();
    }

    public static final int CORDONDATAS_FIELD_NUMBER = 8;
    private java.util.List<ServiceData.CordonData> cordonDatas_;
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    public java.util.List<ServiceData.CordonData> getCordonDatasList() {
      return cordonDatas_;
    }
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    public java.util.List<? extends ServiceData.CordonDataOrBuilder> 
        getCordonDatasOrBuilderList() {
      return cordonDatas_;
    }
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    public int getCordonDatasCount() {
      return cordonDatas_.size();
    }
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    public ServiceData.CordonData getCordonDatas(int index) {
      return cordonDatas_.get(index);
    }
    /**
     * <pre>
     *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
     * </pre>
     *
     * <code>repeated .CordonData cordonDatas = 8;</code>
     */
    public ServiceData.CordonDataOrBuilder getCordonDatasOrBuilder(
        int index) {
      return cordonDatas_.get(index);
    }

    public static final int FOCUSDATA_FIELD_NUMBER = 9;
    private ServiceData.FocusData focusData_;
    /**
     * <pre>
     *关注区域（目标）数据，用于信息叠加算法
     * </pre>
     *
     * <code>.FocusData focusData = 9;</code>
     */
    public boolean hasFocusData() {
      return focusData_ != null;
    }
    /**
     * <pre>
     *关注区域（目标）数据，用于信息叠加算法
     * </pre>
     *
     * <code>.FocusData focusData = 9;</code>
     */
    public ServiceData.FocusData getFocusData() {
      return focusData_ == null ? ServiceData.FocusData.getDefaultInstance() : focusData_;
    }
    /**
     * <pre>
     *关注区域（目标）数据，用于信息叠加算法
     * </pre>
     *
     * <code>.FocusData focusData = 9;</code>
     */
    public ServiceData.FocusDataOrBuilder getFocusDataOrBuilder() {
      return getFocusData();
    }

    public static final int HISTORYIMAGES_FIELD_NUMBER = 10;
    private java.util.List<ServiceData.HistoryImage> historyImages_;
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    public java.util.List<ServiceData.HistoryImage> getHistoryImagesList() {
      return historyImages_;
    }
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    public java.util.List<? extends ServiceData.HistoryImageOrBuilder> 
        getHistoryImagesOrBuilderList() {
      return historyImages_;
    }
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    public int getHistoryImagesCount() {
      return historyImages_.size();
    }
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    public ServiceData.HistoryImage getHistoryImages(int index) {
      return historyImages_.get(index);
    }
    /**
     * <pre>
     *历史图片列表，用于变化检测算法作为对比模板
     * </pre>
     *
     * <code>repeated .HistoryImage historyImages = 10;</code>
     */
    public ServiceData.HistoryImageOrBuilder getHistoryImagesOrBuilder(
        int index) {
      return historyImages_.get(index);
    }

    public static final int VIDEOURL_FIELD_NUMBER = 11;
    private volatile java.lang.Object videoUrl_;
    /**
     * <pre>
     *拉流地址或者历史视频url
     * </pre>
     *
     * <code>string videoUrl = 11;</code>
     */
    public java.lang.String getVideoUrl() {
      java.lang.Object ref = videoUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        videoUrl_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *拉流地址或者历史视频url
     * </pre>
     *
     * <code>string videoUrl = 11;</code>
     */
    public com.google.protobuf.ByteString
        getVideoUrlBytes() {
      java.lang.Object ref = videoUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        videoUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OUTURL_FIELD_NUMBER = 12;
    private volatile java.lang.Object outUrl_;
    /**
     * <pre>
     *推流地址或者视频文件本地存储路径
     * </pre>
     *
     * <code>string outUrl = 12;</code>
     */
    public java.lang.String getOutUrl() {
      java.lang.Object ref = outUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        outUrl_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *推流地址或者视频文件本地存储路径
     * </pre>
     *
     * <code>string outUrl = 12;</code>
     */
    public com.google.protobuf.ByteString
        getOutUrlBytes() {
      java.lang.Object ref = outUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        outUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LINES_FIELD_NUMBER = 13;
    private java.util.List<ServiceData.LinePb> lines_;
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    public java.util.List<ServiceData.LinePb> getLinesList() {
      return lines_;
    }
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    public java.util.List<? extends ServiceData.LinePbOrBuilder> 
        getLinesOrBuilderList() {
      return lines_;
    }
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    public int getLinesCount() {
      return lines_.size();
    }
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    public ServiceData.LinePb getLines(int index) {
      return lines_.get(index);
    }
    /**
     * <pre>
     *大图拼接的线段列表，用于大图拼接算法
     * </pre>
     *
     * <code>repeated .LinePb lines = 13;</code>
     */
    public ServiceData.LinePbOrBuilder getLinesOrBuilder(
        int index) {
      return lines_.get(index);
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (tid_ != 0) {
        output.writeInt32(1, tid_);
      }
      if (type_ != 0) {
        output.writeInt32(2, type_);
      }
      if (videoType_ != 0) {
        output.writeInt32(3, videoType_);
      }
      if (demoParam_ != null) {
        output.writeMessage(4, getDemoParam());
      }
      if (interval_ != 0) {
        output.writeInt32(5, interval_);
      }
      if (getTargetNumbersList().size() > 0) {
        output.writeUInt32NoTag(50);
        output.writeUInt32NoTag(targetNumbersMemoizedSerializedSize);
      }
      for (int i = 0; i < targetNumbers_.size(); i++) {
        output.writeInt32NoTag(targetNumbers_.get(i));
      }
      if (pipeData_ != null) {
        output.writeMessage(7, getPipeData());
      }
      for (int i = 0; i < cordonDatas_.size(); i++) {
        output.writeMessage(8, cordonDatas_.get(i));
      }
      if (focusData_ != null) {
        output.writeMessage(9, getFocusData());
      }
      for (int i = 0; i < historyImages_.size(); i++) {
        output.writeMessage(10, historyImages_.get(i));
      }
      if (!getVideoUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 11, videoUrl_);
      }
      if (!getOutUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 12, outUrl_);
      }
      for (int i = 0; i < lines_.size(); i++) {
        output.writeMessage(13, lines_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (tid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, tid_);
      }
      if (type_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, type_);
      }
      if (videoType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, videoType_);
      }
      if (demoParam_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getDemoParam());
      }
      if (interval_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(5, interval_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < targetNumbers_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(targetNumbers_.get(i));
        }
        size += dataSize;
        if (!getTargetNumbersList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        targetNumbersMemoizedSerializedSize = dataSize;
      }
      if (pipeData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(7, getPipeData());
      }
      for (int i = 0; i < cordonDatas_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, cordonDatas_.get(i));
      }
      if (focusData_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(9, getFocusData());
      }
      for (int i = 0; i < historyImages_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(10, historyImages_.get(i));
      }
      if (!getVideoUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, videoUrl_);
      }
      if (!getOutUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, outUrl_);
      }
      for (int i = 0; i < lines_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(13, lines_.get(i));
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.TaskData)) {
        return super.equals(obj);
      }
      ServiceData.TaskData other = (ServiceData.TaskData) obj;

      boolean result = true;
      result = result && (getTid()
          == other.getTid());
      result = result && (getType()
          == other.getType());
      result = result && (getVideoType()
          == other.getVideoType());
      result = result && (hasDemoParam() == other.hasDemoParam());
      if (hasDemoParam()) {
        result = result && getDemoParam()
            .equals(other.getDemoParam());
      }
      result = result && (getInterval()
          == other.getInterval());
      result = result && getTargetNumbersList()
          .equals(other.getTargetNumbersList());
      result = result && (hasPipeData() == other.hasPipeData());
      if (hasPipeData()) {
        result = result && getPipeData()
            .equals(other.getPipeData());
      }
      result = result && getCordonDatasList()
          .equals(other.getCordonDatasList());
      result = result && (hasFocusData() == other.hasFocusData());
      if (hasFocusData()) {
        result = result && getFocusData()
            .equals(other.getFocusData());
      }
      result = result && getHistoryImagesList()
          .equals(other.getHistoryImagesList());
      result = result && getVideoUrl()
          .equals(other.getVideoUrl());
      result = result && getOutUrl()
          .equals(other.getOutUrl());
      result = result && getLinesList()
          .equals(other.getLinesList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TID_FIELD_NUMBER;
      hash = (53 * hash) + getTid();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType();
      hash = (37 * hash) + VIDEOTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getVideoType();
      if (hasDemoParam()) {
        hash = (37 * hash) + DEMOPARAM_FIELD_NUMBER;
        hash = (53 * hash) + getDemoParam().hashCode();
      }
      hash = (37 * hash) + INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getInterval();
      if (getTargetNumbersCount() > 0) {
        hash = (37 * hash) + TARGETNUMBERS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetNumbersList().hashCode();
      }
      if (hasPipeData()) {
        hash = (37 * hash) + PIPEDATA_FIELD_NUMBER;
        hash = (53 * hash) + getPipeData().hashCode();
      }
      if (getCordonDatasCount() > 0) {
        hash = (37 * hash) + CORDONDATAS_FIELD_NUMBER;
        hash = (53 * hash) + getCordonDatasList().hashCode();
      }
      if (hasFocusData()) {
        hash = (37 * hash) + FOCUSDATA_FIELD_NUMBER;
        hash = (53 * hash) + getFocusData().hashCode();
      }
      if (getHistoryImagesCount() > 0) {
        hash = (37 * hash) + HISTORYIMAGES_FIELD_NUMBER;
        hash = (53 * hash) + getHistoryImagesList().hashCode();
      }
      hash = (37 * hash) + VIDEOURL_FIELD_NUMBER;
      hash = (53 * hash) + getVideoUrl().hashCode();
      hash = (37 * hash) + OUTURL_FIELD_NUMBER;
      hash = (53 * hash) + getOutUrl().hashCode();
      if (getLinesCount() > 0) {
        hash = (37 * hash) + LINES_FIELD_NUMBER;
        hash = (53 * hash) + getLinesList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.TaskData parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TaskData parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TaskData parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TaskData parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TaskData parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TaskData parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TaskData parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.TaskData parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.TaskData parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.TaskData parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.TaskData parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.TaskData parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.TaskData prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *任务数据
     * </pre>
     *
     * Protobuf type {@code TaskData}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TaskData)
        ServiceData.TaskDataOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_TaskData_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_TaskData_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.TaskData.class, ServiceData.TaskData.Builder.class);
      }

      // Construct using ServiceData.TaskData.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getCordonDatasFieldBuilder();
          getHistoryImagesFieldBuilder();
          getLinesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        tid_ = 0;

        type_ = 0;

        videoType_ = 0;

        if (demoParamBuilder_ == null) {
          demoParam_ = null;
        } else {
          demoParam_ = null;
          demoParamBuilder_ = null;
        }
        interval_ = 0;

        targetNumbers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        if (pipeDataBuilder_ == null) {
          pipeData_ = null;
        } else {
          pipeData_ = null;
          pipeDataBuilder_ = null;
        }
        if (cordonDatasBuilder_ == null) {
          cordonDatas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
        } else {
          cordonDatasBuilder_.clear();
        }
        if (focusDataBuilder_ == null) {
          focusData_ = null;
        } else {
          focusData_ = null;
          focusDataBuilder_ = null;
        }
        if (historyImagesBuilder_ == null) {
          historyImages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000200);
        } else {
          historyImagesBuilder_.clear();
        }
        videoUrl_ = "";

        outUrl_ = "";

        if (linesBuilder_ == null) {
          lines_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00001000);
        } else {
          linesBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_TaskData_descriptor;
      }

      @java.lang.Override
      public ServiceData.TaskData getDefaultInstanceForType() {
        return ServiceData.TaskData.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.TaskData build() {
        ServiceData.TaskData result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.TaskData buildPartial() {
        ServiceData.TaskData result = new ServiceData.TaskData(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        result.tid_ = tid_;
        result.type_ = type_;
        result.videoType_ = videoType_;
        if (demoParamBuilder_ == null) {
          result.demoParam_ = demoParam_;
        } else {
          result.demoParam_ = demoParamBuilder_.build();
        }
        result.interval_ = interval_;
        if (((bitField0_ & 0x00000020) == 0x00000020)) {
          targetNumbers_ = java.util.Collections.unmodifiableList(targetNumbers_);
          bitField0_ = (bitField0_ & ~0x00000020);
        }
        result.targetNumbers_ = targetNumbers_;
        if (pipeDataBuilder_ == null) {
          result.pipeData_ = pipeData_;
        } else {
          result.pipeData_ = pipeDataBuilder_.build();
        }
        if (cordonDatasBuilder_ == null) {
          if (((bitField0_ & 0x00000080) == 0x00000080)) {
            cordonDatas_ = java.util.Collections.unmodifiableList(cordonDatas_);
            bitField0_ = (bitField0_ & ~0x00000080);
          }
          result.cordonDatas_ = cordonDatas_;
        } else {
          result.cordonDatas_ = cordonDatasBuilder_.build();
        }
        if (focusDataBuilder_ == null) {
          result.focusData_ = focusData_;
        } else {
          result.focusData_ = focusDataBuilder_.build();
        }
        if (historyImagesBuilder_ == null) {
          if (((bitField0_ & 0x00000200) == 0x00000200)) {
            historyImages_ = java.util.Collections.unmodifiableList(historyImages_);
            bitField0_ = (bitField0_ & ~0x00000200);
          }
          result.historyImages_ = historyImages_;
        } else {
          result.historyImages_ = historyImagesBuilder_.build();
        }
        result.videoUrl_ = videoUrl_;
        result.outUrl_ = outUrl_;
        if (linesBuilder_ == null) {
          if (((bitField0_ & 0x00001000) == 0x00001000)) {
            lines_ = java.util.Collections.unmodifiableList(lines_);
            bitField0_ = (bitField0_ & ~0x00001000);
          }
          result.lines_ = lines_;
        } else {
          result.lines_ = linesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.TaskData) {
          return mergeFrom((ServiceData.TaskData)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.TaskData other) {
        if (other == ServiceData.TaskData.getDefaultInstance()) return this;
        if (other.getTid() != 0) {
          setTid(other.getTid());
        }
        if (other.getType() != 0) {
          setType(other.getType());
        }
        if (other.getVideoType() != 0) {
          setVideoType(other.getVideoType());
        }
        if (other.hasDemoParam()) {
          mergeDemoParam(other.getDemoParam());
        }
        if (other.getInterval() != 0) {
          setInterval(other.getInterval());
        }
        if (!other.targetNumbers_.isEmpty()) {
          if (targetNumbers_.isEmpty()) {
            targetNumbers_ = other.targetNumbers_;
            bitField0_ = (bitField0_ & ~0x00000020);
          } else {
            ensureTargetNumbersIsMutable();
            targetNumbers_.addAll(other.targetNumbers_);
          }
          onChanged();
        }
        if (other.hasPipeData()) {
          mergePipeData(other.getPipeData());
        }
        if (cordonDatasBuilder_ == null) {
          if (!other.cordonDatas_.isEmpty()) {
            if (cordonDatas_.isEmpty()) {
              cordonDatas_ = other.cordonDatas_;
              bitField0_ = (bitField0_ & ~0x00000080);
            } else {
              ensureCordonDatasIsMutable();
              cordonDatas_.addAll(other.cordonDatas_);
            }
            onChanged();
          }
        } else {
          if (!other.cordonDatas_.isEmpty()) {
            if (cordonDatasBuilder_.isEmpty()) {
              cordonDatasBuilder_.dispose();
              cordonDatasBuilder_ = null;
              cordonDatas_ = other.cordonDatas_;
              bitField0_ = (bitField0_ & ~0x00000080);
              cordonDatasBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getCordonDatasFieldBuilder() : null;
            } else {
              cordonDatasBuilder_.addAllMessages(other.cordonDatas_);
            }
          }
        }
        if (other.hasFocusData()) {
          mergeFocusData(other.getFocusData());
        }
        if (historyImagesBuilder_ == null) {
          if (!other.historyImages_.isEmpty()) {
            if (historyImages_.isEmpty()) {
              historyImages_ = other.historyImages_;
              bitField0_ = (bitField0_ & ~0x00000200);
            } else {
              ensureHistoryImagesIsMutable();
              historyImages_.addAll(other.historyImages_);
            }
            onChanged();
          }
        } else {
          if (!other.historyImages_.isEmpty()) {
            if (historyImagesBuilder_.isEmpty()) {
              historyImagesBuilder_.dispose();
              historyImagesBuilder_ = null;
              historyImages_ = other.historyImages_;
              bitField0_ = (bitField0_ & ~0x00000200);
              historyImagesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getHistoryImagesFieldBuilder() : null;
            } else {
              historyImagesBuilder_.addAllMessages(other.historyImages_);
            }
          }
        }
        if (!other.getVideoUrl().isEmpty()) {
          videoUrl_ = other.videoUrl_;
          onChanged();
        }
        if (!other.getOutUrl().isEmpty()) {
          outUrl_ = other.outUrl_;
          onChanged();
        }
        if (linesBuilder_ == null) {
          if (!other.lines_.isEmpty()) {
            if (lines_.isEmpty()) {
              lines_ = other.lines_;
              bitField0_ = (bitField0_ & ~0x00001000);
            } else {
              ensureLinesIsMutable();
              lines_.addAll(other.lines_);
            }
            onChanged();
          }
        } else {
          if (!other.lines_.isEmpty()) {
            if (linesBuilder_.isEmpty()) {
              linesBuilder_.dispose();
              linesBuilder_ = null;
              lines_ = other.lines_;
              bitField0_ = (bitField0_ & ~0x00001000);
              linesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getLinesFieldBuilder() : null;
            } else {
              linesBuilder_.addAllMessages(other.lines_);
            }
          }
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.TaskData parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.TaskData) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int tid_ ;
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int32 tid = 1;</code>
       */
      public int getTid() {
        return tid_;
      }
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int32 tid = 1;</code>
       */
      public Builder setTid(int value) {
        
        tid_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *任务id
       * </pre>
       *
       * <code>int32 tid = 1;</code>
       */
      public Builder clearTid() {
        
        tid_ = 0;
        onChanged();
        return this;
      }

      private int type_ ;
      /**
       * <pre>
       *任务类型，1:信息叠加 2:变化检测 3:目标检测  4:视频解码  5:大图拼接
       *不影响原有算法注册流程，注册时携带算法类型，代理服务根据算法类型分配任务
       *备用字段，用于后续可能的修改或升级
       * </pre>
       *
       * <code>int32 type = 2;</code>
       */
      public int getType() {
        return type_;
      }
      /**
       * <pre>
       *任务类型，1:信息叠加 2:变化检测 3:目标检测  4:视频解码  5:大图拼接
       *不影响原有算法注册流程，注册时携带算法类型，代理服务根据算法类型分配任务
       *备用字段，用于后续可能的修改或升级
       * </pre>
       *
       * <code>int32 type = 2;</code>
       */
      public Builder setType(int value) {
        
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *任务类型，1:信息叠加 2:变化检测 3:目标检测  4:视频解码  5:大图拼接
       *不影响原有算法注册流程，注册时携带算法类型，代理服务根据算法类型分配任务
       *备用字段，用于后续可能的修改或升级
       * </pre>
       *
       * <code>int32 type = 2;</code>
       */
      public Builder clearType() {
        
        type_ = 0;
        onChanged();
        return this;
      }

      private int videoType_ ;
      /**
       * <pre>
       *视频类型，值为1或者2
       * 1表示实时流处理，videoUrl为rtsp拉流地址(例如: rtsp://www.wogrid.com/a-3-1)，outUrl为rtsp推流地址(例如: rtsp://www.wogrid.com/a-3-2)
       * 2表示历史视频文件处理，videoUrl为视频文件url(例如：http://vod.wogrid.com/a/b.mp4)，outUrl为视频本地存储地址(例如：/data/video/ai/3-2.mp4)
       * </pre>
       *
       * <code>int32 videoType = 3;</code>
       */
      public int getVideoType() {
        return videoType_;
      }
      /**
       * <pre>
       *视频类型，值为1或者2
       * 1表示实时流处理，videoUrl为rtsp拉流地址(例如: rtsp://www.wogrid.com/a-3-1)，outUrl为rtsp推流地址(例如: rtsp://www.wogrid.com/a-3-2)
       * 2表示历史视频文件处理，videoUrl为视频文件url(例如：http://vod.wogrid.com/a/b.mp4)，outUrl为视频本地存储地址(例如：/data/video/ai/3-2.mp4)
       * </pre>
       *
       * <code>int32 videoType = 3;</code>
       */
      public Builder setVideoType(int value) {
        
        videoType_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *视频类型，值为1或者2
       * 1表示实时流处理，videoUrl为rtsp拉流地址(例如: rtsp://www.wogrid.com/a-3-1)，outUrl为rtsp推流地址(例如: rtsp://www.wogrid.com/a-3-2)
       * 2表示历史视频文件处理，videoUrl为视频文件url(例如：http://vod.wogrid.com/a/b.mp4)，outUrl为视频本地存储地址(例如：/data/video/ai/3-2.mp4)
       * </pre>
       *
       * <code>int32 videoType = 3;</code>
       */
      public Builder clearVideoType() {
        
        videoType_ = 0;
        onChanged();
        return this;
      }

      private ServiceData.DemoParam demoParam_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.DemoParam, ServiceData.DemoParam.Builder, ServiceData.DemoParamOrBuilder> demoParamBuilder_;
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      public boolean hasDemoParam() {
        return demoParamBuilder_ != null || demoParam_ != null;
      }
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      public ServiceData.DemoParam getDemoParam() {
        if (demoParamBuilder_ == null) {
          return demoParam_ == null ? ServiceData.DemoParam.getDefaultInstance() : demoParam_;
        } else {
          return demoParamBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      public Builder setDemoParam(ServiceData.DemoParam value) {
        if (demoParamBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          demoParam_ = value;
          onChanged();
        } else {
          demoParamBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      public Builder setDemoParam(
          ServiceData.DemoParam.Builder builderForValue) {
        if (demoParamBuilder_ == null) {
          demoParam_ = builderForValue.build();
          onChanged();
        } else {
          demoParamBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      public Builder mergeDemoParam(ServiceData.DemoParam value) {
        if (demoParamBuilder_ == null) {
          if (demoParam_ != null) {
            demoParam_ =
              ServiceData.DemoParam.newBuilder(demoParam_).mergeFrom(value).buildPartial();
          } else {
            demoParam_ = value;
          }
          onChanged();
        } else {
          demoParamBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      public Builder clearDemoParam() {
        if (demoParamBuilder_ == null) {
          demoParam_ = null;
          onChanged();
        } else {
          demoParam_ = null;
          demoParamBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      public ServiceData.DemoParam.Builder getDemoParamBuilder() {
        
        onChanged();
        return getDemoParamFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      public ServiceData.DemoParamOrBuilder getDemoParamOrBuilder() {
        if (demoParamBuilder_ != null) {
          return demoParamBuilder_.getMessageOrBuilder();
        } else {
          return demoParam_ == null ?
              ServiceData.DemoParam.getDefaultInstance() : demoParam_;
        }
      }
      /**
       * <pre>
       *吊舱参数，用于视频解算
       * </pre>
       *
       * <code>.DemoParam demoParam = 4;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.DemoParam, ServiceData.DemoParam.Builder, ServiceData.DemoParamOrBuilder> 
          getDemoParamFieldBuilder() {
        if (demoParamBuilder_ == null) {
          demoParamBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.DemoParam, ServiceData.DemoParam.Builder, ServiceData.DemoParamOrBuilder>(
                  getDemoParam(),
                  getParentForChildren(),
                  isClean());
          demoParam_ = null;
        }
        return demoParamBuilder_;
      }

      private int interval_ ;
      /**
       * <pre>
       *图片帧处理间隔（抽帧检测），单位为秒，比如2表示每2秒处理一帧图片，0表示每一帧都处理
       *目前可以不用考虑该字段，默认值位0，表示每一帧都检测
       * </pre>
       *
       * <code>int32 interval = 5;</code>
       */
      public int getInterval() {
        return interval_;
      }
      /**
       * <pre>
       *图片帧处理间隔（抽帧检测），单位为秒，比如2表示每2秒处理一帧图片，0表示每一帧都处理
       *目前可以不用考虑该字段，默认值位0，表示每一帧都检测
       * </pre>
       *
       * <code>int32 interval = 5;</code>
       */
      public Builder setInterval(int value) {
        
        interval_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片帧处理间隔（抽帧检测），单位为秒，比如2表示每2秒处理一帧图片，0表示每一帧都处理
       *目前可以不用考虑该字段，默认值位0，表示每一帧都检测
       * </pre>
       *
       * <code>int32 interval = 5;</code>
       */
      public Builder clearInterval() {
        
        interval_ = 0;
        onChanged();
        return this;
      }

      private java.util.List<java.lang.Integer> targetNumbers_ = java.util.Collections.emptyList();
      private void ensureTargetNumbersIsMutable() {
        if (!((bitField0_ & 0x00000020) == 0x00000020)) {
          targetNumbers_ = new java.util.ArrayList<java.lang.Integer>(targetNumbers_);
          bitField0_ |= 0x00000020;
         }
      }
      /**
       * <pre>
       *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
       * </pre>
       *
       * <code>repeated int32 targetNumbers = 6;</code>
       */
      public java.util.List<java.lang.Integer>
          getTargetNumbersList() {
        return java.util.Collections.unmodifiableList(targetNumbers_);
      }
      /**
       * <pre>
       *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
       * </pre>
       *
       * <code>repeated int32 targetNumbers = 6;</code>
       */
      public int getTargetNumbersCount() {
        return targetNumbers_.size();
      }
      /**
       * <pre>
       *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
       * </pre>
       *
       * <code>repeated int32 targetNumbers = 6;</code>
       */
      public int getTargetNumbers(int index) {
        return targetNumbers_.get(index);
      }
      /**
       * <pre>
       *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
       * </pre>
       *
       * <code>repeated int32 targetNumbers = 6;</code>
       */
      public Builder setTargetNumbers(
          int index, int value) {
        ensureTargetNumbersIsMutable();
        targetNumbers_.set(index, value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
       * </pre>
       *
       * <code>repeated int32 targetNumbers = 6;</code>
       */
      public Builder addTargetNumbers(int value) {
        ensureTargetNumbersIsMutable();
        targetNumbers_.add(value);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
       * </pre>
       *
       * <code>repeated int32 targetNumbers = 6;</code>
       */
      public Builder addAllTargetNumbers(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureTargetNumbersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, targetNumbers_);
        onChanged();
        return this;
      }
      /**
       * <pre>
       *目标编号列表，比如要检测人物、车辆等，用于目标检测算法
       * </pre>
       *
       * <code>repeated int32 targetNumbers = 6;</code>
       */
      public Builder clearTargetNumbers() {
        targetNumbers_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000020);
        onChanged();
        return this;
      }

      private ServiceData.PipeData pipeData_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PipeData, ServiceData.PipeData.Builder, ServiceData.PipeDataOrBuilder> pipeDataBuilder_;
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      public boolean hasPipeData() {
        return pipeDataBuilder_ != null || pipeData_ != null;
      }
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      public ServiceData.PipeData getPipeData() {
        if (pipeDataBuilder_ == null) {
          return pipeData_ == null ? ServiceData.PipeData.getDefaultInstance() : pipeData_;
        } else {
          return pipeDataBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      public Builder setPipeData(ServiceData.PipeData value) {
        if (pipeDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          pipeData_ = value;
          onChanged();
        } else {
          pipeDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      public Builder setPipeData(
          ServiceData.PipeData.Builder builderForValue) {
        if (pipeDataBuilder_ == null) {
          pipeData_ = builderForValue.build();
          onChanged();
        } else {
          pipeDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      public Builder mergePipeData(ServiceData.PipeData value) {
        if (pipeDataBuilder_ == null) {
          if (pipeData_ != null) {
            pipeData_ =
              ServiceData.PipeData.newBuilder(pipeData_).mergeFrom(value).buildPartial();
          } else {
            pipeData_ = value;
          }
          onChanged();
        } else {
          pipeDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      public Builder clearPipeData() {
        if (pipeDataBuilder_ == null) {
          pipeData_ = null;
          onChanged();
        } else {
          pipeData_ = null;
          pipeDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      public ServiceData.PipeData.Builder getPipeDataBuilder() {
        
        onChanged();
        return getPipeDataFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      public ServiceData.PipeDataOrBuilder getPipeDataOrBuilder() {
        if (pipeDataBuilder_ != null) {
          return pipeDataBuilder_.getMessageOrBuilder();
        } else {
          return pipeData_ == null ?
              ServiceData.PipeData.getDefaultInstance() : pipeData_;
        }
      }
      /**
       * <pre>
       *管线数据，用于信息叠加算法
       * </pre>
       *
       * <code>.PipeData pipeData = 7;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.PipeData, ServiceData.PipeData.Builder, ServiceData.PipeDataOrBuilder> 
          getPipeDataFieldBuilder() {
        if (pipeDataBuilder_ == null) {
          pipeDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.PipeData, ServiceData.PipeData.Builder, ServiceData.PipeDataOrBuilder>(
                  getPipeData(),
                  getParentForChildren(),
                  isClean());
          pipeData_ = null;
        }
        return pipeDataBuilder_;
      }

      private java.util.List<ServiceData.CordonData> cordonDatas_ =
        java.util.Collections.emptyList();
      private void ensureCordonDatasIsMutable() {
        if (!((bitField0_ & 0x00000080) == 0x00000080)) {
          cordonDatas_ = new java.util.ArrayList<ServiceData.CordonData>(cordonDatas_);
          bitField0_ |= 0x00000080;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.CordonData, ServiceData.CordonData.Builder, ServiceData.CordonDataOrBuilder> cordonDatasBuilder_;

      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public java.util.List<ServiceData.CordonData> getCordonDatasList() {
        if (cordonDatasBuilder_ == null) {
          return java.util.Collections.unmodifiableList(cordonDatas_);
        } else {
          return cordonDatasBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public int getCordonDatasCount() {
        if (cordonDatasBuilder_ == null) {
          return cordonDatas_.size();
        } else {
          return cordonDatasBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public ServiceData.CordonData getCordonDatas(int index) {
        if (cordonDatasBuilder_ == null) {
          return cordonDatas_.get(index);
        } else {
          return cordonDatasBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder setCordonDatas(
          int index, ServiceData.CordonData value) {
        if (cordonDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCordonDatasIsMutable();
          cordonDatas_.set(index, value);
          onChanged();
        } else {
          cordonDatasBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder setCordonDatas(
          int index, ServiceData.CordonData.Builder builderForValue) {
        if (cordonDatasBuilder_ == null) {
          ensureCordonDatasIsMutable();
          cordonDatas_.set(index, builderForValue.build());
          onChanged();
        } else {
          cordonDatasBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder addCordonDatas(ServiceData.CordonData value) {
        if (cordonDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCordonDatasIsMutable();
          cordonDatas_.add(value);
          onChanged();
        } else {
          cordonDatasBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder addCordonDatas(
          int index, ServiceData.CordonData value) {
        if (cordonDatasBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCordonDatasIsMutable();
          cordonDatas_.add(index, value);
          onChanged();
        } else {
          cordonDatasBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder addCordonDatas(
          ServiceData.CordonData.Builder builderForValue) {
        if (cordonDatasBuilder_ == null) {
          ensureCordonDatasIsMutable();
          cordonDatas_.add(builderForValue.build());
          onChanged();
        } else {
          cordonDatasBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder addCordonDatas(
          int index, ServiceData.CordonData.Builder builderForValue) {
        if (cordonDatasBuilder_ == null) {
          ensureCordonDatasIsMutable();
          cordonDatas_.add(index, builderForValue.build());
          onChanged();
        } else {
          cordonDatasBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder addAllCordonDatas(
          java.lang.Iterable<? extends ServiceData.CordonData> values) {
        if (cordonDatasBuilder_ == null) {
          ensureCordonDatasIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, cordonDatas_);
          onChanged();
        } else {
          cordonDatasBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder clearCordonDatas() {
        if (cordonDatasBuilder_ == null) {
          cordonDatas_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000080);
          onChanged();
        } else {
          cordonDatasBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public Builder removeCordonDatas(int index) {
        if (cordonDatasBuilder_ == null) {
          ensureCordonDatasIsMutable();
          cordonDatas_.remove(index);
          onChanged();
        } else {
          cordonDatasBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public ServiceData.CordonData.Builder getCordonDatasBuilder(
          int index) {
        return getCordonDatasFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public ServiceData.CordonDataOrBuilder getCordonDatasOrBuilder(
          int index) {
        if (cordonDatasBuilder_ == null) {
          return cordonDatas_.get(index);  } else {
          return cordonDatasBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public java.util.List<? extends ServiceData.CordonDataOrBuilder> 
           getCordonDatasOrBuilderList() {
        if (cordonDatasBuilder_ != null) {
          return cordonDatasBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(cordonDatas_);
        }
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public ServiceData.CordonData.Builder addCordonDatasBuilder() {
        return getCordonDatasFieldBuilder().addBuilder(
            ServiceData.CordonData.getDefaultInstance());
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public ServiceData.CordonData.Builder addCordonDatasBuilder(
          int index) {
        return getCordonDatasFieldBuilder().addBuilder(
            index, ServiceData.CordonData.getDefaultInstance());
      }
      /**
       * <pre>
       *警戒线列表，用于信息叠加算法和变化检测算法，变化检测算法目前只检测警戒区域内的变化
       * </pre>
       *
       * <code>repeated .CordonData cordonDatas = 8;</code>
       */
      public java.util.List<ServiceData.CordonData.Builder> 
           getCordonDatasBuilderList() {
        return getCordonDatasFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.CordonData, ServiceData.CordonData.Builder, ServiceData.CordonDataOrBuilder> 
          getCordonDatasFieldBuilder() {
        if (cordonDatasBuilder_ == null) {
          cordonDatasBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.CordonData, ServiceData.CordonData.Builder, ServiceData.CordonDataOrBuilder>(
                  cordonDatas_,
                  ((bitField0_ & 0x00000080) == 0x00000080),
                  getParentForChildren(),
                  isClean());
          cordonDatas_ = null;
        }
        return cordonDatasBuilder_;
      }

      private ServiceData.FocusData focusData_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.FocusData, ServiceData.FocusData.Builder, ServiceData.FocusDataOrBuilder> focusDataBuilder_;
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      public boolean hasFocusData() {
        return focusDataBuilder_ != null || focusData_ != null;
      }
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      public ServiceData.FocusData getFocusData() {
        if (focusDataBuilder_ == null) {
          return focusData_ == null ? ServiceData.FocusData.getDefaultInstance() : focusData_;
        } else {
          return focusDataBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      public Builder setFocusData(ServiceData.FocusData value) {
        if (focusDataBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          focusData_ = value;
          onChanged();
        } else {
          focusDataBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      public Builder setFocusData(
          ServiceData.FocusData.Builder builderForValue) {
        if (focusDataBuilder_ == null) {
          focusData_ = builderForValue.build();
          onChanged();
        } else {
          focusDataBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      public Builder mergeFocusData(ServiceData.FocusData value) {
        if (focusDataBuilder_ == null) {
          if (focusData_ != null) {
            focusData_ =
              ServiceData.FocusData.newBuilder(focusData_).mergeFrom(value).buildPartial();
          } else {
            focusData_ = value;
          }
          onChanged();
        } else {
          focusDataBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      public Builder clearFocusData() {
        if (focusDataBuilder_ == null) {
          focusData_ = null;
          onChanged();
        } else {
          focusData_ = null;
          focusDataBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      public ServiceData.FocusData.Builder getFocusDataBuilder() {
        
        onChanged();
        return getFocusDataFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      public ServiceData.FocusDataOrBuilder getFocusDataOrBuilder() {
        if (focusDataBuilder_ != null) {
          return focusDataBuilder_.getMessageOrBuilder();
        } else {
          return focusData_ == null ?
              ServiceData.FocusData.getDefaultInstance() : focusData_;
        }
      }
      /**
       * <pre>
       *关注区域（目标）数据，用于信息叠加算法
       * </pre>
       *
       * <code>.FocusData focusData = 9;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.FocusData, ServiceData.FocusData.Builder, ServiceData.FocusDataOrBuilder> 
          getFocusDataFieldBuilder() {
        if (focusDataBuilder_ == null) {
          focusDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.FocusData, ServiceData.FocusData.Builder, ServiceData.FocusDataOrBuilder>(
                  getFocusData(),
                  getParentForChildren(),
                  isClean());
          focusData_ = null;
        }
        return focusDataBuilder_;
      }

      private java.util.List<ServiceData.HistoryImage> historyImages_ =
        java.util.Collections.emptyList();
      private void ensureHistoryImagesIsMutable() {
        if (!((bitField0_ & 0x00000200) == 0x00000200)) {
          historyImages_ = new java.util.ArrayList<ServiceData.HistoryImage>(historyImages_);
          bitField0_ |= 0x00000200;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.HistoryImage, ServiceData.HistoryImage.Builder, ServiceData.HistoryImageOrBuilder> historyImagesBuilder_;

      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public java.util.List<ServiceData.HistoryImage> getHistoryImagesList() {
        if (historyImagesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(historyImages_);
        } else {
          return historyImagesBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public int getHistoryImagesCount() {
        if (historyImagesBuilder_ == null) {
          return historyImages_.size();
        } else {
          return historyImagesBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public ServiceData.HistoryImage getHistoryImages(int index) {
        if (historyImagesBuilder_ == null) {
          return historyImages_.get(index);
        } else {
          return historyImagesBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder setHistoryImages(
          int index, ServiceData.HistoryImage value) {
        if (historyImagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHistoryImagesIsMutable();
          historyImages_.set(index, value);
          onChanged();
        } else {
          historyImagesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder setHistoryImages(
          int index, ServiceData.HistoryImage.Builder builderForValue) {
        if (historyImagesBuilder_ == null) {
          ensureHistoryImagesIsMutable();
          historyImages_.set(index, builderForValue.build());
          onChanged();
        } else {
          historyImagesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder addHistoryImages(ServiceData.HistoryImage value) {
        if (historyImagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHistoryImagesIsMutable();
          historyImages_.add(value);
          onChanged();
        } else {
          historyImagesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder addHistoryImages(
          int index, ServiceData.HistoryImage value) {
        if (historyImagesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureHistoryImagesIsMutable();
          historyImages_.add(index, value);
          onChanged();
        } else {
          historyImagesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder addHistoryImages(
          ServiceData.HistoryImage.Builder builderForValue) {
        if (historyImagesBuilder_ == null) {
          ensureHistoryImagesIsMutable();
          historyImages_.add(builderForValue.build());
          onChanged();
        } else {
          historyImagesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder addHistoryImages(
          int index, ServiceData.HistoryImage.Builder builderForValue) {
        if (historyImagesBuilder_ == null) {
          ensureHistoryImagesIsMutable();
          historyImages_.add(index, builderForValue.build());
          onChanged();
        } else {
          historyImagesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder addAllHistoryImages(
          java.lang.Iterable<? extends ServiceData.HistoryImage> values) {
        if (historyImagesBuilder_ == null) {
          ensureHistoryImagesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, historyImages_);
          onChanged();
        } else {
          historyImagesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder clearHistoryImages() {
        if (historyImagesBuilder_ == null) {
          historyImages_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000200);
          onChanged();
        } else {
          historyImagesBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public Builder removeHistoryImages(int index) {
        if (historyImagesBuilder_ == null) {
          ensureHistoryImagesIsMutable();
          historyImages_.remove(index);
          onChanged();
        } else {
          historyImagesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public ServiceData.HistoryImage.Builder getHistoryImagesBuilder(
          int index) {
        return getHistoryImagesFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public ServiceData.HistoryImageOrBuilder getHistoryImagesOrBuilder(
          int index) {
        if (historyImagesBuilder_ == null) {
          return historyImages_.get(index);  } else {
          return historyImagesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public java.util.List<? extends ServiceData.HistoryImageOrBuilder> 
           getHistoryImagesOrBuilderList() {
        if (historyImagesBuilder_ != null) {
          return historyImagesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(historyImages_);
        }
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public ServiceData.HistoryImage.Builder addHistoryImagesBuilder() {
        return getHistoryImagesFieldBuilder().addBuilder(
            ServiceData.HistoryImage.getDefaultInstance());
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public ServiceData.HistoryImage.Builder addHistoryImagesBuilder(
          int index) {
        return getHistoryImagesFieldBuilder().addBuilder(
            index, ServiceData.HistoryImage.getDefaultInstance());
      }
      /**
       * <pre>
       *历史图片列表，用于变化检测算法作为对比模板
       * </pre>
       *
       * <code>repeated .HistoryImage historyImages = 10;</code>
       */
      public java.util.List<ServiceData.HistoryImage.Builder> 
           getHistoryImagesBuilderList() {
        return getHistoryImagesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.HistoryImage, ServiceData.HistoryImage.Builder, ServiceData.HistoryImageOrBuilder> 
          getHistoryImagesFieldBuilder() {
        if (historyImagesBuilder_ == null) {
          historyImagesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.HistoryImage, ServiceData.HistoryImage.Builder, ServiceData.HistoryImageOrBuilder>(
                  historyImages_,
                  ((bitField0_ & 0x00000200) == 0x00000200),
                  getParentForChildren(),
                  isClean());
          historyImages_ = null;
        }
        return historyImagesBuilder_;
      }

      private java.lang.Object videoUrl_ = "";
      /**
       * <pre>
       *拉流地址或者历史视频url
       * </pre>
       *
       * <code>string videoUrl = 11;</code>
       */
      public java.lang.String getVideoUrl() {
        java.lang.Object ref = videoUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          videoUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *拉流地址或者历史视频url
       * </pre>
       *
       * <code>string videoUrl = 11;</code>
       */
      public com.google.protobuf.ByteString
          getVideoUrlBytes() {
        java.lang.Object ref = videoUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          videoUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *拉流地址或者历史视频url
       * </pre>
       *
       * <code>string videoUrl = 11;</code>
       */
      public Builder setVideoUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        videoUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *拉流地址或者历史视频url
       * </pre>
       *
       * <code>string videoUrl = 11;</code>
       */
      public Builder clearVideoUrl() {
        
        videoUrl_ = getDefaultInstance().getVideoUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *拉流地址或者历史视频url
       * </pre>
       *
       * <code>string videoUrl = 11;</code>
       */
      public Builder setVideoUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        videoUrl_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object outUrl_ = "";
      /**
       * <pre>
       *推流地址或者视频文件本地存储路径
       * </pre>
       *
       * <code>string outUrl = 12;</code>
       */
      public java.lang.String getOutUrl() {
        java.lang.Object ref = outUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          outUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *推流地址或者视频文件本地存储路径
       * </pre>
       *
       * <code>string outUrl = 12;</code>
       */
      public com.google.protobuf.ByteString
          getOutUrlBytes() {
        java.lang.Object ref = outUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          outUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *推流地址或者视频文件本地存储路径
       * </pre>
       *
       * <code>string outUrl = 12;</code>
       */
      public Builder setOutUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        outUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *推流地址或者视频文件本地存储路径
       * </pre>
       *
       * <code>string outUrl = 12;</code>
       */
      public Builder clearOutUrl() {
        
        outUrl_ = getDefaultInstance().getOutUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *推流地址或者视频文件本地存储路径
       * </pre>
       *
       * <code>string outUrl = 12;</code>
       */
      public Builder setOutUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        outUrl_ = value;
        onChanged();
        return this;
      }

      private java.util.List<ServiceData.LinePb> lines_ =
        java.util.Collections.emptyList();
      private void ensureLinesIsMutable() {
        if (!((bitField0_ & 0x00001000) == 0x00001000)) {
          lines_ = new java.util.ArrayList<ServiceData.LinePb>(lines_);
          bitField0_ |= 0x00001000;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.LinePb, ServiceData.LinePb.Builder, ServiceData.LinePbOrBuilder> linesBuilder_;

      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public java.util.List<ServiceData.LinePb> getLinesList() {
        if (linesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(lines_);
        } else {
          return linesBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public int getLinesCount() {
        if (linesBuilder_ == null) {
          return lines_.size();
        } else {
          return linesBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public ServiceData.LinePb getLines(int index) {
        if (linesBuilder_ == null) {
          return lines_.get(index);
        } else {
          return linesBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder setLines(
          int index, ServiceData.LinePb value) {
        if (linesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLinesIsMutable();
          lines_.set(index, value);
          onChanged();
        } else {
          linesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder setLines(
          int index, ServiceData.LinePb.Builder builderForValue) {
        if (linesBuilder_ == null) {
          ensureLinesIsMutable();
          lines_.set(index, builderForValue.build());
          onChanged();
        } else {
          linesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder addLines(ServiceData.LinePb value) {
        if (linesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLinesIsMutable();
          lines_.add(value);
          onChanged();
        } else {
          linesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder addLines(
          int index, ServiceData.LinePb value) {
        if (linesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureLinesIsMutable();
          lines_.add(index, value);
          onChanged();
        } else {
          linesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder addLines(
          ServiceData.LinePb.Builder builderForValue) {
        if (linesBuilder_ == null) {
          ensureLinesIsMutable();
          lines_.add(builderForValue.build());
          onChanged();
        } else {
          linesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder addLines(
          int index, ServiceData.LinePb.Builder builderForValue) {
        if (linesBuilder_ == null) {
          ensureLinesIsMutable();
          lines_.add(index, builderForValue.build());
          onChanged();
        } else {
          linesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder addAllLines(
          java.lang.Iterable<? extends ServiceData.LinePb> values) {
        if (linesBuilder_ == null) {
          ensureLinesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, lines_);
          onChanged();
        } else {
          linesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder clearLines() {
        if (linesBuilder_ == null) {
          lines_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00001000);
          onChanged();
        } else {
          linesBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public Builder removeLines(int index) {
        if (linesBuilder_ == null) {
          ensureLinesIsMutable();
          lines_.remove(index);
          onChanged();
        } else {
          linesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public ServiceData.LinePb.Builder getLinesBuilder(
          int index) {
        return getLinesFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public ServiceData.LinePbOrBuilder getLinesOrBuilder(
          int index) {
        if (linesBuilder_ == null) {
          return lines_.get(index);  } else {
          return linesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public java.util.List<? extends ServiceData.LinePbOrBuilder> 
           getLinesOrBuilderList() {
        if (linesBuilder_ != null) {
          return linesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(lines_);
        }
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public ServiceData.LinePb.Builder addLinesBuilder() {
        return getLinesFieldBuilder().addBuilder(
            ServiceData.LinePb.getDefaultInstance());
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public ServiceData.LinePb.Builder addLinesBuilder(
          int index) {
        return getLinesFieldBuilder().addBuilder(
            index, ServiceData.LinePb.getDefaultInstance());
      }
      /**
       * <pre>
       *大图拼接的线段列表，用于大图拼接算法
       * </pre>
       *
       * <code>repeated .LinePb lines = 13;</code>
       */
      public java.util.List<ServiceData.LinePb.Builder> 
           getLinesBuilderList() {
        return getLinesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.LinePb, ServiceData.LinePb.Builder, ServiceData.LinePbOrBuilder> 
          getLinesFieldBuilder() {
        if (linesBuilder_ == null) {
          linesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.LinePb, ServiceData.LinePb.Builder, ServiceData.LinePbOrBuilder>(
                  lines_,
                  ((bitField0_ & 0x00001000) == 0x00001000),
                  getParentForChildren(),
                  isClean());
          lines_ = null;
        }
        return linesBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TaskData)
    }

    // @@protoc_insertion_point(class_scope:TaskData)
    private static final ServiceData.TaskData DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.TaskData();
    }

    public static ServiceData.TaskData getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TaskData>
        PARSER = new com.google.protobuf.AbstractParser<TaskData>() {
      @java.lang.Override
      public TaskData parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TaskData(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TaskData> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TaskData> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.TaskData getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ChangeDetectResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ChangeDetectResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    java.util.List<ServiceData.ChangeInfo> 
        getChangesList();
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    ServiceData.ChangeInfo getChanges(int index);
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    int getChangesCount();
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    java.util.List<? extends ServiceData.ChangeInfoOrBuilder> 
        getChangesOrBuilderList();
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    ServiceData.ChangeInfoOrBuilder getChangesOrBuilder(
        int index);

    /**
     * <pre>
     *历史图片url
     * </pre>
     *
     * <code>string historyUrl = 2;</code>
     */
    java.lang.String getHistoryUrl();
    /**
     * <pre>
     *历史图片url
     * </pre>
     *
     * <code>string historyUrl = 2;</code>
     */
    com.google.protobuf.ByteString
        getHistoryUrlBytes();

    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData image = 3;</code>
     */
    boolean hasImage();
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData image = 3;</code>
     */
    ServiceData.ImageExtendData getImage();
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData image = 3;</code>
     */
    ServiceData.ImageExtendDataOrBuilder getImageOrBuilder();
  }
  /**
   * <pre>
   *变化检测结果输出
   * </pre>
   *
   * Protobuf type {@code ChangeDetectResult}
   */
  public  static final class ChangeDetectResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ChangeDetectResult)
      ChangeDetectResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ChangeDetectResult.newBuilder() to construct.
    private ChangeDetectResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ChangeDetectResult() {
      changes_ = java.util.Collections.emptyList();
      historyUrl_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ChangeDetectResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                changes_ = new java.util.ArrayList<ServiceData.ChangeInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              changes_.add(
                  input.readMessage(ServiceData.ChangeInfo.parser(), extensionRegistry));
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              historyUrl_ = s;
              break;
            }
            case 26: {
              ServiceData.ImageExtendData.Builder subBuilder = null;
              if (image_ != null) {
                subBuilder = image_.toBuilder();
              }
              image_ = input.readMessage(ServiceData.ImageExtendData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(image_);
                image_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          changes_ = java.util.Collections.unmodifiableList(changes_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_ChangeDetectResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_ChangeDetectResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.ChangeDetectResult.class, ServiceData.ChangeDetectResult.Builder.class);
    }

    private int bitField0_;
    public static final int CHANGES_FIELD_NUMBER = 1;
    private java.util.List<ServiceData.ChangeInfo> changes_;
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    public java.util.List<ServiceData.ChangeInfo> getChangesList() {
      return changes_;
    }
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    public java.util.List<? extends ServiceData.ChangeInfoOrBuilder> 
        getChangesOrBuilderList() {
      return changes_;
    }
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    public int getChangesCount() {
      return changes_.size();
    }
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    public ServiceData.ChangeInfo getChanges(int index) {
      return changes_.get(index);
    }
    /**
     * <pre>
     *当前图片帧中检测到的变化区域列表
     * </pre>
     *
     * <code>repeated .ChangeInfo changes = 1;</code>
     */
    public ServiceData.ChangeInfoOrBuilder getChangesOrBuilder(
        int index) {
      return changes_.get(index);
    }

    public static final int HISTORYURL_FIELD_NUMBER = 2;
    private volatile java.lang.Object historyUrl_;
    /**
     * <pre>
     *历史图片url
     * </pre>
     *
     * <code>string historyUrl = 2;</code>
     */
    public java.lang.String getHistoryUrl() {
      java.lang.Object ref = historyUrl_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        historyUrl_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *历史图片url
     * </pre>
     *
     * <code>string historyUrl = 2;</code>
     */
    public com.google.protobuf.ByteString
        getHistoryUrlBytes() {
      java.lang.Object ref = historyUrl_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        historyUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IMAGE_FIELD_NUMBER = 3;
    private ServiceData.ImageExtendData image_;
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData image = 3;</code>
     */
    public boolean hasImage() {
      return image_ != null;
    }
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData image = 3;</code>
     */
    public ServiceData.ImageExtendData getImage() {
      return image_ == null ? ServiceData.ImageExtendData.getDefaultInstance() : image_;
    }
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData image = 3;</code>
     */
    public ServiceData.ImageExtendDataOrBuilder getImageOrBuilder() {
      return getImage();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < changes_.size(); i++) {
        output.writeMessage(1, changes_.get(i));
      }
      if (!getHistoryUrlBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, historyUrl_);
      }
      if (image_ != null) {
        output.writeMessage(3, getImage());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < changes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, changes_.get(i));
      }
      if (!getHistoryUrlBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, historyUrl_);
      }
      if (image_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getImage());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.ChangeDetectResult)) {
        return super.equals(obj);
      }
      ServiceData.ChangeDetectResult other = (ServiceData.ChangeDetectResult) obj;

      boolean result = true;
      result = result && getChangesList()
          .equals(other.getChangesList());
      result = result && getHistoryUrl()
          .equals(other.getHistoryUrl());
      result = result && (hasImage() == other.hasImage());
      if (hasImage()) {
        result = result && getImage()
            .equals(other.getImage());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getChangesCount() > 0) {
        hash = (37 * hash) + CHANGES_FIELD_NUMBER;
        hash = (53 * hash) + getChangesList().hashCode();
      }
      hash = (37 * hash) + HISTORYURL_FIELD_NUMBER;
      hash = (53 * hash) + getHistoryUrl().hashCode();
      if (hasImage()) {
        hash = (37 * hash) + IMAGE_FIELD_NUMBER;
        hash = (53 * hash) + getImage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.ChangeDetectResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ChangeDetectResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ChangeDetectResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ChangeDetectResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ChangeDetectResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.ChangeDetectResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.ChangeDetectResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.ChangeDetectResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.ChangeDetectResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.ChangeDetectResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.ChangeDetectResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.ChangeDetectResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.ChangeDetectResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *变化检测结果输出
     * </pre>
     *
     * Protobuf type {@code ChangeDetectResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ChangeDetectResult)
        ServiceData.ChangeDetectResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_ChangeDetectResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_ChangeDetectResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.ChangeDetectResult.class, ServiceData.ChangeDetectResult.Builder.class);
      }

      // Construct using ServiceData.ChangeDetectResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getChangesFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (changesBuilder_ == null) {
          changes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          changesBuilder_.clear();
        }
        historyUrl_ = "";

        if (imageBuilder_ == null) {
          image_ = null;
        } else {
          image_ = null;
          imageBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_ChangeDetectResult_descriptor;
      }

      @java.lang.Override
      public ServiceData.ChangeDetectResult getDefaultInstanceForType() {
        return ServiceData.ChangeDetectResult.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.ChangeDetectResult build() {
        ServiceData.ChangeDetectResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.ChangeDetectResult buildPartial() {
        ServiceData.ChangeDetectResult result = new ServiceData.ChangeDetectResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (changesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            changes_ = java.util.Collections.unmodifiableList(changes_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.changes_ = changes_;
        } else {
          result.changes_ = changesBuilder_.build();
        }
        result.historyUrl_ = historyUrl_;
        if (imageBuilder_ == null) {
          result.image_ = image_;
        } else {
          result.image_ = imageBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.ChangeDetectResult) {
          return mergeFrom((ServiceData.ChangeDetectResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.ChangeDetectResult other) {
        if (other == ServiceData.ChangeDetectResult.getDefaultInstance()) return this;
        if (changesBuilder_ == null) {
          if (!other.changes_.isEmpty()) {
            if (changes_.isEmpty()) {
              changes_ = other.changes_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureChangesIsMutable();
              changes_.addAll(other.changes_);
            }
            onChanged();
          }
        } else {
          if (!other.changes_.isEmpty()) {
            if (changesBuilder_.isEmpty()) {
              changesBuilder_.dispose();
              changesBuilder_ = null;
              changes_ = other.changes_;
              bitField0_ = (bitField0_ & ~0x00000001);
              changesBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getChangesFieldBuilder() : null;
            } else {
              changesBuilder_.addAllMessages(other.changes_);
            }
          }
        }
        if (!other.getHistoryUrl().isEmpty()) {
          historyUrl_ = other.historyUrl_;
          onChanged();
        }
        if (other.hasImage()) {
          mergeImage(other.getImage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.ChangeDetectResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.ChangeDetectResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ServiceData.ChangeInfo> changes_ =
        java.util.Collections.emptyList();
      private void ensureChangesIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          changes_ = new java.util.ArrayList<ServiceData.ChangeInfo>(changes_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.ChangeInfo, ServiceData.ChangeInfo.Builder, ServiceData.ChangeInfoOrBuilder> changesBuilder_;

      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public java.util.List<ServiceData.ChangeInfo> getChangesList() {
        if (changesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(changes_);
        } else {
          return changesBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public int getChangesCount() {
        if (changesBuilder_ == null) {
          return changes_.size();
        } else {
          return changesBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public ServiceData.ChangeInfo getChanges(int index) {
        if (changesBuilder_ == null) {
          return changes_.get(index);
        } else {
          return changesBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder setChanges(
          int index, ServiceData.ChangeInfo value) {
        if (changesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChangesIsMutable();
          changes_.set(index, value);
          onChanged();
        } else {
          changesBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder setChanges(
          int index, ServiceData.ChangeInfo.Builder builderForValue) {
        if (changesBuilder_ == null) {
          ensureChangesIsMutable();
          changes_.set(index, builderForValue.build());
          onChanged();
        } else {
          changesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder addChanges(ServiceData.ChangeInfo value) {
        if (changesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChangesIsMutable();
          changes_.add(value);
          onChanged();
        } else {
          changesBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder addChanges(
          int index, ServiceData.ChangeInfo value) {
        if (changesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureChangesIsMutable();
          changes_.add(index, value);
          onChanged();
        } else {
          changesBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder addChanges(
          ServiceData.ChangeInfo.Builder builderForValue) {
        if (changesBuilder_ == null) {
          ensureChangesIsMutable();
          changes_.add(builderForValue.build());
          onChanged();
        } else {
          changesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder addChanges(
          int index, ServiceData.ChangeInfo.Builder builderForValue) {
        if (changesBuilder_ == null) {
          ensureChangesIsMutable();
          changes_.add(index, builderForValue.build());
          onChanged();
        } else {
          changesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder addAllChanges(
          java.lang.Iterable<? extends ServiceData.ChangeInfo> values) {
        if (changesBuilder_ == null) {
          ensureChangesIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, changes_);
          onChanged();
        } else {
          changesBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder clearChanges() {
        if (changesBuilder_ == null) {
          changes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          changesBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public Builder removeChanges(int index) {
        if (changesBuilder_ == null) {
          ensureChangesIsMutable();
          changes_.remove(index);
          onChanged();
        } else {
          changesBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public ServiceData.ChangeInfo.Builder getChangesBuilder(
          int index) {
        return getChangesFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public ServiceData.ChangeInfoOrBuilder getChangesOrBuilder(
          int index) {
        if (changesBuilder_ == null) {
          return changes_.get(index);  } else {
          return changesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public java.util.List<? extends ServiceData.ChangeInfoOrBuilder> 
           getChangesOrBuilderList() {
        if (changesBuilder_ != null) {
          return changesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(changes_);
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public ServiceData.ChangeInfo.Builder addChangesBuilder() {
        return getChangesFieldBuilder().addBuilder(
            ServiceData.ChangeInfo.getDefaultInstance());
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public ServiceData.ChangeInfo.Builder addChangesBuilder(
          int index) {
        return getChangesFieldBuilder().addBuilder(
            index, ServiceData.ChangeInfo.getDefaultInstance());
      }
      /**
       * <pre>
       *当前图片帧中检测到的变化区域列表
       * </pre>
       *
       * <code>repeated .ChangeInfo changes = 1;</code>
       */
      public java.util.List<ServiceData.ChangeInfo.Builder> 
           getChangesBuilderList() {
        return getChangesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.ChangeInfo, ServiceData.ChangeInfo.Builder, ServiceData.ChangeInfoOrBuilder> 
          getChangesFieldBuilder() {
        if (changesBuilder_ == null) {
          changesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.ChangeInfo, ServiceData.ChangeInfo.Builder, ServiceData.ChangeInfoOrBuilder>(
                  changes_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          changes_ = null;
        }
        return changesBuilder_;
      }

      private java.lang.Object historyUrl_ = "";
      /**
       * <pre>
       *历史图片url
       * </pre>
       *
       * <code>string historyUrl = 2;</code>
       */
      public java.lang.String getHistoryUrl() {
        java.lang.Object ref = historyUrl_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          historyUrl_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *历史图片url
       * </pre>
       *
       * <code>string historyUrl = 2;</code>
       */
      public com.google.protobuf.ByteString
          getHistoryUrlBytes() {
        java.lang.Object ref = historyUrl_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          historyUrl_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *历史图片url
       * </pre>
       *
       * <code>string historyUrl = 2;</code>
       */
      public Builder setHistoryUrl(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        historyUrl_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *历史图片url
       * </pre>
       *
       * <code>string historyUrl = 2;</code>
       */
      public Builder clearHistoryUrl() {
        
        historyUrl_ = getDefaultInstance().getHistoryUrl();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *历史图片url
       * </pre>
       *
       * <code>string historyUrl = 2;</code>
       */
      public Builder setHistoryUrlBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        historyUrl_ = value;
        onChanged();
        return this;
      }

      private ServiceData.ImageExtendData image_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder> imageBuilder_;
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      public boolean hasImage() {
        return imageBuilder_ != null || image_ != null;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      public ServiceData.ImageExtendData getImage() {
        if (imageBuilder_ == null) {
          return image_ == null ? ServiceData.ImageExtendData.getDefaultInstance() : image_;
        } else {
          return imageBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      public Builder setImage(ServiceData.ImageExtendData value) {
        if (imageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          image_ = value;
          onChanged();
        } else {
          imageBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      public Builder setImage(
          ServiceData.ImageExtendData.Builder builderForValue) {
        if (imageBuilder_ == null) {
          image_ = builderForValue.build();
          onChanged();
        } else {
          imageBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      public Builder mergeImage(ServiceData.ImageExtendData value) {
        if (imageBuilder_ == null) {
          if (image_ != null) {
            image_ =
              ServiceData.ImageExtendData.newBuilder(image_).mergeFrom(value).buildPartial();
          } else {
            image_ = value;
          }
          onChanged();
        } else {
          imageBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      public Builder clearImage() {
        if (imageBuilder_ == null) {
          image_ = null;
          onChanged();
        } else {
          image_ = null;
          imageBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      public ServiceData.ImageExtendData.Builder getImageBuilder() {
        
        onChanged();
        return getImageFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      public ServiceData.ImageExtendDataOrBuilder getImageOrBuilder() {
        if (imageBuilder_ != null) {
          return imageBuilder_.getMessageOrBuilder();
        } else {
          return image_ == null ?
              ServiceData.ImageExtendData.getDefaultInstance() : image_;
        }
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData image = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder> 
          getImageFieldBuilder() {
        if (imageBuilder_ == null) {
          imageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder>(
                  getImage(),
                  getParentForChildren(),
                  isClean());
          image_ = null;
        }
        return imageBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ChangeDetectResult)
    }

    // @@protoc_insertion_point(class_scope:ChangeDetectResult)
    private static final ServiceData.ChangeDetectResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.ChangeDetectResult();
    }

    public static ServiceData.ChangeDetectResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChangeDetectResult>
        PARSER = new com.google.protobuf.AbstractParser<ChangeDetectResult>() {
      @java.lang.Override
      public ChangeDetectResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ChangeDetectResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ChangeDetectResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChangeDetectResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.ChangeDetectResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface TargetDetectResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TargetDetectResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    java.util.List<ServiceData.TargetInfo> 
        getTargetsList();
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    ServiceData.TargetInfo getTargets(int index);
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    int getTargetsCount();
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    java.util.List<? extends ServiceData.TargetInfoOrBuilder> 
        getTargetsOrBuilderList();
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    ServiceData.TargetInfoOrBuilder getTargetsOrBuilder(
        int index);

    /**
     * <pre>
     *原始图片
     * </pre>
     *
     * <code>.ImageExtendData originImage = 2;</code>
     */
    boolean hasOriginImage();
    /**
     * <pre>
     *原始图片
     * </pre>
     *
     * <code>.ImageExtendData originImage = 2;</code>
     */
    ServiceData.ImageExtendData getOriginImage();
    /**
     * <pre>
     *原始图片
     * </pre>
     *
     * <code>.ImageExtendData originImage = 2;</code>
     */
    ServiceData.ImageExtendDataOrBuilder getOriginImageOrBuilder();

    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData markedImage = 3;</code>
     */
    boolean hasMarkedImage();
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData markedImage = 3;</code>
     */
    ServiceData.ImageExtendData getMarkedImage();
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData markedImage = 3;</code>
     */
    ServiceData.ImageExtendDataOrBuilder getMarkedImageOrBuilder();
  }
  /**
   * <pre>
   *目标识别结果输出
   * </pre>
   *
   * Protobuf type {@code TargetDetectResult}
   */
  public  static final class TargetDetectResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TargetDetectResult)
      TargetDetectResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TargetDetectResult.newBuilder() to construct.
    private TargetDetectResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TargetDetectResult() {
      targets_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TargetDetectResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                targets_ = new java.util.ArrayList<ServiceData.TargetInfo>();
                mutable_bitField0_ |= 0x00000001;
              }
              targets_.add(
                  input.readMessage(ServiceData.TargetInfo.parser(), extensionRegistry));
              break;
            }
            case 18: {
              ServiceData.ImageExtendData.Builder subBuilder = null;
              if (originImage_ != null) {
                subBuilder = originImage_.toBuilder();
              }
              originImage_ = input.readMessage(ServiceData.ImageExtendData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(originImage_);
                originImage_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              ServiceData.ImageExtendData.Builder subBuilder = null;
              if (markedImage_ != null) {
                subBuilder = markedImage_.toBuilder();
              }
              markedImage_ = input.readMessage(ServiceData.ImageExtendData.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(markedImage_);
                markedImage_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          targets_ = java.util.Collections.unmodifiableList(targets_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_TargetDetectResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_TargetDetectResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.TargetDetectResult.class, ServiceData.TargetDetectResult.Builder.class);
    }

    private int bitField0_;
    public static final int TARGETS_FIELD_NUMBER = 1;
    private java.util.List<ServiceData.TargetInfo> targets_;
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    public java.util.List<ServiceData.TargetInfo> getTargetsList() {
      return targets_;
    }
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    public java.util.List<? extends ServiceData.TargetInfoOrBuilder> 
        getTargetsOrBuilderList() {
      return targets_;
    }
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    public int getTargetsCount() {
      return targets_.size();
    }
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    public ServiceData.TargetInfo getTargets(int index) {
      return targets_.get(index);
    }
    /**
     * <pre>
     *当前图片帧中检测到的目标列表
     * </pre>
     *
     * <code>repeated .TargetInfo targets = 1;</code>
     */
    public ServiceData.TargetInfoOrBuilder getTargetsOrBuilder(
        int index) {
      return targets_.get(index);
    }

    public static final int ORIGINIMAGE_FIELD_NUMBER = 2;
    private ServiceData.ImageExtendData originImage_;
    /**
     * <pre>
     *原始图片
     * </pre>
     *
     * <code>.ImageExtendData originImage = 2;</code>
     */
    public boolean hasOriginImage() {
      return originImage_ != null;
    }
    /**
     * <pre>
     *原始图片
     * </pre>
     *
     * <code>.ImageExtendData originImage = 2;</code>
     */
    public ServiceData.ImageExtendData getOriginImage() {
      return originImage_ == null ? ServiceData.ImageExtendData.getDefaultInstance() : originImage_;
    }
    /**
     * <pre>
     *原始图片
     * </pre>
     *
     * <code>.ImageExtendData originImage = 2;</code>
     */
    public ServiceData.ImageExtendDataOrBuilder getOriginImageOrBuilder() {
      return getOriginImage();
    }

    public static final int MARKEDIMAGE_FIELD_NUMBER = 3;
    private ServiceData.ImageExtendData markedImage_;
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData markedImage = 3;</code>
     */
    public boolean hasMarkedImage() {
      return markedImage_ != null;
    }
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData markedImage = 3;</code>
     */
    public ServiceData.ImageExtendData getMarkedImage() {
      return markedImage_ == null ? ServiceData.ImageExtendData.getDefaultInstance() : markedImage_;
    }
    /**
     * <pre>
     *标注后的图片
     * </pre>
     *
     * <code>.ImageExtendData markedImage = 3;</code>
     */
    public ServiceData.ImageExtendDataOrBuilder getMarkedImageOrBuilder() {
      return getMarkedImage();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      for (int i = 0; i < targets_.size(); i++) {
        output.writeMessage(1, targets_.get(i));
      }
      if (originImage_ != null) {
        output.writeMessage(2, getOriginImage());
      }
      if (markedImage_ != null) {
        output.writeMessage(3, getMarkedImage());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < targets_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, targets_.get(i));
      }
      if (originImage_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getOriginImage());
      }
      if (markedImage_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getMarkedImage());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.TargetDetectResult)) {
        return super.equals(obj);
      }
      ServiceData.TargetDetectResult other = (ServiceData.TargetDetectResult) obj;

      boolean result = true;
      result = result && getTargetsList()
          .equals(other.getTargetsList());
      result = result && (hasOriginImage() == other.hasOriginImage());
      if (hasOriginImage()) {
        result = result && getOriginImage()
            .equals(other.getOriginImage());
      }
      result = result && (hasMarkedImage() == other.hasMarkedImage());
      if (hasMarkedImage()) {
        result = result && getMarkedImage()
            .equals(other.getMarkedImage());
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getTargetsCount() > 0) {
        hash = (37 * hash) + TARGETS_FIELD_NUMBER;
        hash = (53 * hash) + getTargetsList().hashCode();
      }
      if (hasOriginImage()) {
        hash = (37 * hash) + ORIGINIMAGE_FIELD_NUMBER;
        hash = (53 * hash) + getOriginImage().hashCode();
      }
      if (hasMarkedImage()) {
        hash = (37 * hash) + MARKEDIMAGE_FIELD_NUMBER;
        hash = (53 * hash) + getMarkedImage().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.TargetDetectResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetDetectResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetDetectResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetDetectResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetDetectResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.TargetDetectResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.TargetDetectResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.TargetDetectResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.TargetDetectResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.TargetDetectResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.TargetDetectResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.TargetDetectResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.TargetDetectResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *目标识别结果输出
     * </pre>
     *
     * Protobuf type {@code TargetDetectResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TargetDetectResult)
        ServiceData.TargetDetectResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_TargetDetectResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_TargetDetectResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.TargetDetectResult.class, ServiceData.TargetDetectResult.Builder.class);
      }

      // Construct using ServiceData.TargetDetectResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getTargetsFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          targetsBuilder_.clear();
        }
        if (originImageBuilder_ == null) {
          originImage_ = null;
        } else {
          originImage_ = null;
          originImageBuilder_ = null;
        }
        if (markedImageBuilder_ == null) {
          markedImage_ = null;
        } else {
          markedImage_ = null;
          markedImageBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_TargetDetectResult_descriptor;
      }

      @java.lang.Override
      public ServiceData.TargetDetectResult getDefaultInstanceForType() {
        return ServiceData.TargetDetectResult.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.TargetDetectResult build() {
        ServiceData.TargetDetectResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.TargetDetectResult buildPartial() {
        ServiceData.TargetDetectResult result = new ServiceData.TargetDetectResult(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (targetsBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            targets_ = java.util.Collections.unmodifiableList(targets_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.targets_ = targets_;
        } else {
          result.targets_ = targetsBuilder_.build();
        }
        if (originImageBuilder_ == null) {
          result.originImage_ = originImage_;
        } else {
          result.originImage_ = originImageBuilder_.build();
        }
        if (markedImageBuilder_ == null) {
          result.markedImage_ = markedImage_;
        } else {
          result.markedImage_ = markedImageBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.TargetDetectResult) {
          return mergeFrom((ServiceData.TargetDetectResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.TargetDetectResult other) {
        if (other == ServiceData.TargetDetectResult.getDefaultInstance()) return this;
        if (targetsBuilder_ == null) {
          if (!other.targets_.isEmpty()) {
            if (targets_.isEmpty()) {
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureTargetsIsMutable();
              targets_.addAll(other.targets_);
            }
            onChanged();
          }
        } else {
          if (!other.targets_.isEmpty()) {
            if (targetsBuilder_.isEmpty()) {
              targetsBuilder_.dispose();
              targetsBuilder_ = null;
              targets_ = other.targets_;
              bitField0_ = (bitField0_ & ~0x00000001);
              targetsBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getTargetsFieldBuilder() : null;
            } else {
              targetsBuilder_.addAllMessages(other.targets_);
            }
          }
        }
        if (other.hasOriginImage()) {
          mergeOriginImage(other.getOriginImage());
        }
        if (other.hasMarkedImage()) {
          mergeMarkedImage(other.getMarkedImage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.TargetDetectResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.TargetDetectResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ServiceData.TargetInfo> targets_ =
        java.util.Collections.emptyList();
      private void ensureTargetsIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          targets_ = new java.util.ArrayList<ServiceData.TargetInfo>(targets_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.TargetInfo, ServiceData.TargetInfo.Builder, ServiceData.TargetInfoOrBuilder> targetsBuilder_;

      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public java.util.List<ServiceData.TargetInfo> getTargetsList() {
        if (targetsBuilder_ == null) {
          return java.util.Collections.unmodifiableList(targets_);
        } else {
          return targetsBuilder_.getMessageList();
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public int getTargetsCount() {
        if (targetsBuilder_ == null) {
          return targets_.size();
        } else {
          return targetsBuilder_.getCount();
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public ServiceData.TargetInfo getTargets(int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);
        } else {
          return targetsBuilder_.getMessage(index);
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder setTargets(
          int index, ServiceData.TargetInfo value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.set(index, value);
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder setTargets(
          int index, ServiceData.TargetInfo.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.set(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder addTargets(ServiceData.TargetInfo value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder addTargets(
          int index, ServiceData.TargetInfo value) {
        if (targetsBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureTargetsIsMutable();
          targets_.add(index, value);
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder addTargets(
          ServiceData.TargetInfo.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder addTargets(
          int index, ServiceData.TargetInfo.Builder builderForValue) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.add(index, builderForValue.build());
          onChanged();
        } else {
          targetsBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder addAllTargets(
          java.lang.Iterable<? extends ServiceData.TargetInfo> values) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, targets_);
          onChanged();
        } else {
          targetsBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder clearTargets() {
        if (targetsBuilder_ == null) {
          targets_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          targetsBuilder_.clear();
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public Builder removeTargets(int index) {
        if (targetsBuilder_ == null) {
          ensureTargetsIsMutable();
          targets_.remove(index);
          onChanged();
        } else {
          targetsBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public ServiceData.TargetInfo.Builder getTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().getBuilder(index);
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public ServiceData.TargetInfoOrBuilder getTargetsOrBuilder(
          int index) {
        if (targetsBuilder_ == null) {
          return targets_.get(index);  } else {
          return targetsBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public java.util.List<? extends ServiceData.TargetInfoOrBuilder> 
           getTargetsOrBuilderList() {
        if (targetsBuilder_ != null) {
          return targetsBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(targets_);
        }
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public ServiceData.TargetInfo.Builder addTargetsBuilder() {
        return getTargetsFieldBuilder().addBuilder(
            ServiceData.TargetInfo.getDefaultInstance());
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public ServiceData.TargetInfo.Builder addTargetsBuilder(
          int index) {
        return getTargetsFieldBuilder().addBuilder(
            index, ServiceData.TargetInfo.getDefaultInstance());
      }
      /**
       * <pre>
       *当前图片帧中检测到的目标列表
       * </pre>
       *
       * <code>repeated .TargetInfo targets = 1;</code>
       */
      public java.util.List<ServiceData.TargetInfo.Builder> 
           getTargetsBuilderList() {
        return getTargetsFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ServiceData.TargetInfo, ServiceData.TargetInfo.Builder, ServiceData.TargetInfoOrBuilder> 
          getTargetsFieldBuilder() {
        if (targetsBuilder_ == null) {
          targetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ServiceData.TargetInfo, ServiceData.TargetInfo.Builder, ServiceData.TargetInfoOrBuilder>(
                  targets_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          targets_ = null;
        }
        return targetsBuilder_;
      }

      private ServiceData.ImageExtendData originImage_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder> originImageBuilder_;
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      public boolean hasOriginImage() {
        return originImageBuilder_ != null || originImage_ != null;
      }
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      public ServiceData.ImageExtendData getOriginImage() {
        if (originImageBuilder_ == null) {
          return originImage_ == null ? ServiceData.ImageExtendData.getDefaultInstance() : originImage_;
        } else {
          return originImageBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      public Builder setOriginImage(ServiceData.ImageExtendData value) {
        if (originImageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          originImage_ = value;
          onChanged();
        } else {
          originImageBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      public Builder setOriginImage(
          ServiceData.ImageExtendData.Builder builderForValue) {
        if (originImageBuilder_ == null) {
          originImage_ = builderForValue.build();
          onChanged();
        } else {
          originImageBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      public Builder mergeOriginImage(ServiceData.ImageExtendData value) {
        if (originImageBuilder_ == null) {
          if (originImage_ != null) {
            originImage_ =
              ServiceData.ImageExtendData.newBuilder(originImage_).mergeFrom(value).buildPartial();
          } else {
            originImage_ = value;
          }
          onChanged();
        } else {
          originImageBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      public Builder clearOriginImage() {
        if (originImageBuilder_ == null) {
          originImage_ = null;
          onChanged();
        } else {
          originImage_ = null;
          originImageBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      public ServiceData.ImageExtendData.Builder getOriginImageBuilder() {
        
        onChanged();
        return getOriginImageFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      public ServiceData.ImageExtendDataOrBuilder getOriginImageOrBuilder() {
        if (originImageBuilder_ != null) {
          return originImageBuilder_.getMessageOrBuilder();
        } else {
          return originImage_ == null ?
              ServiceData.ImageExtendData.getDefaultInstance() : originImage_;
        }
      }
      /**
       * <pre>
       *原始图片
       * </pre>
       *
       * <code>.ImageExtendData originImage = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder> 
          getOriginImageFieldBuilder() {
        if (originImageBuilder_ == null) {
          originImageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder>(
                  getOriginImage(),
                  getParentForChildren(),
                  isClean());
          originImage_ = null;
        }
        return originImageBuilder_;
      }

      private ServiceData.ImageExtendData markedImage_ = null;
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder> markedImageBuilder_;
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      public boolean hasMarkedImage() {
        return markedImageBuilder_ != null || markedImage_ != null;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      public ServiceData.ImageExtendData getMarkedImage() {
        if (markedImageBuilder_ == null) {
          return markedImage_ == null ? ServiceData.ImageExtendData.getDefaultInstance() : markedImage_;
        } else {
          return markedImageBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      public Builder setMarkedImage(ServiceData.ImageExtendData value) {
        if (markedImageBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          markedImage_ = value;
          onChanged();
        } else {
          markedImageBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      public Builder setMarkedImage(
          ServiceData.ImageExtendData.Builder builderForValue) {
        if (markedImageBuilder_ == null) {
          markedImage_ = builderForValue.build();
          onChanged();
        } else {
          markedImageBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      public Builder mergeMarkedImage(ServiceData.ImageExtendData value) {
        if (markedImageBuilder_ == null) {
          if (markedImage_ != null) {
            markedImage_ =
              ServiceData.ImageExtendData.newBuilder(markedImage_).mergeFrom(value).buildPartial();
          } else {
            markedImage_ = value;
          }
          onChanged();
        } else {
          markedImageBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      public Builder clearMarkedImage() {
        if (markedImageBuilder_ == null) {
          markedImage_ = null;
          onChanged();
        } else {
          markedImage_ = null;
          markedImageBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      public ServiceData.ImageExtendData.Builder getMarkedImageBuilder() {
        
        onChanged();
        return getMarkedImageFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      public ServiceData.ImageExtendDataOrBuilder getMarkedImageOrBuilder() {
        if (markedImageBuilder_ != null) {
          return markedImageBuilder_.getMessageOrBuilder();
        } else {
          return markedImage_ == null ?
              ServiceData.ImageExtendData.getDefaultInstance() : markedImage_;
        }
      }
      /**
       * <pre>
       *标注后的图片
       * </pre>
       *
       * <code>.ImageExtendData markedImage = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder> 
          getMarkedImageFieldBuilder() {
        if (markedImageBuilder_ == null) {
          markedImageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              ServiceData.ImageExtendData, ServiceData.ImageExtendData.Builder, ServiceData.ImageExtendDataOrBuilder>(
                  getMarkedImage(),
                  getParentForChildren(),
                  isClean());
          markedImage_ = null;
        }
        return markedImageBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TargetDetectResult)
    }

    // @@protoc_insertion_point(class_scope:TargetDetectResult)
    private static final ServiceData.TargetDetectResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.TargetDetectResult();
    }

    public static ServiceData.TargetDetectResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TargetDetectResult>
        PARSER = new com.google.protobuf.AbstractParser<TargetDetectResult>() {
      @java.lang.Override
      public TargetDetectResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TargetDetectResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TargetDetectResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TargetDetectResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.TargetDetectResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface BigImageResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BigImageResult)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *线段编号，例如 "779-3"
     * </pre>
     *
     * <code>string lineNumber = 1;</code>
     */
    java.lang.String getLineNumber();
    /**
     * <pre>
     *线段编号，例如 "779-3"
     * </pre>
     *
     * <code>string lineNumber = 1;</code>
     */
    com.google.protobuf.ByteString
        getLineNumberBytes();

    /**
     * <pre>
     *名称，例如"xx水库"
     * </pre>
     *
     * <code>string lineName = 2;</code>
     */
    java.lang.String getLineName();
    /**
     * <pre>
     *名称，例如"xx水库"
     * </pre>
     *
     * <code>string lineName = 2;</code>
     */
    com.google.protobuf.ByteString
        getLineNameBytes();

    /**
     * <pre>
     *图片二进制数据
     * </pre>
     *
     * <code>bytes imageData = 3;</code>
     */
    com.google.protobuf.ByteString getImageData();
  }
  /**
   * <pre>
   *大图拼接输出结果
   *每拼接一张都要输出一次
   * </pre>
   *
   * Protobuf type {@code BigImageResult}
   */
  public  static final class BigImageResult extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BigImageResult)
      BigImageResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BigImageResult.newBuilder() to construct.
    private BigImageResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BigImageResult() {
      lineNumber_ = "";
      lineName_ = "";
      imageData_ = com.google.protobuf.ByteString.EMPTY;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BigImageResult(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              lineNumber_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              lineName_ = s;
              break;
            }
            case 26: {

              imageData_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ServiceData.internal_static_BigImageResult_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ServiceData.internal_static_BigImageResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ServiceData.BigImageResult.class, ServiceData.BigImageResult.Builder.class);
    }

    public static final int LINENUMBER_FIELD_NUMBER = 1;
    private volatile java.lang.Object lineNumber_;
    /**
     * <pre>
     *线段编号，例如 "779-3"
     * </pre>
     *
     * <code>string lineNumber = 1;</code>
     */
    public java.lang.String getLineNumber() {
      java.lang.Object ref = lineNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lineNumber_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *线段编号，例如 "779-3"
     * </pre>
     *
     * <code>string lineNumber = 1;</code>
     */
    public com.google.protobuf.ByteString
        getLineNumberBytes() {
      java.lang.Object ref = lineNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lineNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LINENAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object lineName_;
    /**
     * <pre>
     *名称，例如"xx水库"
     * </pre>
     *
     * <code>string lineName = 2;</code>
     */
    public java.lang.String getLineName() {
      java.lang.Object ref = lineName_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lineName_ = s;
        return s;
      }
    }
    /**
     * <pre>
     *名称，例如"xx水库"
     * </pre>
     *
     * <code>string lineName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getLineNameBytes() {
      java.lang.Object ref = lineName_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lineName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int IMAGEDATA_FIELD_NUMBER = 3;
    private com.google.protobuf.ByteString imageData_;
    /**
     * <pre>
     *图片二进制数据
     * </pre>
     *
     * <code>bytes imageData = 3;</code>
     */
    public com.google.protobuf.ByteString getImageData() {
      return imageData_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getLineNumberBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, lineNumber_);
      }
      if (!getLineNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lineName_);
      }
      if (!imageData_.isEmpty()) {
        output.writeBytes(3, imageData_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getLineNumberBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, lineNumber_);
      }
      if (!getLineNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lineName_);
      }
      if (!imageData_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, imageData_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof ServiceData.BigImageResult)) {
        return super.equals(obj);
      }
      ServiceData.BigImageResult other = (ServiceData.BigImageResult) obj;

      boolean result = true;
      result = result && getLineNumber()
          .equals(other.getLineNumber());
      result = result && getLineName()
          .equals(other.getLineName());
      result = result && getImageData()
          .equals(other.getImageData());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + LINENUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getLineNumber().hashCode();
      hash = (37 * hash) + LINENAME_FIELD_NUMBER;
      hash = (53 * hash) + getLineName().hashCode();
      hash = (37 * hash) + IMAGEDATA_FIELD_NUMBER;
      hash = (53 * hash) + getImageData().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ServiceData.BigImageResult parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.BigImageResult parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.BigImageResult parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.BigImageResult parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.BigImageResult parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ServiceData.BigImageResult parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ServiceData.BigImageResult parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.BigImageResult parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.BigImageResult parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ServiceData.BigImageResult parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ServiceData.BigImageResult parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ServiceData.BigImageResult parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(ServiceData.BigImageResult prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     *大图拼接输出结果
     *每拼接一张都要输出一次
     * </pre>
     *
     * Protobuf type {@code BigImageResult}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BigImageResult)
        ServiceData.BigImageResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ServiceData.internal_static_BigImageResult_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ServiceData.internal_static_BigImageResult_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ServiceData.BigImageResult.class, ServiceData.BigImageResult.Builder.class);
      }

      // Construct using ServiceData.BigImageResult.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        lineNumber_ = "";

        lineName_ = "";

        imageData_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ServiceData.internal_static_BigImageResult_descriptor;
      }

      @java.lang.Override
      public ServiceData.BigImageResult getDefaultInstanceForType() {
        return ServiceData.BigImageResult.getDefaultInstance();
      }

      @java.lang.Override
      public ServiceData.BigImageResult build() {
        ServiceData.BigImageResult result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ServiceData.BigImageResult buildPartial() {
        ServiceData.BigImageResult result = new ServiceData.BigImageResult(this);
        result.lineNumber_ = lineNumber_;
        result.lineName_ = lineName_;
        result.imageData_ = imageData_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ServiceData.BigImageResult) {
          return mergeFrom((ServiceData.BigImageResult)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ServiceData.BigImageResult other) {
        if (other == ServiceData.BigImageResult.getDefaultInstance()) return this;
        if (!other.getLineNumber().isEmpty()) {
          lineNumber_ = other.lineNumber_;
          onChanged();
        }
        if (!other.getLineName().isEmpty()) {
          lineName_ = other.lineName_;
          onChanged();
        }
        if (other.getImageData() != com.google.protobuf.ByteString.EMPTY) {
          setImageData(other.getImageData());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        ServiceData.BigImageResult parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ServiceData.BigImageResult) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object lineNumber_ = "";
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public java.lang.String getLineNumber() {
        java.lang.Object ref = lineNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lineNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public com.google.protobuf.ByteString
          getLineNumberBytes() {
        java.lang.Object ref = lineNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lineNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public Builder setLineNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lineNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public Builder clearLineNumber() {
        
        lineNumber_ = getDefaultInstance().getLineNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *线段编号，例如 "779-3"
       * </pre>
       *
       * <code>string lineNumber = 1;</code>
       */
      public Builder setLineNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lineNumber_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object lineName_ = "";
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public java.lang.String getLineName() {
        java.lang.Object ref = lineName_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lineName_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public com.google.protobuf.ByteString
          getLineNameBytes() {
        java.lang.Object ref = lineName_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lineName_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public Builder setLineName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lineName_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public Builder clearLineName() {
        
        lineName_ = getDefaultInstance().getLineName();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *名称，例如"xx水库"
       * </pre>
       *
       * <code>string lineName = 2;</code>
       */
      public Builder setLineNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lineName_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString imageData_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <pre>
       *图片二进制数据
       * </pre>
       *
       * <code>bytes imageData = 3;</code>
       */
      public com.google.protobuf.ByteString getImageData() {
        return imageData_;
      }
      /**
       * <pre>
       *图片二进制数据
       * </pre>
       *
       * <code>bytes imageData = 3;</code>
       */
      public Builder setImageData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        imageData_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *图片二进制数据
       * </pre>
       *
       * <code>bytes imageData = 3;</code>
       */
      public Builder clearImageData() {
        
        imageData_ = getDefaultInstance().getImageData();
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:BigImageResult)
    }

    // @@protoc_insertion_point(class_scope:BigImageResult)
    private static final ServiceData.BigImageResult DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ServiceData.BigImageResult();
    }

    public static ServiceData.BigImageResult getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BigImageResult>
        PARSER = new com.google.protobuf.AbstractParser<BigImageResult>() {
      @java.lang.Override
      public BigImageResult parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BigImageResult(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BigImageResult> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BigImageResult> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ServiceData.BigImageResult getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PositionPb_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PositionPb_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LabelInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LabelInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LinePb_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LinePb_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LineStylePb_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LineStylePb_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegionPb_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegionPb_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TargetPb_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TargetPb_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PipeData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PipeData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_CordonData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_CordonData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FocusData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FocusData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HistoryImage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HistoryImage_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DemoParam_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DemoParam_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ImageExtendData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ImageExtendData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TargetInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TargetInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeInfo_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TaskData_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TaskData_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ChangeDetectResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ChangeDetectResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TargetDetectResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TargetDetectResult_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BigImageResult_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BigImageResult_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037ServiceData-Internal-v1.4.proto\"6\n\nPos" +
      "itionPb\022\013\n\003lng\030\001 \001(\001\022\013\n\003lat\030\002 \001(\001\022\016\n\006hei" +
      "ght\030\003 \001(\002\"C\n\tLabelInfo\022\014\n\004xmin\030\001 \001(\005\022\014\n\004" +
      "ymin\030\002 \001(\005\022\014\n\004xmax\030\003 \001(\005\022\014\n\004ymax\030\004 \001(\005\"d" +
      "\n\006LinePb\022\022\n\nlineNumber\030\001 \001(\t\022\020\n\010lineName" +
      "\030\002 \001(\t\022\032\n\005start\030\003 \001(\0132\013.PositionPb\022\030\n\003en" +
      "d\030\004 \001(\0132\013.PositionPb\"9\n\013LineStylePb\022\r\n\005c" +
      "olor\030\001 \001(\t\022\r\n\005width\030\002 \001(\005\022\014\n\004type\030\003 \001(\005\"" +
      "]\n\010RegionPb\022\036\n\tpositions\030\001 \003(\0132\013.Positio" +
      "nPb\022\020\n\010markinfo\030\002 \001(\t\022\037\n\tlineStyle\030\003 \001(\013" +
      "2\014.LineStylePb\"\\\n\010TargetPb\022\035\n\010position\030\001" +
      " \001(\0132\013.PositionPb\022\020\n\010markType\030\002 \001(\t\022\037\n\tl" +
      "ineStyle\030\003 \001(\0132\014.LineStylePb\"K\n\010PipeData" +
      "\022\036\n\tpositions\030\001 \003(\0132\013.PositionPb\022\037\n\tline" +
      "Style\030\002 \001(\0132\014.LineStylePb\"e\n\nCordonData\022" +
      "\032\n\005line1\030\001 \003(\0132\013.PositionPb\022\032\n\005line2\030\002 \003" +
      "(\0132\013.PositionPb\022\037\n\tlineStyle\030\003 \001(\0132\014.Lin" +
      "eStylePb\"C\n\tFocusData\022\032\n\007regions\030\001 \003(\0132\t" +
      ".RegionPb\022\032\n\007targets\030\002 \003(\0132\t.TargetPb\"Y\n" +
      "\014HistoryImage\022\035\n\010location\030\001 \001(\0132\013.Positi" +
      "onPb\022\035\n\010viewFild\030\002 \003(\0132\013.PositionPb\022\013\n\003u" +
      "rl\030\003 \001(\t\"\334\001\n\tDemoParam\022\025\n\rm_nPixelNum_w\030" +
      "\001 \001(\005\022\025\n\rm_nPixelNum_h\030\002 \001(\005\022\025\n\rm_fChipS" +
      "ize_w\030\003 \001(\002\022\025\n\rm_fChipSize_h\030\004 \001(\002\022\024\n\014m_" +
      "fFocal_min\030\005 \001(\002\022\027\n\017m_fPitch_Offset\030\006 \001(" +
      "\002\022\031\n\021m_fHeading_Offset\030\007 \001(\002\022\024\n\014m_vValue" +
      "List\030\010 \003(\005\022\023\n\013m_vZoomList\030\t \003(\005\"\222\001\n\017Imag" +
      "eExtendData\022\013\n\003tid\030\001 \001(\005\022\016\n\006number\030\002 \001(\005" +
      "\022\035\n\010location\030\003 \001(\0132\013.PositionPb\022\036\n\tviewF" +
      "ield\030\004 \003(\0132\013.PositionPb\022\021\n\timageData\030\005 \001" +
      "(\014\022\020\n\010imageUrl\030\006 \001(\t\"v\n\nTargetInfo\022\022\n\nta" +
      "rgetName\030\001 \001(\t\022\031\n\021targetProbability\030\002 \001(" +
      "\002\022\031\n\005lable\030\003 \001(\0132\n.LabelInfo\022\036\n\tposition" +
      "s\030\004 \003(\0132\013.PositionPb\"b\n\nChangeInfo\022\031\n\021ta" +
      "rgetProbability\030\001 \001(\002\022\031\n\005lable\030\002 \001(\0132\n.L" +
      "abelInfo\022\036\n\tpositions\030\003 \003(\0132\013.PositionPb" +
      "\"\276\002\n\010TaskData\022\013\n\003tid\030\001 \001(\005\022\014\n\004type\030\002 \001(\005" +
      "\022\021\n\tvideoType\030\003 \001(\005\022\035\n\tdemoParam\030\004 \001(\0132\n" +
      ".DemoParam\022\020\n\010interval\030\005 \001(\005\022\025\n\rtargetNu" +
      "mbers\030\006 \003(\005\022\033\n\010pipeData\030\007 \001(\0132\t.PipeData" +
      "\022 \n\013cordonDatas\030\010 \003(\0132\013.CordonData\022\035\n\tfo" +
      "cusData\030\t \001(\0132\n.FocusData\022$\n\rhistoryImag" +
      "es\030\n \003(\0132\r.HistoryImage\022\020\n\010videoUrl\030\013 \001(" +
      "\t\022\016\n\006outUrl\030\014 \001(\t\022\026\n\005lines\030\r \003(\0132\007.LineP" +
      "b\"g\n\022ChangeDetectResult\022\034\n\007changes\030\001 \003(\013" +
      "2\013.ChangeInfo\022\022\n\nhistoryUrl\030\002 \001(\t\022\037\n\005ima" +
      "ge\030\003 \001(\0132\020.ImageExtendData\"\200\001\n\022TargetDet" +
      "ectResult\022\034\n\007targets\030\001 \003(\0132\013.TargetInfo\022" +
      "%\n\013originImage\030\002 \001(\0132\020.ImageExtendData\022%" +
      "\n\013markedImage\030\003 \001(\0132\020.ImageExtendData\"I\n" +
      "\016BigImageResult\022\022\n\nlineNumber\030\001 \001(\t\022\020\n\010l" +
      "ineName\030\002 \001(\t\022\021\n\timageData\030\003 \001(\014B\rB\013Serv" +
      "iceDatab\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_PositionPb_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_PositionPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PositionPb_descriptor,
        new java.lang.String[] { "Lng", "Lat", "Height", });
    internal_static_LabelInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_LabelInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LabelInfo_descriptor,
        new java.lang.String[] { "Xmin", "Ymin", "Xmax", "Ymax", });
    internal_static_LinePb_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_LinePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LinePb_descriptor,
        new java.lang.String[] { "LineNumber", "LineName", "Start", "End", });
    internal_static_LineStylePb_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_LineStylePb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LineStylePb_descriptor,
        new java.lang.String[] { "Color", "Width", "Type", });
    internal_static_RegionPb_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_RegionPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegionPb_descriptor,
        new java.lang.String[] { "Positions", "Markinfo", "LineStyle", });
    internal_static_TargetPb_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_TargetPb_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TargetPb_descriptor,
        new java.lang.String[] { "Position", "MarkType", "LineStyle", });
    internal_static_PipeData_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_PipeData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PipeData_descriptor,
        new java.lang.String[] { "Positions", "LineStyle", });
    internal_static_CordonData_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_CordonData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_CordonData_descriptor,
        new java.lang.String[] { "Line1", "Line2", "LineStyle", });
    internal_static_FocusData_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_FocusData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FocusData_descriptor,
        new java.lang.String[] { "Regions", "Targets", });
    internal_static_HistoryImage_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_HistoryImage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HistoryImage_descriptor,
        new java.lang.String[] { "Location", "ViewFild", "Url", });
    internal_static_DemoParam_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_DemoParam_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DemoParam_descriptor,
        new java.lang.String[] { "MNPixelNumW", "MNPixelNumH", "MFChipSizeW", "MFChipSizeH", "MFFocalMin", "MFPitchOffset", "MFHeadingOffset", "MVValueList", "MVZoomList", });
    internal_static_ImageExtendData_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_ImageExtendData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ImageExtendData_descriptor,
        new java.lang.String[] { "Tid", "Number", "Location", "ViewField", "ImageData", "ImageUrl", });
    internal_static_TargetInfo_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_TargetInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TargetInfo_descriptor,
        new java.lang.String[] { "TargetName", "TargetProbability", "Lable", "Positions", });
    internal_static_ChangeInfo_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_ChangeInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeInfo_descriptor,
        new java.lang.String[] { "TargetProbability", "Lable", "Positions", });
    internal_static_TaskData_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_TaskData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TaskData_descriptor,
        new java.lang.String[] { "Tid", "Type", "VideoType", "DemoParam", "Interval", "TargetNumbers", "PipeData", "CordonDatas", "FocusData", "HistoryImages", "VideoUrl", "OutUrl", "Lines", });
    internal_static_ChangeDetectResult_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_ChangeDetectResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ChangeDetectResult_descriptor,
        new java.lang.String[] { "Changes", "HistoryUrl", "Image", });
    internal_static_TargetDetectResult_descriptor =
      getDescriptor().getMessageTypes().get(16);
    internal_static_TargetDetectResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TargetDetectResult_descriptor,
        new java.lang.String[] { "Targets", "OriginImage", "MarkedImage", });
    internal_static_BigImageResult_descriptor =
      getDescriptor().getMessageTypes().get(17);
    internal_static_BigImageResult_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BigImageResult_descriptor,
        new java.lang.String[] { "LineNumber", "LineName", "ImageData", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
