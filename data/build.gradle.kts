plugins {
    id("com.android.library")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Config.Android.compileSdkVersion)
    buildToolsVersion(Config.Android.buildToolsVersion)

    defaultConfig {
        minSdkVersion(Config.Android.minSdkVersion)
        targetSdkVersion(Config.Android.targetSdkVersion)
        versionCode = Config.Android.versionCode
        versionName = Config.Android.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }

    sourceSets {
        getByName("main").java.srcDirs("src/main/kotlin")
        getByName("test").java.srcDirs("src/test/kotlin")
        getByName("androidTest").java.srcDirs("src/androidTest/kotlin")
    }
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    implementation(Config.Libs.kotlinStd)

    testImplementation(Config.TestLibs.AndroidX.core)
    testImplementation(Config.TestLibs.AndroidX.coreArch)
    testImplementation(Config.TestLibs.AndroidX.rules)
    testImplementation(Config.TestLibs.AndroidX.jUnitExt)
    testImplementation(Config.TestLibs.AndroidX.truthExt)
    testImplementation(Config.TestLibs.mockito)
    testImplementation(Config.TestLibs.mockitoKt)
    testImplementation(Config.TestLibs.googleTruth)
    androidTestImplementation(Config.TestLibs.AndroidX.runner)
    androidTestImplementation(Config.TestLibs.AndroidX.espresso)
    androidTestUtil(Config.TestLibs.AndroidX.orchestrator)
}
