plugins {
    java
}

dependencies {
    implementation("com.nabobery:kotlin-sdkgen-transport-okhttp:${providers.gradleProperty("sdkgenVersion").get()}")
}
