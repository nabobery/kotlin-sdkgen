plugins {
    java
}

dependencies {
    implementation("com.nabobery:kotlin-sdkgen-engine:${providers.gradleProperty("sdkgenVersion").get()}")
}
