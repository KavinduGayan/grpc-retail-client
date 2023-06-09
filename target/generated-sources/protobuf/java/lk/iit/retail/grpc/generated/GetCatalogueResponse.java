// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RetailService.proto

package lk.iit.retail.grpc.generated;

/**
 * Protobuf type {@code lk.iit.retail.grpc.generated.GetCatalogueResponse}
 */
public final class GetCatalogueResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lk.iit.retail.grpc.generated.GetCatalogueResponse)
    GetCatalogueResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetCatalogueResponse.newBuilder() to construct.
  private GetCatalogueResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetCatalogueResponse() {
    catalogues_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetCatalogueResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetCatalogueResponse(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              catalogues_ = new java.util.ArrayList<lk.iit.retail.grpc.generated.Catalogue>();
              mutable_bitField0_ |= 0x00000001;
            }
            catalogues_.add(
                input.readMessage(lk.iit.retail.grpc.generated.Catalogue.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        catalogues_ = java.util.Collections.unmodifiableList(catalogues_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            lk.iit.retail.grpc.generated.GetCatalogueResponse.class, lk.iit.retail.grpc.generated.GetCatalogueResponse.Builder.class);
  }

  public static final int CATALOGUES_FIELD_NUMBER = 1;
  private java.util.List<lk.iit.retail.grpc.generated.Catalogue> catalogues_;
  /**
   * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
   */
  @java.lang.Override
  public java.util.List<lk.iit.retail.grpc.generated.Catalogue> getCataloguesList() {
    return catalogues_;
  }
  /**
   * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends lk.iit.retail.grpc.generated.CatalogueOrBuilder> 
      getCataloguesOrBuilderList() {
    return catalogues_;
  }
  /**
   * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
   */
  @java.lang.Override
  public int getCataloguesCount() {
    return catalogues_.size();
  }
  /**
   * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
   */
  @java.lang.Override
  public lk.iit.retail.grpc.generated.Catalogue getCatalogues(int index) {
    return catalogues_.get(index);
  }
  /**
   * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
   */
  @java.lang.Override
  public lk.iit.retail.grpc.generated.CatalogueOrBuilder getCataloguesOrBuilder(
      int index) {
    return catalogues_.get(index);
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
    for (int i = 0; i < catalogues_.size(); i++) {
      output.writeMessage(1, catalogues_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < catalogues_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, catalogues_.get(i));
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
    if (!(obj instanceof lk.iit.retail.grpc.generated.GetCatalogueResponse)) {
      return super.equals(obj);
    }
    lk.iit.retail.grpc.generated.GetCatalogueResponse other = (lk.iit.retail.grpc.generated.GetCatalogueResponse) obj;

    if (!getCataloguesList()
        .equals(other.getCataloguesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getCataloguesCount() > 0) {
      hash = (37 * hash) + CATALOGUES_FIELD_NUMBER;
      hash = (53 * hash) + getCataloguesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static lk.iit.retail.grpc.generated.GetCatalogueResponse parseFrom(
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
  public static Builder newBuilder(lk.iit.retail.grpc.generated.GetCatalogueResponse prototype) {
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
   * Protobuf type {@code lk.iit.retail.grpc.generated.GetCatalogueResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lk.iit.retail.grpc.generated.GetCatalogueResponse)
      lk.iit.retail.grpc.generated.GetCatalogueResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              lk.iit.retail.grpc.generated.GetCatalogueResponse.class, lk.iit.retail.grpc.generated.GetCatalogueResponse.Builder.class);
    }

    // Construct using lk.iit.retail.grpc.generated.GetCatalogueResponse.newBuilder()
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
        getCataloguesFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cataloguesBuilder_ == null) {
        catalogues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        cataloguesBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return lk.iit.retail.grpc.generated.RetailService.internal_static_lk_iit_retail_grpc_generated_GetCatalogueResponse_descriptor;
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.GetCatalogueResponse getDefaultInstanceForType() {
      return lk.iit.retail.grpc.generated.GetCatalogueResponse.getDefaultInstance();
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.GetCatalogueResponse build() {
      lk.iit.retail.grpc.generated.GetCatalogueResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public lk.iit.retail.grpc.generated.GetCatalogueResponse buildPartial() {
      lk.iit.retail.grpc.generated.GetCatalogueResponse result = new lk.iit.retail.grpc.generated.GetCatalogueResponse(this);
      int from_bitField0_ = bitField0_;
      if (cataloguesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          catalogues_ = java.util.Collections.unmodifiableList(catalogues_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.catalogues_ = catalogues_;
      } else {
        result.catalogues_ = cataloguesBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof lk.iit.retail.grpc.generated.GetCatalogueResponse) {
        return mergeFrom((lk.iit.retail.grpc.generated.GetCatalogueResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(lk.iit.retail.grpc.generated.GetCatalogueResponse other) {
      if (other == lk.iit.retail.grpc.generated.GetCatalogueResponse.getDefaultInstance()) return this;
      if (cataloguesBuilder_ == null) {
        if (!other.catalogues_.isEmpty()) {
          if (catalogues_.isEmpty()) {
            catalogues_ = other.catalogues_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCataloguesIsMutable();
            catalogues_.addAll(other.catalogues_);
          }
          onChanged();
        }
      } else {
        if (!other.catalogues_.isEmpty()) {
          if (cataloguesBuilder_.isEmpty()) {
            cataloguesBuilder_.dispose();
            cataloguesBuilder_ = null;
            catalogues_ = other.catalogues_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cataloguesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCataloguesFieldBuilder() : null;
          } else {
            cataloguesBuilder_.addAllMessages(other.catalogues_);
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
      lk.iit.retail.grpc.generated.GetCatalogueResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (lk.iit.retail.grpc.generated.GetCatalogueResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<lk.iit.retail.grpc.generated.Catalogue> catalogues_ =
      java.util.Collections.emptyList();
    private void ensureCataloguesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        catalogues_ = new java.util.ArrayList<lk.iit.retail.grpc.generated.Catalogue>(catalogues_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        lk.iit.retail.grpc.generated.Catalogue, lk.iit.retail.grpc.generated.Catalogue.Builder, lk.iit.retail.grpc.generated.CatalogueOrBuilder> cataloguesBuilder_;

    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public java.util.List<lk.iit.retail.grpc.generated.Catalogue> getCataloguesList() {
      if (cataloguesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(catalogues_);
      } else {
        return cataloguesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public int getCataloguesCount() {
      if (cataloguesBuilder_ == null) {
        return catalogues_.size();
      } else {
        return cataloguesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public lk.iit.retail.grpc.generated.Catalogue getCatalogues(int index) {
      if (cataloguesBuilder_ == null) {
        return catalogues_.get(index);
      } else {
        return cataloguesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder setCatalogues(
        int index, lk.iit.retail.grpc.generated.Catalogue value) {
      if (cataloguesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCataloguesIsMutable();
        catalogues_.set(index, value);
        onChanged();
      } else {
        cataloguesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder setCatalogues(
        int index, lk.iit.retail.grpc.generated.Catalogue.Builder builderForValue) {
      if (cataloguesBuilder_ == null) {
        ensureCataloguesIsMutable();
        catalogues_.set(index, builderForValue.build());
        onChanged();
      } else {
        cataloguesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder addCatalogues(lk.iit.retail.grpc.generated.Catalogue value) {
      if (cataloguesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCataloguesIsMutable();
        catalogues_.add(value);
        onChanged();
      } else {
        cataloguesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder addCatalogues(
        int index, lk.iit.retail.grpc.generated.Catalogue value) {
      if (cataloguesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCataloguesIsMutable();
        catalogues_.add(index, value);
        onChanged();
      } else {
        cataloguesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder addCatalogues(
        lk.iit.retail.grpc.generated.Catalogue.Builder builderForValue) {
      if (cataloguesBuilder_ == null) {
        ensureCataloguesIsMutable();
        catalogues_.add(builderForValue.build());
        onChanged();
      } else {
        cataloguesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder addCatalogues(
        int index, lk.iit.retail.grpc.generated.Catalogue.Builder builderForValue) {
      if (cataloguesBuilder_ == null) {
        ensureCataloguesIsMutable();
        catalogues_.add(index, builderForValue.build());
        onChanged();
      } else {
        cataloguesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder addAllCatalogues(
        java.lang.Iterable<? extends lk.iit.retail.grpc.generated.Catalogue> values) {
      if (cataloguesBuilder_ == null) {
        ensureCataloguesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, catalogues_);
        onChanged();
      } else {
        cataloguesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder clearCatalogues() {
      if (cataloguesBuilder_ == null) {
        catalogues_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cataloguesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public Builder removeCatalogues(int index) {
      if (cataloguesBuilder_ == null) {
        ensureCataloguesIsMutable();
        catalogues_.remove(index);
        onChanged();
      } else {
        cataloguesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public lk.iit.retail.grpc.generated.Catalogue.Builder getCataloguesBuilder(
        int index) {
      return getCataloguesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public lk.iit.retail.grpc.generated.CatalogueOrBuilder getCataloguesOrBuilder(
        int index) {
      if (cataloguesBuilder_ == null) {
        return catalogues_.get(index);  } else {
        return cataloguesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public java.util.List<? extends lk.iit.retail.grpc.generated.CatalogueOrBuilder> 
         getCataloguesOrBuilderList() {
      if (cataloguesBuilder_ != null) {
        return cataloguesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(catalogues_);
      }
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public lk.iit.retail.grpc.generated.Catalogue.Builder addCataloguesBuilder() {
      return getCataloguesFieldBuilder().addBuilder(
          lk.iit.retail.grpc.generated.Catalogue.getDefaultInstance());
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public lk.iit.retail.grpc.generated.Catalogue.Builder addCataloguesBuilder(
        int index) {
      return getCataloguesFieldBuilder().addBuilder(
          index, lk.iit.retail.grpc.generated.Catalogue.getDefaultInstance());
    }
    /**
     * <code>repeated .lk.iit.retail.grpc.generated.Catalogue catalogues = 1;</code>
     */
    public java.util.List<lk.iit.retail.grpc.generated.Catalogue.Builder> 
         getCataloguesBuilderList() {
      return getCataloguesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        lk.iit.retail.grpc.generated.Catalogue, lk.iit.retail.grpc.generated.Catalogue.Builder, lk.iit.retail.grpc.generated.CatalogueOrBuilder> 
        getCataloguesFieldBuilder() {
      if (cataloguesBuilder_ == null) {
        cataloguesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            lk.iit.retail.grpc.generated.Catalogue, lk.iit.retail.grpc.generated.Catalogue.Builder, lk.iit.retail.grpc.generated.CatalogueOrBuilder>(
                catalogues_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        catalogues_ = null;
      }
      return cataloguesBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:lk.iit.retail.grpc.generated.GetCatalogueResponse)
  }

  // @@protoc_insertion_point(class_scope:lk.iit.retail.grpc.generated.GetCatalogueResponse)
  private static final lk.iit.retail.grpc.generated.GetCatalogueResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new lk.iit.retail.grpc.generated.GetCatalogueResponse();
  }

  public static lk.iit.retail.grpc.generated.GetCatalogueResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetCatalogueResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetCatalogueResponse>() {
    @java.lang.Override
    public GetCatalogueResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetCatalogueResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetCatalogueResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetCatalogueResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public lk.iit.retail.grpc.generated.GetCatalogueResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

