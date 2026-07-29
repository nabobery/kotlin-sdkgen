plugins {
    java
}

dependencies {
    implementation("com.nabobery:kotlin-sdkgen-testing:${providers.gradleProperty("sdkgenVersion").get()}")
}
