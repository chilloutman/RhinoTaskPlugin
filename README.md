# RhinoTaskPlugin

A Gradle plugin that adds a "RhinoTask". The task can be used to run javascript inside Gradle builds using [Rhino](https://developer.mozilla.org/en-US/docs/Rhino).

## How to use it

You can use maven repository that is on github (`https://raw.github.com/chilloutman/RhinoTaskPlugin/master/repo/`) like this:
  
```groovy
buildscript {
    repositories {
        maven {
            url 'https://raw.github.com/chilloutman/RhinoTaskPlugin/master/repo/'
        }
    }
    dependencies {
        classpath 'ch.neiva.gradle.plugins:rhinoTask:1.0'
    }
}

apply plugin: 'rhinoTask'
```

Or you could just download the jar or build it yourself, of course.

After you've done that you can use the `RhinoTask` to run any Rhino compatible javascripts. Here is an example that runs the [requirejs optimizer](https://github.com/jrburke/r.js):

```groovy
task requirejsWithRhino(type: RhinoTask) {
    description "Runs the requirejs optimizer (r.js) with Rhino."
    args 'r.js', '-o', 'app.build.js'
    doFirst {
        println "*** Running r.js with Rhino ***"
        printCommand()
    }
}
```

For more information on the arguments and the usage of Rhino see: https://developer.mozilla.org/en-US/docs/Rhino/Shell
