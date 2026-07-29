plugins {
    java
}

dependencies {
    compileOnly(gradleApi())
    implementation("com.nabobery:kotlin-sdkgen-gradle-plugin:${providers.gradleProperty("sdkgenVersion").get()}")
}
