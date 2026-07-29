plugins {
    java
}

dependencies {
    implementation("com.nabobery:kotlin-sdkgen-runtime:${providers.gradleProperty("sdkgenVersion").get()}")
}
