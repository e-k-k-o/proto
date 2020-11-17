// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package proto

import (
	context "context"
	empty "github.com/golang/protobuf/ptypes/empty"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion7

// LocatorClient is the client API for Locator service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type LocatorClient interface {
	Register(ctx context.Context, in *Entity, opts ...grpc.CallOption) (*empty.Empty, error)
	Remove(ctx context.Context, in *Entity, opts ...grpc.CallOption) (*empty.Empty, error)
	Ping(ctx context.Context, in *Location, opts ...grpc.CallOption) (*empty.Empty, error)
	Find(ctx context.Context, in *Entity, opts ...grpc.CallOption) (*Location, error)
}

type locatorClient struct {
	cc grpc.ClientConnInterface
}

func NewLocatorClient(cc grpc.ClientConnInterface) LocatorClient {
	return &locatorClient{cc}
}

func (c *locatorClient) Register(ctx context.Context, in *Entity, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/proto.Locator/Register", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *locatorClient) Remove(ctx context.Context, in *Entity, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/proto.Locator/Remove", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *locatorClient) Ping(ctx context.Context, in *Location, opts ...grpc.CallOption) (*empty.Empty, error) {
	out := new(empty.Empty)
	err := c.cc.Invoke(ctx, "/proto.Locator/Ping", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *locatorClient) Find(ctx context.Context, in *Entity, opts ...grpc.CallOption) (*Location, error) {
	out := new(Location)
	err := c.cc.Invoke(ctx, "/proto.Locator/Find", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// LocatorServer is the server API for Locator service.
// All implementations must embed UnimplementedLocatorServer
// for forward compatibility
type LocatorServer interface {
	Register(context.Context, *Entity) (*empty.Empty, error)
	Remove(context.Context, *Entity) (*empty.Empty, error)
	Ping(context.Context, *Location) (*empty.Empty, error)
	Find(context.Context, *Entity) (*Location, error)
	mustEmbedUnimplementedLocatorServer()
}

// UnimplementedLocatorServer must be embedded to have forward compatible implementations.
type UnimplementedLocatorServer struct {
}

func (UnimplementedLocatorServer) Register(context.Context, *Entity) (*empty.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Register not implemented")
}
func (UnimplementedLocatorServer) Remove(context.Context, *Entity) (*empty.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Remove not implemented")
}
func (UnimplementedLocatorServer) Ping(context.Context, *Location) (*empty.Empty, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Ping not implemented")
}
func (UnimplementedLocatorServer) Find(context.Context, *Entity) (*Location, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Find not implemented")
}
func (UnimplementedLocatorServer) mustEmbedUnimplementedLocatorServer() {}

// UnsafeLocatorServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to LocatorServer will
// result in compilation errors.
type UnsafeLocatorServer interface {
	mustEmbedUnimplementedLocatorServer()
}

func RegisterLocatorServer(s grpc.ServiceRegistrar, srv LocatorServer) {
	s.RegisterService(&_Locator_serviceDesc, srv)
}

func _Locator_Register_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Entity)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LocatorServer).Register(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.Locator/Register",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LocatorServer).Register(ctx, req.(*Entity))
	}
	return interceptor(ctx, in, info, handler)
}

func _Locator_Remove_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Entity)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LocatorServer).Remove(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.Locator/Remove",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LocatorServer).Remove(ctx, req.(*Entity))
	}
	return interceptor(ctx, in, info, handler)
}

func _Locator_Ping_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Location)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LocatorServer).Ping(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.Locator/Ping",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LocatorServer).Ping(ctx, req.(*Location))
	}
	return interceptor(ctx, in, info, handler)
}

func _Locator_Find_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(Entity)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(LocatorServer).Find(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/proto.Locator/Find",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(LocatorServer).Find(ctx, req.(*Entity))
	}
	return interceptor(ctx, in, info, handler)
}

var _Locator_serviceDesc = grpc.ServiceDesc{
	ServiceName: "proto.Locator",
	HandlerType: (*LocatorServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Register",
			Handler:    _Locator_Register_Handler,
		},
		{
			MethodName: "Remove",
			Handler:    _Locator_Remove_Handler,
		},
		{
			MethodName: "Ping",
			Handler:    _Locator_Ping_Handler,
		},
		{
			MethodName: "Find",
			Handler:    _Locator_Find_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "locator.proto",
}
