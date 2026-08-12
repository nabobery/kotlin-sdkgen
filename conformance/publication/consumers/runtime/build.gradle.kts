plugins {
    java
}

dependencies {
    implementation("io.github.nabobery:kotlin-sdkgen-runtime:${providers.gradleProperty("sdkgenVersion").get()}")
}
