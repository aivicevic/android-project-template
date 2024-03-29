/*********************
 * Plugin Versions
 *********************/
private const val kotlinVersion = "1.3.31"
private const val androidGradleVersion = "3.4.1"

/*********************
 * Lib Versions
 *********************/
// AndroidX
private const val coreKtxVersion = "1.0.2"
private const val appCompatVersion = "1.0.0"
private const val constraintLayoutVersion = "1.1.2"
private const val recyclerViewVersion = "1.0.0"
private const val lifeCycleVersion = "2.1.0-alpha04"
private const val roomVersion = "2.0.0"

// Other
private const val materialVersion = "1.1.0-alpha07"
private const val daggerVersion = "2.16"
private const val kotlinCoroutinesCoreVersion = "1.0.0"
private const val kotlinCoroutinesAndroidVersion = "1.0.0"
private const val rxJavaVersion = "2.1.15"
private const val rxAndroidVersion = "2.0.2"
private const val retrofitVersion = "2.4.0"
private const val okHttpVersion = "3.11.0"
private const val glideVersion = "4.2.0"

/*********************
 * Test Lib Versions
 *********************/
// AndroidX
private const val coreTestVersion = "1.0.0"
private const val coreArchTestVersion = "2.0.0"
private const val runnerVersion = "1.1.0"
private const val rulesVersion = "1.1.0"
private const val junitExtVersion = "1.0.0"
private const val truthExtVersion = "1.1.0"
private const val orchestratorVersion = "1.1.0"
private const val espressoVersion = "3.1.0"

// Other
private const val mockitoVersion = "2.7.22"
private const val mockitoKtVersion = "2.1.0"
private const val googleTruthVersion = "0.43"

object Config {

    object BuildPlugins {
        const val androidGradle = "com.android.tools.build:gradle:$androidGradleVersion"
        const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion"
    }

    object Android {
        const val buildToolsVersion = "28.0.3"
        const val minSdkVersion = 21
        const val targetSdkVersion = 28
        const val compileSdkVersion = 28
        const val applicationId = "com.blink.neptunesprideassistant"
        const val versionCode = 1
        const val versionName = "0.1"
    }

    object Libs {

        const val kotlinStd = "org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion"

        object AndroidX {

            object Ktx {
                const val core = "androidx.core:core-ktx:$coreKtxVersion"
            }

            object Support {
                const val appCompat = "androidx.appcompat:appcompat:$appCompatVersion"
                const val constraintLayout = "androidx.constraintlayout:constraintlayout:$constraintLayoutVersion"
                const val recyclerView = "androidx.recyclerview:recyclerview:$recyclerViewVersion"
            }

            object LifeCycle {
                const val runtime = "androidx.lifecycle:lifecycle-runtime:$lifeCycleVersion"
                const val extensions = "androidx.lifecycle:lifecycle-extensions:$lifeCycleVersion"
                const val compiler = "androidx.lifecycle:lifecycle-compiler:$lifeCycleVersion"
            }

            object Room {
                const val runtime = "androidx.room:room-runtime:$roomVersion"
                const val rxJava = "androidx.room:room-rxjava2:$roomVersion"
                const val compiler = "androidx.room:room-compiler:$roomVersion"
            }
        }

        object Dagger {
            const val dagger = "com.google.dagger:dagger:$daggerVersion"
            const val compiler = "com.google.dagger:dagger-compiler:$daggerVersion"
            const val android = "com.google.dagger:dagger-android:$daggerVersion"
            const val androidSupport = "com.google.dagger:dagger-android-support:$daggerVersion"
            const val androidProcessor = "com.google.dagger:dagger-android-processor:$daggerVersion"
        }

        object Coroutines {
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:$kotlinCoroutinesCoreVersion"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:$kotlinCoroutinesAndroidVersion"
        }

        object Rx {
            const val rxJava = "io.reactivex.rxjava2:rxjava:$rxJavaVersion"
            const val rxAndroid = "io.reactivex.rxjava2:rxandroid:$rxAndroidVersion"
        }

        object Network {

            object Retrofit {
                const val retrofit = "com.squareup.retrofit2:retrofit:$retrofitVersion"
                const val rxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:$retrofitVersion"
            }

            object OkHttp {
                const val okHttp = "com.squareup.okhttp3:okhttp:$okHttpVersion"
                const val loggingInterceptor = "com.squareup.okhttp3:logging-interceptor:$okHttpVersion"
            }
        }

        const val material = "com.google.android.material:material:$materialVersion"
        const val glide = "com.github.bumptech.glide:glide:$glideVersion"
    }

    object TestLibs {

        object AndroidX {
            const val core = "androidx.test:core:$coreTestVersion"
            const val coreArch = "androidx.arch.core:core-testing:$coreArchTestVersion"
            const val runner = "androidx.test:runner:$runnerVersion"
            const val rules = "androidx.test:rules:$rulesVersion"
            const val jUnitExt = "androidx.test.ext:junit:$junitExtVersion"
            const val truthExt = "androidx.test.ext:truth:$truthExtVersion"
            const val orchestrator = "androidx.test:orchestrator:$orchestratorVersion"
            const val espresso = "androidx.test.espresso:espresso-core:$espressoVersion"
        }

        const val mockito = "org.mockito:mockito-core:$mockitoVersion"
        const val mockitoKt = "com.nhaarman.mockitokotlin2:mockito-kotlin:$mockitoKtVersion"
        const val googleTruth = "com.google.truth:truth:$googleTruthVersion"
    }
 }
