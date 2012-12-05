package org.gradle

import org.gradle.api.Project
import org.gradle.api.Plugin

class RhinoTaskPlugin implements Plugin<Project> {

    void apply(Project target) {
        target.configurations {
            rhino
        }

        target.dependencies {
            rhino 'org.mozilla:rhino:1.7R4'
        }
    }

}
