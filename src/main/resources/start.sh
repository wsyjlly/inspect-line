#!/usr/bin/env bash
su root Ilovewty2018!

pid=`jps | grep inspect-line-1.0.jar | awk '{print $1}'`
[[ -n ${pid} ]] && kill -9 ${pid}
java -jar /data/server/inspect-line-1.0.jar >/data/server/inspect-line.log 2>&1 &
echo "Process $! start Success!"
tailf inspect-line.log