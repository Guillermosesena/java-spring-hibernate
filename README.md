<h1 align="center"> Spring and Hibernate </h1> <br>

## Table of Contents

- [Introduction](#introduction)
- [This&nbsp;respository](#thisrepository)
- [Dependencies](#dependencies)
- [Run&nbsp;Code](#runcode)
- [Platzi&nbsp;Course](#platzicourse)
- [Notes](#notes)

## Introduction

#### 
Model, mapped classes representing database tables
Business, Classes representing the business and its logic
View classes, files related to response that the user interacts

##### Servlet
They are components on the server side, which contain classes with special connotations, they allow to process response requests, they also generate dynamic content

#### JavaServer Pages (JSP)
They are a server-side component to develop pages that support dynamic content, thanks to the inclusion of Java code in html code, through the use of JSO tags.

#### Spring framework
It was created as an alternative to solve the complexity of the heavier Java technologies at that time.

#### Spring boot
Technology that allows optimization of development time in the creation and deployment of applications, allowing developers to take care of the business logic. Some of its characteristics:
- Stand alone applications are packed in a file with all the dependencies to be executed without the need to install a web server, since it has an embedded server.
- Spring has several modules such as: Spring MV, Spring Data, Spring REST and Spring Security, each of them works in a simple way through its dependencies.
- Its construction and configuration is simple, which there a web tool is called Spring Initializr that builds the structure of the project according to yours needs.

#### Spring Data
Provides an easy way to implement the data access layer. Create a repository deployment. Supports paging, query execution. The main Spring Data tools are the repositories, the main of them is tje CrudRepository and Paging AndSorting Repository.

#### Spring Swagger
It is the default tool to document web API, it generates an interactive way to do it

#### Web Service
They are applications built to interact information between applications using standardized protocols There are two main architectures: REST and SOAP. The first handles information in Json format and the second in XML.

#### Spring Rest
It is a way to build a web service in Spring using Rest architecture

#### Spring Security
It is a framework that allows you to fully manage the security of the applications, it allows:
- Manage security at various levels
- Configure portable security
- -Supports http basic, oauth, http digest authentication models, among others

## This&nbsp;repository
This repository contains the project developed  is a REST API that controls the operations of users. This API gets information from a H2 database. What this API does is:

- Gets the users
- Posts a new user
- Deletes a user
- Updates a user
- Pagination of users


## Dependencies
- Spring Tool IDE
- JDK11 or later
-


## Run&nbsp;Code
You can only run these projects using Spring Tool IDE or another IDE.


## Platzi&nbsp;Course

Check out [Platzi's Spring and Hibernate course](https://platzi.com/clases/jee/).


## Notes

Most commits correspond to sections of the course in which the project code was changed.
