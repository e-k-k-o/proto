// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.12.3
// source: dialog.proto

package proto

import (
	proto "github.com/golang/protobuf/proto"
	_struct "github.com/golang/protobuf/ptypes/struct"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type Detect struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Text     string   `protobuf:"bytes,1,opt,name=text,proto3" json:"text,omitempty"`
	Identity string   `protobuf:"bytes,2,opt,name=identity,proto3" json:"identity,omitempty"`
	Source   string   `protobuf:"bytes,3,opt,name=source,proto3" json:"source,omitempty"`
	Context  *Context `protobuf:"bytes,4,opt,name=context,proto3" json:"context,omitempty"`
}

func (x *Detect) Reset() {
	*x = Detect{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dialog_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Detect) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Detect) ProtoMessage() {}

func (x *Detect) ProtoReflect() protoreflect.Message {
	mi := &file_dialog_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Detect.ProtoReflect.Descriptor instead.
func (*Detect) Descriptor() ([]byte, []int) {
	return file_dialog_proto_rawDescGZIP(), []int{0}
}

func (x *Detect) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

func (x *Detect) GetIdentity() string {
	if x != nil {
		return x.Identity
	}
	return ""
}

func (x *Detect) GetSource() string {
	if x != nil {
		return x.Source
	}
	return ""
}

func (x *Detect) GetContext() *Context {
	if x != nil {
		return x.Context
	}
	return nil
}

type Intent struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Vendor                   string           `protobuf:"bytes,1,opt,name=vendor,proto3" json:"vendor,omitempty"`
	Skill                    string           `protobuf:"bytes,2,opt,name=skill,proto3" json:"skill,omitempty"`
	Command                  string           `protobuf:"bytes,3,opt,name=command,proto3" json:"command,omitempty"`
	Query                    string           `protobuf:"bytes,4,opt,name=query,proto3" json:"query,omitempty"`
	Text                     string           `protobuf:"bytes,5,opt,name=text,proto3" json:"text,omitempty"`
	Confidence               float32          `protobuf:"fixed32,6,opt,name=confidence,proto3" json:"confidence,omitempty"`
	AllRequiredParamsPresent bool             `protobuf:"varint,7,opt,name=all_required_params_present,json=allRequiredParamsPresent,proto3" json:"all_required_params_present,omitempty"`
	Parameters               *_struct.Struct  `protobuf:"bytes,8,opt,name=parameters,proto3" json:"parameters,omitempty"`
	OutputContexts           []*OutputContext `protobuf:"bytes,9,rep,name=output_contexts,json=outputContexts,proto3" json:"output_contexts,omitempty"`
	Context                  *Context         `protobuf:"bytes,10,opt,name=context,proto3" json:"context,omitempty"`
}

func (x *Intent) Reset() {
	*x = Intent{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dialog_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Intent) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Intent) ProtoMessage() {}

func (x *Intent) ProtoReflect() protoreflect.Message {
	mi := &file_dialog_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Intent.ProtoReflect.Descriptor instead.
func (*Intent) Descriptor() ([]byte, []int) {
	return file_dialog_proto_rawDescGZIP(), []int{1}
}

func (x *Intent) GetVendor() string {
	if x != nil {
		return x.Vendor
	}
	return ""
}

func (x *Intent) GetSkill() string {
	if x != nil {
		return x.Skill
	}
	return ""
}

func (x *Intent) GetCommand() string {
	if x != nil {
		return x.Command
	}
	return ""
}

func (x *Intent) GetQuery() string {
	if x != nil {
		return x.Query
	}
	return ""
}

func (x *Intent) GetText() string {
	if x != nil {
		return x.Text
	}
	return ""
}

func (x *Intent) GetConfidence() float32 {
	if x != nil {
		return x.Confidence
	}
	return 0
}

func (x *Intent) GetAllRequiredParamsPresent() bool {
	if x != nil {
		return x.AllRequiredParamsPresent
	}
	return false
}

func (x *Intent) GetParameters() *_struct.Struct {
	if x != nil {
		return x.Parameters
	}
	return nil
}

func (x *Intent) GetOutputContexts() []*OutputContext {
	if x != nil {
		return x.OutputContexts
	}
	return nil
}

func (x *Intent) GetContext() *Context {
	if x != nil {
		return x.Context
	}
	return nil
}

type OutputContext struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Name     string `protobuf:"bytes,1,opt,name=name,proto3" json:"name,omitempty"`
	Lifespan int32  `protobuf:"varint,2,opt,name=lifespan,proto3" json:"lifespan,omitempty"`
}

