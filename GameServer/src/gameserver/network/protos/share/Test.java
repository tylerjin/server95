// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game/java-share/Test.proto

package gameserver.network.protos.share;

public final class Test {
  private Test() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface Msg_G_Test1OrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code gameserver.network.protos.share.Msg_G_Test1}
   */
  public static final class Msg_G_Test1 extends
      com.google.protobuf.GeneratedMessage
      implements Msg_G_Test1OrBuilder {
    // Use Msg_G_Test1.newBuilder() to construct.
    private Msg_G_Test1(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Msg_G_Test1(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Msg_G_Test1 defaultInstance;
    public static Msg_G_Test1 getDefaultInstance() {
      return defaultInstance;
    }

    public Msg_G_Test1 getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Msg_G_Test1(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
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
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_G_Test1_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_G_Test1_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gameserver.network.protos.share.Test.Msg_G_Test1.class, gameserver.network.protos.share.Test.Msg_G_Test1.Builder.class);
    }

    public static com.google.protobuf.Parser<Msg_G_Test1> PARSER =
        new com.google.protobuf.AbstractParser<Msg_G_Test1>() {
      public Msg_G_Test1 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Msg_G_Test1(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Msg_G_Test1> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gameserver.network.protos.share.Test.Msg_G_Test1 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gameserver.network.protos.share.Test.Msg_G_Test1 prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gameserver.network.protos.share.Msg_G_Test1}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gameserver.network.protos.share.Test.Msg_G_Test1OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_G_Test1_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_G_Test1_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gameserver.network.protos.share.Test.Msg_G_Test1.class, gameserver.network.protos.share.Test.Msg_G_Test1.Builder.class);
      }

      // Construct using gameserver.network.protos.share.Test.Msg_G_Test1.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_G_Test1_descriptor;
      }

      public gameserver.network.protos.share.Test.Msg_G_Test1 getDefaultInstanceForType() {
        return gameserver.network.protos.share.Test.Msg_G_Test1.getDefaultInstance();
      }

      public gameserver.network.protos.share.Test.Msg_G_Test1 build() {
        gameserver.network.protos.share.Test.Msg_G_Test1 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gameserver.network.protos.share.Test.Msg_G_Test1 buildPartial() {
        gameserver.network.protos.share.Test.Msg_G_Test1 result = new gameserver.network.protos.share.Test.Msg_G_Test1(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gameserver.network.protos.share.Test.Msg_G_Test1) {
          return mergeFrom((gameserver.network.protos.share.Test.Msg_G_Test1)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gameserver.network.protos.share.Test.Msg_G_Test1 other) {
        if (other == gameserver.network.protos.share.Test.Msg_G_Test1.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gameserver.network.protos.share.Test.Msg_G_Test1 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gameserver.network.protos.share.Test.Msg_G_Test1) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gameserver.network.protos.share.Msg_G_Test1)
    }

    static {
      defaultInstance = new Msg_G_Test1(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gameserver.network.protos.share.Msg_G_Test1)
  }

  public interface Msg_S_Test2OrBuilder
      extends com.google.protobuf.MessageOrBuilder {
  }
  /**
   * Protobuf type {@code gameserver.network.protos.share.Msg_S_Test2}
   */
  public static final class Msg_S_Test2 extends
      com.google.protobuf.GeneratedMessage
      implements Msg_S_Test2OrBuilder {
    // Use Msg_S_Test2.newBuilder() to construct.
    private Msg_S_Test2(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Msg_S_Test2(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Msg_S_Test2 defaultInstance;
    public static Msg_S_Test2 getDefaultInstance() {
      return defaultInstance;
    }

    public Msg_S_Test2 getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Msg_S_Test2(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
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
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_S_Test2_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_S_Test2_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gameserver.network.protos.share.Test.Msg_S_Test2.class, gameserver.network.protos.share.Test.Msg_S_Test2.Builder.class);
    }

    public static com.google.protobuf.Parser<Msg_S_Test2> PARSER =
        new com.google.protobuf.AbstractParser<Msg_S_Test2>() {
      public Msg_S_Test2 parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Msg_S_Test2(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Msg_S_Test2> getParserForType() {
      return PARSER;
    }

    private void initFields() {
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static gameserver.network.protos.share.Test.Msg_S_Test2 parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(gameserver.network.protos.share.Test.Msg_S_Test2 prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code gameserver.network.protos.share.Msg_S_Test2}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements gameserver.network.protos.share.Test.Msg_S_Test2OrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_S_Test2_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_S_Test2_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                gameserver.network.protos.share.Test.Msg_S_Test2.class, gameserver.network.protos.share.Test.Msg_S_Test2.Builder.class);
      }

      // Construct using gameserver.network.protos.share.Test.Msg_S_Test2.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return gameserver.network.protos.share.Test.internal_static_gameserver_network_protos_share_Msg_S_Test2_descriptor;
      }

      public gameserver.network.protos.share.Test.Msg_S_Test2 getDefaultInstanceForType() {
        return gameserver.network.protos.share.Test.Msg_S_Test2.getDefaultInstance();
      }

      public gameserver.network.protos.share.Test.Msg_S_Test2 build() {
        gameserver.network.protos.share.Test.Msg_S_Test2 result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public gameserver.network.protos.share.Test.Msg_S_Test2 buildPartial() {
        gameserver.network.protos.share.Test.Msg_S_Test2 result = new gameserver.network.protos.share.Test.Msg_S_Test2(this);
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof gameserver.network.protos.share.Test.Msg_S_Test2) {
          return mergeFrom((gameserver.network.protos.share.Test.Msg_S_Test2)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(gameserver.network.protos.share.Test.Msg_S_Test2 other) {
        if (other == gameserver.network.protos.share.Test.Msg_S_Test2.getDefaultInstance()) return this;
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        gameserver.network.protos.share.Test.Msg_S_Test2 parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (gameserver.network.protos.share.Test.Msg_S_Test2) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      // @@protoc_insertion_point(builder_scope:gameserver.network.protos.share.Msg_S_Test2)
    }

    static {
      defaultInstance = new Msg_S_Test2(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:gameserver.network.protos.share.Msg_S_Test2)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gameserver_network_protos_share_Msg_G_Test1_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gameserver_network_protos_share_Msg_G_Test1_fieldAccessorTable;
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_gameserver_network_protos_share_Msg_S_Test2_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_gameserver_network_protos_share_Msg_S_Test2_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032game/java-share/Test.proto\022\037gameserver" +
      ".network.protos.share\"\r\n\013Msg_G_Test1\"\r\n\013" +
      "Msg_S_Test2"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_gameserver_network_protos_share_Msg_G_Test1_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_gameserver_network_protos_share_Msg_G_Test1_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gameserver_network_protos_share_Msg_G_Test1_descriptor,
              new java.lang.String[] { });
          internal_static_gameserver_network_protos_share_Msg_S_Test2_descriptor =
            getDescriptor().getMessageTypes().get(1);
          internal_static_gameserver_network_protos_share_Msg_S_Test2_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_gameserver_network_protos_share_Msg_S_Test2_descriptor,
              new java.lang.String[] { });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
