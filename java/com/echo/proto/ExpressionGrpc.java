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
    comments = "Source: expression.proto")
public final class ExpressionGrpc {

  private ExpressionGrpc() {}

  public static final String SERVICE_NAME = "proto.Expression";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.echo.proto.ExpressionProto.StreamSource,
      com.echo.proto.AudioProto.AudioSample> getAudioStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AudioStream",
      requestType = com.echo.proto.ExpressionProto.StreamSource.class,
      responseType = com.echo.proto.AudioProto.AudioSample.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.echo.proto.ExpressionProto.StreamSource,
      com.echo.proto.AudioProto.AudioSample> getAudioStreamMethod() {
    io.grpc.MethodDescriptor<com.echo.proto.ExpressionProto.StreamSource, com.echo.proto.AudioProto.AudioSample> getAudioStreamMethod;
    if ((getAudioStreamMethod = ExpressionGrpc.getAudioStreamMethod) == null) {
      synchronized (ExpressionGrpc.class) {
        if ((getAudioStreamMethod = ExpressionGrpc.getAudioStreamMethod) == null) {
          ExpressionGrpc.getAudioStreamMethod = getAudioStreamMethod =
              io.grpc.MethodDescriptor.<com.echo.proto.ExpressionProto.StreamSource, com.echo.proto.AudioProto.AudioSample>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AudioStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.ExpressionProto.StreamSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.AudioProto.AudioSample.getDefaultInstance()))
              .setSchemaDescriptor(new ExpressionMethodDescriptorSupplier("AudioStream"))
              .build();
        }
      }
    }
    return getAudioStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExpressionStub newStub(io.grpc.Channel channel) {
    return new ExpressionStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ExpressionBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ExpressionBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExpressionFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ExpressionFutureStub(channel);
  }

  /**
   */
  public static abstract class ExpressionImplBase implements io.grpc.BindableService {

    /**
     */
    public void audioStream(com.echo.proto.ExpressionProto.StreamSource request,
        io.grpc.stub.StreamObserver<com.echo.proto.AudioProto.AudioSample> responseObserver) {
      asyncUnimplementedUnaryCall(getAudioStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAudioStreamMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                com.echo.proto.ExpressionProto.StreamSource,
                com.echo.proto.AudioProto.AudioSample>(
                  this, METHODID_AUDIO_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class ExpressionStub extends io.grpc.stub.AbstractStub<ExpressionStub> {
    private ExpressionStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExpressionStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExpressionStub(channel, callOptions);
    }

    /**
     */
    public void audioStream(com.echo.proto.ExpressionProto.StreamSource request,
        io.grpc.stub.StreamObserver<com.echo.proto.AudioProto.AudioSample> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getAudioStreamMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ExpressionBlockingStub extends io.grpc.stub.AbstractStub<ExpressionBlockingStub> {
    private ExpressionBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExpressionBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExpressionBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.echo.proto.AudioProto.AudioSample> audioStream(
        com.echo.proto.ExpressionProto.StreamSource request) {
      return blockingServerStreamingCall(
          getChannel(), getAudioStreamMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ExpressionFutureStub extends io.grpc.stub.AbstractStub<ExpressionFutureStub> {
    private ExpressionFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ExpressionFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExpressionFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExpressionFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_AUDIO_STREAM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ExpressionImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ExpressionImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AUDIO_STREAM:
          serviceImpl.audioStream((com.echo.proto.ExpressionProto.StreamSource) request,
              (io.grpc.stub.StreamObserver<com.echo.proto.AudioProto.AudioSample>) responseObserver);
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

  private static abstract class ExpressionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ExpressionBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.echo.proto.ExpressionProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Expression");
    }
  }

  private static final class ExpressionFileDescriptorSupplier
      extends ExpressionBaseDescriptorSupplier {
    ExpressionFileDescriptorSupplier() {}
  }

  private static final class ExpressionMethodDescriptorSupplier
      extends ExpressionBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ExpressionMethodDescriptorSupplier(String methodName) {
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
      synchronized (ExpressionGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExpressionFileDescriptorSupplier())
              .addMethod(getAudioStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
