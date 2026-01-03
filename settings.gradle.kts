import org.jetbrains.intellij.platform.gradle.extensions.intellijPlatform

rootProject.name = "catbrains-islands-theme"

plugins {
    id("org.jetbrains.intellij.platform.settings") version "2.10.5"
}

dependencyResolutionManagement {
    repositoriesMode = RepositoriesMode.FAIL_ON_PROJECT_REPOS
    repositories {
        mavenCentral()
        intellijPlatform {
            defaultRepositories()
        }
    }
}
