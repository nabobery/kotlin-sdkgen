plugins {
    java
}

dependencies {
    compileOnly(gradleApi())
    implementation("io.github.nabobery:kotlin-sdkgen-gradle-plugin:${providers.gradleProperty("sdkgenVersion").get()}")
}
