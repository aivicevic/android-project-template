plugins {
    id("java-library")
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

sourceSets {
    getByName("main").java.srcDirs("src/main/kotlin")
    getByName("test").java.srcDirs("src/test/kotlin")
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))

    testImplementation(Config.TestLibs.AndroidX.core)
    testImplementation(Config.TestLibs.AndroidX.coreArch)
    testImplementation(Config.TestLibs.AndroidX.rules)
    testImplementation(Config.TestLibs.AndroidX.jUnitExt)
    testImplementation(Config.TestLibs.AndroidX.truthExt)
    testImplementation(Config.TestLibs.mockito)
    testImplementation(Config.TestLibs.mockitoKt)
    testImplementation(Config.TestLibs.googleTruth)
}
