// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/channelz/v1/channelz.proto

package io.grpc.channelz.v1;

public interface ChannelRefOrBuilder extends
    // @@protoc_insertion_point(interface_extends:grpc.channelz.v1.ChannelRef)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The globally unique id for this channel.  Must be a positive number.
   * </pre>
   *
   * <code>int64 channel_id = 1;</code>
   */
  long getChannelId();

  /**
   * <pre>
   * An optional name associated with the channel.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * An optional name associated with the channel.
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
