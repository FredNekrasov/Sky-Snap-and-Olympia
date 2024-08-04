plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
    alias(libs.plugins.hilt)
    alias(libs.plugins.ksp)
}

android {
    namespace = "com.fredprojects.skysnap"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.fredprojects.skysnap"
        minSdk = 29
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation(project(":mfa:auth"))
    implementation(project(":mfa:main"))

    implementation(project(":olympia:data"))
    implementation(project(":olympia:domain"))
    implementation(project(":olympia:presentation:auth"))
    implementation(project(":olympia:presentation:home"))
    implementation(project(":olympia:presentation:profile"))

    implementation(project(":skysnap:data"))
    implementation(project(":skysnap:domain"))
    implementation(project(":skysnap:presentation:main"))
    implementation(project(":skysnap:presentation:search"))
    implementation(project(":skysnap:presentation:tickets"))

    implementation(libs.hilt.android)
    ksp(libs.bundles.hilt)
    implementation(libs.bundles.app)
    implementation(libs.bundles.navigation)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}