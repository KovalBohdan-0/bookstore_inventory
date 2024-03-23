Bookstore inventory management application

This repository contains a Java Spring Boot application built with Gradle, utilizing gRPC plugin for communication. The application also includes integration tests using Testcontainers with PostgreSQL and without containers.
Prerequisites

Before running this application, ensure you have the following prerequisites installed:

    Java JDK (version 17)
    Gradle
    Docker (if running tests with Testcontainers)
    Protocol Buffers (protoc) compiler
    Grpc Java Plugin
    PostgreSQL

Setup

    Clone this repository to your local machine:

    bash

    git clone 

Running the Application

To run the application, follow these steps:

    Build the project:

    bash

gradle build

Run the application:

bash

    gradle bootRun

The application will start, and you should see output indicating that the server is running.
Running Integration Tests
With Testcontainers

If you want to run integration tests with Testcontainers, ensure you have Docker installed on your machine.

    Ensure Docker is running.

    Run the integration tests:

    bash

    gradle integrationTest

Environment Variables
    You can set the following environment variables to configure the application:

    PGURL: The URL of the PostgreSQL database.
    PGUSER: The username for the PostgreSQL database.
    PGPASSWORD: The password for the PostgreSQL database.
