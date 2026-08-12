plugins {
    java
}

dependencies {
    implementation("io.github.nabobery:kotlin-sdkgen-cli:${providers.gradleProperty("sdkgenVersion").get()}")
}
