plugins {
    java
}

dependencies {
    implementation("com.nabobery:kotlin-sdkgen-transport-java-http:${providers.gradleProperty("sdkgenVersion").get()}")
}
