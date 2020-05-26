#!/bin/sh
export JAVA_HOME=/home/lin/apps/jdk13
export PATH=$JAVA_HOME/bin:$PATH
keytool -genkey -keyalg RSA -alias DatanaLicense -keystore keystore-client-license.jks -storepass 12345678 -validity 360 -keysize 2048

