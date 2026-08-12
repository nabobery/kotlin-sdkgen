plugins {
    java
}

dependencies {
    implementation("io.github.nabobery:kotlin-sdkgen-engine:${providers.gradleProperty("sdkgenVersion").get()}")
}
