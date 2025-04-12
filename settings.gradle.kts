pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}

val localProperties = java.util.Properties().apply {
    load(File(rootProject.projectDir, "local.properties").inputStream())
}
val mavenUsername: String = localProperties["mavenUsername"] as String
val mavenPassword: String = localProperties["mavenPassword"] as String
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/kalkadam404/Android_Advanced_KBTU")
            credentials {
                username = mavenUsername
                password = mavenPassword
            }
        }
    }
}

rootProject.name = "TestAndroidLib"
include(":app")
 