func (x *OutputContext) Reset() {
	*x = OutputContext{}
	if protoimpl.UnsafeEnabled {
		mi := &file_dialog_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *OutputContext) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*OutputContext) ProtoMessage() {}

func (x *OutputContext) ProtoReflect() protoreflect.Message {
	mi := &file_dialog_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use OutputContext.ProtoReflect.Descriptor instead.
func (*OutputContext) Descriptor() ([]byte, []int) {
	return file_dialog_proto_rawDescGZIP(), []int{2}
}

func (x *OutputContext) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *OutputContext) GetLifespan() int32 {
	if x != nil {
		return x.Lifespan
	}
	return 0
}

var File_dialog_proto protoreflect.FileDescriptor

var file_dialog_proto_rawDesc = []byte{
	0x0a, 0x0c, 0x64, 0x69, 0x61, 0x6c, 0x6f, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x73, 0x74, 0x72, 0x75, 0x63, 0x74, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x0b, 0x61, 0x75, 0x64, 0x69, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x0d, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0x7a, 0x0a, 0x06, 0x44, 0x65, 0x74, 0x65, 0x63, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x65, 0x78,
	0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74, 0x12, 0x1a, 0x0a,
	0x08, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x08, 0x69, 0x64, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x79, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x12, 0x28, 0x0a, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x65,
	0x78, 0x74, 0x52, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x22, 0xfb, 0x02, 0x0a, 0x06,
	0x49, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x76, 0x65, 0x6e, 0x64, 0x6f, 0x72,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x76, 0x65, 0x6e, 0x64, 0x6f, 0x72, 0x12, 0x14,
	0x0a, 0x05, 0x73, 0x6b, 0x69, 0x6c, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x73,
	0x6b, 0x69, 0x6c, 0x6c, 0x12, 0x18, 0x0a, 0x07, 0x63, 0x6f, 0x6d, 0x6d, 0x61, 0x6e, 0x64, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x63, 0x6f, 0x6d, 0x6d, 0x61, 0x6e, 0x64, 0x12, 0x14,
	0x0a, 0x05, 0x71, 0x75, 0x65, 0x72, 0x79, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x71,
	0x75, 0x65, 0x72, 0x79, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x65, 0x78, 0x74, 0x18, 0x05, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x74, 0x65, 0x78, 0x74, 0x12, 0x1e, 0x0a, 0x0a, 0x63, 0x6f, 0x6e, 0x66,
	0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x02, 0x52, 0x0a, 0x63, 0x6f,
	0x6e, 0x66, 0x69, 0x64, 0x65, 0x6e, 0x63, 0x65, 0x12, 0x3d, 0x0a, 0x1b, 0x61, 0x6c, 0x6c, 0x5f,
	0x72, 0x65, 0x71, 0x75, 0x69, 0x72, 0x65, 0x64, 0x5f, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x5f,
	0x70, 0x72, 0x65, 0x73, 0x65, 0x6e, 0x74, 0x18, 0x07, 0x20, 0x01, 0x28, 0x08, 0x52, 0x18, 0x61,
	0x6c, 0x6c, 0x52, 0x65, 0x71, 0x75, 0x69, 0x72, 0x65, 0x64, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73,
	0x50, 0x72, 0x65, 0x73, 0x65, 0x6e, 0x74, 0x12, 0x37, 0x0a, 0x0a, 0x70, 0x61, 0x72, 0x61, 0x6d,
	0x65, 0x74, 0x65, 0x72, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x67, 0x6f,
	0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x53, 0x74,
	0x72, 0x75, 0x63, 0x74, 0x52, 0x0a, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x73,
	0x12, 0x3d, 0x0a, 0x0f, 0x6f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x74, 0x65,
	0x78, 0x74, 0x73, 0x18, 0x09, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2e, 0x4f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x52,
	0x0e, 0x6f, 0x75, 0x74, 0x70, 0x75, 0x74, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x73, 0x12,
	0x28, 0x0a, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x0e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74,
	0x52, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x22, 0x3f, 0x0a, 0x0d, 0x4f, 0x75, 0x74,
	0x70, 0x75, 0x74, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x78, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x1a,
	0x0a, 0x08, 0x6c, 0x69, 0x66, 0x65, 0x73, 0x70, 0x61, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x08, 0x6c, 0x69, 0x66, 0x65, 0x73, 0x70, 0x61, 0x6e, 0x32, 0x7a, 0x0a, 0x06, 0x44, 0x69,
	0x61, 0x6c, 0x6f, 0x67, 0x12, 0x30, 0x0a, 0x10, 0x44, 0x65, 0x74, 0x65, 0x63, 0x74, 0x54, 0x65,
	0x78, 0x74, 0x49, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x12, 0x0d, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2e, 0x44, 0x65, 0x74, 0x65, 0x63, 0x74, 0x1a, 0x0d, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x49, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x12, 0x3e, 0x0a, 0x17, 0x44, 0x65, 0x74, 0x65, 0x63, 0x74,
	0x41, 0x75, 0x64, 0x69, 0x6f, 0x49, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61,
	0x6d, 0x12, 0x12, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x41, 0x75, 0x64, 0x69, 0x6f, 0x53,
	0x61, 0x6d, 0x70, 0x6c, 0x65, 0x1a, 0x0d, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x49, 0x6e,
	0x74, 0x65, 0x6e, 0x74, 0x28, 0x01, 0x42, 0x26, 0x0a, 0x0e, 0x63, 0x6f, 0x6d, 0x2e, 0x65, 0x63,
	0x68, 0x6f, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x42, 0x0b, 0x44, 0x69, 0x61, 0x6c, 0x6f, 0x67,
	0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5a, 0x07, 0x2e, 0x3b, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_dialog_proto_rawDescOnce sync.Once
	file_dialog_proto_rawDescData = file_dialog_proto_rawDesc
)

