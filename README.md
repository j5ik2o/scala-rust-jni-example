# scala-rust-jni-example

```sh
❯ sbt test
[info] welcome to sbt 1.5.5 (AdoptOpenJDK Java 1.8.0_292)
[info] loading settings for project scala-rust-jni-example-build from plugins.sbt ...
[info] loading project definition from /Users/j5ik2o/Sources/scala-rust-jni-example/project
[info] loading settings for project root from build.sbt ...
[info] set current project to root (in build file:/Users/j5ik2o/Sources/scala-rust-jni-example/)
[info] Building library with native build tool Cargo
[warn]     Finished release [optimized] target(s) in 0.02s
[success] Library built in /Users/j5ik2o/Sources/scala-rust-jni-example/native/target/native/x86_64-darwin/bin/release/libadder.dylib
Printing from rust library. base: 12
Printing from rust library. term: 34
[info] AdderSpec:
[info] Calling native methods in tests
[info] - should work
[info] Run completed in 440 milliseconds.
[info] Total number of tests run: 1
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 1, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 1 s, completed 2021/08/04 21:43:55
```
