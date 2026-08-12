plugins {
    java
}

dependencies {
    implementation("io.github.nabobery:kotlin-sdkgen-transport-ktor:${providers.gradleProperty("sdkgenVersion").get()}")
}
