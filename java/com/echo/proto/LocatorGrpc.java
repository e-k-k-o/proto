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
    comments = "Source: locator.proto")
public final class LocatorGrpc {

  private LocatorGrpc() {}

  public static final String SERVICE_NAME = "proto.Locator";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity,
      com.google.protobuf.Empty> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = com.echo.proto.EntityProto.Entity.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity,
      com.google.protobuf.Empty> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity, com.google.protobuf.Empty> getRegisterMethod;
    if ((getRegisterMethod = LocatorGrpc.getRegisterMethod) == null) {
      synchronized (LocatorGrpc.class) {
        if ((getRegisterMethod = LocatorGrpc.getRegisterMethod) == null) {
          LocatorGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<com.echo.proto.EntityProto.Entity, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.EntityProto.Entity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LocatorMethodDescriptorSupplier("Register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity,
      com.google.protobuf.Empty> getRemoveMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Remove",
      requestType = com.echo.proto.EntityProto.Entity.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity,
      com.google.protobuf.Empty> getRemoveMethod() {
    io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity, com.google.protobuf.Empty> getRemoveMethod;
    if ((getRemoveMethod = LocatorGrpc.getRemoveMethod) == null) {
      synchronized (LocatorGrpc.class) {
        if ((getRemoveMethod = LocatorGrpc.getRemoveMethod) == null) {
          LocatorGrpc.getRemoveMethod = getRemoveMethod =
              io.grpc.MethodDescriptor.<com.echo.proto.EntityProto.Entity, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Remove"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.EntityProto.Entity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LocatorMethodDescriptorSupplier("Remove"))
              .build();
        }
      }
    }
    return getRemoveMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.echo.proto.LocatorProto.Location,
      com.google.protobuf.Empty> getPingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Ping",
      requestType = com.echo.proto.LocatorProto.Location.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.echo.proto.LocatorProto.Location,
      com.google.protobuf.Empty> getPingMethod() {
    io.grpc.MethodDescriptor<com.echo.proto.LocatorProto.Location, com.google.protobuf.Empty> getPingMethod;
    if ((getPingMethod = LocatorGrpc.getPingMethod) == null) {
      synchronized (LocatorGrpc.class) {
        if ((getPingMethod = LocatorGrpc.getPingMethod) == null) {
          LocatorGrpc.getPingMethod = getPingMethod =
              io.grpc.MethodDescriptor.<com.echo.proto.LocatorProto.Location, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Ping"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.LocatorProto.Location.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new LocatorMethodDescriptorSupplier("Ping"))
              .build();
        }
      }
    }
    return getPingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity,
      com.echo.proto.LocatorProto.Location> getFindMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Find",
      requestType = com.echo.proto.EntityProto.Entity.class,
      responseType = com.echo.proto.LocatorProto.Location.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity,
      com.echo.proto.LocatorProto.Location> getFindMethod() {
    io.grpc.MethodDescriptor<com.echo.proto.EntityProto.Entity, com.echo.proto.LocatorProto.Location> getFindMethod;
    if ((getFindMethod = LocatorGrpc.getFindMethod) == null) {
      synchronized (LocatorGrpc.class) {
        if ((getFindMethod = LocatorGrpc.getFindMethod) == null) {
          LocatorGrpc.getFindMethod = getFindMethod =
              io.grpc.MethodDescriptor.<com.echo.proto.EntityProto.Entity, com.echo.proto.LocatorProto.Location>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Find"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.EntityProto.Entity.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.echo.proto.LocatorProto.Location.getDefaultInstance()))
              .setSchemaDescriptor(new LocatorMethodDescriptorSupplier("Find"))
              .build();
        }
      }
    }
    return getFindMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LocatorStub newStub(io.grpc.Channel channel) {
    return new LocatorStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LocatorBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new LocatorBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LocatorFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new LocatorFutureStub(channel);
  }

  /**
   */
  public static abstract class LocatorImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(com.echo.proto.EntityProto.Entity request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void remove(com.echo.proto.EntityProto.Entity request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getRemoveMethod(), responseObserver);
    }

    /**
     */
    public void ping(com.echo.proto.LocatorProto.Location request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getPingMethod(), responseObserver);
    }

    /**
     */
    public void find(com.echo.proto.EntityProto.Entity request,
        io.grpc.stub.StreamObserver<com.echo.proto.LocatorProto.Location> responseObserver) {
      asyncUnimplementedUnaryCall(getFindMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.echo.proto.EntityProto.Entity,
                com.google.protobuf.Empty>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getRemoveMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.echo.proto.EntityProto.Entity,
                com.google.protobuf.Empty>(
                  this, METHODID_REMOVE)))
          .addMethod(
            getPingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.echo.proto.LocatorProto.Location,
                com.google.protobuf.Empty>(
                  this, METHODID_PING)))
          .addMethod(
            getFindMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.echo.proto.EntityProto.Entity,
                com.echo.proto.LocatorProto.Location>(
                  this, METHODID_FIND)))
          .build();
    }
  }

  /**
   */
  public static final class LocatorStub extends io.grpc.stub.AbstractStub<LocatorStub> {
    private LocatorStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocatorStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocatorStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocatorStub(channel, callOptions);
    }

    /**
     */
    public void register(com.echo.proto.EntityProto.Entity request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void remove(com.echo.proto.EntityProto.Entity request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void ping(com.echo.proto.LocatorProto.Location request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void find(com.echo.proto.EntityProto.Entity request,
        io.grpc.stub.StreamObserver<com.echo.proto.LocatorProto.Location> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LocatorBlockingStub extends io.grpc.stub.AbstractStub<LocatorBlockingStub> {
    private LocatorBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocatorBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocatorBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocatorBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.google.protobuf.Empty register(com.echo.proto.EntityProto.Entity request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty remove(com.echo.proto.EntityProto.Entity request) {
      return blockingUnaryCall(
          getChannel(), getRemoveMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.google.protobuf.Empty ping(com.echo.proto.LocatorProto.Location request) {
      return blockingUnaryCall(
          getChannel(), getPingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.echo.proto.LocatorProto.Location find(com.echo.proto.EntityProto.Entity request) {
      return blockingUnaryCall(
          getChannel(), getFindMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LocatorFutureStub extends io.grpc.stub.AbstractStub<LocatorFutureStub> {
    private LocatorFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private LocatorFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LocatorFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new LocatorFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> register(
        com.echo.proto.EntityProto.Entity request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> remove(
        com.echo.proto.EntityProto.Entity request) {
      return futureUnaryCall(
          getChannel().newCall(getRemoveMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> ping(
        com.echo.proto.LocatorProto.Location request) {
      return futureUnaryCall(
          getChannel().newCall(getPingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.echo.proto.LocatorProto.Location> find(
        com.echo.proto.EntityProto.Entity request) {
      return futureUnaryCall(
          getChannel().newCall(getFindMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_REMOVE = 1;
  private static final int METHODID_PING = 2;
  private static final int METHODID_FIND = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LocatorImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LocatorImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((com.echo.proto.EntityProto.Entity) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_REMOVE:
          serviceImpl.remove((com.echo.proto.EntityProto.Entity) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_PING:
          serviceImpl.ping((com.echo.proto.LocatorProto.Location) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_FIND:
          serviceImpl.find((com.echo.proto.EntityProto.Entity) request,
              (io.grpc.stub.StreamObserver<com.echo.proto.LocatorProto.Location>) responseObserver);
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

  private static abstract class LocatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LocatorBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.echo.proto.LocatorProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Locator");
    }
  }

  private static final class LocatorFileDescriptorSupplier
      extends LocatorBaseDescriptorSupplier {
    LocatorFileDescriptorSupplier() {}
  }

  private static final class LocatorMethodDescriptorSupplier
      extends LocatorBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LocatorMethodDescriptorSupplier(String methodName) {
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
      synchronized (LocatorGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LocatorFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getRemoveMethod())
              .addMethod(getPingMethod())
              .addMethod(getFindMethod())
              .build();
        }
      }
    }
    return result;
  }
}
