// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: maths.proto

package ds.examples.maths;

public interface CalculateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:maths.CalculateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float number1 = 1;</code>
   */
  float getNumber1();

  /**
   * <code>float number2 = 2;</code>
   */
  float getNumber2();

  /**
   * <code>.maths.CalculateRequest.Operation operation = 3;</code>
   */
  int getOperationValue();
  /**
   * <code>.maths.CalculateRequest.Operation operation = 3;</code>
   */
  ds.examples.maths.CalculateRequest.Operation getOperation();
}
