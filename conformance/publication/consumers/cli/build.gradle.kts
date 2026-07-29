plugins {
    java
}

dependencies {
    implementation("com.nabobery:kotlin-sdkgen-cli:${providers.gradleProperty("sdkgenVersion").get()}")
}
