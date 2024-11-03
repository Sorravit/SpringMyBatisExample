#!/bin/sh -x

goal_createDB() {
    docker run -it --rm -p3306:3306 -e MYSQL_ROOT_PASSWORD=sorravit -e MYSQL_USER=sorravit -e MYSQL_DATABASE=sorravit -e MYSQL_PASSWORD=sorravit --name mysql mysql
}

goal_deleteDB() {
    docker kill mysql
}

if type -t "goal_$1" &>/dev/null; then
  goal_$1 ${@:-2}
else
    echo "usage: $0 <goal>
    goal:
        createDB           -- create database in docker container in the background
        deleteDB           -- delete the database
        "
  exit 1
fi