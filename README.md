[![Codacy Badge](https://api.codacy.com/project/badge/Grade/46dba76fdc85412a8e56de5d7b91cd79)](https://www.codacy.com/app/sudarsan.a/pincodes-lucene?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=isudarsan/pincodes-lucene&amp;utm_campaign=Badge_Grade) [![Build Status](https://travis-ci.com/isudarsan/pincodes-lucene.svg?branch=master)](https://travis-ci.com/isudarsan/pincodes-lucene)

# pincodes-lucene
Pincodes:Solr Implementation

Indian Pin Codes Rest API provides the below endpoints to fetch related information from Solr.
Configuring `Solr Server` & importing data from MySQL to Solr, have a look at the below links.

https://github.com/isudarsan/pincodes-csvtodb-transformer

https://github.com/isudarsan/document-inventory/wiki/Import-data-from-MySQL-to-Solr

https://github.com/isudarsan/pincodes

## Docker Deployment

Solr is the popular, blazing-fast, open source enterprise search platform built on Apache Lucene™.To run a single Solr server in docker, use the below docker command.

`docker run --name pincodes_solr_server -d -p 8983:8983 -t solr`

Then with a web browser go to http://localhost:8983/ to see the Admin Console (adjust the hostname for your docker host).

A Dockerfile is available in the project, build a docker image for our application. Type the following command from the root directory of the project to build the docker image

`$ docker build -t pincodessolr .`

Once we have a docker image, run and link with Solr Server Container which we already createed.

`docker run -p 8080:8080 --name pincodes_solr_service --link pincodes_solr_server -d pincodessolr`

The application Docker image is also available in Docker Hub : https://hub.docker.com/r/isudarsan/zarvis-apps/tags/

Image can be pulled directly from Docker Hub using `docker pull isudarsan/zarvis-apps:pincodessolr-0.0.1-SNAPSHOT`

