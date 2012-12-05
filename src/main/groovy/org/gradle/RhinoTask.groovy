package org.gradle

import org.gradle.api.tasks.JavaExec

class RhinoTask extends JavaExec {

    RhinoTask() {
        classpath project.configurations.rhino
        main 'org.mozilla.javascript.tools.shell.Main'
    }

    void printCommand() {
        println 'RhinoTask: Running Command:\n' + commandLine.join(' ') + '\n'
    }

}