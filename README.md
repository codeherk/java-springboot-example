# Java Spring Boot Example
A Java Spring Boot containerized API example


## Table of Contents

- [Documentation](#documentation)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Contributing](#contributing)

## Documentation
Technologies used:
- Java: API via gin
- MySQL: Database that holds the Task data
- Docker: containerize the API and Database for local development
- Maven: a project management tool

For local development, we use Docker to containerize the API and MySQL database

## Prerequisites

- Install Java 17 (OpenJDK 17.0.2)
    - [via Chocolately for Windows](https://community.chocolatey.org/packages/openjdk/17.0.2)
    - via Homebrew for Mac
- Install Docker (Desktop and CLI)
    - via Chocolately for Windows
    - via Homebrew for Mac
- (Optional) Install [Docker VSCode Extension](https://marketplace.visualstudio.com/items?itemName=ms-azuretools.vscode-docker). Helps with Syntax highlighting and autocompletion.

## Getting Started

- Clone repo
- Run `make start` at the top level directory to build and run the API and MySQL docker containers
- Other make targets:
    - `make stop`: stops and removes the docker containers
## Contributing

I appreciate feedback and contribution to this repo! Feel free to create a PR with your changes. I plan to add additional things like a PR template, etc. to make the contribution process more formal.  
