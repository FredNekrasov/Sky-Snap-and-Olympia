pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "SkySnap"
include(":app")

include(":olympia:domain")
include(":olympia:data")
include(":olympia:presentation:auth")
include(":olympia:presentation:home")
include(":olympia:presentation:profile")

include(":mfa:auth")
include(":mfa:main")

include(":skysnap:domain")
include(":skysnap:data")
include(":skysnap:presentation:main")
include(":skysnap:presentation:search")
include(":skysnap:presentation:tickets")
