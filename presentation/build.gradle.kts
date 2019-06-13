plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
    kotlin("kapt")
}

android {
    compileSdkVersion(Config.Android.compileSdkVersion)
    buildToolsVersion(Config.Android.buildToolsVersion)

    defaultConfig {
        applicationId = Config.Android.applicationId
        minSdkVersion(Config.Android.minSdkVersion)
        targetSdkVersion(Config.Android.targetSdkVersion)
        versionCode = Config.Android.versionCode
        versionName = Config.Android.versionName
        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    testOptions {
        execution = "ANDROIDX_TEST_ORCHESTRATOR"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
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
    implementation(Config.Libs.AndroidX.Ktx.core)

    implementation(Config.Libs.AndroidX.Support.appCompat)
    implementation(Config.Libs.AndroidX.Support.constraintLayout)
    implementation(Config.Libs.AndroidX.Support.recyclerView)

    implementation(Config.Libs.AndroidX.LifeCycle.runtime)
    implementation(Config.Libs.AndroidX.LifeCycle.extensions)
    kapt(Config.Libs.AndroidX.LifeCycle.compiler)

    implementation(Config.Libs.AndroidX.Room.runtime)
    implementation(Config.Libs.AndroidX.Room.rxJava)
    kapt(Config.Libs.AndroidX.Room.compiler)

    implementation(Config.Libs.Dagger.dagger)
    kapt(Config.Libs.Dagger.compiler)
    implementation(Config.Libs.Dagger.android)
    implementation(Config.Libs.Dagger.androidSupport)
    kapt(Config.Libs.Dagger.androidProcessor)

    implementation(Config.Libs.Coroutines.core)
    implementation(Config.Libs.Coroutines.android)
//    implementation(Config.Libs.Rx.rxJava)
//    implementation(Config.Libs.Rx.rxAndroid)

    implementation(Config.Libs.Network.Retrofit.retrofit)
    implementation(Config.Libs.Network.Retrofit.rxJavaAdapter)
    implementation(Config.Libs.Network.OkHttp.okHttp)
    implementation(Config.Libs.Network.OkHttp.loggingInterceptor)

    implementation(Config.Libs.material)
    implementation(Config.Libs.glide)

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
