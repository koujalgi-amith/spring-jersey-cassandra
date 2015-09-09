#!/bin/sh
WEBAPP_DIR=~/apps/tomcat-8.0.26/webapps

sudo pkill -f tomcat
sudo rm -rf $WEBAPP_DIR/spring-jersey-cassandra.war
sudo rm -rf $WEBAPP_DIR/spring-jersey-cassandra

mvn -f ../pom.xml clean package
sudo cp ../target/spring-jersey-cassandra.war $WEBAPP_DIR/

sudo sh $WEBAPP_DIR/../bin/startup.sh