func file_dialog_proto_rawDescGZIP() []byte {
	file_dialog_proto_rawDescOnce.Do(func() {
		file_dialog_proto_rawDescData = protoimpl.X.CompressGZIP(file_dialog_proto_rawDescData)
	})
	return file_dialog_proto_rawDescData
}

var file_dialog_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_dialog_proto_goTypes = []interface{}{
	(*Detect)(nil),         // 0: proto.Detect
	(*Intent)(nil),         // 1: proto.Intent
	(*OutputContext)(nil),  // 2: proto.OutputContext
	(*Context)(nil),        // 3: proto.Context
	(*_struct.Struct)(nil), // 4: google.protobuf.Struct
	(*AudioSample)(nil),    // 5: proto.AudioSample
}
var file_dialog_proto_depIdxs = []int32{
	3, // 0: proto.Detect.context:type_name -> proto.Context
	4, // 1: proto.Intent.parameters:type_name -> google.protobuf.Struct
	2, // 2: proto.Intent.output_contexts:type_name -> proto.OutputContext
	3, // 3: proto.Intent.context:type_name -> proto.Context
	0, // 4: proto.Dialog.DetectTextIntent:input_type -> proto.Detect
	5, // 5: proto.Dialog.DetectAudioIntentStream:input_type -> proto.AudioSample
	1, // 6: proto.Dialog.DetectTextIntent:output_type -> proto.Intent
	1, // 7: proto.Dialog.DetectAudioIntentStream:output_type -> proto.Intent
	6, // [6:8] is the sub-list for method output_type
	4, // [4:6] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_dialog_proto_init() }
func file_dialog_proto_init() {
	if File_dialog_proto != nil {
		return
	}
	file_audio_proto_init()
	file_context_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_dialog_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Detect); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_dialog_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Intent); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
		file_dialog_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*OutputContext); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_dialog_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_dialog_proto_goTypes,
		DependencyIndexes: file_dialog_proto_depIdxs,
		MessageInfos:      file_dialog_proto_msgTypes,
	}.Build()
	File_dialog_proto = out.File
	file_dialog_proto_rawDesc = nil
	file_dialog_proto_goTypes = nil
	file_dialog_proto_depIdxs = nil
}
