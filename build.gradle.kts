plugins {
    base
}

allprojects {
    version = providers.gradleProperty("sdkgenVersion").get()
}
