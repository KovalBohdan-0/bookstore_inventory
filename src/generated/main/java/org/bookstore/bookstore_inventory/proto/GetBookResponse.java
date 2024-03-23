// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book_service.proto

// Protobuf Java Version: 3.25.3
package org.bookstore.bookstore_inventory.proto;

/**
 * Protobuf type {@code org.bookstore.bookstore_inventory.proto.GetBookResponse}
 */
public final class GetBookResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.bookstore.bookstore_inventory.proto.GetBookResponse)
    GetBookResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetBookResponse.newBuilder() to construct.
  private GetBookResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetBookResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetBookResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.bookstore.bookstore_inventory.proto.BookServiceProto.internal_static_org_bookstore_bookstore_inventory_proto_GetBookResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.bookstore.bookstore_inventory.proto.BookServiceProto.internal_static_org_bookstore_bookstore_inventory_proto_GetBookResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.bookstore.bookstore_inventory.proto.GetBookResponse.class, org.bookstore.bookstore_inventory.proto.GetBookResponse.Builder.class);
  }

  private int responseCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object response_;
  public enum ResponseCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    BOOK(1),
    ERROR(2),
    RESPONSE_NOT_SET(0);
    private final int value;
    private ResponseCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ResponseCase valueOf(int value) {
      return forNumber(value);
    }

    public static ResponseCase forNumber(int value) {
      switch (value) {
        case 1: return BOOK;
        case 2: return ERROR;
        case 0: return RESPONSE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ResponseCase
  getResponseCase() {
    return ResponseCase.forNumber(
        responseCase_);
  }

  public static final int BOOK_FIELD_NUMBER = 1;
  /**
   * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
   * @return Whether the book field is set.
   */
  @java.lang.Override
  public boolean hasBook() {
    return responseCase_ == 1;
  }
  /**
   * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
   * @return The book.
   */
  @java.lang.Override
  public org.bookstore.bookstore_inventory.proto.Book getBook() {
    if (responseCase_ == 1) {
       return (org.bookstore.bookstore_inventory.proto.Book) response_;
    }
    return org.bookstore.bookstore_inventory.proto.Book.getDefaultInstance();
  }
  /**
   * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
   */
  @java.lang.Override
  public org.bookstore.bookstore_inventory.proto.BookOrBuilder getBookOrBuilder() {
    if (responseCase_ == 1) {
       return (org.bookstore.bookstore_inventory.proto.Book) response_;
    }
    return org.bookstore.bookstore_inventory.proto.Book.getDefaultInstance();
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  /**
   * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
   * @return Whether the error field is set.
   */
  @java.lang.Override
  public boolean hasError() {
    return responseCase_ == 2;
  }
  /**
   * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
   * @return The error.
   */
  @java.lang.Override
  public org.bookstore.bookstore_inventory.proto.Error getError() {
    if (responseCase_ == 2) {
       return (org.bookstore.bookstore_inventory.proto.Error) response_;
    }
    return org.bookstore.bookstore_inventory.proto.Error.getDefaultInstance();
  }
  /**
   * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
   */
  @java.lang.Override
  public org.bookstore.bookstore_inventory.proto.ErrorOrBuilder getErrorOrBuilder() {
    if (responseCase_ == 2) {
       return (org.bookstore.bookstore_inventory.proto.Error) response_;
    }
    return org.bookstore.bookstore_inventory.proto.Error.getDefaultInstance();
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
    if (responseCase_ == 1) {
      output.writeMessage(1, (org.bookstore.bookstore_inventory.proto.Book) response_);
    }
    if (responseCase_ == 2) {
      output.writeMessage(2, (org.bookstore.bookstore_inventory.proto.Error) response_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (responseCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.bookstore.bookstore_inventory.proto.Book) response_);
    }
    if (responseCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.bookstore.bookstore_inventory.proto.Error) response_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.bookstore.bookstore_inventory.proto.GetBookResponse)) {
      return super.equals(obj);
    }
    org.bookstore.bookstore_inventory.proto.GetBookResponse other = (org.bookstore.bookstore_inventory.proto.GetBookResponse) obj;

    if (!getResponseCase().equals(other.getResponseCase())) return false;
    switch (responseCase_) {
      case 1:
        if (!getBook()
            .equals(other.getBook())) return false;
        break;
      case 2:
        if (!getError()
            .equals(other.getError())) return false;
        break;
      case 0:
      default:
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (responseCase_) {
      case 1:
        hash = (37 * hash) + BOOK_FIELD_NUMBER;
        hash = (53 * hash) + getBook().hashCode();
        break;
      case 2:
        hash = (37 * hash) + ERROR_FIELD_NUMBER;
        hash = (53 * hash) + getError().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.bookstore.bookstore_inventory.proto.GetBookResponse parseFrom(
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
  public static Builder newBuilder(org.bookstore.bookstore_inventory.proto.GetBookResponse prototype) {
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
   * Protobuf type {@code org.bookstore.bookstore_inventory.proto.GetBookResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.bookstore.bookstore_inventory.proto.GetBookResponse)
      org.bookstore.bookstore_inventory.proto.GetBookResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.bookstore.bookstore_inventory.proto.BookServiceProto.internal_static_org_bookstore_bookstore_inventory_proto_GetBookResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.bookstore.bookstore_inventory.proto.BookServiceProto.internal_static_org_bookstore_bookstore_inventory_proto_GetBookResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.bookstore.bookstore_inventory.proto.GetBookResponse.class, org.bookstore.bookstore_inventory.proto.GetBookResponse.Builder.class);
    }

    // Construct using org.bookstore.bookstore_inventory.proto.GetBookResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (bookBuilder_ != null) {
        bookBuilder_.clear();
      }
      if (errorBuilder_ != null) {
        errorBuilder_.clear();
      }
      responseCase_ = 0;
      response_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.bookstore.bookstore_inventory.proto.BookServiceProto.internal_static_org_bookstore_bookstore_inventory_proto_GetBookResponse_descriptor;
    }

    @java.lang.Override
    public org.bookstore.bookstore_inventory.proto.GetBookResponse getDefaultInstanceForType() {
      return org.bookstore.bookstore_inventory.proto.GetBookResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.bookstore.bookstore_inventory.proto.GetBookResponse build() {
      org.bookstore.bookstore_inventory.proto.GetBookResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.bookstore.bookstore_inventory.proto.GetBookResponse buildPartial() {
      org.bookstore.bookstore_inventory.proto.GetBookResponse result = new org.bookstore.bookstore_inventory.proto.GetBookResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.bookstore.bookstore_inventory.proto.GetBookResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.bookstore.bookstore_inventory.proto.GetBookResponse result) {
      result.responseCase_ = responseCase_;
      result.response_ = this.response_;
      if (responseCase_ == 1 &&
          bookBuilder_ != null) {
        result.response_ = bookBuilder_.build();
      }
      if (responseCase_ == 2 &&
          errorBuilder_ != null) {
        result.response_ = errorBuilder_.build();
      }
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
      if (other instanceof org.bookstore.bookstore_inventory.proto.GetBookResponse) {
        return mergeFrom((org.bookstore.bookstore_inventory.proto.GetBookResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.bookstore.bookstore_inventory.proto.GetBookResponse other) {
      if (other == org.bookstore.bookstore_inventory.proto.GetBookResponse.getDefaultInstance()) return this;
      switch (other.getResponseCase()) {
        case BOOK: {
          mergeBook(other.getBook());
          break;
        }
        case ERROR: {
          mergeError(other.getError());
          break;
        }
        case RESPONSE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getBookFieldBuilder().getBuilder(),
                  extensionRegistry);
              responseCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getErrorFieldBuilder().getBuilder(),
                  extensionRegistry);
              responseCase_ = 2;
              break;
            } // case 18
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int responseCase_ = 0;
    private java.lang.Object response_;
    public ResponseCase
        getResponseCase() {
      return ResponseCase.forNumber(
          responseCase_);
    }

    public Builder clearResponse() {
      responseCase_ = 0;
      response_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        org.bookstore.bookstore_inventory.proto.Book, org.bookstore.bookstore_inventory.proto.Book.Builder, org.bookstore.bookstore_inventory.proto.BookOrBuilder> bookBuilder_;
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     * @return Whether the book field is set.
     */
    @java.lang.Override
    public boolean hasBook() {
      return responseCase_ == 1;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     * @return The book.
     */
    @java.lang.Override
    public org.bookstore.bookstore_inventory.proto.Book getBook() {
      if (bookBuilder_ == null) {
        if (responseCase_ == 1) {
          return (org.bookstore.bookstore_inventory.proto.Book) response_;
        }
        return org.bookstore.bookstore_inventory.proto.Book.getDefaultInstance();
      } else {
        if (responseCase_ == 1) {
          return bookBuilder_.getMessage();
        }
        return org.bookstore.bookstore_inventory.proto.Book.getDefaultInstance();
      }
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     */
    public Builder setBook(org.bookstore.bookstore_inventory.proto.Book value) {
      if (bookBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        bookBuilder_.setMessage(value);
      }
      responseCase_ = 1;
      return this;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     */
    public Builder setBook(
        org.bookstore.bookstore_inventory.proto.Book.Builder builderForValue) {
      if (bookBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        bookBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 1;
      return this;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     */
    public Builder mergeBook(org.bookstore.bookstore_inventory.proto.Book value) {
      if (bookBuilder_ == null) {
        if (responseCase_ == 1 &&
            response_ != org.bookstore.bookstore_inventory.proto.Book.getDefaultInstance()) {
          response_ = org.bookstore.bookstore_inventory.proto.Book.newBuilder((org.bookstore.bookstore_inventory.proto.Book) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 1) {
          bookBuilder_.mergeFrom(value);
        } else {
          bookBuilder_.setMessage(value);
        }
      }
      responseCase_ = 1;
      return this;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     */
    public Builder clearBook() {
      if (bookBuilder_ == null) {
        if (responseCase_ == 1) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 1) {
          responseCase_ = 0;
          response_ = null;
        }
        bookBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     */
    public org.bookstore.bookstore_inventory.proto.Book.Builder getBookBuilder() {
      return getBookFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     */
    @java.lang.Override
    public org.bookstore.bookstore_inventory.proto.BookOrBuilder getBookOrBuilder() {
      if ((responseCase_ == 1) && (bookBuilder_ != null)) {
        return bookBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 1) {
          return (org.bookstore.bookstore_inventory.proto.Book) response_;
        }
        return org.bookstore.bookstore_inventory.proto.Book.getDefaultInstance();
      }
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Book book = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.bookstore.bookstore_inventory.proto.Book, org.bookstore.bookstore_inventory.proto.Book.Builder, org.bookstore.bookstore_inventory.proto.BookOrBuilder> 
        getBookFieldBuilder() {
      if (bookBuilder_ == null) {
        if (!(responseCase_ == 1)) {
          response_ = org.bookstore.bookstore_inventory.proto.Book.getDefaultInstance();
        }
        bookBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.bookstore.bookstore_inventory.proto.Book, org.bookstore.bookstore_inventory.proto.Book.Builder, org.bookstore.bookstore_inventory.proto.BookOrBuilder>(
                (org.bookstore.bookstore_inventory.proto.Book) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 1;
      onChanged();
      return bookBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.bookstore.bookstore_inventory.proto.Error, org.bookstore.bookstore_inventory.proto.Error.Builder, org.bookstore.bookstore_inventory.proto.ErrorOrBuilder> errorBuilder_;
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     * @return Whether the error field is set.
     */
    @java.lang.Override
    public boolean hasError() {
      return responseCase_ == 2;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     * @return The error.
     */
    @java.lang.Override
    public org.bookstore.bookstore_inventory.proto.Error getError() {
      if (errorBuilder_ == null) {
        if (responseCase_ == 2) {
          return (org.bookstore.bookstore_inventory.proto.Error) response_;
        }
        return org.bookstore.bookstore_inventory.proto.Error.getDefaultInstance();
      } else {
        if (responseCase_ == 2) {
          return errorBuilder_.getMessage();
        }
        return org.bookstore.bookstore_inventory.proto.Error.getDefaultInstance();
      }
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     */
    public Builder setError(org.bookstore.bookstore_inventory.proto.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     */
    public Builder setError(
        org.bookstore.bookstore_inventory.proto.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        response_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     */
    public Builder mergeError(org.bookstore.bookstore_inventory.proto.Error value) {
      if (errorBuilder_ == null) {
        if (responseCase_ == 2 &&
            response_ != org.bookstore.bookstore_inventory.proto.Error.getDefaultInstance()) {
          response_ = org.bookstore.bookstore_inventory.proto.Error.newBuilder((org.bookstore.bookstore_inventory.proto.Error) response_)
              .mergeFrom(value).buildPartial();
        } else {
          response_ = value;
        }
        onChanged();
      } else {
        if (responseCase_ == 2) {
          errorBuilder_.mergeFrom(value);
        } else {
          errorBuilder_.setMessage(value);
        }
      }
      responseCase_ = 2;
      return this;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        if (responseCase_ == 2) {
          responseCase_ = 0;
          response_ = null;
          onChanged();
        }
      } else {
        if (responseCase_ == 2) {
          responseCase_ = 0;
          response_ = null;
        }
        errorBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     */
    public org.bookstore.bookstore_inventory.proto.Error.Builder getErrorBuilder() {
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     */
    @java.lang.Override
    public org.bookstore.bookstore_inventory.proto.ErrorOrBuilder getErrorOrBuilder() {
      if ((responseCase_ == 2) && (errorBuilder_ != null)) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        if (responseCase_ == 2) {
          return (org.bookstore.bookstore_inventory.proto.Error) response_;
        }
        return org.bookstore.bookstore_inventory.proto.Error.getDefaultInstance();
      }
    }
    /**
     * <code>.org.bookstore.bookstore_inventory.proto.Error error = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.bookstore.bookstore_inventory.proto.Error, org.bookstore.bookstore_inventory.proto.Error.Builder, org.bookstore.bookstore_inventory.proto.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        if (!(responseCase_ == 2)) {
          response_ = org.bookstore.bookstore_inventory.proto.Error.getDefaultInstance();
        }
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.bookstore.bookstore_inventory.proto.Error, org.bookstore.bookstore_inventory.proto.Error.Builder, org.bookstore.bookstore_inventory.proto.ErrorOrBuilder>(
                (org.bookstore.bookstore_inventory.proto.Error) response_,
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      responseCase_ = 2;
      onChanged();
      return errorBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.bookstore.bookstore_inventory.proto.GetBookResponse)
  }

  // @@protoc_insertion_point(class_scope:org.bookstore.bookstore_inventory.proto.GetBookResponse)
  private static final org.bookstore.bookstore_inventory.proto.GetBookResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.bookstore.bookstore_inventory.proto.GetBookResponse();
  }

  public static org.bookstore.bookstore_inventory.proto.GetBookResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetBookResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetBookResponse>() {
    @java.lang.Override
    public GetBookResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<GetBookResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetBookResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.bookstore.bookstore_inventory.proto.GetBookResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
