package com.echo.proto;

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
  private static volatile io.grpc.MethodDescriptor<com.echo.proto.DialogProto.Detect,
      com.echo.proto.DialogProto.Intent> getDetectTextIntentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectTextIntent",
      requestType = com.echo.proto.DialogProto.Detect.class,
      responseType = com.echo.proto.DialogProto.Intent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.echo.proto.DialogProto.Detect,
      com.echo.proto.DialogProto.Intent> getDetectTextIntentMethod() {
    io.grpc.MethodDescriptor<com.echo.proto.DialogProto.Detect, com.echo.proto.DialogProto.Intent> getDetectTextIntentMethod;
    if ((getDetectTextIntentMethod = DialogGrpc.getDetectTextIntentMethod) == null) {
      synchronized (DialogGrpc.class) {
        if ((getDetectTextIntentMethod = DialogGrpc.getDetectTextIntentMethod) == null) {
          DialogGrpc.getDetectTextIntentMethod = getDetectTextIntentMethod =
              io.grpc.MethodDescriptor.<com.echo.proto.DialogProto.Detect, com.echo.proto.DialogProto.Intent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetectTextIntent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.DialogProto.Detect.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.DialogProto.Intent.getDefaultInstance()))
              .setSchemaDescriptor(new DialogMethodDescriptorSupplier("DetectTextIntent"))
              .build();
        }
      }
    }
    return getDetectTextIntentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.echo.proto.AudioProto.AudioSample,
      com.echo.proto.DialogProto.Intent> getDetectAudioIntentStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DetectAudioIntentStream",
      requestType = com.echo.proto.AudioProto.AudioSample.class,
      responseType = com.echo.proto.DialogProto.Intent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.echo.proto.AudioProto.AudioSample,
      com.echo.proto.DialogProto.Intent> getDetectAudioIntentStreamMethod() {
    io.grpc.MethodDescriptor<com.echo.proto.AudioProto.AudioSample, com.echo.proto.DialogProto.Intent> getDetectAudioIntentStreamMethod;
    if ((getDetectAudioIntentStreamMethod = DialogGrpc.getDetectAudioIntentStreamMethod) == null) {
      synchronized (DialogGrpc.class) {
        if ((getDetectAudioIntentStreamMethod = DialogGrpc.getDetectAudioIntentStreamMethod) == null) {
          DialogGrpc.getDetectAudioIntentStreamMethod = getDetectAudioIntentStreamMethod =
              io.grpc.MethodDescriptor.<com.echo.proto.AudioProto.AudioSample, com.echo.proto.DialogProto.Intent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DetectAudioIntentStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.AudioProto.AudioSample.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.DialogProto.Intent.getDefaultInstance()))
              .setSchemaDescriptor(new DialogMethodDescriptorSupplier("DetectAudioIntentStream"))
              .build();
        }
      }
    }
    return getDetectAudioIntentStreamMethod;
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
    public void detectTextIntent(com.echo.proto.DialogProto.Detect request,
        io.grpc.stub.StreamObserver<com.echo.proto.DialogProto.Intent> responseObserver) {
      asyncUnimplementedUnaryCall(getDetectTextIntentMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.echo.proto.AudioProto.AudioSample> detectAudioIntentStream(
        io.grpc.stub.StreamObserver<com.echo.proto.DialogProto.Intent> responseObserver) {
      return asyncUnimplementedStreamingCall(getDetectAudioIntentStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDetectTextIntentMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.echo.proto.DialogProto.Detect,
                com.echo.proto.DialogProto.Intent>(
                  this, METHODID_DETECT_TEXT_INTENT)))
          .addMethod(
            getDetectAudioIntentStreamMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                com.echo.proto.AudioProto.AudioSample,
                com.echo.proto.DialogProto.Intent>(
                  this, METHODID_DETECT_AUDIO_INTENT_STREAM)))
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
    public void detectTextIntent(com.echo.proto.DialogProto.Detect request,
        io.grpc.stub.StreamObserver<com.echo.proto.DialogProto.Intent> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDetectTextIntentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.echo.proto.AudioProto.AudioSample> detectAudioIntentStream(
        io.grpc.stub.StreamObserver<com.echo.proto.DialogProto.Intent> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getDetectAudioIntentStreamMethod(), getCallOptions()), responseObserver);
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
    public com.echo.proto.DialogProto.Intent detectTextIntent(com.echo.proto.DialogProto.Detect request) {
      return blockingUnaryCall(
          getChannel(), getDetectTextIntentMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.echo.proto.DialogProto.Intent> detectTextIntent(
        com.echo.proto.DialogProto.Detect request) {
      return futureUnaryCall(
          getChannel().newCall(getDetectTextIntentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DETECT_TEXT_INTENT = 0;
  private static final int METHODID_DETECT_AUDIO_INTENT_STREAM = 1;

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
        case METHODID_DETECT_TEXT_INTENT:
          serviceImpl.detectTextIntent((com.echo.proto.DialogProto.Detect) request,
              (io.grpc.stub.StreamObserver<com.echo.proto.DialogProto.Intent>) responseObserver);
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
        case METHODID_DETECT_AUDIO_INTENT_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.detectAudioIntentStream(
              (io.grpc.stub.StreamObserver<com.echo.proto.DialogProto.Intent>) responseObserver);
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
      return com.echo.proto.DialogProto.getDescriptor();
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
              .addMethod(getDetectTextIntentMethod())
              .addMethod(getDetectAudioIntentStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
