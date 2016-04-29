#!/bin/bash
[ -n "$BTRACE_HOME" ] || echo "BTRACE_HOME is not set"
DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )"
echo "-Xshare:off -Xverify:none -javaagent:$BTRACE_HOME/build/btrace-agent.jar=scriptdir=$DIR/btrace-scripts,stdout=false,noServer=true,unsafe=true,debug=false,scriptOutputFile=$DIR/btrace.out"
