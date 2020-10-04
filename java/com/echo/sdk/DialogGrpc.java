package com.echo.sdk;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.25.0)",
    comments = "Source: dialog.proto")
public final class DialogGrpc {

  private DialogGrpc() {}

  public static final String SERVICE_NAME = "proto.Dialog";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.echo.sdk.DialogProto.Detect,
      com.echo.sdk.DialogProto.Intent> getDetectIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectIntent",
      requestType = com.echo.sdk.DialogProto.Detect.class,
      responseType = com.echo.sdk.DialogProto.Intent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.echo.sdk.DialogProto.Detect,
      com.echo.sdk.DialogProto.Intent> getDetectIntentMethod() {
    io.grpc.MethodDescriptor<com.echo.sdk.DialogProto.Detect, com.echo.sdk.DialogProto.Intent> getDetectIntentMethod;
    if ((getDetectIntentMethod = DialogGrpc.getDetectIntentMethod) == null) {
      synchronized (DialogGrpc.class) {
        if ((getDetectIntentMethod = DialogGrpc.getDetectIntentMethod) == null) {
          DialogGrpc.getDetectIntentMethod = getDetectIntentMethod =
              io.grpc.MethodDescriptor.<com.echo.sdk.DialogProto.Detect, com.echo.sdk.DialogProto.Intent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetectIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.sdk.DialogProto.Detect.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.sdk.DialogProto.Intent.getDefaultInstance()))
              .setSchemaDescriptor(new DialogMethodDescriptorSupplier("DetectIntent"))
              .build();
        }
      }
    }
    return getDetectIntentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DialogStub newStub(io.grpc.Channel channel) {
    return new DialogStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DialogBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DialogBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DialogFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DialogFutureStub(channel);
  }

  /**
   */
  public static abstract class DialogImplBase implements io.grpc.BindableService {

    /**
     */
    public void detectIntent(com.echo.sdk.DialogProto.Detect request,
        io.grpc.stub.StreamObserver<com.echo.sdk.DialogProto.Intent> responseObserver) {
      asyncUnimplementedUnaryCall(getDetectIntentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDetectIntentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.echo.sdk.DialogProto.Detect,
                com.echo.sdk.DialogProto.Intent>(
                  this, METHODID_DETECT_INTENT)))
          .build();
    }
  }

  /**
   */
  public static final class DialogStub extends io.grpc.stub.AbstractStub<DialogStub> {
    private DialogStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DialogStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DialogStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DialogStub(channel, callOptions);
    }

    /**
     */
    public void detectIntent(com.echo.sdk.DialogProto.Detect request,
        io.grpc.stub.StreamObserver<com.echo.sdk.DialogProto.Intent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectIntentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DialogBlockingStub extends io.grpc.stub.AbstractStub<DialogBlockingStub> {
    private DialogBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DialogBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DialogBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DialogBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.echo.sdk.DialogProto.Intent detectIntent(com.echo.sdk.DialogProto.Detect request) {
      return blockingUnaryCall(
          getChannel(), getDetectIntentMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DialogFutureStub extends io.grpc.stub.AbstractStub<DialogFutureStub> {
    private DialogFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DialogFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DialogFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DialogFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.echo.sdk.DialogProto.Intent> detectIntent(
        com.echo.sdk.DialogProto.Detect request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectIntentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT_INTENT = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DialogImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DialogImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECT_INTENT:
          serviceImpl.detectIntent((com.echo.sdk.DialogProto.Detect) request,
              (io.grpc.stub.StreamObserver<com.echo.sdk.DialogProto.Intent>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DialogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DialogBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.echo.sdk.DialogProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Dialog");
    }
  }

  private static final class DialogFileDescriptorSupplier
      extends DialogBaseDescriptorSupplier {
    DialogFileDescriptorSupplier() {}
  }

  private static final class DialogMethodDescriptorSupplier
      extends DialogBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DialogMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DialogGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DialogFileDescriptorSupplier())
              .addMethod(getDetectIntentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
