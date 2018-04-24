// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kythe/proto/explore.proto

package com.google.devtools.kythe.proto;

public interface GraphOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kythe.proto.Graph)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */
  int getNodesCount();
  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */
  boolean containsNodes(
      java.lang.String key);
  /**
   * Use {@link #getNodesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode>
  getNodes();
  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.devtools.kythe.proto.GraphNode>
  getNodesMap();
  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */

  com.google.devtools.kythe.proto.GraphNode getNodesOrDefault(
      java.lang.String key,
      com.google.devtools.kythe.proto.GraphNode defaultValue);
  /**
   * <pre>
   * semantic ticket -&gt; node/topology data
   * </pre>
   *
   * <code>map&lt;string, .kythe.proto.GraphNode&gt; nodes = 1;</code>
   */

  com.google.devtools.kythe.proto.GraphNode getNodesOrThrow(
      java.lang.String key);
}