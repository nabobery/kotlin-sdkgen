plugins {
    java
}

dependencies {
    implementation("com.nabobery:kotlin-sdkgen-transport-ktor:${providers.gradleProperty("sdkgenVersion").get()}")
}
