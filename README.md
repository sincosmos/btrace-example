# btrace example

[btrace](http://btrace.io) is a dynamic tracing tool for the JVM.

## Preparations

Download [btrace](http://btrace.io) from https://github.com/btraceio/btrace/releases

example of installing btrace 1.3.6 to `~/tools/btrace`:
```
mkdir -p ~/tools/btrace
cd ~/tools/btrace
curl -L https://github.com/btraceio/btrace/releases/download/v1.3.6/btrace-bin-1.3.6.tgz | tar zxvf -
chmod 0755 bin/*
export BTRACE_HOME=$HOME/tools/btrace
export PATH=$PATH:$BTRACE_HOME/bin
```

## Compile btrace scripts

```
cd btrace-scripts
btracec *.java
```

## Add btrace JVM options

The script `print_jvm_opts.sh` creates the JVM options for btrace.

Example usage:
```
export JAVA_OPTS="$(./print_jvm_opts.sh)"
```

Use for Gradle daemon:
```
export GRADLE_OPTS="-Dorg.gradle.jvmargs='$(./print_jvm_opts.sh)'"
```

## btrace documentation

* [btrace project's wiki](https://github.com/btraceio/btrace/wiki)