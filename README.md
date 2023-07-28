# Java Spring Boot Example
A Java Spring Boot containerized API example


## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Contributing](#contributing)

## Overview
Technologies used:
- Java: Object Oriented Programming Language
- Spring Boot: Java-based web framework for developing microservices
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

### Available Endpoints

| Method | Endpoint      | Description       |
|--------|---------------|-------------------|
| GET    | `/tasks`      | Get all tasks     |
| POST   | `/tasks`      | Create a task     |
| GET    | `/tasks/{id}` | Get task by ID    |
| PUT    | `/tasks/{id}` | Update task by ID |
| DELETE | `/tasks/{id}` | Delete task by ID |

###  Request Example

`GET /tasks`

    curl -i -H 'Accept: application/json' http://localhost:8100/tasks

#### Response

    HTTP/1.1 200 
    Content-Type: application/json
    Transfer-Encoding: chunked
    Date: Fri, 28 Jul 2023 07:30:54 GMT
    
    [{"id":2,"description":"Crush interview","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":3,"description":"Write a poem about the changing seasons","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{
    "id":4,"description":"Research the history of the Eiffel Tower","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":5,"description":"Create a new recipe for a vegetarian lasagna","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-
    07-28T06:50:47.000+00:00"},{"id":6,"description":"Design a logo for a new business","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":7,"description":"Plan a weekend road trip through the mountains","createdTimestamp":"2023-07-28T06:50:47.000+00:00","up
    datedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":8,"description":"Read a book in a new genre","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":9,"description":"Learn a new skill on Skillshare","createdTimestamp":"2023-07-28T06:50:47.000+00:00","u
    pdatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":10,"description":"Organize your closet using the KonMari method","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":11,"description":"Write a short story about a time traveler","createdTimestamp":"2
    023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":12,"description":"Paint a picture of your favorite place","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":13,"description":"Try a new workout routine for a week","
    createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":14,"description":"Take a photography course online","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":15,"description":"Research and book a volun
    teer trip abroad","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":16,"description":"Make homemade soap from scratch","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":17,"description":"Write a
    letter to your future self","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":18,"description":"Build a piece of furniture from reclaimed wood","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id"
    :19,"description":"Create a vision board for your goals","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":20,"description":"Organize a fundraiser for a local charity","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:
    50:47.000+00:00"},{"id":21,"description":"Learn to play a new instrument","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-28T06:50:47.000+00:00"},{"id":22,"description":"Spend a day without technology","createdTimestamp":"2023-07-28T06:50:47.000+00:00","updatedTimestamp":"2023-07-
    28T06:50:47.000+00:00"}]

## Contributing

I appreciate feedback and contribution to this repo! Feel free to create a PR with your changes. I plan to add additional things like a PR template, etc. to make the contribution process more formal.  
