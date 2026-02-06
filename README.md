# gRPC Retail Client

This repository contains a Java-based gRPC retail client. It uses a protobuf definition to generate gRPC stubs for catalogue updates, catalogue retrieval, shopping cart operations, and checkout workflows.

## Project layout

- `src/main/resources/RetailService.proto` contains the gRPC service and message definitions.
- Maven is used to generate gRPC sources and package the client.

## Prerequisites

- Java 8
- Maven 3.x

## Build

Generate gRPC sources and build the shaded JAR:

```bash
mvn clean package
```

The build uses the protobuf Maven plugin to compile the `.proto` definitions and the Maven assembly plugin to create a `jar-with-dependencies` artifact.

## Notes

If you update the protobuf definitions, re-run the build so the generated stubs stay in sync with the service contracts.
