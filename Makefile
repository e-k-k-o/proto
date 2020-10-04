pwd = $(shell pwd)
google_proto_loc=/usr/local/include/google/protobuf/

SHELL=/bin/bash

# define standard colors
BLACK     := $(shell tput -Txterm setaf 0)
RED       := $(shell tput -Txterm setaf 1)
GREEN     := $(shell tput -Txterm setaf 2)
YELLOW    := $(shell tput -Txterm setaf 3)
BLUE      := $(shell tput -Txterm setaf 4)
PURPLE    := $(shell tput -Txterm setaf 5)
LIGHTBLUE := $(shell tput -Txterm setaf 6)
WHITE     := $(shell tput -Txterm setaf 7)

RESET := $(shell tput -Txterm sgr0)

.DEFAULT_GOAL := help
.PHONY: build

PROJECTNAME=$(shell basename "$(PWD)")
BRANCHENAME=$(shell git rev-parse --abbrev-ref HEAD)

%::
	make
	@echo "$(RED) > type one of the targets above$(RESET)"
	@echo

colors: ## show all the colors
	@echo "${BLACK}BLACK${RESET}"
	@echo "${RED}RED${RESET}"
	@echo "${GREEN}GREEN${RESET}"
	@echo "${YELLOW}YELLOW${RESET}"
	@echo "${BLUE}DARKBLUE${RESET}"
	@echo "${PURPLE}PURPLE${RESET}"
	@echo "${LIGHTBLUE}LIGHTBLUE${RESET}"
	@echo "${WHITE}WHITE${RESET}"

## build: makes a production build
build:
	@echo -en "\033c"
	@echo "$(LIGHTBLUE) > Starting build $(BLUE)$(PROJECTNAME) $(YELLOW)$(BRANCHENAME)$(RESET)"
	@rm -rf ${pwd}/go && mkdir ${pwd}/go
	@protoc --go_out=plugins=grpc:go *.proto
	@rm -rf ${pwd}/java && mkdir ${pwd}/java
	@protoc --plugin=protoc-gen-grpc-java=${pwd}/bin/protoc-gen-grpc-java --grpc-java_out=grpc:java *.proto
#	@rm -rf ${pwd}/js && mkdir ${pwd}/js
#	@protoc --plugin=protoc-gen-grpc-web=${pwd}/bin/protoc-gen-grpc-web --grpc-web_out=import_style=typescript,mode=grpcweb:js *.proto
	@echo "$(GREEN) > ready: $(BLUE)$(PROJECTNAME)$(RESET) $(YELLOW)$(BRANCHENAME)$(RESET)"


makefile: help
help: Makefile
	@echo -en "\033c"
	@echo "$(RED) > Choose a make command from the following:$(RESET)"
	@echo
	@sed -n 's/^##//p' $< | column -t -s ':' |  sed -e 's/^/ /'
	@echo
	@echo "$(GREEN) > ready: $(BLUE)$(PROJECTNAME)$(RESET) $(YELLOW)$(BRANCHENAME)$(RESET)"