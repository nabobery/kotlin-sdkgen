plugins {
    java
}

dependencies {
    implementation("io.github.nabobery:kotlin-sdkgen-transport-okhttp:${providers.gradleProperty("sdkgenVersion").get()}")
}
