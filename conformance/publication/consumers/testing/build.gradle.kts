plugins {
    java
}

dependencies {
    implementation("io.github.nabobery:kotlin-sdkgen-testing:${providers.gradleProperty("sdkgenVersion").get()}")
}
