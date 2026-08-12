plugins {
    java
}

dependencies {
    implementation("io.github.nabobery:kotlin-sdkgen-transport-java-http:${providers.gradleProperty("sdkgenVersion").get()}")
}
