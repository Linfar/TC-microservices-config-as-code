package demo

import jetbrains.buildServer.configs.kotlin.BuildType
import jetbrains.buildServer.configs.kotlin.buildSteps.dotnetBuild
import jetbrains.buildServer.configs.kotlin.buildSteps.maven

val javaBuild: BuildType.() -> Unit = {
    steps {
        maven {
            goals = "package"
        }
    }
}

val withACustomParameter: BuildType.() -> Unit = {
    params {
        param("some", "value")
    }
}

val dotNetBuild: BuildType.() -> Unit = {
    steps {
        dotnetBuild {
            configuration = "build"
        }
    }
}
